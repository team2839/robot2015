package org.team2839.robot2015.subsystems;

import org.team2839.robot2015.GeneralConstants;
import org.team2839.robot2015.PIDConstants;
import org.team2839.robot2015.RobotMap;
import org.team2839.robot2015.commands.SideToteStopCommand;

public class SideToteSubsystem extends LifterSubsystem {

	public SideToteSubsystem() {
		super("SideToteSubsystem", RobotMap.sideTotePickupPot,
				RobotMap.sideTotePickupMotor,
				GeneralConstants.SIDE_TOTE_PICKUP_OFFSET,
				PIDConstants.SIDE_TOTE_LIFTER_P,
				PIDConstants.SIDE_TOTE_LIFTER_I,
				PIDConstants.SIDE_TOTE_LIFTER_D,
				PIDConstants.SIDE_TOTE_LIFTER_OUTPUT_MIN,
				PIDConstants.SIDE_TOTE_LIFTER_OUTPUT_MAX);
	}

	@Override
	public void initDefaultCommand() {
		setDefaultCommand(new SideToteStopCommand());
	}

}
