package org.usfirst.frc.team4576.robot.subsystems;

import org.usfirst.frc.team4576.robot.Robot;

//import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Chassis extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	boolean manualOverride = false;

	CANTalon tsrxL = new CANTalon(0);
	CANTalon tsrxR = new CANTalon(1);
	CANTalon tsrxL2 = new CANTalon(2);
	CANTalon tsrxR2 = new CANTalon(3);
	//CANTalon tsrxSL1 = new CANTalon(4);
	//CANTalon tsrxSR2 = new CANTalon(5);
	// (Shooter talons below)
	// CANTalon tsrxL3 = new CANTalon(4);
	// CANTalon tsrxR3 = new CANTalon(5);
	
	// This defines the talons used to drive.
	RobotDrive drive = new RobotDrive(tsrxL, tsrxL2, tsrxR, tsrxR2);
	// These 2 lines declare the axes for turning
	public static final int FORWARD_AXIS = 1;
	public static final int TURN_AXIS = 4;

	PowerDistributionPanel pdp = new PowerDistributionPanel();

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	// This defines whether a talon is on the right or left.
	public void setLeftRight(double left, double right) {
		tsrxR.set(right);
		tsrxR2.set(right);
		// tsrxR3.set(right);
		tsrxL.set(left);
		tsrxL2.set(left);
		// tsrxL3.set(left);
	}

	public void disable() {
		tsrxR.disable();
		tsrxR2.disable();
		// tsrxR3.disable();
		tsrxL.disable();
		tsrxL2.disable();
		// tsrxL3.disable();

	}

	public void initAuto() {
		drive.setSafetyEnabled(false);
	}

	public void initTeleop() {
		drive.setSafetyEnabled(true);
	}
//This declares that for driving only the assigned axes are used.
	public void normalDrive() {
		drive.arcadeDrive(Robot.driveStick.getRawAxis(FORWARD_AXIS), Robot.driveStick.getRawAxis(TURN_AXIS));
	}

}