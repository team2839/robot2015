package org.team2839.robot2015.subsystems;

import org.team2839.robot2015.GeneralConstants;
import org.team2839.robot2015.PIDConstants;
import org.team2839.robot2015.RobotMap;
import org.team2839.robot2015.commands.CanStopCommand;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 *
 */
public class CanSubsystem extends PIDSubsystem {
	
	private AnalogInput pot;
	private SpeedController speedController;
	private double offset;

    // Initialize your subsystem here
    public CanSubsystem() {
    	super("CanLifterSubsystem", PIDConstants.CAN_LIFTER_P,
				PIDConstants.CAN_LIFTER_I, PIDConstants.CAN_LIFTER_D);
    	this.pot = RobotMap.canPickupPot;
    	this.speedController = RobotMap.canPickupMotor;
    	this.offset = GeneralConstants.CAN_PICKUP_OFFSET;
    	setAbsoluteTolerance(PIDConstants.CAN_LIFTER_ABSOLUTE_TOLERANCE);
    	LiveWindow.addActuator("CanLifterSubsystem", "PIDSubsystem Controller",
				getPIDController());
    	getPIDController().setOutputRange(PIDConstants.CAN_LIFTER_OUTPUT_MIN,
				PIDConstants.CAN_LIFTER_OUTPUT_MAX);
		getPIDController().setInputRange(PIDConstants.CAN_LIFTER_INPUT_MIN,
				PIDConstants.CAN_LIFTER_INPUT_MAX);
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new CanStopCommand());
    }
    
    protected double returnPIDInput() {
    	return pot.getAverageVoltage() - offset;
    }
    
    protected void usePIDOutput(double output) {
    	speedController.pidWrite(output);
    }
}
