package org.team2839.robot2015.subsystems;


import org.team2839.robot2015.RobotMap;

public class LRDPIDSubsystem extends DriveSubsystem {
	public LRDPIDSubsystem() {
		super("LRDPIDSubsystem", RobotMap.lRDPIDSubsystemLRDEncoder, RobotMap.lRDPIDSubsystemLRDSpeedController);
	}
}
