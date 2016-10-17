package org.usfirst.frc.team949.robot.commands;

import org.usfirst.frc.team949.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class JoystickArmControl extends Command {
	
	/**
	 * Is initialized in constructor to be operatorStick
	 */
	private Joystick joystick;
	
	/**
	 * Y axis value for operatorStick
	 */
	private double yInput;
	
	/**
	 * Power modifier for the arm movement
	 */
	private final double NERF_CONSTANT;
	
    public JoystickArmControl() {
    	joystick = Robot.oi.getOperatorJoystick();
    	NERF_CONSTANT = 0.8;
        // Use requires() here to declare subsystem dependencies
        requires(Robot.arm); 
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	yInput = joystick.getY();
    	
    	//Warning!: POWER MODE!!
    	if(Robot.oi.isButtonPressed(joystick, 1)) {
    		Robot.arm.joystickArm(yInput);
    	}
    	//Regular Mode
    	else {
    		Robot.arm.joystickArm(yInput * NERF_CONSTANT);
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
