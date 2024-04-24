// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;


public final class Constants {

  public static class InputConstants{
    public static final int kDriverControllerPort = 0;

    public static final int kRaiseButton = 4; // Y Button
    public static final int kLowerButton = 2; // A Button

    public static final int kSpeedBoostButton = 8; //Right trigger
  }

  public static class OperatorConstants {

    //Declaring joytick ports || NOT MINE
    public static int kJoystickPort = 1;

    //Declaring Motor Speeds
    public static double kElevatorUpSpeed = 0.2f;
    public static double kElevatorDownSpeed = 0.25f;

    public static double kElevatorUpSpeedFast = 0.5f;
    public static double kElevatorDownSpeedFast = 0.55f;

    //Declaring CAN IDs
    public static int kElevatorID = 5;
  }
}
