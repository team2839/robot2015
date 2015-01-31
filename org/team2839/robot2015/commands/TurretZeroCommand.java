package org.team2839.robot2015.commands;

import org.team2839.robot2015.GeneralConstants;
import org.team2839.robot2015.Robot;
import org.team2839.robot2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TurretZeroCommand extends Command {

	public TurretZeroCommand() {
		requires(Robot.turretSubsystem);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		RobotMap.turretMotor.set(GeneralConstants.TURRET_RIGHT_DIRECTION * 0.25);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return RobotMap.turretRightLimitSwitch.get();
	}

	// Called once after isFinished returns true
	protected void end() {
		RobotMap.turretEncoder.reset();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
