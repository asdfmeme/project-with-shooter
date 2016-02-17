package org.usfirst.frc.team4576.robot.commands;

import org.usfirst.frc.team4576.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveWithJoysticks extends Command {
	public DriveWithJoysticks(){
		
		requires(Robot.chassis);
		//Need requires to run command
		requires(Robot.shooter);
        Robot.chassis.initTeleop();
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.chassis.normalDrive();
		// gamePadControl required in execute loop
		Robot.shooter.gamePadControl(Robot.shooterStick);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
