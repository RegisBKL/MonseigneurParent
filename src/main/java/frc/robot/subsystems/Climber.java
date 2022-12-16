// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ClimberConstants;


public class Climber extends SubsystemBase {

  /** Creates a new ExampleSubsystem. */

    
  private final WPI_TalonSRX m_climber_LeftMotor = new WPI_TalonSRX(ClimberConstants.climberLeft);
  private final WPI_TalonSRX m_climber_RightMotor = new WPI_TalonSRX(ClimberConstants.climberRight);

  private final DigitalInput m_limitSwitch_UP = new DigitalInput(ClimberConstants.limitSwitchUP);
  private final DigitalInput m_limitSwitch_Down = new DigitalInput(ClimberConstants.limitSWitchDown);

  // Creation d'un objet Mecanisme2
  public Climber() {
    m_climber_LeftMotor.configFactoryDefault();
    m_climber_RightMotor.configFactoryDefault();
    
  }

  @Override
  public void periodic() { // every 20 ms

  }

  // Faire tourner le moteur sens horaire
  // Remarque: le sens de rotation depend du cablage de votre
  // moteur donc il faudra faire un test, une fois votre moteur câblé
  // pour savoir determiner le sens
  public void setClimberDown() {
    m_climber_LeftMotor.set(ControlMode.PercentOutput, 0.25);
    m_climber_RightMotor.set(ControlMode.PercentOutput, 0.25);
  }
  // Faire tourner le moteur sens anti-horaire
  // Remarque: le sens de rotation depend du cablage de votre
  // moteur donc il faudra faire un test, une fois votre moteur câblé
  // pour savoir determiner le sens
  public void setClimberUp() {
    m_climber_LeftMotor.set(ControlMode.PercentOutput, -0.25);
    m_climber_RightMotor.set(ControlMode.PercentOutput, -0.25);
  }

  // Faire tourner le moteur sens anti-horaire
  // Remarque: le sens de rotation depend du cablage de votre
  // moteur donc il faudra faire un test, une fois votre moteur câblé
  // pour savoir determiner le sens
  public void setClimberSpeedFreely(double speed) {
    m_climber_LeftMotor.set(ControlMode.PercentOutput, speed);
    m_climber_RightMotor.set(ControlMode.PercentOutput, speed);
  }

  // Mettre le moteur à l'arrêt
  public void stopClimber() {
    m_climber_LeftMotor.set(ControlMode.PercentOutput, 0);
    m_climber_RightMotor.set(ControlMode.PercentOutput, 0);
    
  }
  
  public boolean isClimberUP(){
    return m_limitSwitch_UP.get();
  }
  
  public boolean isClimberDown(){
    return m_limitSwitch_Down.get();
  }

}
