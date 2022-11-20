// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Intake;


import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class AutoRotationCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final Intake m_intake;
  //private final double m_AvanceRecule;
  private final double m_speed;
  //private final double m_rotation;
  //private final double m_duration;
  private Timer m_timer = new Timer();

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public AutoRotationCommand(double speed, Intake intake) {
    m_intake = intake;
    m_speed = speed;
    //m_rotation = rotation;
    //m_duration = duration;
    //m_AvanceRecule = avanceRecule;
    //m_Tourne = tourne;
    // Use addRequirements() here to declare subsystem dependencies.
    

    addRequirements(m_intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    //System.out.println("in initialize");
    m_timer.reset();
    m_timer.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    // Drive for 2 seconds
    //if (m_timer.get() < m_duration) {
      m_intake.tourneAnySens(m_speed); // drive forwards half speed
    //} else {
     // m_intake.tourneAnySens(0); // stop robot
   // }
    //m_drivetrain.arcadeDrive(m_AvanceRecule, m_Tourne);
  }

// Returns true when the command should end.
@Override
 public boolean isFinished() {
  return false;
 }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_intake.tourneAnySens(0);
  }

}

