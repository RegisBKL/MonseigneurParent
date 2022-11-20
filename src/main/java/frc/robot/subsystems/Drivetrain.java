// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;


public class Drivetrain extends SubsystemBase  {

  /** Cette classe permet de creer un objet Drivetrain avec un entrainement differentiel. */
  /** 
  * |_______|
  * | |   | |
  *   |   |
  * |_|___|_|
  * |       |
  */

  /**
   * Definition et declaration des moteurs et la gestion de ces derniers pour le BetaBots
   * Commenter ici mais a activer lorsque vous aurez des moteurs Venom
   */
   
  private final WPI_VictorSPX m_left_leaderMotor = new WPI_VictorSPX(DriveConstants.rightleader); 
  //private final WPI_VictorSPX m_left_followerMotor = new WPI_VictorSPX(DriveConstants.rightfollower);
  //private final MotorControllerGroup m_left = new MotorControllerGroup(m_left_leaderMotor, m_left_followerMotor);

  private final WPI_VictorSPX m_right_leaderMotor = new WPI_VictorSPX(DriveConstants.leftleader); 
  //private final WPI_VictorSPX m_right_followerMotor = new WPI_VictorSPX(DriveConstants.leftfollower);
  //private final MotorControllerGroup m_right = new MotorControllerGroup(m_right_leaderMotor, m_right_followerMotor);
  
  private final DifferentialDrive m_drive; 
  

 /**
  * Definition et declaration des 4 moteurs de votre base pilotable de pratique qui utilise des controleurs de 
  * moteur VictoSPX à commenter lorsque vous aurez des moteurs Venom pour la compétition BetaBots
  */

  /**
   * Pour chaque côté du robot, on déclare individuellement les moteurs avant et arrière
   * Ici le côté droit
   */
  ///private final SpeedController m_avantDroit = new PWMVictorSPX(DriveConstants.kavantDroit);
  ///private final SpeedController m_arriereDroit = new PWMVictorSPX(DriveConstants.karriereDroit);

  /**
   * On regroupe ensuite les deux moteurs de chaque côté du robot dans un objet SpeeControllerGroup
   * Ici le côté droit
   */
  ///private SpeedControllerGroup m_groupeMoteursdroits = new SpeedControllerGroup(m_avantDroit, m_arriereDroit);

  /**
   * Pour chaque côté du robot, on déclare individuellement les moteurs avant et arrière
   * Ici le côté gauche
   */
  ///private final SpeedController m_avantGauche = new PWMVictorSPX(DriveConstants.kavantGauche);
  ///private final SpeedController m_arriereGauche = new PWMVictorSPX(DriveConstants.karriereGauche);

  /**
   * On regroupe ensuite les deux moteurs de chaque côté du robot dans un objet SpeeControllerGroup
   * Ici le côté gauche
   */
  ///private SpeedControllerGroup m_groupeMoteursgauches = new SpeedControllerGroup(m_avantGauche, m_arriereGauche);

  /**
   * On regroupe finalement ces deux groupes de moteurs dans un objet DifferentialDrive qui 
   * implemente l'entraînement différentiel
   */

  ///private final DifferentialDrive m_drivetrain = new DifferentialDrive(m_groupeMoteursgauches, m_groupeMoteursdroits);
  

  //Creation d'un objet Drivetrain 
  public Drivetrain() {
    m_left_leaderMotor.configFactoryDefault();
    //m_left_followerMotor.configFactoryDefault();
    m_right_leaderMotor.configFactoryDefault();
    //m_right_followerMotor.configFactoryDefault();
    
    m_right_leaderMotor.setInverted(true);
   // m_right_followerMotor.setInverted(true);
    m_left_leaderMotor.setInverted(false);
    //m_left_followerMotor.setInverted(false);
    
    //m_drive = new DifferentialDrive(m_left, m_right);

    m_drive = new DifferentialDrive(m_left_leaderMotor, m_right_leaderMotor);
    // Pour affichage sur LiveWindow
    ///addChild("BasePilotable", m_drivetrain);
  }

  @Override
  public void periodic() { //every 20 ms
  }
  
  /**
   * Type de pilotage ArcadeDrive 
   * 
   * @param pavanceRecule pour avancer ou reculer [-1,1]
   * @param ptourne       pour tourner gauche ou droire [-1,1]
   */
  public void arcadeDrive(double speed, double rotation){     
    m_drive.arcadeDrive(0.6*speed, (0.6)*rotation);
  }

}
