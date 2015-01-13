package org.team2839.swerve;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.team2839.swerve.commands.*;
import org.team2839.swerve.subsystems.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	Command autonomousCommand;
	public static OI oi;
	public static LFSPIDSubsystem lFSPIDSubsystem;
	public static LFDPIDSubsystem lFDPIDSubsystem;
	public static RFSPIDSubsystem rFSPIDSubsystem;
	public static RFDPIDSubsystem rFDPIDSubsystem;
	public static RRSPIDSubsystem rRSPIDSubsystem;
	public static RRDPIDSubsystem rRDPIDSubsystem;
	public static LRSPIDSubsystem lRSPIDSubsystem;
	public static LRDPIDSubsystem lRDPIDSubsystem;
	public static GyroRangefinder gyroRangefinder;

	public CameraServer server;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	public void robotInit() {
		RobotMap.init();
		lFSPIDSubsystem = new LFSPIDSubsystem();
		lFDPIDSubsystem = new LFDPIDSubsystem();
		rFSPIDSubsystem = new RFSPIDSubsystem();
		rFDPIDSubsystem = new RFDPIDSubsystem();
		rRSPIDSubsystem = new RRSPIDSubsystem();
		rRDPIDSubsystem = new RRDPIDSubsystem();
		lRSPIDSubsystem = new LRSPIDSubsystem();
		lRDPIDSubsystem = new LRDPIDSubsystem();
		gyroRangefinder = new GyroRangefinder();

		// This MUST be here. If the OI creates Commands (which it very likely
		// will), constructing it during the construction of CommandBase (from
		// which commands extend), subsystems are not guaranteed to be
		// yet. Thus, their requires() statements may grab null pointers. Bad
		// news. Don't move it.
		oi = new OI();

		// instantiate the command used for the autonomous period
		autonomousCommand = new AutonomousCommand();

		server = CameraServer.getInstance();
		server.setQuality(50);
		// the camera name (ex "cam0") can be found through the roborio web
		// interface
		server.startAutomaticCapture("cam0");
		server.startAutomaticCapture("cam1");
		server.startAutomaticCapture("cam2");
	}

	public void autonomousInit() {
		// schedule the autonomous command (example)
		if (autonomousCommand != null)
			autonomousCommand.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		updateStatus(); // added in SD video
		if (autonomousCommand != null)
			autonomousCommand.cancel();
	}

	/**
	 * This function is called periodically during operator control
	 */
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		updateStatus(); // added in SD video
	}

	/**
	 * This function called periodically during test mode
	 */

	public void testPeriodic() {
		LiveWindow.run();
	}

	public void disabledPeriodic() { // added in SD video when added here , the
										// code won't work
		updateStatus();
	}

	public void updateStatus() { // added in SD video
		lFDPIDSubsystem.updateStatus();
		lFSPIDSubsystem.updateStatus();
		rFDPIDSubsystem.updateStatus();
		rFSPIDSubsystem.updateStatus();
		rRDPIDSubsystem.updateStatus();
		rRSPIDSubsystem.updateStatus();
		lRDPIDSubsystem.updateStatus();
		lRSPIDSubsystem.updateStatus();
		gyroRangefinder.updateStatus();
	}
}
