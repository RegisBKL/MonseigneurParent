// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.BackShooterConstants;
import frc.robot.Constants.GrabberConstants;
import frc.robot.Constants.LimitSwitchConstants;

public class LimitSwitch extends SubsystemBase {

  /** Creates a new ExampleSubsystem. */

  // Definition et declaration du moteur supplementaire et du verin
  //private final VictorSPX m_intake_Motor = new VictorSPX(Mecanisme2Constants.kmoteurSupplementaire);
  
  private final DigitalInput m_limitswitch = new DigitalInput(LimitSwitchConstants.limitswitchport);
  
  // Creation d'un objet Mecanisme2
  public LimitSwitch() {
  // m_backshooter_Motor.configFactoryDefault();
    
  }

  @Override
  public void periodic() { // every 20 ms
SmartDashboard.putBoolean("limitswitch", getState());
  }

  // Faire tourner le moteur sens horaire
  // Remarque: le sens de rotation depend du cablage de votre
  // moteur donc il faudra faire un test, une fois votre moteur câblé
  // pour savoir determiner le sens
  public boolean getState() {
    //m_intake_Motor.set(ControlMode.PercentOutput, Mecanisme2Constants.kvitesseRotation);
    return !m_limitswitch.get();
  }
  // Faire tourner le moteur sens anti-horaire
  // Remarque: le sens de rotation depend du cablage de votre
  // moteur donc il faudra faire un test, une fois votre moteur câblé
  // pour savoir determiner le sens
  
    //m_intake_Motor.set(ControlMode.PercentOutput, -Mecanisme2Constants.kvitesseRotation);
    

  // Faire tourner le moteur sens anti-horaire
  // Remarque: le sens de rotation depend du cablage de votre
  // moteur donc il faudra faire un test, une fois votre moteur câblé
  // pour savoir determiner le sens
  

  

}
