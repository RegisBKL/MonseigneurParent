// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.IOConstants;
import frc.robot.commands.ArcadeDriveCommand;
import frc.robot.commands.GrabberCommand;
import frc.robot.commands.IntakeAtRestCommand;
import frc.robot.commands.ReleaseCommand;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Intake;



/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final Drivetrain m_drivetrain = new Drivetrain();
  private final Intake m_intake = new Intake();
  
  //Declaration et definition de la manette
  private final Joystick m_pilot = new Joystick(IOConstants.KmanettePort);

  //Declaration et definition du compressor
  //private final Compressor m_compressor = new Compressor(PneumatiqueConstants.kcompressor);
  //m_compressor.start();
  // private final ExampleCommand m_autoCommand = new
  // ExampleCommand(m_exampleSubsystem);

  /**
   * The container for the robot. Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {

    //activation du compresseurs
        
    //configuration des commandes par defaut
    setDefaultCommands();
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */

   //Definition des commandes par default de chaque sous-systeme
  private void setDefaultCommands() {
    m_drivetrain.setDefaultCommand(new ArcadeDriveCommand(
      ()->(-1)*m_pilot.getY(), ()->m_pilot.getZ(), m_drivetrain)
      );
    m_intake.setDefaultCommand(new IntakeAtRestCommand(m_intake));
   
    // Configure de la correspondance entre les boutons et les commandes
    
    // Affichage du sous-systeme en fonction au Shuffleboard
    //
    SmartDashboard.putData(m_drivetrain);
  }

  // Correspondance entre les boutons de la manette et les commandes
  private void configureButtonBindings() {
    //Generer les boutons ici
    //final JoystickButton antiHoraire = new JoystickButton(m_pilot, 1);


   //connecter les boutons aux commandes ici
   
   //new JoystickButton(m_pilot, 1).whileHeld(new BackShooterReverseCommand(m_backshooter));
   new JoystickButton(m_pilot, 3).whileHeld(new GrabberCommand(m_intake));
   new JoystickButton(m_pilot, 4).whileHeld(new ReleaseCommand(m_intake));
   

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
 public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    //return new AutoCommand(m_drivetrain, m_mecanisme2).andThen(new SensHoraireCommand(m_mecanisme2).withTimeout(1));
    return null;
    //addSequential(new AutoDriveCommand(2, 0.5, 0, m_drivetrain));
    //addSequential(new AutoRotationCommand(2, -0.7, m_mecanisme2));
    //return new AutoRotationCommand(2, -0.7, m_mecanisme2).withTimeout(2).andThen(new AutoDriveCommand(2, -0.5, 0, m_drivetrain));
    
  }
}
