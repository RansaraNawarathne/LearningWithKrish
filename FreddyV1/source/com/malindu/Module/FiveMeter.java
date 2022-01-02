package com.malindu.Module;

import com.malindu.Handler.DistanceHandler;

public class FiveMeter extends DistanceHandler {
	@Override
	public int calculateHops (HopCounter hopCounter){
		hopCounter.setHopCount (hopCounter.getHopCount () + 1);
		hopCounter.setDistance (hopCounter.getDistance () - 5);
		
		if (hopCounter.getDistance () <= 0) {
			return hopCounter.getHopCount();
		} else {
			hopCounter.setRestTime (hopCounter.getRestTime () + 1.0);
			return nextJump.calculateHops (hopCounter);
		}
	}
	
}