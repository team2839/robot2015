package org.team2839.robot2015.commands;

import org.team2839.robot2015.GeneralConstants;
import org.team2839.robot2015.Robot;
import org.team2839.robot2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LifterCamZeroCommand extends Command {

	public LifterCamZeroCommand() {
		requires(Robot.lifterCamSubsystem);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		RobotMap.lifterCamMotor.set(GeneralConstants.CAM_OUT_DIRECTION * 0.15);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return RobotMap.lifterCamZeroLimitSwitch.get();
	}

	// Called once after isFinished returns true
	protected void end() {
		RobotMap.lifterCamEncoder.reset();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
