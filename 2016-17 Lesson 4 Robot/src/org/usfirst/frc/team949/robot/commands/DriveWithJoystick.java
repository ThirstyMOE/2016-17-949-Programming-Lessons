
package org.usfirst.frc.team949.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team949.robot.Robot;

/**
 *
 */
public class DriveWithJoystick extends Command {
	
	private Joystick joystick;
	
	/**
	 * 
	 */
	private final double NERF_CONSTANT;
	
	/**
	 * 
	 */
	private double yInput;
	
	/**
	 * 
	 */
	private double zInput;

    public DriveWithJoystick() {
    	/* TO BE IMPLEMENTED IN LESSON 3*/
    	joystick = Robot.oi.getDriveJoystick();
    	NERF_CONSTANT = 0.5;
    	
        // Use requires() here to declare subsystem dependencies
        requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	/* TO BE IMPLEMENTED IN LESSON 3 */
    	yInput = joystick.getY();
    	zInput = joystick.getZ();
    	
    	if (Robot.oi.isButtonPressed(joystick, 2)) {
    		Robot.driveTrain.arcadeJoystick(yInput * NERF_CONSTANT, zInput * NERF_CONSTANT);
    	}
    	else {
    		Robot.driveTrain.arcadeJoystick(yInput, zInput);
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
