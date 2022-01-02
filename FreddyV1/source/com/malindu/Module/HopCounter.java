package com.malindu.Module;

public class HopCounter {
	private int distance;
	private int hopCount;
	private double restTime;

	public HopCounter (int distance) {
		this.distance = distance;
	}

	public void setHopCount (int hopCount) {
		this.hopCount = hopCount;
	}

	public void setDistance (int distance) {
		this.distance = distance;
	}

	public void setRestTime (double restTime) {
		this.restTime = restTime;
	}
	
	public int getHopCount () {
		return hopCount;
	}

	public int getDistance () {
		return distance;
	}

	public double getRestTime () {
		return restTime;
	}
}