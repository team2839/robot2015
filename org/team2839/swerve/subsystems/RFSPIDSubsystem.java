package org.team2839.swerve.subsystems;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.SpeedController;

import org.team2839.swerve.Constants;
import org.team2839.swerve.RobotMap;

/**
 *
 */
public class RFSPIDSubsystem extends PIDSubsystem {

	AnalogInput rFSPot = RobotMap.rFSPIDSubsystemRFSPot;
	SpeedController rFSSpeedController = RobotMap.rFSPIDSubsystemRFSSpeedController;

	// Initialize your subsystem here
	public RFSPIDSubsystem() {
		// add Kf speed value to "super" & change Kp, Ki & Kd as needed
		super("RFSPIDSubsystem", 1.0, 0.0, 0.0);
		setAbsoluteTolerance(0.1);
		getPIDController().setContinuous(true); // This is supposed to force the
												// shortest way from 4.9v to
												// 0.1v
		LiveWindow.addActuator("RFS PID Subsystem", "PIDSubsystem Controller",
				getPIDController());
		getPIDController().setOutputRange(-1.0, 1.0);
		getPIDController().setInputRange(0.0, 5.0); // copied from Tim Ellis'
													// code
	}

	public void initDefaultCommand() {
		// Add this to trigger a default control with joystick
		// setDefaultCommand(new SwerveSetpointCommand());
	}

	protected double returnPIDInput() {
		// Return your input value for the PID loop
		return rFSPot.getAverageVoltage() - Constants.RF_SWERVE_OFFSET;
	}

	protected void usePIDOutput(double output) {
		// Use output to drive your system, like a motor
		rFSSpeedController.pidWrite(output);
	}

	public void updateStatus() {
		// added in SD video
		SmartDashboard.putNumber("RFSPot", (rFSPot.getAverageVoltage())); // Adds
																			// sensor
																			// output
																			// to
																			// SmartDashboard
	}
}
