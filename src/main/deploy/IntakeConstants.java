package frc.robot.constants;

import org.bytingbulldogs.bulldoglibrary.INIConfiguration.BBConstants;

public class ShooterConstants extends BBConstants{
	public ShooterConstants() {
		super("/home/lvuser/ShooterConstants.ini", true);
		save();
	}
	public static double shootRps = 0.0;
	public static double revRps = 0.0;
}
