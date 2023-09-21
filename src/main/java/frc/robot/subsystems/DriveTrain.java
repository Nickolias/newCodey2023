// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class DriveTrain extends SubsystemBase {
  /** Creates the a new DriveTrain... */
  private CANSparkMax motor0;
  private CANSparkMax motor1;
  private CANSparkMax motor2;
  private CANSparkMax motor3;
  private MotorControllerGroup MotorGroup0;
  private MotorControllerGroup MotorGroup1;
  private DifferentialDrive drivetrain;
  public DriveTrain() {
    motor0 = new CANSparkMax(22,MotorType.kBrushless);
    motor1 = new CANSparkMax(22,MotorType.kBrushless);
    motor2 = new CANSparkMax(22,MotorType.kBrushless);
    motor3 = new CANSparkMax(22,MotorType.kBrushless);
    MotorGroup0 = new MotorControllerGroup(motor0, motor1);
    MotorGroup1 = new MotorControllerGroup(motor2,motor3);
    drivetrain = new DifferentialDrive(MotorGroup0,MotorGroup1);
  }
  
  public void drive(double forward, double turn) {
    drivetrain.arcadeDrive(forward, turn, false);
    System.out.println("I do not have adhd");
  };
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
