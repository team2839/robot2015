package org.team2839.robot2015.subsystems;

import org.team2839.robot2015.DriveTrainConstants;
import org.team2839.robot2015.RobotMap;

public class LRSPIDSubsystem extends SwerveSubsystem {
	public LRSPIDSubsystem() {
		super("LRSPIDSubsystem", RobotMap.lRSPIDSubsystemLRSPot,
				RobotMap.lRSPIDSubsystemLRSSpeedController,
				DriveTrainConstants.LR_SWERVE_OFFSET);
	}
}
