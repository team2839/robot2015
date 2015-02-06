package org.team2839.robot2015;

import org.team2839.robot2015.autonomousCommands.AutonomousCommandGroup;
import org.team2839.robot2015.subsystems.CanSubsystem;
import org.team2839.robot2015.subsystems.DriveSubsystem;
import org.team2839.robot2015.subsystems.FrontToteSubsystem;
import org.team2839.robot2015.subsystems.GyroRangefinder;
import org.team2839.robot2015.subsystems.SideToteSubsystem;
import org.team2839.robot2015.subsystems.SwerveSubsystem;
import org.team2839.robot2015.subsystems.TurretSubsystem;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.vision.AxisCamera;

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
	public static SwerveSubsystem leftFrontSwerve;
	public static DriveSubsystem leftFrontDrive;
	public static SwerveSubsystem rightFrontSwerve;
	public static DriveSubsystem rightFrontDrive;
	public static SwerveSubsystem rightRearSwerve;
	public static DriveSubsystem rightRearDrive;
	public static SwerveSubsystem leftRearSwerve;
	public static DriveSubsystem leftRearDrive;

	public static TurretSubsystem turretSubsystem;
	public static CanSubsystem canPickupSubsystem;
	public static FrontToteSubsystem frontTotePickupSubsystem;
	public static SideToteSubsystem sideTotePickupSubsystem;

	public static GyroRangefinder gyroRangefinder;

	public CameraServer server;

	// int session;
	// Image frame;
	 AxisCamera camera;
	// NIVision.Rect rect;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	public void robotInit() {
		RobotMap.init();
		leftFrontSwerve = new SwerveSubsystem("LFSPIDSubsystem",
				RobotMap.LFSPot, RobotMap.LFSSpeedController,
				DriveTrainConstants.LF_SWERVE_OFFSET, PIDConstants.LF_SWERVE_P, PIDConstants.LF_SWERVE_I, PIDConstants.LF_SWERVE_D);
		leftFrontDrive = new DriveSubsystem("LFDPIDSubsystem",
				RobotMap.LFDEncoder, RobotMap.LFDSpeedController);
		rightFrontSwerve = new SwerveSubsystem("RFSPIDSubsystem",
				RobotMap.RFSPot, RobotMap.RFSSpeedController,
				DriveTrainConstants.RF_SWERVE_OFFSET, PIDConstants.RF_SWERVE_P, PIDConstants.RF_SWERVE_I, PIDConstants.RF_SWERVE_D);
		rightFrontDrive = new DriveSubsystem("RFDPIDSubsystem",
				RobotMap.RFDEncoder, RobotMap.RFDSpeedController);
		rightRearSwerve = new SwerveSubsystem("RRSPIDSubsystem",
				RobotMap.RRSPot, RobotMap.RRSSpeedController,
				DriveTrainConstants.RR_SWERVE_OFFSET, PIDConstants.RR_SWERVE_P, PIDConstants.RR_SWERVE_I, PIDConstants.RR_SWERVE_D);
		rightRearDrive = new DriveSubsystem("RRDPIDSubsystem",
				RobotMap.RRDEncoder, RobotMap.RRDSpeedController);
		leftRearSwerve = new SwerveSubsystem("LRSPIDSubsystem",
				RobotMap.LRSPot, RobotMap.LRSSpeedController,
				DriveTrainConstants.LR_SWERVE_OFFSET, PIDConstants.LR_SWERVE_P, PIDConstants.LR_SWERVE_I, PIDConstants.LR_SWERVE_D);
		leftRearDrive = new DriveSubsystem("LRDPIDSubsystem",
				RobotMap.LRDEncoder, RobotMap.LRDSpeedController);
		gyroRangefinder = new GyroRangefinder();

		turretSubsystem = new TurretSubsystem();
		canPickupSubsystem = new CanSubsystem();
		frontTotePickupSubsystem = new FrontToteSubsystem();
		sideTotePickupSubsystem = new SideToteSubsystem();

		// This MUST be here. If the OI creates Commands (which it very likely
		// will), constructing it during the construction of CommandBase (from
		// which commands extend), subsystems are not guaranteed to be
		// yet. Thus, their requires() statements may grab null pointers. Bad
		// news. Don't move it.
		oi = new OI();

		// instantiate the command used for the autonomous period
		autonomousCommand = new AutonomousCommandGroup();

		server = CameraServer.getInstance();
		server.setQuality(50);
		// the camera name (ex "cam0") can be found through the roborio web
		// interface
		server.startAutomaticCapture("cam0");

		// frame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);
		//
		// // open the camera at the IP address assigned. This is the IP address
		// // that the camera
		// // can be accessed through the web interface.
		// camera = new AxisCamera("10.28.39.14");
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
//		 rect = new NIVision.Rect(10, 10, 100, 100);
	}

	/**
	 * This function is called periodically during operator control
	 */
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		RobotMap.LRDSpeedController.set(0.3);
		updateStatus(); // added in SD video
//		 camera.getImage(frame);
		// NIVision.imaqDrawShapeOnImage(frame, frame, rect,
		// DrawMode.DRAW_VALUE,
		// ShapeMode.SHAPE_OVAL, 0.0f);
		//
		// CameraServer.getInstance().setImage(frame);
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
		leftFrontDrive.updateStatus();
		leftFrontSwerve.updateStatus();
		rightFrontDrive.updateStatus();
		rightFrontSwerve.updateStatus();
		rightRearDrive.updateStatus();
		rightRearSwerve.updateStatus();
		leftRearDrive.updateStatus();
		leftRearSwerve.updateStatus();
		turretSubsystem.updateStatus();
		canPickupSubsystem.updateStatus();
		frontTotePickupSubsystem.updateStatus();
		sideTotePickupSubsystem.updateStatus();
	}
}
