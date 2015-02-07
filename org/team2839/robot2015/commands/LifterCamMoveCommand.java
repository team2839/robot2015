package org.team2839.robot2015.commands;

import org.team2839.robot2015.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class LifterCamMoveCommand extends Command {

	private double setpoint;

	public LifterCamMoveCommand(double setpoint) {
		requires(Robot.lifterCamSubsystem);
		this.setpoint = setpoint;
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.lifterCamSubsystem.enable();
		Robot.lifterCamSubsystem.setSetpoint(setpoint);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return Robot.lifterCamSubsystem.onTarget();
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.lifterCamSubsystem.disable();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		Robot.lifterCamSubsystem.disable();
	}
}
