
package org.usfirst.frc.team949.robot.subsystems;

import org.usfirst.frc.team949.robot.RobotMap;
import org.usfirst.frc.team949.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * A DriveTrain subsystem which includes the drive motors and the methods to be executed by 
 * drive commands.
 */
public class DriveTrain extends Subsystem {
    
	/**
	 * CANTalon SpeedController that corresponds to the left motor
	 */
	private CANTalon leftMotor;
	
	/**
	 * CANTalon SpeedController that corresponds to the right motor
	 */
	private CANTalon rightMotor;
	
	/**
	 * RobotDrive object that enables motors to be controlled via Joystick
	 */
	private RobotDrive driveTrain;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	/**
	 * The DriveTrain constructor. All motors and sensors should be initialized here, so 
	 * that they are initialized when the subsystem is declared in Robot.java
	 */
	public DriveTrain() {
		/* TO BE IMPLEMENTED IN LESSON 1 */
		leftMotor = new CANTalon(RobotMap.leftMotor);
		rightMotor = new CANTalon(RobotMap.rightMotor);
		driveTrain = new RobotDrive(leftMotor, rightMotor);
		invertMotors();
	}

    public void initDefaultCommand() {
    	/* TO BE IMPLEMENTED IN LESSON 3 */
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithJoystick());
    }
    
    public void arcadeJoystick(double moveValue, double rotateValue) {
    	/* TO BE IMPLEMENTED IN LESSON 3*/
    	driveTrain.arcadeDrive(moveValue, rotateValue, true);
    }
    
    public void driveForward() {
    	/* TO BE IMPLEMENTED IN LESSON 1 */
    	driveTrain.arcadeDrive(1.0, 0.0);
    }
    
    public void brake() {
    	/* TO BE IMPLEMENTED IN LESSON 4*/
    	driveTrain.arcadeDrive(0.0, 0.0);
    }
    
    private void invertMotors() {
    	/* TO BE IMPLEMENTED IN LESSON 3 */
    	driveTrain.setInvertedMotor(RobotDrive.MotorType.kRearLeft, false);
    	driveTrain.setInvertedMotor(RobotDrive.MotorType.kRearRight, false);
    }

}

