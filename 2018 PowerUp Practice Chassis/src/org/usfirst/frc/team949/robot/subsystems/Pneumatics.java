package org.usfirst.frc.team949.robot.subsystems;

import org.usfirst.frc.team949.robot.commands.ResetActuator;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pneumatics extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Compressor compressor;
	//private Solenoid solenoid;
	
	private DoubleSolenoid doubleSolenoid;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ResetActuator());
    }
	
	public Pneumatics() 
	{
		compressor = new Compressor(0);
		//solenoid = new Solenoid(0);
		doubleSolenoid = new DoubleSolenoid(0, 1);
		
		compressor.setClosedLoopControl(true);
		compressor.start();
		//solenoid.set(false);
		doubleSolenoid.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void setSolenoidOn() 
	{
		//solenoid.set(true);
		doubleSolenoid.set(DoubleSolenoid.Value.kForward);
	}
	public void setSolenoidOff() 
	{
		//solenoid.set(false);
		doubleSolenoid.set(DoubleSolenoid.Value.kReverse);
	}
}

