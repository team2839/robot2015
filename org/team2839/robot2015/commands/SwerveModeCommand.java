package org.team2839.robot2015.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.team2839.robot2015.DriveTrainConstants;
import org.team2839.robot2015.GeneralConstants;
import org.team2839.robot2015.OI;
import org.team2839.robot2015.Robot;
import org.team2839.robot2015.Utils;

/**
 *
 */
public class SwerveModeCommand extends Command {

	public SwerveModeCommand() {
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
		double voltage = Utils.joystickDirectionToVoltage(OI.driveJoystick
				.getDirectionDegrees());
		GenericCommands.setSwerveSetpoint(voltage);

		double speed = OI.driveJoystick.getMagnitude()
				* DriveTrainConstants.SWERVE_MULTIPLIER
				* OI.getNormalThrottle();
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
