package com.malindu.Handler;
import com.malindu.Module.HopCounter;

public abstract class DistanceHandler {
	protected DistanceHandler nextJump;

	public void setNextJump (DistanceHandler nextJump) {
		this.nextJump = nextJump;
	}

	public abstract int calculateHops (HopCounter hopCounter);
}