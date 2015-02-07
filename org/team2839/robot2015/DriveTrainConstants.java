package org.team2839.robot2015;

public class DriveTrainConstants {

	// Slots on the Sideboard/RoboRIO
	public static final int LF_SWERVE_MOTOR = 0;
	public static final int RF_SWERVE_MOTOR = 2;
	public static final int RR_SWERVE_MOTOR = 4;
	public static final int LR_SWERVE_MOTOR = 6;

	public static final int LF_DRIVE_MOTOR = 1;
	public static final int RF_DRIVE_MOTOR = 3;
	public static final int RR_DRIVE_MOTOR = 5;
	public static final int LR_DRIVE_MOTOR = 7;

	public static final int LF_DRIVE_ENCODER_A = 0;
	public static final int LF_DRIVE_ENCODER_B = 1;
	public static final int RF_DRIVE_ENCODER_A = 2;
	public static final int RF_DRIVE_ENCODER_B = 3;
	public static final int RR_DRIVE_ENCODER_A = 4;
	public static final int RR_DRIVE_ENCODER_B = 5;
	public static final int LR_DRIVE_ENCODER_A = 6;
	public static final int LR_DRIVE_ENCODER_B = 7;

	public static final int LF_SWERVE_POT = 0;
	public static final int RF_SWERVE_POT = 1;
	public static final int RR_SWERVE_POT = 2;
	public static final int LR_SWERVE_POT = 3;

	public static final int RANGE_FINDER = 2;
	public static final int RANGE_FINDER_GYRO = 1; // Must be in 1 or 2?

	// Swerve offsets
	public static final double LF_SWERVE_OFFSET = 1.17;
	public static final double RF_SWERVE_OFFSET = 1.06;
	public static final double RR_SWERVE_OFFSET = 1.42;
	public static final double LR_SWERVE_OFFSET = 1.38;

	public static final double LF_SWERVE_SPIN_OFFSET = 1.771;
	public static final double RF_SWERVE_SPIN_OFFSET = 0.729;
	public static final double RR_SWERVE_SPIN_OFFSET = 4.271;
	public static final double LR_SWERVE_SPIN_OFFSET = 3.229;

	// Speed multipliers
	public static final double SPIN_MULTIPLIER = 0.20;
	public static final double DRIVE_MULTIPLIER = 1.0;
	public static final double DRIVE_STRAIGHT_MULTIPLIER = 1.0;
	public static final double SWERVE_MULTIPLIER = 0.5;

	public static final double THROTTLE_MIN = 0.1;
	public static final double THROTTLE_MAX = 1.0;

	// Misc.
	public static final double QUAD_ENCODER_DISTANCE_PER_PULSE = 0.01;

	public static final double SWERVE_LEFT = 90.0; // degrees
	public static final double DRIVE_STOP = 0.0;

	public static final double DISTANCE_PER_REVOLUTION = 13.4; // inches
	public static final double PULSES_PER_REVOLUTION = 200.0;
	public static final double DISTANCE_PER_PULSE = DISTANCE_PER_REVOLUTION
			/ PULSES_PER_REVOLUTION;

}
