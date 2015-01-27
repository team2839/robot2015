package org.team2839.robot2015.subsystems;

import org.team2839.robot2015.GeneralConstants;
import org.team2839.robot2015.RobotMap;
import org.team2839.robot2015.commands.CanStopCommand;

public class CanSubsystem extends LifterSubsystem {
	public CanSubsystem() {
		super("CanLifterSubsystem", RobotMap.canPickupPot,
				RobotMap.canPickupMotor, GeneralConstants.CAN_PICKUP_OFFSET);
	}

	@Override
	public void initDefaultCommand() {
		setDefaultCommand(new CanStopCommand());
	}
}