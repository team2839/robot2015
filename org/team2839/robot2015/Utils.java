package org.team2839.robot2015;

public class Utils {

	/**
	 * Takes a direction from 0 to 360.0 and normalizes it to 0 to 5
	 * 
	 * @param joystickDirection
	 * @return
	 */
	public static final double directionToVoltage(double degrees) {
		double circlePart = 360.0 / GeneralConstants.MAX_MOTOR_VOLTAGE;
		return GeneralConstants.MAX_MOTOR_VOLTAGE - (degrees / circlePart);
	}

	/**
	 * Takes a direction from -180.0 to 180.0 and normalizes it to 0 to 5
	 * 
	 * @param joystickDirection
	 * @return
	 */
	public static final double joystickDirectionToVoltage(
			double joystickDirection) {
		double degrees = joystickDirection + 180.0;
		double circlePart = 360.0 / GeneralConstants.MAX_MOTOR_VOLTAGE;
		return GeneralConstants.MAX_MOTOR_VOLTAGE - (degrees / circlePart);
	}

}
