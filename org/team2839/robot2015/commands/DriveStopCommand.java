package org.team2839.robot2015.commands;

import org.team2839.robot2015.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveStopCommand extends Command {

	public DriveStopCommand() {
		requires(Robot.leftFrontDrive);
		requires(Robot.rightFrontDrive);
		requires(Robot.rightRearDrive);
		requires(Robot.leftRearDrive);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.leftFrontDrive.enable();
		Robot.leftFrontDrive.setSetpoint(0);
		Robot.rightFrontDrive.enable();
		Robot.rightFrontDrive.setSetpoint(0);
		Robot.rightRearDrive.enable();
		Robot.rightRearDrive.setSetpoint(0);
		Robot.leftRearDrive.enable();
		Robot.leftRearDrive.setSetpoint(0);
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
}
