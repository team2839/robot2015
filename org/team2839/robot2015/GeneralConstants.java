package org.team2839.robot2015;

public class GeneralConstants {

	public static final int FRONT_TOTE_PICKUP_MOTOR = 8;
	public static final int SIDE_TOTE_PICKUP_MOTOR = 9;
	public static final int CAN_PICKUP_MOTOR = 18;
	public static final int TURRET_MOTOR = 19;

	public static final int FRONT_TOTE_PICKUP_POT = 4;
	public static final int SIDE_TOTE_PICKUP_POT = 5;
	public static final int CAN_PICKUP_POT = 6;

	public static final int FRONT_TOTE_PICKUP_BOTTOM_SENSOR = 8;
	public static final int FRONT_TOTE_PICKUP_TOP_SENSOR = 9;
	public static final int SIDE_TOTE_PICKUP_BOTTOM_SENSOR = 10;
	public static final int SIDE_TOTE_PICKUP_TOP_SENSOR = 11;
	public static final int CAN_PICKUP_BOTTOM_SENSOR = 12;
	public static final int CAN_PICKUP_TOP_SENSOR = 13;
	public static final int TURRET_RIGHT_SENSOR = 14;
	public static final int TURRET_LEFT_SENSOR = 15;
	public static final int TURRET_ENCODER_A = 16;
	public static final int TURRET_ENCODER_B = 17;

	// Operator Interface slots
	public static final int DRIVE_JOYSTICK = 0;
	public static final int START_SETPOINT_BUTTON = 2;
	public static final int SPIN_SETPOINT_BUTTON = 1;

	public static final int OP_GAMEPAD = 1;

	// Miscellaneous
	public static final double MAX_MOTOR_VOLTAGE = 5.0;

	// Autonomous Stuff
	public static final double DISTANCE_BETWEEN_TOTES = 85.0; // inches
	public static final double AUTONOMOUS_DRIVE_SPEED = 0.5; // 0.0 to 1.0

	public static final double TURRET_PULSES_PER_REVOLUTION = 2000.0;
	public static final double TURRET_DEGREES_PER_PULSE = 360.0 / TURRET_PULSES_PER_REVOLUTION;
	public static final double TWISTY_POT_MAX_VOLTAGE = 5.0;
	public static final double TWISTY_POT_MIN_VOLTAGE = 0.0;
	public static final double CAN_PICKUP_OFFSET = 0;
	public static final double FRONT_TOTE_PICKUP_OFFSET = 0;
	public static final double SIDE_TOTE_PICKUP_OFFSET = 0;

	public static final double TWISTY_POT_TURNS = 10.0;
	public static final double CAN_PICKUP_INCHES_PER_TURN = 8.0;
	public static final double CAN_PICKUP_INCHES_PER_VOLT = (CAN_PICKUP_INCHES_PER_TURN * TWISTY_POT_TURNS)
			/ (TWISTY_POT_MAX_VOLTAGE - TWISTY_POT_MIN_VOLTAGE);
	public static final double FRONT_TOTE_PICKUP_INCHES_PER_TURN = 5.5;
	public static final double FRONT_TOTE_PICKUP_INCHES_PER_VOLT = (FRONT_TOTE_PICKUP_INCHES_PER_TURN * TWISTY_POT_TURNS)
			/ (TWISTY_POT_MAX_VOLTAGE - TWISTY_POT_MIN_VOLTAGE);
	public static final double SIDE_TOTE_PICKUP_INCHES_PER_TURN = 5.5;
	public static final double SIDE_TOTE_PICKUP_INCHES_PER_VOLT = (SIDE_TOTE_PICKUP_INCHES_PER_TURN * TWISTY_POT_TURNS)
			/ (TWISTY_POT_MAX_VOLTAGE - TWISTY_POT_MIN_VOLTAGE);

	public static final double TURRET_LEFT_DIRECTION = 1.0;
	public static final double TURRET_RIGHT_DIRECTION = -1.0
			* TURRET_LEFT_DIRECTION;
	public static final double CAN_PICKUP_UP_DIRECTION = 1.0;
	public static final double CAN_PICKUP_DOWN_DIRECTION = -1.0
			* CAN_PICKUP_UP_DIRECTION;
	public static final double FRONT_TOTE_PICKUP_UP_DIRECTION = 1.0;
	public static final double FRONT_TOTE_PICKUP_DOWN_DIRECTION = -1.0
			* FRONT_TOTE_PICKUP_UP_DIRECTION;
	public static final double SIDE_TOTE_PICKUP_UP_DIRECTION = 1.0;
	public static final double SIDE_TOTE_PICKUP_DOWN_DIRECTION = -1.0
			* SIDE_TOTE_PICKUP_UP_DIRECTION;

	public static final double TURRET_POSITION = 135.0; // degrees

	public static final double CAN_PICKUP_POSITION_ONE = 3.0; // inches
	public static final double CAN_PICKUP_POSITION_TWO = 15.0;
	public static final double CAN_PICKUP_POSITION_THREE = 21.0;

	public static final double FRONT_TOTE_PICKUP_POSITION_ONE = 26.0;
	public static final double FRONT_TOTE_PICKUP_POSITION_TWO = 40.0;
	public static final double FRONT_TOTE_PICKUP_POSITION_THREE = 44.0;

	public static final double SIDE_TOTE_PICKUP_POSITION = 26.0;

}
