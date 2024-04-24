package frc.robot.commands;

import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.subsystems.ElevatorSubsystem;

public class MoveElevatorCmd extends Command{

    ElevatorSubsystem elevatorSubsystem;
    boolean isGoingUp;
    boolean isFast;

    public MoveElevatorCmd(ElevatorSubsystem elevatorSubsystem, boolean isGoingUp, boolean isFast){
        this.elevatorSubsystem = elevatorSubsystem;
        this.isGoingUp = isGoingUp;
        this.isFast = isFast;

        addRequirements(elevatorSubsystem);
    }

    //Called when first initilized
    @Override
    public void initialize(){
        if(isGoingUp){
            elevatorSubsystem.RaiseElevator(isFast);
        }
        else{
            elevatorSubsystem.LowerElevator(isFast);
        }
    }


    //I am really deperately hoping this works
    @Override
    public void end(boolean interrupted){
        elevatorSubsystem.StopElevator();
    }
}
