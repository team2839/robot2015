package org.team2839.robot2015.subsystems;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.SpeedController;

import org.team2839.robot2015.DriveTrainConstants;
import org.team2839.robot2015.RobotMap;

/**
 *
 */
public class LFSPIDSubsystem extends PIDSubsystem {

	AnalogInput lFSPot = RobotMap.lFSPIDSubsystemLFSPot;
	SpeedController lFSSpeedController = RobotMap.lFSPIDSubsystemLFSSpeedController;

	// Initialize your subsystem here
	public LFSPIDSubsystem() {
		// add Kf speed value to "super" & change Kp, Ki & Kd as needed
		super("LFSPIDSubsystem", 1.0, 0.0, 0.0);
		setAbsoluteTolerance(0.1);
		getPIDController().setContinuous(true); // this is supposed to force the
												// shortest way from 4.9v to
												// 0.1v
		LiveWindow.addActuator("LFS PID Subsystem", "PIDSubsystem Controller",
				getPIDController());
		getPIDController().setOutputRange(-1.0, 1.0);
		getPIDController().setInputRange(0.0, 5.0); // copied from Tim Ellis'
													// code
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// Add this to trigger a default control with joystick
		// setDefaultCommand(new SwerveSetpointCommand());
	}

	protected double returnPIDInput() {
		// Return your input value for the PID loop
		return lFSPot.getAverageVoltage()
				- DriveTrainConstants.LF_SWERVE_OFFSET;
	}

	protected void usePIDOutput(double output) {
		// Use output to drive your system, like a motor
		lFSSpeedController.pidWrite(output);
	}

	public void updateStatus() {
		// Added in SD video
		SmartDashboard.putNumber("LFSPot", (lFSPot.getAverageVoltage())); // adds
																			// sensor
																			// output
																			// to
																			// SmartDashboard
	}
}
