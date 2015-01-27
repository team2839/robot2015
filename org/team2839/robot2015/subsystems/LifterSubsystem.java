package org.team2839.robot2015.subsystems;

import org.team2839.robot2015.PIDConstants;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

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
		super(name, PIDConstants.CAN_LIFTER_P, PIDConstants.CAN_LIFTER_I,
				PIDConstants.CAN_LIFTER_D);
		this.pot = pot;
		this.speedController = speedController;
		this.offset = offset;
		setAbsoluteTolerance(PIDConstants.CAN_LIFTER_ABSOLUTE_TOLERANCE);
		LiveWindow.addActuator("CanLifterSubsystem", "PIDSubsystem Controller",
				getPIDController());
		getPIDController().setOutputRange(PIDConstants.CAN_LIFTER_OUTPUT_MIN,
				PIDConstants.CAN_LIFTER_OUTPUT_MAX);
		getPIDController().setInputRange(PIDConstants.CAN_LIFTER_INPUT_MIN,
				PIDConstants.CAN_LIFTER_INPUT_MAX);
	}

	public void initDefaultCommand() {
	}

	protected double returnPIDInput() {
		return pot.getAverageVoltage() - offset;
	}

	protected void usePIDOutput(double output) {
		speedController.pidWrite(output);
	}
}
