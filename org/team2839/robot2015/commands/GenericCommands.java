package org.team2839.robot2015.commands;

import org.team2839.robot2015.Robot;

public class GenericCommands {

	public static final void setSwerveSetpoint(double setpoint) {
//		Robot.leftFrontSwerve.enable();
//		Robot.leftFrontSwerve.setSetpoint(setpoint);
//		Robot.rightFrontSwerve.enable();
//		Robot.rightFrontSwerve.setSetpoint(setpoint);
//		Robot.rightRearSwerve.enable();
//		Robot.rightRearSwerve.setSetpoint(setpoint);
//		Robot.leftRearSwerve.enable();
//		Robot.leftRearSwerve.setSetpoint(setpoint);
	}

	public static final void setDriveSetpoint(double setpoint) {
		if (Math.abs(setpoint) <= 0.1) {
			setpoint = 0.0;
		}
//		Robot.leftFrontDrive.enable();
//		Robot.leftFrontDrive.setSetpoint(setpoint);
//		Robot.rightFrontDrive.enable();
//		Robot.rightFrontDrive.setSetpoint(setpoint);
//		Robot.rightRearDrive.enable();
//		Robot.rightRearDrive.setSetpoint(setpoint);
		Robot.leftRearDrive.enable();
		Robot.leftRearDrive.setSetpoint(setpoint);
	}

}
