package com.malindu.CLI;

import com.malindu.Module.FiveMeter;
import com.malindu.Module.ThreeMeter;
import com.malindu.Module.OneMeter;
import com.malindu.Module.HopCounter;

import java.util.Scanner;

public class Application {

	public static void main (String[] args) {
		FiveMeter fiveMeter = new FiveMeter ();
		ThreeMeter threeMeter = new ThreeMeter ();
		OneMeter oneMeter = new OneMeter ();

		fiveMeter.setNextJump (threeMeter);
		threeMeter.setNextJump (oneMeter);
		oneMeter.setNextJump (fiveMeter);

		int distance = 0;

		System.out.println ("Enter distance that Freddy need to move?");
		Scanner scanner = new Scanner (System.in);
		distance = scanner.nextInt ();
		scanner.close ();
		
		if (distance != 0) { 
		HopCounter hopCounter = new HopCounter (distance);
		System.out.println ("Hop(s) Count : " + fiveMeter.calculateHops(hopCounter));
		System.out.println ("Total Rest Time : " + hopCounter.getRestTime () + " second(s).");
		} else {
			System.out.println ("Hop(s) Count : 0");
			System.out.println ("Total Rest Time : 0 seconds");
		}
	}

}