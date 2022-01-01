import java.util.Scanner;

class Freddy {
	public static void main (String[] args){
		int[] jumpDistance = {5,3,1};
		double[] restTime = {1,2,3.5};
		int distance = 0;
		System.out.println ("Enter distance that Freddy need to move?");
		Scanner sc = new Scanner (System.in);
		distance = sc.nextInt ();
		sc.close();
		int jumpDistanceIndex = 0;
		int hopCount = 0;
		int restTimeIndex = 0;
		double timeTaken = 0.0;
		while (distance > 0) {
			distance = distance - jumpDistance[jumpDistanceIndex];
			//timeTaken = timeTaken + restTime[jumpDistanceIndex];
			hopCount++;
			if (jumpDistanceIndex == 2) {
				jumpDistanceIndex = 0;
			} else {
				jumpDistanceIndex++;
			}
		}
		int tempCount = 0;
		for (int count = 1; count < hopCount; count++){		
			if(tempCount >= restTime.length){
				tempCount = 0;
				timeTaken = timeTaken + restTime[tempCount];
			} else {
				timeTaken = timeTaken + restTime[tempCount];
			}
			tempCount++;		
		}
		System.out.println ("Hop(s) Count : " + hopCount);
		System.out.println ("Time Taken : " + timeTaken + " Seconds");
	}
}