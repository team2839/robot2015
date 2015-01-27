package org.team2839.robot2015;

public class PIDConstants {

	public static final double DRIVE_P = 0.003;
	public static final double DRIVE_I = 0.0;
	public static final double DRIVE_D = 0.0;
	public static final double DRIVE_F = 2.2;

	public static final double DRIVE_OUTPUT_MIN = -1.0;
	public static final double DRIVE_OUTPUT_MAX = 1.0;

	public static final double DRIVE_ABSOLUTE_TOLERANCE = 0.2;

	public static final double SWERVE_P = 1.0;
	public static final double SWERVE_I = 0.0;
	public static final double SWERVE_D = 0.0;

	public static final double SWERVE_OUTPUT_MIN = -1.0;
	public static final double SWERVE_OUTPUT_MAX = 1.0;
	public static final double SWERVE_INPUT_MIN = 0.0;
	public static final double SWERVE_INPUT_MAX = 5.0;

	public static final double SWERVE_ABSOLUTE_TOLERANCE = 0.1;

	public static final double TURNTABLE_P = 1.0;
	public static final double TURNTABLE_I = 0.0;
	public static final double TURNTABLE_D = 0.0;

	public static final double TURNTABLE_OUTPUT_MIN = -1.0;
	public static final double TURNTABLE_OUTPUT_MAX = 1.0;
	public static final double TURNTABLE_INPUT_MIN = 0.0;
	public static final double TURNTABLE_INPUT_MAX = GeneralConstants.TURRET_PULSES_PER_REVOLUTION;

	public static final double TURNTABLE_ABSOLUTE_TOLERANCE = 2.0;
	
	public static final double CAN_LIFTER_P = 1.0;
	public static final double CAN_LIFTER_I = 0.0;
	public static final double CAN_LIFTER_D = 0.0;

	public static final double CAN_LIFTER_OUTPUT_MIN = -1.0;
	public static final double CAN_LIFTER_OUTPUT_MAX = 1.0;
	public static final double CAN_LIFTER_INPUT_MIN = GeneralConstants.TWISTY_POT_MIN_VOLTAGE;
	public static final double CAN_LIFTER_INPUT_MAX = GeneralConstants.TWISTY_POT_MAX_VOLTAGE;
	
	public static final double CAN_LIFTER_ABSOLUTE_TOLERANCE = 2.0;

}
