package org.team2839.robot2015.subsystems;

import org.team2839.robot2015.RobotMap;

public class RFDPIDSubsystem extends DriveSubsystem {
	public RFDPIDSubsystem() {
		super("RFDPIDSubsystem", RobotMap.rFDPIDSubsystemRFDEncoder,
				RobotMap.rFDPIDSubsystemRFDSpeedController);
	}
}
