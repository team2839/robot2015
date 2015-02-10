package org.team2839.robot2015.subsystems;

import org.team2839.robot2015.GeneralConstants;
import org.team2839.robot2015.PIDConstants;
import org.team2839.robot2015.RobotMap;
import org.team2839.robot2015.commands.CanStopCommand;

public class CanSubsystem extends LifterSubsystem {
	public CanSubsystem() {
		super("CanLifterSubsystem", RobotMap.canPickupPot,
				RobotMap.canPickupMotor, GeneralConstants.CAN_PICKUP_OFFSET,
				PIDConstants.CAN_LIFTER_P, PIDConstants.CAN_LIFTER_I,
				PIDConstants.CAN_LIFTER_D, PIDConstants.CAN_LIFTER_OUTPUT_MIN,
				PIDConstants.CAN_LIFTER_OUTPUT_MAX);
	}

	@Override
	public void initDefaultCommand() {
		setDefaultCommand(new CanStopCommand());
	}
}