// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class DriveConstants{
        //Cette classe regroupe toutes les constantes
        //relatives à votre base pilotable

        // Mis pour les tests avec les controleurs de moteur TalonSRX.
        // Ces valeurs constantes correspondent aux numeros
        // de ports de vos controleurs de moteur dans le reseau CAN
        public static final int leftleader = 1;
        public static final int leftfollower = 2;
        public static final int rightleader = 3;
        public static final int rightfollower = 4;
    }

    public static final class ClimberConstants{

        // Ces valeurs constantes correspondent aux numeros
        // de ports de vos controleurs de moteur dans le reseau CAN
        public static final int climberLeft = 5;
        public static final int climberRight = 6;

        public static final int limitSwitchUP = 0;
        public static final int limitSWitchDown = 1;

        //vitesse de rotation du moteur: valeur arbitraire mais
        //que vous pouvez modifier pour vos propres besoins
        public static final double kvitesseRotation = 0.5;

        //Arreter le moteur
        public static final double krepos = 0.0;
    }

    public static final class IOConstants{
        // Numero du port USB sur lequel vous brancherez votre manette
        public static final int KmanettePilot = 0;
        public static final int KmanetteCoPilot = 1;
    }

}
