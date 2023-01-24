package frc.team3128.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.team3128.subsystems.TestBenchSensors;

public class CmdGetGamePiece extends CommandBase{
    private TestBenchSensors sensors;

    public CmdGetGamePiece(TestBenchSensors sensors) {
        this.sensors = sensors;
        addRequirements(sensors);
    }

    @Override
    public void initialize(){}

    @Override
    public void execute(){
        System.out.println(sensors.getGamePiece());
    }

    @Override
    public void end(boolean interrupted){
    }

    @Override
    public boolean isFinished(){
        return false;
    }
}