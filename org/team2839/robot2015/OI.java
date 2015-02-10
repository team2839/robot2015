package org.team2839.robot2015;

import org.team2839.robot2015.autonomousCommands.AutonomousCommandGroup;
import org.team2839.robot2015.commands.CamReleaseCommand;
import org.team2839.robot2015.commands.DriveSpinCommand;
import org.team2839.robot2015.commands.DriveStartCommand;
import org.team2839.robot2015.commands.DriveStopCommand;
import org.team2839.robot2015.commands.DriveSwerveCommand;
import org.team2839.robot2015.commands.LifterCamMoveCommand;
import org.team2839.robot2015.commands.LifterCamZeroCommand;
import org.team2839.robot2015.commands.SpecificCommands;
import org.team2839.robot2015.commands.TurretZeroCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public static final Joystick driveJoystick = new Joystick(
			GeneralConstants.DRIVE_JOYSTICK);
	public JoystickButton spinSetpointButton;
	public JoystickButton startSetpointButton;

	public static final Gamepad operatorJoystick = new Gamepad(
			GeneralConstants.OP_GAMEPAD);
	public JoystickButton turretZeroButton;
	private JoystickButton turretLeftButton;
	private JoystickButton turretRightButton;
	private JoystickButton turretOffBackButton;

	private JoystickButton camZeroButton;
	private JoystickButton camInButton;
	private JoystickButton camOutButton;

	public OI() {
		startSetpointButton = new JoystickButton(driveJoystick,
				GeneralConstants.START_SETPOINT_BUTTON);
		startSetpointButton.whileHeld(new DriveStartCommand());
		startSetpointButton.whenReleased(new DriveStopCommand());

		spinSetpointButton = new JoystickButton(driveJoystick,
				GeneralConstants.SPIN_SETPOINT_BUTTON);
		spinSetpointButton.whileHeld(new DriveSpinCommand());
		spinSetpointButton.whenReleased(new DriveSwerveCommand());

		// turretZeroButton = new JoystickButton(operatorJoystick,
		// Gamepad.BUTTON_A);
		// turretZeroButton.whenReleased(new TurretZeroCommand());
		// turretLeftButton = new JoystickButton(operatorJoystick,
		// Gamepad.BUTTON_B);
		// turretLeftButton.whenReleased(SpecificCommands.turretToLeft);
		// turretRightButton = new JoystickButton(operatorJoystick,
		// Gamepad.BUTTON_X);
		// turretRightButton.whenReleased(SpecificCommands.turretToRight);
		// turretOffBackButton = new JoystickButton(operatorJoystick,
		// Gamepad.BUTTON_Y);
		// turretOffBackButton.whenReleased(SpecificCommands.turretTo45OffBack);

		camZeroButton = new JoystickButton(operatorJoystick, Gamepad.BUTTON_A);
		camZeroButton.whenReleased(new LifterCamZeroCommand());
		camInButton = new JoystickButton(operatorJoystick, Gamepad.BUTTON_B);
		camInButton.whenReleased(new LifterCamMoveCommand(
				GeneralConstants.CAM_IN_POSITION));
		camOutButton = new JoystickButton(operatorJoystick, Gamepad.BUTTON_X);
		camOutButton.whenReleased(new CamReleaseCommand());

		SmartDashboard.putData("Autonomous Command",
				new AutonomousCommandGroup());
		SmartDashboard.putData("Start Setpoint Command",
				new DriveStartCommand());
		SmartDashboard.putData("Spin Setpoint Command", new DriveSpinCommand());
		SmartDashboard.putData("Swerve Setpoint Command",
				new DriveSwerveCommand());
	}

	/**
	 * Converts the throttle (-1.0 to 1.0, usually inverted for some reason) to
	 * a range defined in the constants
	 */
	public static double getNormalThrottle() {
		// double throttle = (driveJoystick.getThrottle() * -1.0) + 1.0;
		// double scaled = ((throttle * (DriveTrainConstants.THROTTLE_MAX -
		// DriveTrainConstants.THROTTLE_MIN)) / 2.0)
		// + DriveTrainConstants.THROTTLE_MIN;
		// return scaled;
		double throttle = ((driveJoystick.getThrottle() * -1.0) + 1.0) / 2.0;
		return throttle;
	}

}
