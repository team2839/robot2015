package org.team2839.swerve;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.livewindow.LiveWindowSendable;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Encoder;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static AnalogInput lFSPIDSubsystemLFSPot;
	public static SpeedController lFSPIDSubsystemLFSSpeedController;
	public static Encoder lFDPIDSubsystemLFDEncoder;
	public static SpeedController lFDPIDSubsystemLFDSpeedController;
	public static AnalogInput rFSPIDSubsystemRFSPot;
	public static SpeedController rFSPIDSubsystemRFSSpeedController;
	public static Encoder rFDPIDSubsystemRFDEncoder;
	public static SpeedController rFDPIDSubsystemRFDSpeedController;
	public static AnalogInput rRSPIDSubsystemRRSPot;
	public static SpeedController rRSPIDSubsystemRRSSpeedController;
	public static Encoder rRDPIDSubsystemRRDEncoder;
	public static SpeedController rRDPIDSubsystemRRDSpeedController;
	public static AnalogInput lRSPIDSubsystemLRSPot;
	public static SpeedController lRSPIDSubsystemLRSSpeedController;
	public static Encoder lRDPIDSubsystemLRDEncoder;
	public static SpeedController lRDPIDSubsystemLRDSpeedController;

	// public static Gyro gyroRangefinderGyro1;
	// public static AnalogInput gyroRangefinderRangefinder;

	public static void init() {
		lFSPIDSubsystemLFSPot = new AnalogInput(Constants.LF_SWERVE_POT);
		LiveWindow.addSensor("LFS PID Subsystem", "LFS Pot",
				lFSPIDSubsystemLFSPot);
		lFSPIDSubsystemLFSSpeedController = new Talon(Constants.LF_SWERVE_TALON);
		LiveWindow.addActuator("LFS PID Subsystem", "LFS Speed Controller",
				(LiveWindowSendable) lFSPIDSubsystemLFSSpeedController);

		lFDPIDSubsystemLFDEncoder = new Encoder(Constants.LF_DRIVE_ENCODER_A,
				Constants.LF_DRIVE_ENCODER_B, false, EncodingType.k1X);
		LiveWindow.addSensor("LFD PID Subsystem", "LFD Encoder",
				lFDPIDSubsystemLFDEncoder);
		lFDPIDSubsystemLFDEncoder.setDistancePerPulse(.01); // (1.0);
		lFDPIDSubsystemLFDEncoder
				.setPIDSourceParameter(PIDSourceParameter.kRate);
		lFDPIDSubsystemLFDSpeedController = new Talon(Constants.LF_DRIVE_TALON);
		LiveWindow.addActuator("LFD PID Subsystem", "LFD Speed Controller",
				(LiveWindowSendable) lFDPIDSubsystemLFDSpeedController);

		rFSPIDSubsystemRFSPot = new AnalogInput(Constants.RF_SWERVE_POT);
		LiveWindow.addSensor("RFS PID Subsystem", "RFS Pot",
				rFSPIDSubsystemRFSPot);

		rFSPIDSubsystemRFSSpeedController = new Talon(Constants.RF_SWERVE_TALON);
		LiveWindow.addActuator("RFS PID Subsystem", "RFS Speed Controller",
				(LiveWindowSendable) rFSPIDSubsystemRFSSpeedController);

		rFDPIDSubsystemRFDEncoder = new Encoder(Constants.RF_DRIVE_ENCODER_A,
				Constants.RF_DRIVE_ENCODER_B, false, EncodingType.k1X);
		LiveWindow.addSensor("RFD PID Subsystem", "RFD Encoder",
				rFDPIDSubsystemRFDEncoder);
		rFDPIDSubsystemRFDEncoder.setDistancePerPulse(.01);
		rFDPIDSubsystemRFDEncoder
				.setPIDSourceParameter(PIDSourceParameter.kRate);
		rFDPIDSubsystemRFDSpeedController = new Talon(Constants.RF_DRIVE_TALON);
		LiveWindow.addActuator("RFD PID Subsystem", "RFD Speed Controller",
				(LiveWindowSendable) rFDPIDSubsystemRFDSpeedController);

		rRSPIDSubsystemRRSPot = new AnalogInput(Constants.RR_SWERVE_POT);
		LiveWindow.addSensor("RRS PID Subsystem", "RRS Pot",
				rRSPIDSubsystemRRSPot);

		rRSPIDSubsystemRRSSpeedController = new Talon(Constants.RR_SWERVE_TALON);
		LiveWindow.addActuator("RRS PID Subsystem", "RRS Speed Controller",
				(LiveWindowSendable) rRSPIDSubsystemRRSSpeedController);

		rRDPIDSubsystemRRDEncoder = new Encoder(Constants.RR_DRIVE_ENCODER_A,
				Constants.RR_DRIVE_ENCODER_B, false, EncodingType.k1X);
		LiveWindow.addSensor("RRD PID Subsystem", "RRD Encoder",
				rRDPIDSubsystemRRDEncoder);
		rRDPIDSubsystemRRDEncoder.setDistancePerPulse(.01);
		rRDPIDSubsystemRRDEncoder
				.setPIDSourceParameter(PIDSourceParameter.kRate);
		rRDPIDSubsystemRRDSpeedController = new Talon(Constants.RR_DRIVE_TALON);
		LiveWindow.addActuator("RRD PID Subsystem", "RRD Speed Controller",
				(LiveWindowSendable) rRDPIDSubsystemRRDSpeedController);

		lRSPIDSubsystemLRSPot = new AnalogInput(Constants.LR_SWERVE_POT);
		LiveWindow.addSensor("LRS PID Subsystem", "LRS Pot",
				lRSPIDSubsystemLRSPot);

		lRSPIDSubsystemLRSSpeedController = new Talon(Constants.LR_SWERVE_TALON);
		LiveWindow.addActuator("LRS PID Subsystem", "LRS Speed Controller",
				(LiveWindowSendable) lRSPIDSubsystemLRSSpeedController);

		lRDPIDSubsystemLRDEncoder = new Encoder(Constants.LR_DRIVE_ENCODER_A,
				Constants.LR_DRIVE_ENCODER_B, false, EncodingType.k1X);
		LiveWindow.addSensor("LRD PID Subsystem", "LRD Encoder",
				lRDPIDSubsystemLRDEncoder);
		lRDPIDSubsystemLRDEncoder.setDistancePerPulse(.01);
		lRDPIDSubsystemLRDEncoder
				.setPIDSourceParameter(PIDSourceParameter.kRate);
		lRDPIDSubsystemLRDSpeedController = new Talon(Constants.LR_DRIVE_TALON);
		LiveWindow.addActuator("LRD PID Subsystem", "LRD Speed Controller",
				(LiveWindowSendable) lRDPIDSubsystemLRDSpeedController);

		// gyroRangefinderGyro1 = new Gyro(Constants.RANGE_FINDER_GYRO); //gyros
		// must be in either port 1 or 2
		// gyroRangefinderRangefinder = new AnalogInput(Constants.RANGE_FINDER);
	}
}
