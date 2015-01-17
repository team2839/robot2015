package org.team2839.robot2015.commands;

import org.team2839.robot2015.Robot;

public class GenericCommands {

	public static final void setSwerveSetpoint(double setpoint) {
		Robot.lFSPIDSubsystem.enable();
		Robot.lFSPIDSubsystem.setSetpoint(setpoint);
		Robot.rFSPIDSubsystem.enable();
		Robot.rFSPIDSubsystem.setSetpoint(setpoint);
		Robot.rRSPIDSubsystem.enable();
		Robot.rRSPIDSubsystem.setSetpoint(setpoint);
		Robot.lRSPIDSubsystem.enable();
		Robot.lRSPIDSubsystem.setSetpoint(setpoint);
	}

	public static final void setDriveSetpoint(double setpoint) {
		// 1.4 for full speed going straight
		// Because joystick.getMagnitude() == sqrt(2) when the
		// joystick is pushed into the corner ( sqrt(1^2 + 1^2) )
		Robot.lFDPIDSubsystem.enable();
		Robot.lFDPIDSubsystem.setSetpoint(setpoint);
		Robot.rFDPIDSubsystem.enable();
		Robot.rFDPIDSubsystem.setSetpoint(setpoint);
		Robot.rRDPIDSubsystem.enable();
		Robot.rRDPIDSubsystem.setSetpoint(setpoint);
		Robot.lRDPIDSubsystem.enable();
		Robot.lRDPIDSubsystem.setSetpoint(setpoint);
	}

}
