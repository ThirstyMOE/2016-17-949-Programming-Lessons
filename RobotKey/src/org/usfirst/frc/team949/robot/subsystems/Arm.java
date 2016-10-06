package org.usfirst.frc.team949.robot.subsystems;

import org.usfirst.frc.team949.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Arm extends Subsystem {
	
	private CANTalon armMotor;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public Arm() {
		armMotor = new CANTalon(RobotMap.armMotor);
		invertMotor(false);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void armControl(int outputValue) {
    	armMotor.set(Math.pow(outputValue, 2));
    }
    
    public void invertMotor(boolean flip) {
    	armMotor.reverseOutput(flip);
    }
}

