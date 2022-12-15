// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.GrabberConstants;

public class Intake extends SubsystemBase {

  /** Creates a new ExampleSubsystem. */

    
  private final WPI_VictorSPX m_intake_Motor = new WPI_VictorSPX(GrabberConstants.grabbermotor);
  
  // Creation d'un objet Mecanisme2
  public Intake() {
    m_intake_Motor.configFactoryDefault();
    
  }

  @Override
  public void periodic() { // every 20 ms

  }

  // Faire tourner le moteur sens horaire
  // Remarque: le sens de rotation depend du cablage de votre
  // moteur donc il faudra faire un test, une fois votre moteur câblé
  // pour savoir determiner le sens
  public void tourneSensHoraire() {
  
    m_intake_Motor.set(ControlMode.PercentOutput, 0.25);
  }
  // Faire tourner le moteur sens anti-horaire
  // Remarque: le sens de rotation depend du cablage de votre
  // moteur donc il faudra faire un test, une fois votre moteur câblé
  // pour savoir determiner le sens
  public void tourneSensAntiHoraire() {
    
    m_intake_Motor.set(ControlMode.PercentOutput, -0.25);
  }

  // Faire tourner le moteur sens anti-horaire
  // Remarque: le sens de rotation depend du cablage de votre
  // moteur donc il faudra faire un test, une fois votre moteur câblé
  // pour savoir determiner le sens
  public void tourneAnySens(double speed) {
    
    m_intake_Motor.set(ControlMode.PercentOutput, speed);
  }

  // Mettre le moteur à l'arrêt
  public void mettreAuRepos() {
    
    m_intake_Motor.set(ControlMode.PercentOutput, 0);
    
  }

  

}
