package org.team2839.robot2015;

public class PIDConstants {

	public static final double DRIVE_P = 0.002;
	public static final double DRIVE_I = 0.0;
	public static final double DRIVE_D = 0.0;
	public static final double DRIVE_F = 2.0;

	public static final double DRIVE_OUTPUT_MIN = -1.0;
	public static final double DRIVE_OUTPUT_MAX = 1.0;

	public static final double DRIVE_ABSOLUTE_TOLERANCE = 0.2;

	public static final double RF_SWERVE_P = 1.9;
	public static final double RF_SWERVE_I = 0.0;
	public static final double RF_SWERVE_D = 0.0;
	public static final double RF_SWERVE_ABSOLUTE_TOLERANCE = 0.001;

	public static final double LF_SWERVE_P = 1.6;
	public static final double LF_SWERVE_I = 0.0;
	public static final double LF_SWERVE_D = 0.0;
	public static final double LF_SWERVE_ABSOLUTE_TOLERANCE = 0.001;

	public static final double RR_SWERVE_P = 1.6;
	public static final double RR_SWERVE_I = 0.0;
	public static final double RR_SWERVE_D = 0.0;
	public static final double RR_SWERVE_ABSOLUTE_TOLERANCE = 0.001;

	public static final double LR_SWERVE_P = 2.1;
	public static final double LR_SWERVE_I = 0.0;
	public static final double LR_SWERVE_D = 0.0;
	public static final double LR_SWERVE_ABSOLUTE_TOLERANCE = 0.001;

	public static final double SWERVE_OUTPUT_MIN = -1.0;
	public static final double SWERVE_OUTPUT_MAX = 1.0;
	public static final double SWERVE_INPUT_MIN = 0.0;
	public static final double SWERVE_INPUT_MAX = 5.0;

	public static final double SWERVE_ABSOLUTE_TOLERANCE = 0.001;

	public static final double TURNTABLE_P = 1.0;
	public static final double TURNTABLE_I = 0.0;
	public static final double TURNTABLE_D = 0.0;

	public static final double TURNTABLE_OUTPUT_MIN = -0.15;
	public static final double TURNTABLE_OUTPUT_MAX = 0.15;
	public static final double TURNTABLE_INPUT_MIN = 0.0;
	public static final double TURNTABLE_INPUT_MAX = GeneralConstants.TURRET_PULSES_PER_REVOLUTION;

	public static final double TURNTABLE_ABSOLUTE_TOLERANCE = 2.0;

	public static final double LIFTER_P = 1.0;
	public static final double LIFTER_I = 0.0;
	public static final double LIFTER_D = 0.0;

	public static final double LIFTER_OUTPUT_MIN = -1.0;
	public static final double LIFTER_OUTPUT_MAX = 1.0;
	public static final double LIFTER_INPUT_MIN = GeneralConstants.TWISTY_POT_MIN_VOLTAGE;
	public static final double LIFTER_INPUT_MAX = GeneralConstants.TWISTY_POT_MAX_VOLTAGE;

	public static final double LIFTER_ABSOLUTE_TOLERANCE = 2.0;

	public static final double CAM_P = 1.0;
	public static final double CAM_I = 0.0;
	public static final double CAM_D = 0.0;

	public static final double CAM_OUTPUT_MIN = -0.15;
	public static final double CAM_OUTPUT_MAX = 0.15;
	public static final double CAM_INPUT_MIN = 0.0;
	public static final double CAM_INPUT_MAX = GeneralConstants.TURRET_PULSES_PER_REVOLUTION;

	public static final double CAM_ABSOLUTE_TOLERANCE = 2.0;

}
