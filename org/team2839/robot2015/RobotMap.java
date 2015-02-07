package org.team2839.robot2015;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.livewindow.LiveWindowSendable;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.DigitalInput;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static AnalogInput LFSPot;
	public static SpeedController LFSSpeedController;
	public static Encoder LFDEncoder;
	public static SpeedController LFDSpeedController;
	public static AnalogInput RFSPot;
	public static SpeedController RFSSpeedController;
	public static Encoder RFDEncoder;
	public static SpeedController RFDSpeedController;
	public static AnalogInput RRSPot;
	public static SpeedController RRSSpeedController;
	public static Encoder RRDEncoder;
	public static SpeedController RRDSpeedController;
	public static AnalogInput LRSPot;
	public static SpeedController LRSSpeedController;
	public static Encoder LRDEncoder;
	public static SpeedController LRDSpeedController;

	public static PositionalQuadEncoder turretEncoder;
	public static SpeedController turretMotor;
	public static DigitalInput turretLeftLimitSwitch;
	public static DigitalInput turretRightLimitSwitch;

	public static SpeedController canPickupMotor;
	public static AnalogInput canPickupPot;
	public static DigitalInput canPickupTopLimitSwitch;
	public static DigitalInput canPickupBottomLimitSwitch;

	public static SpeedController frontTotePickupMotor;
	public static AnalogInput frontTotePickupPot;
	public static DigitalInput frontTotePickupTopLimitSwitch;
	public static DigitalInput frontTotePickupBottomLimitSwitch;

	public static SpeedController sideTotePickupMotor;
	public static AnalogInput sideTotePickupPot;
	public static DigitalInput sideTotePickupTopLimitSwitch;
	public static DigitalInput sideTotePickupBottomLimitSwitch;

	public static PositionalQuadEncoder lifterCamEncoder;
	public static SpeedController lifterCamMotor;
	public static DigitalInput lifterCamZeroLimitSwitch;

	// public static Gyro gyroRangefinderGyro1;
	// public static AnalogInput gyroRangefinderRangefinder;

	public static void init() {
		LFSPot = new AnalogInput(DriveTrainConstants.LF_SWERVE_POT);
		LiveWindow.addSensor("LFS PID Subsystem", "LFS Pot", LFSPot);
		LFSSpeedController = new Victor(DriveTrainConstants.LF_SWERVE_MOTOR);
		LiveWindow.addActuator("LFS PID Subsystem", "LFS Speed Controller",
				(LiveWindowSendable) LFSSpeedController);

		LFDEncoder = new Encoder(DriveTrainConstants.LF_DRIVE_ENCODER_A,
				DriveTrainConstants.LF_DRIVE_ENCODER_B, false, EncodingType.k1X);
		LiveWindow.addSensor("LFD PID Subsystem", "LFD Encoder", LFDEncoder);
		LFDEncoder.setDistancePerPulse(DriveTrainConstants.DISTANCE_PER_PULSE);
		LFDEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
		LFDSpeedController = new Victor(DriveTrainConstants.LF_DRIVE_MOTOR);
		LiveWindow.addActuator("LFD PID Subsystem", "LFD Speed Controller",
				(LiveWindowSendable) LFDSpeedController);

		RFSPot = new AnalogInput(DriveTrainConstants.RF_SWERVE_POT);
		LiveWindow.addSensor("RFS PID Subsystem", "RFS Pot", RFSPot);

		RFSSpeedController = new Victor(DriveTrainConstants.RF_SWERVE_MOTOR);
		LiveWindow.addActuator("RFS PID Subsystem", "RFS Speed Controller",
				(LiveWindowSendable) RFSSpeedController);

		RFDEncoder = new Encoder(DriveTrainConstants.RF_DRIVE_ENCODER_A,
				DriveTrainConstants.RF_DRIVE_ENCODER_B, false, EncodingType.k1X);
		LiveWindow.addSensor("RFD PID Subsystem", "RFD Encoder", RFDEncoder);
		RFDEncoder.setDistancePerPulse(DriveTrainConstants.DISTANCE_PER_PULSE);
		RFDEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
		RFDSpeedController = new Victor(DriveTrainConstants.RF_DRIVE_MOTOR);
		LiveWindow.addActuator("RFD PID Subsystem", "RFD Speed Controller",
				(LiveWindowSendable) RFDSpeedController);

		RRSPot = new AnalogInput(DriveTrainConstants.RR_SWERVE_POT);
		LiveWindow.addSensor("RRS PID Subsystem", "RRS Pot", RRSPot);

		RRSSpeedController = new Victor(DriveTrainConstants.RR_SWERVE_MOTOR);
		LiveWindow.addActuator("RRS PID Subsystem", "RRS Speed Controller",
				(LiveWindowSendable) RRSSpeedController);

		RRDEncoder = new Encoder(DriveTrainConstants.RR_DRIVE_ENCODER_A,
				DriveTrainConstants.RR_DRIVE_ENCODER_B, false, EncodingType.k1X);
		LiveWindow.addSensor("RRD PID Subsystem", "RRD Encoder", RRDEncoder);
		RRDEncoder.setDistancePerPulse(DriveTrainConstants.DISTANCE_PER_PULSE);
		RRDEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
		RRDSpeedController = new Victor(DriveTrainConstants.RR_DRIVE_MOTOR);
		LiveWindow.addActuator("RRD PID Subsystem", "RRD Speed Controller",
				(LiveWindowSendable) RRDSpeedController);

		LRSPot = new AnalogInput(DriveTrainConstants.LR_SWERVE_POT);
		LiveWindow.addSensor("LRS PID Subsystem", "LRS Pot", LRSPot);

		LRSSpeedController = new Victor(DriveTrainConstants.LR_SWERVE_MOTOR);
		LiveWindow.addActuator("LRS PID Subsystem", "LRS Speed Controller",
				(LiveWindowSendable) LRSSpeedController);

		LRDEncoder = new Encoder(DriveTrainConstants.LR_DRIVE_ENCODER_A,
				DriveTrainConstants.LR_DRIVE_ENCODER_B, false, EncodingType.k1X);
		LiveWindow.addSensor("LRD PID Subsystem", "LRD Encoder", LRDEncoder);
		LRDEncoder.setDistancePerPulse(DriveTrainConstants.DISTANCE_PER_PULSE);
		LRDEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
		LRDSpeedController = new Victor(DriveTrainConstants.LR_DRIVE_MOTOR);
		LiveWindow.addActuator("LRD PID Subsystem", "LRD Speed Controller",
				(LiveWindowSendable) LRDSpeedController);

		turretEncoder = new PositionalQuadEncoder(
				GeneralConstants.TURRET_ENCODER_A,
				GeneralConstants.TURRET_ENCODER_B, false, EncodingType.k1X);
		turretEncoder
				.setPulsesPerRevolution(GeneralConstants.TURRET_PULSES_PER_REVOLUTION);
		LiveWindow.addSensor("Turret Subsystem", "Turret Encoder",
				(LiveWindowSendable) turretEncoder);
		turretMotor = new Victor(GeneralConstants.TURRET_MOTOR);
		LiveWindow.addActuator("Turret Subsystem", "Turret Speed Controller",
				(LiveWindowSendable) turretMotor);
		turretLeftLimitSwitch = new DigitalInput(
				GeneralConstants.TURRET_LEFT_SENSOR);
		LiveWindow.addSensor("Turret Subsystem", "Turret Left Sensor",
				(LiveWindowSendable) turretLeftLimitSwitch);
		turretRightLimitSwitch = new DigitalInput(
				GeneralConstants.TURRET_RIGHT_SENSOR);
		LiveWindow.addSensor("Turret Subsystem", "Turret Right Sensor",
				(LiveWindowSendable) turretRightLimitSwitch);

		canPickupMotor = new Victor(GeneralConstants.CAN_PICKUP_MOTOR);
		LiveWindow.addActuator("Can Subsystem", "Can Speed Controller",
				(LiveWindowSendable) canPickupMotor);
		canPickupPot = new AnalogInput(GeneralConstants.CAN_PICKUP_POT);
		LiveWindow.addSensor("Can Subsystem", "Can Pot",
				(LiveWindowSendable) canPickupPot);
		canPickupTopLimitSwitch = new DigitalInput(
				GeneralConstants.CAN_PICKUP_TOP_SENSOR);
		LiveWindow.addSensor("Can Subsystem", "Can Top Sensor",
				(LiveWindowSendable) canPickupTopLimitSwitch);
		canPickupBottomLimitSwitch = new DigitalInput(
				GeneralConstants.CAN_PICKUP_BOTTOM_SENSOR);
		LiveWindow.addSensor("Can Subsystem", "Can Bottom Sensor",
				(LiveWindowSendable) canPickupBottomLimitSwitch);

		frontTotePickupMotor = new Victor(
				GeneralConstants.FRONT_TOTE_PICKUP_MOTOR);
		LiveWindow.addActuator("Front Tote Subsystem",
				"Front Tote Speed Controller",
				(LiveWindowSendable) frontTotePickupMotor);
		frontTotePickupPot = new AnalogInput(
				GeneralConstants.FRONT_TOTE_PICKUP_POT);
		LiveWindow.addSensor("Front Tote Subsystem", "Front Tote Pot",
				(LiveWindowSendable) frontTotePickupPot);
		frontTotePickupTopLimitSwitch = new DigitalInput(
				GeneralConstants.FRONT_TOTE_PICKUP_TOP_SENSOR);
		LiveWindow.addSensor("Front Tote Subsystem", "Front Tote Top Sensor",
				(LiveWindowSendable) frontTotePickupTopLimitSwitch);
		frontTotePickupBottomLimitSwitch = new DigitalInput(
				GeneralConstants.FRONT_TOTE_PICKUP_BOTTOM_SENSOR);
		LiveWindow.addSensor("Front Tote Subsystem",
				"Front Tote Bottom Sensor",
				(LiveWindowSendable) frontTotePickupBottomLimitSwitch);

		sideTotePickupMotor = new Victor(
				GeneralConstants.SIDE_TOTE_PICKUP_MOTOR);
		LiveWindow.addActuator("Side Tote Subsystem",
				"Side Tote Speed Controller",
				(LiveWindowSendable) sideTotePickupMotor);
		sideTotePickupPot = new AnalogInput(
				GeneralConstants.SIDE_TOTE_PICKUP_POT);
		LiveWindow.addSensor("Side Tote Subsystem", "Side Tote Pot",
				(LiveWindowSendable) sideTotePickupPot);
		sideTotePickupTopLimitSwitch = new DigitalInput(
				GeneralConstants.SIDE_TOTE_PICKUP_TOP_SENSOR);
		LiveWindow.addSensor("Side Tote Subsystem", "Side Tote Top Sensor",
				(LiveWindowSendable) sideTotePickupTopLimitSwitch);
		sideTotePickupBottomLimitSwitch = new DigitalInput(
				GeneralConstants.SIDE_TOTE_PICKUP_BOTTOM_SENSOR);
		LiveWindow.addSensor("Side Tote Subsystem", "Side Tote Bottom Sensor",
				(LiveWindowSendable) sideTotePickupBottomLimitSwitch);

		lifterCamEncoder = new PositionalQuadEncoder(
				GeneralConstants.CAM_ENCODER_A, GeneralConstants.CAM_ENCODER_B,
				false, EncodingType.k1X);
		lifterCamEncoder
				.setPulsesPerRevolution(GeneralConstants.TURRET_PULSES_PER_REVOLUTION);
		LiveWindow.addSensor("Cam Subsystem", "Cam Encoder",
				(LiveWindowSendable) lifterCamEncoder);
		lifterCamMotor = new Victor(GeneralConstants.CAM_MOTOR);
		LiveWindow.addActuator("Cam Subsystem", "Cam Speed Controller",
				(LiveWindowSendable) lifterCamMotor);
		lifterCamZeroLimitSwitch = new DigitalInput(
				GeneralConstants.CAM_ZERO_SENSOR);
		LiveWindow.addSensor("Cam Subsystem", "Cam Zero Sensor",
				(LiveWindowSendable) lifterCamZeroLimitSwitch);

		// gyroRangefinderGyro1 = new Gyro(Constants.RANGE_FINDER_GYRO);
		// gyroRangefinderRangefinder = new AnalogInput(Constants.RANGE_FINDER);
	}
}
