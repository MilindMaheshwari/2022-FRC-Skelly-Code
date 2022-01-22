
package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


public class Shooter extends SubsystemBase{

    CANSparkMax firstConveyerMotor = new CANSparkMax(Constants.ShooterConsts.CAN_ADDRESS_FIRST_CONVEYER_MOTOR, MotorType.kBrushless);
    CANSparkMax secondConveyerMotor = new CANSparkMax(Constants.ShooterConsts.CAN_ADDRESS_SECOND_CONVEYER_MOTOR, MotorType.kBrushless);
    CANSparkMax thirdConveyerMotor = new CANSparkMax(Constants.ShooterConsts.CAN_ADDRESS_THIRD_CONVEYER_MOTOR, MotorType.kBrushless);
    
    public Shooter(){
        super();
        secondConveyerMotor.follow(firstConveyerMotor);
        thirdConveyerMotor.follow(firstConveyerMotor);
    }

    public void launch(int speed){
        firstConveyerMotor.set(speed);
    }
}

