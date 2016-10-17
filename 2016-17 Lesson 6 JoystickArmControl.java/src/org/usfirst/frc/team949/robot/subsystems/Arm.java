package org.usfirst.frc.team949.robot.subsystems;

import org.usfirst.frc.team949.robot.RobotMap;
import org.usfirst.frc.team949.robot.commands.JoystickArmControl;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Arm extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	/**
	 * CANTalon speedController that corresponds to the arm motor.
	 */
	private CANTalon armMotor;
	
	public Arm() {
		armMotor = new CANTalon(RobotMap.armMotor);
		armMotor.setSafetyEnabled(false);
		armMotor.setInverted(true);

	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new JoystickArmControl());
    }
    
    public void joystickArm(double moveValue) {
    	armMotor.set(moveValue);
    }
}

