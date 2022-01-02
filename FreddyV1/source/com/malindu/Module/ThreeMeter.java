package com.malindu.Module;

import com.malindu.Handler.DistanceHandler;

public class ThreeMeter extends DistanceHandler {
	@Override
	public int calculateHops (HopCounter hopCounter){
		hopCounter.setHopCount (hopCounter.getHopCount () + 1);
		hopCounter.setDistance (hopCounter.getDistance () - 3);
		System.out.println ("Jumped 3m");
		
		if (hopCounter.getDistance () <= 0) {
			return hopCounter.getHopCount();
		} else {
			return nextJump.calculateHops (hopCounter);
		}
	}
	
}