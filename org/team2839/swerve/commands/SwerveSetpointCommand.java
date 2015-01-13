package org.team2839.swerve.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.team2839.swerve.Constants;
import org.team2839.swerve.OI;
import org.team2839.swerve.Robot;

/**
 *
 */
public class SwerveSetpointCommand extends Command {

	public SwerveSetpointCommand() {
		requires(Robot.lFSPIDSubsystem);
		requires(Robot.rFSPIDSubsystem);
		requires(Robot.rRSPIDSubsystem);
		requires(Robot.lRSPIDSubsystem);

		requires(Robot.lFDPIDSubsystem);
		requires(Robot.rFDPIDSubsystem);
		requires(Robot.rRDPIDSubsystem);
		requires(Robot.lRDPIDSubsystem);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		double setpoint = joystickDirectionToVoltage(OI.driveJoystick
				.getDirectionDegrees());
		Robot.lFSPIDSubsystem.enable();
		Robot.lFSPIDSubsystem.setSetpoint(setpoint);
		Robot.rFSPIDSubsystem.enable();
		Robot.rFSPIDSubsystem.setSetpoint(setpoint);
		Robot.rRSPIDSubsystem.enable();
		Robot.rRSPIDSubsystem.setSetpoint(setpoint);
		Robot.lRSPIDSubsystem.enable();
		Robot.lRSPIDSubsystem.setSetpoint(setpoint);

		double speed = OI.driveJoystick.getMagnitude()
				* Constants.SWERVE_MULTIPLIER;
		Robot.lFDPIDSubsystem.enable();
		Robot.lFDPIDSubsystem.setSetpoint(speed); // *1.4 for full speed going
													// straight
		Robot.rFDPIDSubsystem.enable();
		Robot.rFDPIDSubsystem.setSetpoint(speed);
		Robot.rRDPIDSubsystem.enable();
		Robot.rRDPIDSubsystem.setSetpoint(speed);
		Robot.lRDPIDSubsystem.enable();
		Robot.lRDPIDSubsystem.setSetpoint(speed);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		// return Robot.lFSPIDSubsystem.onTarget();
		return false; // changed to false to keep this command running
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}

	private double joystickDirectionToVoltage(double joystickDirection) {
		double degrees = joystickDirection + 180.0;
		double circlePart = 360.0 / Constants.MAX_MOTOR_VOLTAGE;
		return Constants.MAX_MOTOR_VOLTAGE - (degrees / circlePart);
	}
}
