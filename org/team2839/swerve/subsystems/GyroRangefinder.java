package org.team2839.swerve.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.team2839.swerve.RobotMap;

/**
 *
 * @author Jim
 */
public class GyroRangefinder extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	// Gyro gyro1 = RobotMap.gyroRangefinderGyro1;
	// AnalogInput rangefinder = RobotMap.gyroRangefinderRangefinder;

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		// gyro1.reset();
	}

	public void updateStatus() {
		// added to get sensor output to dashboard
		// SmartDashboard.putNumber("Gyro plot", gyro1.getAngle());
		// SmartDashboard.putNumber("Gyro", gyro1.getAngle());
		// SmartDashboard.putNumber("Rangefinder", rangefinder.getVoltage());
	}
}
