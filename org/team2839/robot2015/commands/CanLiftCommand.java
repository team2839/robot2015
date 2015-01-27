package org.team2839.robot2015.commands;

import org.team2839.robot2015.Robot;
import org.team2839.robot2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/*
 * Some notes on this stuff:
 * There are two limit switches at the extremes of the lifter
 * There is a pot which will tell us what the height of the turret is
 * The pot has 10 turns, and is attached to a gear which will give us 8 inches per turn
 * The lifter will have 5 positions, two of which rely on the limit switches
 * The other three positions will rely on the pot: 3 in, 15 in, 21 in (approx.)
 */

public class CanLiftCommand extends Command {

	private double setpoint;

	public CanLiftCommand(double setpoint) {
		requires(Robot.canPickupSubsystem);
		this.setpoint = setpoint;
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.canPickupSubsystem.enable();
		Robot.canPickupSubsystem.setSetpoint(setpoint);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return Robot.canPickupSubsystem.onTarget()
				|| RobotMap.canPickupTopLimitSwitch.get()
				|| RobotMap.canPickupBottomLimitSwitch.get();
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
