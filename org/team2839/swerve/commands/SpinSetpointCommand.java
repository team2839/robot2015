package org.team2839.swerve.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.team2839.swerve.Constants;
import org.team2839.swerve.OI;
import org.team2839.swerve.Robot;

/**
 *
 */
public class SpinSetpointCommand extends Command {

	public SpinSetpointCommand() {
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
		Robot.lFSPIDSubsystem.setSetpoint(Constants.LF_SWERVE_SPIN_OFFSET); // increase
																			// #
																			// to
																			// increase
																			// CCW
		Robot.rFSPIDSubsystem.enable();
		Robot.rFSPIDSubsystem.setSetpoint(Constants.RF_SWERVE_SPIN_OFFSET);
		Robot.rRSPIDSubsystem.enable();
		Robot.rRSPIDSubsystem.setSetpoint(Constants.RR_SWERVE_SPIN_OFFSET);
		Robot.lRSPIDSubsystem.enable();
		Robot.lRSPIDSubsystem.setSetpoint(Constants.LR_SWERVE_SPIN_OFFSET);

		double speed = OI.driveJoystick.getTwist() * Constants.SPIN_MULTIPLIER * OI.getNormalThrottle();
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
