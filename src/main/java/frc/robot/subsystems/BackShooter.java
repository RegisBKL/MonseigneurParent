// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.BackShooterConstants;
import frc.robot.Constants.GrabberConstants;

public class BackShooter extends SubsystemBase {

  /** Creates a new ExampleSubsystem. */

  // Definition et declaration du moteur supplementaire et du verin
  //private final VictorSPX m_intake_Motor = new VictorSPX(Mecanisme2Constants.kmoteurSupplementaire);
  
  private final WPI_VictorSPX m_backshooter_Motor = new WPI_VictorSPX(BackShooterConstants.backshootermotor);
  private final double m_kspeed = BackShooterConstants.backShooterSpeed;
  // Creation d'un objet Mecanisme2
  public BackShooter() {
    m_backshooter_Motor.configFactoryDefault();
    
  }

  @Override
  public void periodic() { // every 20 ms

  }

  // Faire tourner le moteur sens horaire
  // Remarque: le sens de rotation depend du cablage de votre
  // moteur donc il faudra faire un test, une fois votre moteur câblé
  // pour savoir determiner le sens
  public void tourneSensHoraire() {
    //m_intake_Motor.set(ControlMode.PercentOutput, Mecanisme2Constants.kvitesseRotation);
    m_backshooter_Motor.set(ControlMode.PercentOutput, -m_kspeed);
  }
  // Faire tourner le moteur sens anti-horaire
  // Remarque: le sens de rotation depend du cablage de votre
  // moteur donc il faudra faire un test, une fois votre moteur câblé
  // pour savoir determiner le sens
  public void tourneSensAntiHoraire() {
    //m_intake_Motor.set(ControlMode.PercentOutput, -Mecanisme2Constants.kvitesseRotation);
    m_backshooter_Motor.set(ControlMode.PercentOutput, m_kspeed);
  }

  // Faire tourner le moteur sens anti-horaire
  // Remarque: le sens de rotation depend du cablage de votre
  // moteur donc il faudra faire un test, une fois votre moteur câblé
  // pour savoir determiner le sens
  public void tourneAnySens(double speed) {
    //m_intake_Motor.set(ControlMode.PercentOutput, -Mecanisme2Constants.kvitesseRotation);
    m_backshooter_Motor.set(ControlMode.PercentOutput, speed);
  }

  // Mettre le moteur à l'arrêt
  public void mettreAuRepos() {
    //m_intake_Motor.set(ControlMode.PercentOutput, Mecanisme2Constants.krepos);
    m_backshooter_Motor.set(ControlMode.PercentOutput, 0);
    //m_Verin2.set(true);
    
  }

  

}