package org.team2839.robot2015.subsystems;

import org.team2839.robot2015.PIDConstants;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class LifterSubsystem extends PIDSubsystem {

	private AnalogInput pot;
	private SpeedController speedController;
	private double offset;

	// Initialize your subsystem here
	public LifterSubsystem(String name, AnalogInput pot,
			SpeedController speedController, double offset) {
		super(name, PIDConstants.LIFTER_P, PIDConstants.LIFTER_I,
				PIDConstants.LIFTER_D);
		this.pot = pot;
		this.speedController = speedController;
		this.offset = offset;
		setAbsoluteTolerance(PIDConstants.LIFTER_ABSOLUTE_TOLERANCE);
		LiveWindow.addActuator("CanLifterSubsystem", "PIDSubsystem Controller",
				getPIDController());
		getPIDController().setOutputRange(PIDConstants.LIFTER_OUTPUT_MIN,
				PIDConstants.LIFTER_OUTPUT_MAX);
		getPIDController().setInputRange(PIDConstants.LIFTER_INPUT_MIN,
				PIDConstants.LIFTER_INPUT_MAX);
	}

	public void initDefaultCommand() {
	}

	protected double returnPIDInput() {
		return pot.getAverageVoltage() - offset;
	}

	protected void usePIDOutput(double output) {
		speedController.pidWrite(output);
	}

	public void updateStatus() {
		SmartDashboard.putNumber(getName(), pot.getAverageVoltage());
	}

	public AnalogInput getPot() {
		return pot;
	}
}
