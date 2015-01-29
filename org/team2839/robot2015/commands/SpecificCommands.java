package org.team2839.robot2015.commands;

import org.team2839.robot2015.GeneralConstants;

public class SpecificCommands {
	public static CanLiftCommand canLifterToBottomCommand = new CanLiftCommand(
			GeneralConstants.TWISTY_POT_MIN_VOLTAGE);
	public static CanLiftCommand canLifterToFirstLevelCommand = new CanLiftCommand(
			GeneralConstants.CAN_PICKUP_POSITION_ONE
					/ GeneralConstants.CAN_PICKUP_INCHES_PER_VOLT);
	public static CanLiftCommand canLifterToSecondLevelCommand = new CanLiftCommand(
			GeneralConstants.CAN_PICKUP_POSITION_TWO
					/ GeneralConstants.CAN_PICKUP_INCHES_PER_VOLT);
	public static CanLiftCommand canLifterToThirdLevelCommand = new CanLiftCommand(
			GeneralConstants.CAN_PICKUP_POSITION_THREE
					/ GeneralConstants.CAN_PICKUP_INCHES_PER_VOLT);
	public static CanLiftCommand canLifterToTopCommand = new CanLiftCommand(
			GeneralConstants.TWISTY_POT_MAX_VOLTAGE);

	public static FrontToteLiftCommand frontToteLifterToBottomCommand = new FrontToteLiftCommand(
			GeneralConstants.TWISTY_POT_MIN_VOLTAGE);
	public static FrontToteLiftCommand frontToteLifterToFirstLevelCommand = new FrontToteLiftCommand(
			GeneralConstants.FRONT_TOTE_PICKUP_POSITION_ONE
					/ GeneralConstants.FRONT_TOTE_PICKUP_INCHES_PER_VOLT);
	public static FrontToteLiftCommand frontToteLifterToSecondLevelCommand = new FrontToteLiftCommand(
			GeneralConstants.FRONT_TOTE_PICKUP_POSITION_TWO
					/ GeneralConstants.FRONT_TOTE_PICKUP_INCHES_PER_VOLT);
	public static FrontToteLiftCommand frontToteLifterToThirdLevelCommand = new FrontToteLiftCommand(
			GeneralConstants.FRONT_TOTE_PICKUP_POSITION_THREE
					/ GeneralConstants.FRONT_TOTE_PICKUP_INCHES_PER_VOLT);
	public static FrontToteLiftCommand frontToteLifterToTopCommand = new FrontToteLiftCommand(
			GeneralConstants.TWISTY_POT_MAX_VOLTAGE);

	public static SideToteLiftCommand sideToteLifterToBottomCommand = new SideToteLiftCommand(
			GeneralConstants.TWISTY_POT_MIN_VOLTAGE);
	public static SideToteLiftCommand sideToteLifterToFirstLevelCommand = new SideToteLiftCommand(
			GeneralConstants.SIDE_TOTE_PICKUP_POSITION
					/ GeneralConstants.SIDE_TOTE_PICKUP_INCHES_PER_VOLT);
	public static SideToteLiftCommand sideToteLifterToTopCommand = new SideToteLiftCommand(
			GeneralConstants.TWISTY_POT_MAX_VOLTAGE);

}
