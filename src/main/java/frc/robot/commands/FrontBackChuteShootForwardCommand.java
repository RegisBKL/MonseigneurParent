// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.BackShooter;
import frc.robot.subsystems.Chute;
import frc.robot.subsystems.FrontShooter;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.LimitSwitch;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class FrontBackChuteShootForwardCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final FrontShooter m_frontshooter;
  private final BackShooter m_backshooter;
  private final Chute m_chute;
  private final LimitSwitch m_limitSwitch;
  private final Intake m_intake;
  private boolean m_flag = false;



  ///private final double m_speed;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public FrontBackChuteShootForwardCommand(Intake intake, FrontShooter frontShooter, BackShooter backShooter, Chute chute, LimitSwitch limitSwitch) {
    m_frontshooter = frontShooter;
    m_backshooter = backShooter;
    m_chute = chute;
    m_limitSwitch = limitSwitch;
    m_intake = intake;
    ///m_speed = speed;
    
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_intake, m_frontshooter, m_backshooter, m_chute, m_limitSwitch);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
   // System.out.println("in initialize");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(m_limitSwitch.getState()&& m_flag == false){

    }
    m_frontshooter.tourneSensAntiHoraire();
    m_backshooter.tourneSensHoraire();
    m_chute.tourneSensHoraire();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_frontshooter.mettreAuRepos();
    m_backshooter.mettreAuRepos();
    m_chute.mettreAuRepos();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
