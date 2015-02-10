package org.team2839.robot2015.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CamInitCommand extends CommandGroup {

	public CamInitCommand() {
		addSequential(new LifterCamZeroCommand());
		addSequential(SpecificCommands.camOutCommand);
	}
}
