package org.team2839.robot2015.subsystems;

import org.team2839.robot2015.RobotMap;

public class LFDPIDSubsystem extends DriveSubsystem {
	public LFDPIDSubsystem() {
		super("LFDPIDSubsystem", RobotMap.lFDPIDSubsystemLFDEncoder,
				RobotMap.lFDPIDSubsystemLFDSpeedController);
	}
}
