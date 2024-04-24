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

  public void RaiseElevator(boolean isFast){
    //Up is the positive direction
    if(isFast){
      RunMotor(Constants.OperatorConstants.kElevatorUpSpeedFast);
    }
    else{
      RunMotor(Constants.OperatorConstants.kElevatorUpSpeed);
    }
  }

  public void LowerElevator(boolean isFast){
    //Down is the negative direction
    if(isFast){
      RunMotor(-Constants.OperatorConstants.kElevatorDownSpeedFast);
    }
    else{
      RunMotor(-Constants.OperatorConstants.kElevatorDownSpeed);
    }
  }

  //This better work
  public void StopElevator(){
    elevatorMotor.set(0);
  }


}
