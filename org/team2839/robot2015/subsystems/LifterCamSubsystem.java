package org.team2839.robot2015.subsystems;

import org.team2839.robot2015.PIDConstants;
import org.team2839.robot2015.PositionalQuadEncoder;
import org.team2839.robot2015.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class LifterCamSubsystem extends PIDSubsystem {

	private PositionalQuadEncoder encoder;
	private SpeedController speedController;

	// Initialize your subsystem here
	public LifterCamSubsystem() {
		super("LifterCamSubsystem", PIDConstants.CAM_P, PIDConstants.CAM_I,
				PIDConstants.CAM_D);
		encoder = RobotMap.lifterCamEncoder;
		speedController = RobotMap.lifterCamMotor;
		setAbsoluteTolerance(PIDConstants.CAM_ABSOLUTE_TOLERANCE);
		// getPIDController().setContinuous(true); // Probably a bad idea
		LiveWindow.addActuator("LifterCamSubsystem", "PIDSubsystem Controller",
				getPIDController());
		getPIDController().setOutputRange(PIDConstants.CAM_OUTPUT_MIN,
				PIDConstants.CAM_OUTPUT_MAX);
		getPIDController().setInputRange(PIDConstants.CAM_INPUT_MIN,
				PIDConstants.CAM_INPUT_MAX);
	}

	public void initDefaultCommand() {
		// setDefaultCommand(new LifterCamStopCommand());
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
