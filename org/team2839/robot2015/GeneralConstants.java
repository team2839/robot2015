package org.team2839.robot2015;

public class GeneralConstants {

	public static final int FRONT_TOTE_PICKUP_MOTOR = 8;
	public static final int SIDE_TOTE_PICKUP_MOTOR = 9;
	public static final int CAN_PICKUP_MOTOR = 10;
	public static final int CAN_TURRET_MOTOR = 11;

	public static final int FRONT_TOTE_PICKUP_POT = 4;
	public static final int CAN_PICKUP_POT = 5;

	public static final int FRONT_TOTE_IN_POSITION_SENSOR = 8;
	public static final int FRONT_TOTE_BOTTOM_SENSOR = 9;
	public static final int FRONT_TOTE_TOP_SENSOR = 10;
	public static final int SIDE_TOTE_BOTTOM_SENSOR = 11;
	public static final int SIDE_TOTE_ONE_TOTE_SENSOR = 12;
	public static final int SIDE_TOTE_SCORING_SENSOR = 13;
	public static final int CAN_PICKUP_BOTTOM_SENSOR = 14;
	public static final int CAN_PICKUP_TOP_SENSOR = 15;
	public static final int TURNTABLE_ENCODER_A = 16;
	public static final int TURNTABLE_ENCODER_B = 17;

	// Operator Interface slots
	public static final int DRIVE_JOYSTICK = 0;
	public static final int START_SETPOINT_BUTTON = 2;
	public static final int SPIN_SETPOINT_BUTTON = 1;

	// Miscellaneous
	public static final double MAX_MOTOR_VOLTAGE = 5.0;

	public static final double DISTANCE_PER_REVOLUTION = 13.4; // inches
	public static final double PULSES_PER_REVOLUTION = 200.0;
	public static final double DISTANCE_PER_PULSE = DISTANCE_PER_REVOLUTION
			/ PULSES_PER_REVOLUTION;

	// Autonomous Stuff
	public static final double DISTANCE_BETWEEN_TOTES = 85.0; // inches
	public static final double AUTONOMOUS_DRIVE_SPEED = 0.5; // 0.0 to 1.0

}
