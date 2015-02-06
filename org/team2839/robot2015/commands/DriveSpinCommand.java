package org.team2839.robot2015.commands;

import org.team2839.robot2015.DriveTrainConstants;
import org.team2839.robot2015.OI;
import org.team2839.robot2015.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveSpinCommand extends Command {

	public DriveSpinCommand() {
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
		Robot.leftFrontSwerve
				.setSetpoint(DriveTrainConstants.LF_SWERVE_SPIN_OFFSET); // increase
		// #
		// to
		// increase
		// CCW
		Robot.rightFrontSwerve.enable();
		Robot.rightFrontSwerve
				.setSetpoint(DriveTrainConstants.RF_SWERVE_SPIN_OFFSET);
		Robot.rightRearSwerve.enable();
		Robot.rightRearSwerve
				.setSetpoint(DriveTrainConstants.RR_SWERVE_SPIN_OFFSET);
		Robot.leftRearSwerve.enable();
		Robot.leftRearSwerve
				.setSetpoint(DriveTrainConstants.LR_SWERVE_SPIN_OFFSET);

		double speed = OI.driveJoystick.getTwist()
				* DriveTrainConstants.SPIN_MULTIPLIER;
		Robot.leftFrontDrive.enable();
		Robot.leftFrontDrive.setSetpoint(speed);
		Robot.rightFrontDrive.enable();
		Robot.rightFrontDrive.setSetpoint(speed);
		Robot.rightRearDrive.enable();
		Robot.rightRearDrive.setSetpoint(speed);
		Robot.leftRearDrive.enable();
		Robot.leftRearDrive.setSetpoint(speed);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		// return Robot.rFSPIDSubsystem.onTarget();
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
