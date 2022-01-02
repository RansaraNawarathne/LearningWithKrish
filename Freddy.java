import java.util.Scanner;

class Freddy {
	public static void main (String[] args){
		//Declaring and initializing jump distance, rest time array and  distance variable.
		int[] jumpDistance = {5,3,1};
		double[] restTime = {1,2,3.5};
		int distance = 0;

		//Promting question to the user and assigning user input value to the distance variable.
		System.out.println ("Enter distance that Freddy need to move?");
		Scanner sc = new Scanner (System.in);
		distance = sc.nextInt ();
		sc.close();

		//Declaring and initializing array indexes and related variables.
		int jumpDistanceIndex = 0;
		int hopCount = 0;
		int restTimeIndex = 0;
		double timeTaken = 0.0;

		//Calculating hop count according to the distance.
		while (distance > 0) {
			distance -= jumpDistance[jumpDistanceIndex];
			hopCount++;
			if (jumpDistanceIndex == 2) {
				jumpDistanceIndex = 0;
			} else {
				jumpDistanceIndex++;
			}
		}

		//Calculating total rest time according to the hop count.
		int tempCount = 0;
		for (int count = 1; count < hopCount; count++){		
			if(tempCount >= restTime.length){
				tempCount = 0;
			}
			timeTaken += restTime[tempCount];
			tempCount++;		
		}
		
		//Displaying calculated values.
		System.out.println ("Hop(s) Count : " + hopCount);
		if (timeTaken  == 1) {
			System.out.println ("Total Rest Time : " + timeTaken  + " second");
		} else {
			System.out.println ("Total Rest Time : " + timeTaken  + " seconds");
		}
	}
}