package org.team2839.swerve.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.team2839.swerve.Constants;
import org.team2839.swerve.OI;
import org.team2839.swerve.Robot;

/**
 *
 */
public class StopSetpointCommand extends Command {

	public StopSetpointCommand() {
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
		Robot.lFDPIDSubsystem.enable();
		Robot.lFDPIDSubsystem.setSetpoint(0);
		Robot.rFDPIDSubsystem.enable();
		Robot.rFDPIDSubsystem.setSetpoint(0);
		Robot.rRDPIDSubsystem.enable();
		Robot.rRDPIDSubsystem.setSetpoint(0);
		Robot.lRDPIDSubsystem.enable();
		Robot.lRDPIDSubsystem.setSetpoint(0);
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
