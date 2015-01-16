package org.team2839.robot2015.subsystems;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;

import org.team2839.robot2015.RobotMap;

/**
 *
 */
public class RFDPIDSubsystem extends PIDSubsystem {

	Encoder rFDEncoder = RobotMap.rFDPIDSubsystemRFDEncoder;
	SpeedController rFDSpeedController = RobotMap.rFDPIDSubsystemRFDSpeedController;

	// Initialize your subsystem here
	public RFDPIDSubsystem() {
		// Add Kf speed value to "super" & change Kp, Ki & Kd as needed
		super("RFDPIDSubsystem", 0.003, 0.0, 0.0, 2.2);
		setAbsoluteTolerance(0.2);
		getPIDController().setContinuous(false);
		LiveWindow.addActuator("RFD PID Subsystem", "PIDSubsystem Controller",
				getPIDController());
		getPIDController().setOutputRange(-1, 1);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// Add this to trigger a default control with joystick
		// setDefaultCommand(new SwerveSetpointCommand());
	}

	protected double returnPIDInput() {
		// Return your input value for the PID loop
		return rFDEncoder.pidGet();
	}

	protected void usePIDOutput(double output) {
		// Use output to drive your system, like a motor
		rFDSpeedController.pidWrite(output);
	}

	public void updateStatus() {
		// added in SD video
		SmartDashboard.putNumber("RFD Encoder", rFDEncoder.getRate()); // adds
																		// sensor
																		// output
																		// to
																		// SmartDashboard
	}
}
