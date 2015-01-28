package org.team2839.robot2015;

import edu.wpi.first.wpilibj.Joystick;

public class Gamepad extends Joystick {

	public static final int LEFT_X_AXIS = 0;
	public static final int LEFT_Y_AXIS = 1;
	public static final int LEFT_TRIGGER = 2;
	public static final int RIGHT_TRIGGER = 3;
	public static final int RIGHT_X_AXIS = 4;
	public static final int RIGHT_Y_AXIS = 5;

	public static final int BUTTON_A = 1;
	public static final int BUTTON_B = 2;
	public static final int BUTTON_X = 3;
	public static final int BUTTON_Y = 4;
	public static final int BUTTON_LEFT = 5;
	public static final int BUTTON_RIGHT = 6;
	public static final int BUTTON_BACK = 7;
	public static final int BUTTON_START = 8;
	public static final int BUTTON_LEFT_THUMB = 9;
	public static final int BUTTON_RIGHT_THUMB = 10;

	public Gamepad(int slot) {
		super(slot);
	}

	public double getLeftX() {
		return getRawAxis(LEFT_X_AXIS);
	}

	public double getLeftY() {
		return getRawAxis(LEFT_Y_AXIS);
	}

	public double getRightX() {
		return getRawAxis(RIGHT_X_AXIS);
	}

	public double getRightY() {
		return getRawAxis(RIGHT_Y_AXIS);
	}

	public double getLeftTrigger() {
		return getRawAxis(LEFT_TRIGGER);
	}

	public double getRightTrigger() {
		return getRawAxis(RIGHT_TRIGGER);
	}

}
