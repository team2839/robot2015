package org.team2839.robot2015.commands;

import org.team2839.robot2015.DriveTrainConstants;
import org.team2839.robot2015.OI;
import org.team2839.robot2015.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveStartCommand extends Command {

	public DriveStartCommand() {
		requires(Robot.leftFrontSwerve);
		requires(Robot.rightFrontSwerve);
		requires(Robot.rightRearSwerve);
		requires(Robot.leftRearSwerve);

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
		Robot.leftFrontSwerve.enable();
		Robot.leftFrontSwerve.setSetpoint(0);
		Robot.rightFrontSwerve.enable();
		Robot.rightFrontSwerve.setSetpoint(0);
		Robot.rightRearSwerve.enable();
		Robot.rightRearSwerve.setSetpoint(0);
		Robot.leftRearSwerve.enable();
		Robot.leftRearSwerve.setSetpoint(0);

		double speed = OI.driveJoystick.getY()
				* DriveTrainConstants.DRIVE_STRAIGHT_MULTIPLIER * OI.getNormalThrottle();
		GenericCommands.setDriveSetpoint(speed);
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
