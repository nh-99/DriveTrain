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
    public static SpeedController motorsRightFront;
    public static SpeedController motorsLeftFront;
    public static RobotDrive motorsFrontMotors;
    public static SpeedController motorsLeftBack;
    public static SpeedController motorsRightBack;
    public static RobotDrive motorsBackMotors;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        motorsRightFront = new Victor(1);
        LiveWindow.addActuator("Motors", "RightFront", (Victor) motorsRightFront);
        
        motorsLeftFront = new Victor(0);
        LiveWindow.addActuator("Motors", "LeftFront", (Victor) motorsLeftFront);
        
        motorsFrontMotors = new RobotDrive(motorsRightFront, motorsLeftFront);
        
        motorsFrontMotors.setSafetyEnabled(true);
        motorsFrontMotors.setExpiration(0.1);
        motorsFrontMotors.setSensitivity(0.5);
        motorsFrontMotors.setMaxOutput(1.0);
        

        motorsLeftBack = new Victor(2);
        LiveWindow.addActuator("Motors", "LeftBack", (Victor) motorsLeftBack);
        
        motorsRightBack = new Victor(3);
        LiveWindow.addActuator("Motors", "RightBack", (Victor) motorsRightBack);
        
        motorsBackMotors = new RobotDrive(motorsLeftBack, motorsRightBack);
        
        motorsBackMotors.setSafetyEnabled(true);
        motorsBackMotors.setExpiration(0.1);
        motorsBackMotors.setSensitivity(0.5);
        motorsBackMotors.setMaxOutput(1.0);
        


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
