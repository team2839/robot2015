package org.team2839.swerve.subsystems;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;

import org.team2839.swerve.RobotMap;

/**
 *
 */
public class LFDPIDSubsystem extends PIDSubsystem {

	Encoder lFDEncoder = RobotMap.lFDPIDSubsystemLFDEncoder;
	SpeedController lFDSpeedController = RobotMap.lFDPIDSubsystemLFDSpeedController;

	// Initialize your subsystem here
	public LFDPIDSubsystem() {
		// add Kf speed value to "super" & change Kp, Ki & Kd as needed
		super("LFDPIDSubsystem", 0.003, 0.0, 0.0, 2.2);
		setAbsoluteTolerance(0.2);
		getPIDController().setContinuous(false);
		LiveWindow.addActuator("LFD PID Subsystem", "PIDSubsystem Controller",
				getPIDController());
		getPIDController().setOutputRange(-1.0, 1.0);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// Add this to trigger a default control with joystick
		// SetDefaultCommand(new SwerveSetpointCommand());
	}

	protected double returnPIDInput() {
		// Return your input value for the PID loop
		return lFDEncoder.pidGet();
	}

	protected void usePIDOutput(double output) {
		// Use output to drive your system, like a motor
		lFDSpeedController.pidWrite(output);
	}

	public void updateStatus() {
		// added in SD video
		SmartDashboard.putNumber("LFD Encoder", lFDEncoder.getRate()); // Adds
																		// sensor
																		// output
																		// to
																		// SmartDashboard
	}
}
