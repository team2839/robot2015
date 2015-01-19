package org.team2839.robot2015.subsystems;

import org.team2839.robot2015.PIDConstants;
import org.team2839.robot2015.commands.DriveStopCommand;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class SwerveSubsystem extends PIDSubsystem {

	private AnalogInput pot;
	private SpeedController speedController;
	private double swerveOffset;
	private String name;

	// Initialize your subsystem here
	public SwerveSubsystem(String name, AnalogInput pot,
			SpeedController speedController, double swerveOffset) {
		// add Kf speed value to "super" & change Kp, Ki & Kd as needed
		super(name, PIDConstants.SWERVE_P, PIDConstants.SWERVE_I,
				PIDConstants.SWERVE_D);
		this.pot = pot;
		this.speedController = speedController;
		this.swerveOffset = swerveOffset;
		this.name = name;
		setAbsoluteTolerance(PIDConstants.SWERVE_ABSOLUTE_TOLERANCE);
		getPIDController().setContinuous(true); // this is supposed to force the
												// shortest way from 4.9v to
												// 0.1v
		LiveWindow.addActuator(name, "PIDSubsystem Controller",
				getPIDController());
		getPIDController().setOutputRange(PIDConstants.SWERVE_OUTPUT_MIN,
				PIDConstants.SWERVE_OUTPUT_MAX);
		getPIDController().setInputRange(PIDConstants.SWERVE_INPUT_MIN,
				PIDConstants.SWERVE_INPUT_MAX); // copied from Tim Ellis'
		// code
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// Add this to trigger a default control with joystick
		//setDefaultCommand(new DriveStopCommand());
	}

	protected double returnPIDInput() {
		// Return your input value for the PID loop
		return pot.getAverageVoltage() - swerveOffset;
	}

	protected void usePIDOutput(double output) {
		// Use output to drive your system, like a motor
		speedController.pidWrite(output);
	}

	public void updateStatus() {
		// Added in SD video
		SmartDashboard.putNumber(name, (pot.getAverageVoltage())); // adds
																	// sensor
																	// output
																	// to
																	// SmartDashboard
	}

}
