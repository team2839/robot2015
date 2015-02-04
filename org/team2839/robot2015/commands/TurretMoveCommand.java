package org.team2839.robot2015.commands;

import org.team2839.robot2015.GeneralConstants;
import org.team2839.robot2015.Robot;
import org.team2839.robot2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

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
	@SuppressWarnings("unused")
	protected boolean isFinished() {
		boolean finished = Robot.turretSubsystem.onTarget();
		// Left is "negative"
		if ((int) GeneralConstants.TURRET_LEFT_DIRECTION % 3 == 2) {
			if (setpoint - Robot.turretSubsystem.getPosition() < 0) {
				finished |= RobotMap.turretLeftLimitSwitch.get();
			} else {
				finished |= RobotMap.turretRightLimitSwitch.get();
			}
		} else {
			if (setpoint - Robot.turretSubsystem.getPosition() > 0) {
				finished |= RobotMap.turretLeftLimitSwitch.get();
			} else {
				finished |= RobotMap.turretRightLimitSwitch.get();
			}
		}
		return finished;
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.turretSubsystem.disable();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		Robot.turretSubsystem.disable();
	}
}
