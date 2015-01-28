package org.team2839.robot2015.subsystems;

import org.team2839.robot2015.PIDConstants;
import org.team2839.robot2015.PositionalQuadEncoder;
import org.team2839.robot2015.commands.TurretStopCommand;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class TurretSubsystem extends PIDSubsystem {

	private PositionalQuadEncoder encoder;
	private SpeedController speedController;

	// Initialize your subsystem here
	public TurretSubsystem() {
		super("TurnTableSubsystem", PIDConstants.TURNTABLE_P,
				PIDConstants.TURNTABLE_I, PIDConstants.TURNTABLE_D);
		setAbsoluteTolerance(PIDConstants.TURNTABLE_ABSOLUTE_TOLERANCE);
		getPIDController().setContinuous(true);
		LiveWindow.addActuator("TurnTableSubsystem", "PIDSubsystem Controller",
				getPIDController());
		getPIDController().setOutputRange(PIDConstants.TURNTABLE_OUTPUT_MIN,
				PIDConstants.TURNTABLE_OUTPUT_MAX);
		getPIDController().setInputRange(PIDConstants.TURNTABLE_INPUT_MIN,
				PIDConstants.TURNTABLE_INPUT_MAX);
	}

	public void initDefaultCommand() {
		setDefaultCommand(new TurretStopCommand());
	}

	protected double returnPIDInput() {
		return encoder.pidGet();
	}

	protected void usePIDOutput(double output) {
		speedController.pidWrite(output);
	}

	public void updateStatus() {
		SmartDashboard.putNumber(getName(), encoder.pidGet());
	}

	public Encoder getEncoder() {
		return encoder;
	}
}
