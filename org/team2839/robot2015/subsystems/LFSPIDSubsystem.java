package org.team2839.robot2015.subsystems;

import org.team2839.robot2015.DriveTrainConstants;
import org.team2839.robot2015.RobotMap;

public class LFSPIDSubsystem extends SwerveSubsystem {
	public LFSPIDSubsystem() {
		super("LFSPIDSubsystem", RobotMap.lFSPIDSubsystemLFSPot,
				RobotMap.lFSPIDSubsystemLFSSpeedController,
				DriveTrainConstants.LF_SWERVE_OFFSET);
	}
}
