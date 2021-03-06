package org.usfirst.frc.team3786.robot.commands.drive;

import org.usfirst.frc.team3786.robot.subsystems.ChargerDriveSubsystem;

import edu.wpi.first.wpilibj.command.Command;

public class BrakeOnCommand extends Command {

    public BrakeOnCommand() {
    }

    @Override
    protected void initialize() {
        ChargerDriveSubsystem.getInstance().setBrake(true);
    }

    @Override
    protected void execute() {
    }

    @Override
    protected boolean isFinished() {
        return true;
    }

    @Override
    protected void end() {
    }

}