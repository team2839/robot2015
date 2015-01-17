package org.team2839.robot2015.commands;

//import org.team2839.robot2015.states.AutonomousState;

import org.team2839.robot2015.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutonomousCommand extends Command {

	public enum AutonomousState {
		START, FINISHED
	}

	private AutonomousState state;

	public AutonomousCommand() {
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
		state = AutonomousState.START;
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {

	}

	// Make this return false when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return state.equals(AutonomousState.FINISHED);
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
