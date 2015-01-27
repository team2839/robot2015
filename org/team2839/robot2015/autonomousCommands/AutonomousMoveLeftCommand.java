package org.team2839.robot2015.autonomousCommands;

import org.team2839.robot2015.DriveTrainConstants;
import org.team2839.robot2015.GeneralConstants;
import org.team2839.robot2015.Robot;
import org.team2839.robot2015.Utils;
import org.team2839.robot2015.commands.GenericCommands;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Command;

public class AutonomousMoveLeftCommand extends Command {

	private Encoder lFDEncoder;

	@Override
	protected void initialize() {
		requires(Robot.lFSPIDSubsystem);
		requires(Robot.rFSPIDSubsystem);
		requires(Robot.rRSPIDSubsystem);
		requires(Robot.lRSPIDSubsystem);
		requires(Robot.lFDPIDSubsystem);
		requires(Robot.rFDPIDSubsystem);
		requires(Robot.rRDPIDSubsystem);
		requires(Robot.lRDPIDSubsystem);

		lFDEncoder = Robot.lFDPIDSubsystem.getEncoder();
		lFDEncoder.reset();
	}

	@Override
	protected void execute() {
		double direction = Utils
				.directionToVoltage(DriveTrainConstants.SWERVE_LEFT);
		GenericCommands.setSwerveSetpoint(direction);
		GenericCommands
				.setDriveSetpoint(GeneralConstants.AUTONOMOUS_DRIVE_SPEED);
	}

	@Override
	protected boolean isFinished() {
		return lFDEncoder.getDistance() >= GeneralConstants.DISTANCE_BETWEEN_TOTES;
	}

	@Override
	protected void end() {
		GenericCommands.setDriveSetpoint(DriveTrainConstants.DRIVE_STOP);
	}

	@Override
	protected void interrupted() {
	}

}
