package org.team2839.robot2015;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.livewindow.LiveWindowSendable;

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
		lFSPIDSubsystemLFSPot = new AnalogInput(
				DriveTrainConstants.LF_SWERVE_POT);
		LiveWindow.addSensor("LFS PID Subsystem", "LFS Pot",
				lFSPIDSubsystemLFSPot);
		lFSPIDSubsystemLFSSpeedController = new Talon(
				DriveTrainConstants.LF_SWERVE_TALON);
		LiveWindow.addActuator("LFS PID Subsystem", "LFS Speed Controller",
				(LiveWindowSendable) lFSPIDSubsystemLFSSpeedController);

		lFDPIDSubsystemLFDEncoder = new Encoder(
				DriveTrainConstants.LF_DRIVE_ENCODER_A,
				DriveTrainConstants.LF_DRIVE_ENCODER_B, false, EncodingType.k1X);
		LiveWindow.addSensor("LFD PID Subsystem", "LFD Encoder",
				lFDPIDSubsystemLFDEncoder);
		lFDPIDSubsystemLFDEncoder
				.setDistancePerPulse(GeneralConstants.DISTANCE_PER_PULSE);
		lFDPIDSubsystemLFDEncoder
				.setPIDSourceParameter(PIDSourceParameter.kRate);
		lFDPIDSubsystemLFDSpeedController = new Talon(
				DriveTrainConstants.LF_DRIVE_TALON);
		LiveWindow.addActuator("LFD PID Subsystem", "LFD Speed Controller",
				(LiveWindowSendable) lFDPIDSubsystemLFDSpeedController);

		rFSPIDSubsystemRFSPot = new AnalogInput(
				DriveTrainConstants.RF_SWERVE_POT);
		LiveWindow.addSensor("RFS PID Subsystem", "RFS Pot",
				rFSPIDSubsystemRFSPot);

		rFSPIDSubsystemRFSSpeedController = new Talon(
				DriveTrainConstants.RF_SWERVE_TALON);
		LiveWindow.addActuator("RFS PID Subsystem", "RFS Speed Controller",
				(LiveWindowSendable) rFSPIDSubsystemRFSSpeedController);

		rFDPIDSubsystemRFDEncoder = new Encoder(
				DriveTrainConstants.RF_DRIVE_ENCODER_A,
				DriveTrainConstants.RF_DRIVE_ENCODER_B, false, EncodingType.k1X);
		LiveWindow.addSensor("RFD PID Subsystem", "RFD Encoder",
				rFDPIDSubsystemRFDEncoder);
		rFDPIDSubsystemRFDEncoder
				.setDistancePerPulse(GeneralConstants.DISTANCE_PER_PULSE);
		rFDPIDSubsystemRFDEncoder
				.setPIDSourceParameter(PIDSourceParameter.kRate);
		rFDPIDSubsystemRFDSpeedController = new Talon(
				DriveTrainConstants.RF_DRIVE_TALON);
		LiveWindow.addActuator("RFD PID Subsystem", "RFD Speed Controller",
				(LiveWindowSendable) rFDPIDSubsystemRFDSpeedController);

		rRSPIDSubsystemRRSPot = new AnalogInput(
				DriveTrainConstants.RR_SWERVE_POT);
		LiveWindow.addSensor("RRS PID Subsystem", "RRS Pot",
				rRSPIDSubsystemRRSPot);

		rRSPIDSubsystemRRSSpeedController = new Talon(
				DriveTrainConstants.RR_SWERVE_TALON);
		LiveWindow.addActuator("RRS PID Subsystem", "RRS Speed Controller",
				(LiveWindowSendable) rRSPIDSubsystemRRSSpeedController);

		rRDPIDSubsystemRRDEncoder = new Encoder(
				DriveTrainConstants.RR_DRIVE_ENCODER_A,
				DriveTrainConstants.RR_DRIVE_ENCODER_B, false, EncodingType.k1X);
		LiveWindow.addSensor("RRD PID Subsystem", "RRD Encoder",
				rRDPIDSubsystemRRDEncoder);
		rRDPIDSubsystemRRDEncoder
				.setDistancePerPulse(GeneralConstants.DISTANCE_PER_PULSE);
		rRDPIDSubsystemRRDEncoder
				.setPIDSourceParameter(PIDSourceParameter.kRate);
		rRDPIDSubsystemRRDSpeedController = new Talon(
				DriveTrainConstants.RR_DRIVE_TALON);
		LiveWindow.addActuator("RRD PID Subsystem", "RRD Speed Controller",
				(LiveWindowSendable) rRDPIDSubsystemRRDSpeedController);

		lRSPIDSubsystemLRSPot = new AnalogInput(
				DriveTrainConstants.LR_SWERVE_POT);
		LiveWindow.addSensor("LRS PID Subsystem", "LRS Pot",
				lRSPIDSubsystemLRSPot);

		lRSPIDSubsystemLRSSpeedController = new Talon(
				DriveTrainConstants.LR_SWERVE_TALON);
		LiveWindow.addActuator("LRS PID Subsystem", "LRS Speed Controller",
				(LiveWindowSendable) lRSPIDSubsystemLRSSpeedController);

		lRDPIDSubsystemLRDEncoder = new Encoder(
				DriveTrainConstants.LR_DRIVE_ENCODER_A,
				DriveTrainConstants.LR_DRIVE_ENCODER_B, false, EncodingType.k1X);
		LiveWindow.addSensor("LRD PID Subsystem", "LRD Encoder",
				lRDPIDSubsystemLRDEncoder);
		lRDPIDSubsystemLRDEncoder
				.setDistancePerPulse(GeneralConstants.DISTANCE_PER_PULSE);
		lRDPIDSubsystemLRDEncoder
				.setPIDSourceParameter(PIDSourceParameter.kRate);
		lRDPIDSubsystemLRDSpeedController = new Talon(
				DriveTrainConstants.LR_DRIVE_TALON);
		LiveWindow.addActuator("LRD PID Subsystem", "LRD Speed Controller",
				(LiveWindowSendable) lRDPIDSubsystemLRDSpeedController);

		// gyroRangefinderGyro1 = new Gyro(Constants.RANGE_FINDER_GYRO);
		// gyroRangefinderRangefinder = new AnalogInput(Constants.RANGE_FINDER);
	}
}
