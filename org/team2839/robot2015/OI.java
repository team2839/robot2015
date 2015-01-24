package org.team2839.robot2015;

import org.team2839.robot2015.commands.AutonomousCommandGroup;
import org.team2839.robot2015.commands.DriveSpinCommand;
import org.team2839.robot2015.commands.DriveStartCommand;
import org.team2839.robot2015.commands.DriveStopCommand;
import org.team2839.robot2015.commands.DriveSwerveCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	// // CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// Another type of button you can create is a DigitalIOButton, which is
	// a button or switch hooked up to the cypress module. These are useful if
	// you want to build a customized operator interface.
	// Button button = new DigitalIOButton(1);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	// // TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());

	public JoystickButton spinSetpointButton;
	public JoystickButton startSetpointButton;

	public static final Joystick driveJoystick = new Joystick(
			GeneralConstants.DRIVE_JOYSTICK);

	public OI() {
		startSetpointButton = new JoystickButton(driveJoystick,
				GeneralConstants.START_SETPOINT_BUTTON);
		startSetpointButton.whileHeld(new DriveStartCommand());
		startSetpointButton.whenReleased(new DriveStopCommand());
		spinSetpointButton = new JoystickButton(driveJoystick,
				GeneralConstants.SPIN_SETPOINT_BUTTON); // squeeze trigger &
														// twist
		// joystick to spin robot
		spinSetpointButton.whileHeld(new DriveSpinCommand());
		spinSetpointButton.whenReleased(new DriveSwerveCommand()); // press
																	// once
																	// to
																	// start
																	// swerve
																	// mode

		// SmartDashboard Buttons
		SmartDashboard.putData("Autonomous Command",
				new AutonomousCommandGroup());
		SmartDashboard.putData("Start Setpoint Command",
				new DriveStartCommand());
		SmartDashboard.putData("Spin Setpoint Command", new DriveSpinCommand());
		SmartDashboard.putData("Swerve Setpoint Command",
				new DriveSwerveCommand());
	}

	public static double getNormalThrottle() {
		return (((driveJoystick.getThrottle() * -1.0) + 1.0) / 2.0);
	}

}
