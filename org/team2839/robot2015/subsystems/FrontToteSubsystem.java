package org.team2839.robot2015.subsystems;

import org.team2839.robot2015.GeneralConstants;
import org.team2839.robot2015.PIDConstants;
import org.team2839.robot2015.RobotMap;
import org.team2839.robot2015.commands.FrontToteStopCommand;

public class FrontToteSubsystem extends LifterSubsystem {

	public FrontToteSubsystem() {
		super("FrontToteSubsystem", RobotMap.frontTotePickupPot,
				RobotMap.frontTotePickupMotor,
				GeneralConstants.FRONT_TOTE_PICKUP_OFFSET,
				PIDConstants.FRONT_TOTE_LIFTER_P,
				PIDConstants.FRONT_TOTE_LIFTER_I,
				PIDConstants.FRONT_TOTE_LIFTER_D,
				PIDConstants.FRONT_TOTE_LIFTER_OUTPUT_MIN,
				PIDConstants.FRONT_TOTE_LIFTER_OUTPUT_MAX);
	}

	@Override
	public void initDefaultCommand() {
		setDefaultCommand(new FrontToteStopCommand());
	}

}
