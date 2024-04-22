package frc.robot.commands;

import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.subsystems.ElevatorSubsystem;

public class MoveElevatorCmd extends Command{

    ElevatorSubsystem elevatorSubsystem;
    boolean isGoingUp;

    public MoveElevatorCmd(ElevatorSubsystem elevatorSubsystem, boolean isGoingUp){
        this.elevatorSubsystem = elevatorSubsystem;
        this.isGoingUp = isGoingUp;

        addRequirements(elevatorSubsystem);
    }

    //Called when first initilized
    @Override
    public void initialize(){
        if(isGoingUp){
            elevatorSubsystem.RaiseElevator();
        }
        else{
            elevatorSubsystem.LowerElevator();
        }
    }


    //I am really deperately hoping this works
    @Override
    public void end(boolean interrupted){
        elevatorSubsystem.StopElevator();
    }
}
