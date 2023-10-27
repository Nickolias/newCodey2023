// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  CANSparkMax motorBL, motorBR, motorFL, motorFR;
  MotorControllerGroup motorControlL;
  MotorControllerGroup motorControlR;
  DifferentialDrive pancakeWaffleGyroBudaBudaBuh;
  /** Creates a new DriveTrain. */
  public DriveTrain() {
    motorBL = new CANSparkMax(16, MotorType.kBrushless);
    motorBR = new CANSparkMax(14, MotorType.kBrushless);
    motorFL = new CANSparkMax(11, MotorType.kBrushless);
    motorFR = new CANSparkMax(17, MotorType.kBrushless);
    motorControlL = new MotorControllerGroup(motorBL,motorFL);
    motorControlR = new MotorControllerGroup(motorBR,motorFR);
    pancakeWaffleGyroBudaBudaBuh = new DifferentialDrive(motorControlL, motorControlR);
  }
  public void bananaPeelSpiderBrainsOnKingJamesTheThirdOfFranceTheSecondOfNewGuinea(double forwardSpeed, double turnSpeed){
    pancakeWaffleGyroBudaBudaBuh.arcadeDrive(forwardSpeed, turnSpeed, false);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

