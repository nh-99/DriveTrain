// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5506.DriveTrain;
    
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController motorsfrontLeft;
    public static SpeedController motorsfrontRight;
    public static SpeedController motorsbackLeft;
    public static SpeedController motorsbackRight;
    public static RobotDrive motorsDriveTrain;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        motorsfrontLeft = new TalonSRX(1);
        LiveWindow.addActuator("Motors", "frontLeft", (TalonSRX) motorsfrontLeft);
        
        motorsfrontRight = new TalonSRX(2);
        LiveWindow.addActuator("Motors", "frontRight", (TalonSRX) motorsfrontRight);
        
        motorsbackLeft = new TalonSRX(4);
        LiveWindow.addActuator("Motors", "backLeft", (TalonSRX) motorsbackLeft);
        
        motorsbackRight = new TalonSRX(5);
        LiveWindow.addActuator("Motors", "backRight", (TalonSRX) motorsbackRight);
        
        motorsDriveTrain = new RobotDrive(motorsfrontLeft, motorsbackLeft,
              motorsfrontRight, motorsbackRight);
        
        motorsDriveTrain.setSafetyEnabled(true);
        motorsDriveTrain.setExpiration(0.1);
        motorsDriveTrain.setSensitivity(0.5);
        motorsDriveTrain.setMaxOutput(1.0);


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
