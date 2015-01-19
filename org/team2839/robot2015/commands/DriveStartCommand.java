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
		Robot.lFSPIDSubsystem.enable();
		Robot.lFSPIDSubsystem.setSetpoint(DriveTrainConstants.LF_SWERVE_OFFSET);
		Robot.rFSPIDSubsystem.enable();
		Robot.rFSPIDSubsystem.setSetpoint(DriveTrainConstants.RF_SWERVE_OFFSET);
		Robot.rRSPIDSubsystem.enable();
		Robot.rRSPIDSubsystem.setSetpoint(DriveTrainConstants.RR_SWERVE_OFFSET);
		Robot.lRSPIDSubsystem.enable();
		Robot.lRSPIDSubsystem.setSetpoint(DriveTrainConstants.LR_SWERVE_OFFSET);

		double speed = OI.driveJoystick.getY()
				* DriveTrainConstants.DRIVE_MULTIPLIER * OI.getNormalThrottle();
		Robot.lFDPIDSubsystem.enable();
		Robot.lFDPIDSubsystem.setSetpoint(speed);
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
}
