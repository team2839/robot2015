package org.team2839.swerve;

public class Constants {

	// Slots on the Sideboard/RoboRIO
	public static final int LF_SWERVE_TALON = 0;
	public static final int RF_SWERVE_TALON = 2;
	public static final int RR_SWERVE_TALON = 4;
	public static final int LR_SWERVE_TALON = 6;

	public static final int LF_DRIVE_TALON = 1;
	public static final int RF_DRIVE_TALON = 3;
	public static final int RR_DRIVE_TALON = 5;
	public static final int LR_DRIVE_TALON = 7;

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

	public static final int RANGE_FINDER = 8;
	public static final int RANGE_FINDER_GYRO = 9;

	// Operator Interface slots
	public static final int DRIVE_JOYSTICK = 0;
	public static final int START_SETPOINT_BUTTON = 2;
	public static final int SPIN_SETPOINT_BUTTON = 1;

	// Swerve offsets
	public static final double LF_SWERVE_OFFSET = 2.48;
	public static final double RF_SWERVE_OFFSET = 2.55;
	public static final double RR_SWERVE_OFFSET = 2.56;
	public static final double LR_SWERVE_OFFSET = 2.46;

	public static final double LF_SWERVE_SPIN_OFFSET = LF_SWERVE_OFFSET + 1.81;
	public static final double RF_SWERVE_SPIN_OFFSET = RF_SWERVE_OFFSET + 0.51;
	public static final double RR_SWERVE_SPIN_OFFSET = RR_SWERVE_OFFSET - 0.69;
	public static final double LR_SWERVE_SPIN_OFFSET = LR_SWERVE_OFFSET - 1.92;

	// Speed multipliers
	public static final double SPIN_MULTIPLIER = 0.5;
	public static final double DRIVE_MULTIPLIER = 1.0;
	public static final double SWERVE_MULTIPLIER = -0.5;

	// Miscellaneous
	public static final double MAX_MOTOR_VOLTAGE = 5.0;

}
