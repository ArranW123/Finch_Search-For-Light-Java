import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class FollowLightOLD{

	public static void main(String[] args){
		
		Finch myFinch = new Finch();
		
		int[] LightReading = new int[30];
		int i = 0;
		boolean Tapped = myFinch.isTapped();
		
		while (i < 30) {
			myFinch.setWheelVelocities(100, 100, 1000);
			LightReading[i] = (myFinch.getLeftLightSensor() + myFinch.getRightLightSensor());
			i++;
		}
		
		i = 0;
		
		while (i < 30) {
		System.out.println(LightReading[i]);
		i++;
		}
		
		if (Tapped = true) {
			myFinch.setWheelVelocities(0, 0);
			
		}
				
		
		
	}
	
}
