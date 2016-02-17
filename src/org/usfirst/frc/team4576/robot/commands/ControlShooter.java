package org.usfirst.frc.team4576.robot.commands;

import org.usfirst.frc.team4576.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ControlShooter extends Command{

	private boolean up = true;
	public ControlShooter(boolean up)
	{
		this.up = up;
		requires(Robot.shooter);
	}
	@Override
	protected void initialize() {
		
		
	}
	@Override
	protected void execute() {
		if(up){
			Robot.shooter.up();
		}else{
			Robot.shooter.down();
		}
		
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
		end();
	}
	
}
