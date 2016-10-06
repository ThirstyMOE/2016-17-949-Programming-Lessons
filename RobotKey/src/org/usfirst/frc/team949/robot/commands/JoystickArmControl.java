package org.usfirst.frc.team949.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *	JoystickArmControl command is a tele-Op command that will control arm movement with operator joystick
 */
public class JoystickArmControl extends Command {
	
    public JoystickArmControl() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	/*
    	 * Implemented in the Arm.java lesson.
	 * Draw from your methods in the Arm.java subsystem to give functionality here
    	 */
    	
    	
    }


    // WARNING! Don't change anything below!! 
	
	
	
	
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
