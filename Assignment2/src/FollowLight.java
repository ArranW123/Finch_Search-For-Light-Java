import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class FollowLight {

public static void main(String[] args) {

	LightMovement();
	

// Multiple Methods should be created; Light Movement, 
	
}
private static Finch MyFinch;

public static void LightMovement() { //Method for Movement
	
	MyFinch = new Finch();
	
	//Declaring Variables
	int LeftLight = MyFinch.getLeftLightSensor();
	int RightLight = MyFinch.getRightLightSensor();
	int LightThreshold = 150; //This is the Threshold for the light. So, the Finch does not execute/move at very low light. 	
	int LightMovementLED = (LeftLight + RightLight); // Make a variable for the red colour, if there is more light the variable value increases and increases the colour RED

	System.out.println("Left Light =  " + LeftLight + " " + "Right Light =  " + RightLight ); //Testing the Light Sensors

	MyFinch.setLED(LightMovementLED,0,0); // This variable would increase in value depending on the light density.
	
	
	

}


}
