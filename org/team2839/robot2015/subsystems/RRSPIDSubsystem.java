package org.team2839.robot2015.subsystems;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.AnalogInput;

import org.team2839.robot2015.DriveTrainConstants;
import org.team2839.robot2015.RobotMap;

/**
 *
 */
public class RRSPIDSubsystem extends PIDSubsystem {

	AnalogInput rRSPot = RobotMap.rRSPIDSubsystemRRSPot;
	SpeedController rRSSpeedController = RobotMap.rRSPIDSubsystemRRSSpeedController;

	// Initialize your subsystem here
	public RRSPIDSubsystem() {
		// add Kf speed value to "super" & change Kp, Ki & Kd as needed
		super("RRSPIDSubsystem", 1.0, 0.0, 0.0);
		setAbsoluteTolerance(0.1);
		getPIDController().setContinuous(true); // this is supposed to force the
												// shortest way from 4.9v to
												// 0.1v
		LiveWindow.addActuator("RRS PID Subsystem", "PIDSubsystem Controller",
				getPIDController());
		getPIDController().setOutputRange(-1.0, 1.0);
		getPIDController().setInputRange(0.0, 5.0); // copied from Tim Ellis'
													// code //
													// ((stick3.getDirectionDegrees()+180)/72);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// Add this to trigger a default control with joystick
		// setDefaultCommand(new SwerveSetpointCommand()); //add this to trigger
		// a default control with joystick
	}

	protected double returnPIDInput() {
		// Return your input value for the PID loop
		return rRSPot.getAverageVoltage()
				- DriveTrainConstants.RR_SWERVE_OFFSET;
	}

	protected void usePIDOutput(double output) {
		// Use output to drive your system, like a motor
		rRSSpeedController.pidWrite(output);
	}

	public void updateStatus() {
		// added in SD video
		SmartDashboard.putNumber("RRSPot", (rRSPot.getAverageVoltage())); // adds
																			// sensor
																			// output
																			// to
																			// SmartDashboard
	}
}
