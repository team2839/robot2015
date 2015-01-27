package org.team2839.robot2015.autonomousCommands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * Pick up tote 1 above can Back up to the wall Move left/drop tote down Move
 * forward touch sensor Lift tote 2 above can Back to wall Move left/drop tote
 * down Push tote to auto zone Drop tote 1, 2 Back off/stay in auto
 *
 */
public class AutonomousCommandGroup extends CommandGroup {

	public AutonomousCommandGroup() {
		// Add Commands here:
		// e.g. addSequential(new Command1());
		// addSequential(new Command2());
		// these will run in order.

		// To run multiple commands at the same time,
		// use addParallel()
		// e.g. addParallel(new Command1());
		// addSequential(new Command2());
		// Command1 and Command2 will run in parallel.

		// A command group will require all of the subsystems that each member
		// would require.
		// e.g. if Command1 requires chassis, and Command2 requires arm,
		// a CommandGroup containing them would require both the chassis and the
		// arm.
		addSequential(new AutonomousLiftToteCommand());
		addSequential(new AutonomousBackupCommand());
		addParallel(new AutonomousDropToteCommand());
		addSequential(new AutonomousMoveLeftCommand()); // DONE
		addSequential(new AutonomousMoveForwardCommand());
		addSequential(new AutonomousBackupCommand());
		addParallel(new AutonomousMoveLeftCommand());
		addSequential(new AutonomousPushToteCommand());
		addSequential(new AutonomousDropToteCommand());
		addSequential(new AutonomousBackOffCommand());
	}
}
