package org.team2839.robot2015.commands;

import org.team2839.robot2015.Robot;
import org.team2839.robot2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TurretMoveCommand extends Command {

	private double setpoint;

	public TurretMoveCommand(double setpoint) {
		requires(Robot.turretSubsystem);
		this.setpoint = setpoint;
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.turretSubsystem.enable();
		Robot.turretSubsystem.setSetpoint(setpoint);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return Robot.turretSubsystem.onTarget()
				|| RobotMap.turretLeftLimitSwitch.get()
				|| RobotMap.turretRightLimitSwitch.get();
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
