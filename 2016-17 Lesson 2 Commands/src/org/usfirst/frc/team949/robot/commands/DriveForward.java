package org.usfirst.frc.team949.robot.commands;

import org.usfirst.frc.team949.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveForward extends Command {
	
	/**
	 * Constructor that initializes the DriveForward command.
	 * Takes duration and links to Command superclass in order to access its built in timer function.
	 * @param duration How long DriveForward lasts
	 */
    public DriveForward(double duration) {
    	super(duration);
        // Use requires() here to declare subsystem dependencies
        requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	/* TO BE IMPLEMENTED IN LESSON 2 */
    	Robot.driveTrain.driveForward();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}