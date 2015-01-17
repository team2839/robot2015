package org.team2839.robot2015.subsystems;

import org.team2839.robot2015.DriveTrainConstants;
import org.team2839.robot2015.RobotMap;

public class RFSPIDSubsystem extends SwerveSubsystem {
	public RFSPIDSubsystem() {
		super("RFSPIDSubsystem", RobotMap.rFSPIDSubsystemRFSPot,
				RobotMap.rFSPIDSubsystemRFSSpeedController,
				DriveTrainConstants.RF_SWERVE_OFFSET);
	}
}
