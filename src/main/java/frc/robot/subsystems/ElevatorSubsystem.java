package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import frc.robot.Constants;

public class ElevatorSubsystem extends SubsystemBase {
  private final CANSparkMax elevatorMotor;

  public ElevatorSubsystem() {
    elevatorMotor = new CANSparkMax(Constants.OperatorConstants.kElevatorID, MotorType.kBrushed);
  }

  //speed is 0 - 1
  public void RunMotor(double speed){
    elevatorMotor.set(speed);
  }

  public void RaiseElevator(){
    RunMotor(Constants.OperatorConstants.kElevatorSpeed);
  }

  public void LowerElevator(){
    //Here I am assuming that moving the elevator down is the motor's negative direction
    RunMotor(-Constants.OperatorConstants.kElevatorSpeed);
  }

  //This better work
  public void StopElevator(){
    elevatorMotor.set(0);
  }


}
