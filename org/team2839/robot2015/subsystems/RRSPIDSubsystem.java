package org.team2839.robot2015.subsystems;


import org.team2839.robot2015.DriveTrainConstants;
import org.team2839.robot2015.RobotMap;

public class RRSPIDSubsystem extends SwerveSubsystem {
	public RRSPIDSubsystem() {
		super("rrSPIDSubsystem", RobotMap.rRSPIDSubsystemRRSPot, RobotMap.rRSPIDSubsystemRRSSpeedController, DriveTrainConstants.RR_SWERVE_OFFSET);
	}
}