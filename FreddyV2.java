import java.util.Scanner;

class FreddyV2 {
	public static void main (String[] args)  {
		//Declaring and initializing variables.
		int distance = 0;
		double restTime = 0.0;
		int hopCount = 0;

		//Promting question to the user and assigning user input value to the distance variable.
		System.out.println ("Enter distance that Freddy need to move?");
		Scanner scanner = new Scanner (System.in);
		distance = scanner.nextInt();
		scanner.close();
		
		//Calculating hop count and rest time according to the distance.
		while (distance > 0) {
			if (distance >= 5) {
				distance -= 5;
				hopCount++;
				restTime += 1;
				if (distance >= 3) {
					distance -= 3;
					hopCount++;
					restTime += 2;
					if (distance >= 1) {
						distance -= 1;
						hopCount++;
						restTime += 3.5;
					} else {
						hopCount++;
						break;
					}	
				} else {
					hopCount++;
					break;
				}			
			} else {
				hopCount++;
				break;
			}
		}

		//Displaying calculated values.
		System.out.println ("Hope Count : " + hopCount);
		if (restTime == 1) {
			System.out.println ("Total Rest Time : " + restTime + " second");
		} else {
			System.out.println ("Total Rest Time : " + restTime + " seconds");
		}	
	}
}