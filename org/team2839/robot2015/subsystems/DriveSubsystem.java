package org.team2839.robot2015.subsystems;

import org.team2839.robot2015.PIDConstants;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveSubsystem extends PIDSubsystem {
	
	private Encoder encoder;
	private SpeedController speedController;
	private String name;

	// Initialize your subsystem here
	public DriveSubsystem(String name, Encoder encoder, SpeedController speedController) {
		// add Kf speed value to "super" & change Kp, Ki & Kd as needed
		super(name, PIDConstants.DRIVE_P, PIDConstants.DRIVE_I, PIDConstants.DRIVE_D, PIDConstants.DRIVE_F);
		this.encoder = encoder;
		this.speedController = speedController;
		this.name = name;
		setAbsoluteTolerance(PIDConstants.DRIVE_ABSOLUTE_TOLERANCE);
		getPIDController().setContinuous(false);
		LiveWindow.addActuator(name, "PIDSubsystem Controller",
				getPIDController());
		getPIDController().setOutputRange(PIDConstants.DRIVE_OUTPUT_MIN, PIDConstants.DRIVE_OUTPUT_MAX);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// Add this to trigger a default control with joystick
		// SetDefaultCommand(new SwerveSetpointCommand());
	}

	protected double returnPIDInput() {
		// Return your input value for the PID loop
		return encoder.pidGet();
	}

	protected void usePIDOutput(double output) {
		// Use output to drive your system, like a motor
		speedController.pidWrite(output);
	}

	public void updateStatus() {
		// added in SD video
		SmartDashboard.putNumber(name, encoder.getRate()); // Adds
																		// sensor
																		// output
																		// to
																		// SmartDashboard
	}

	public Encoder getEncoder() {
		return encoder;
	}
}
