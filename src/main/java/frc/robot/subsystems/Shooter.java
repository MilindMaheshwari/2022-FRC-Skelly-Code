
package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


public class Shooter extends SubsystemBase{

    CANSparkMax firstShooterMotor = new CANSparkMax(Constants.ShooterConsts.CAN_ADDRESS_FIRST_SHOOTER_MOTOR, MotorType.kBrushless);
    CANSparkMax secondShooterMotor = new CANSparkMax(Constants.ShooterConsts.CAN_ADDRESS_SECOND_SHOOTER_MOTOR, MotorType.kBrushless);
    CANSparkMax thirdShooterMotor = new CANSparkMax(Constants.ShooterConsts.CAN_ADDRESS_THIRD_SHOOTER_MOTOR, MotorType.kBrushless);
    
    public Shooter(){
        super();
        secondShooterMotor.follow(firstShooterMotor);
        thirdShooterMotor.follow(firstShooterMotor);
    }

    public void launch(int speed){
        firstShooterMotor.set(speed);
    }
}

