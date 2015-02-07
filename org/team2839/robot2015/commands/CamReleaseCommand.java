package org.team2839.robot2015.commands;

import org.team2839.robot2015.GeneralConstants;
import org.team2839.robot2015.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CamReleaseCommand extends CommandGroup {

	public CamReleaseCommand() {
		addSequential(new LifterCamMoveCommand(
				GeneralConstants.CAM_OUT_POSITION));
		addSequential(new FrontToteLiftCommand(
				Robot.frontTotePickupSubsystem.getPosition()
						+ GeneralConstants.CAM_RELEASE_LIFTER_DOWN_DISTANCE));
		addSequential(new LifterCamMoveCommand(GeneralConstants.CAM_IN_POSITION));
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
	}
}
