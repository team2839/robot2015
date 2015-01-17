package org.team2839.robot2015.subsystems;

import org.team2839.robot2015.RobotMap;

public class RRDPIDSubsystem extends DriveSubsystem {
	public RRDPIDSubsystem() {
		super("RRDPIDSubsystem", RobotMap.rRDPIDSubsystemRRDEncoder, RobotMap.rRDPIDSubsystemRRDSpeedController);
	}
}