package org.usfirst.frc.team4576.robot.subsystems;

//import org.usfirst.frc.team4576.robot.Robot;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.Timer;
//import edu.wpi.first.wpilibj.DigitalInput;
//import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
	//public static final int RIGHT_AXIS = 3;
	//public static final int LEFT_AXIS = 2;

	public Shooter() {
	}

	CANTalon shooterTalon1 = new CANTalon(4);
	CANTalon shooterTalon2 = new CANTalon(5);

	//DigitalInput d6 = new DigitalInput(8);
	//DigitalInput d7 = new DigitalInput(9);

	@Override
	protected void initDefaultCommand() {

	}

	public void up() {
		//Timer.delay(1);
		shooterTalon1.set(.25);
		shooterTalon2.set(-.25);

	}

	public void down() {
		//Timer.delay(1);
		shooterTalon1.set(-.25);
		shooterTalon2.set(.25);
	}

	public void stop() {
		shooterTalon1.set(0);
		shooterTalon2.set(0);
	}

	public void gamePadControl(Joystick stick)
	{
		
		//System.out.println("gamepad control");
		//System.out.println(stick.getRawAxis(3) +  " " + stick.getRawAxis(2));
			if(stick.getRawAxis(3) - stick.getRawAxis(2) < 0 && stick.getRawAxis(3) - stick.getRawAxis(2) > -0.1)
			{
				shooterTalon1.set(0);
				shooterTalon2.set(0);
				return;
			}
		
		
		
			if(stick.getRawAxis(3) - stick.getRawAxis(2) > 0 && stick.getRawAxis(3) - stick.getRawAxis(2) < 0.1)
			{
				shooterTalon1.set(0);
				shooterTalon2.set(0);
				return;
			}
		
		
		shooterTalon1.set(stick.getRawAxis(3) - stick.getRawAxis(2));
		shooterTalon2.set(stick.getRawAxis(3) - stick.getRawAxis(2));
	}
	}
	

