package com.abstraction;

public class Application {
	public static void main(String[] args) {
		Television r = new Television(10, false, 90);
		r.powerSwitch();
		r.increaseVolume();
		r.decreaseVolume();
		r.channelTunning(1);

	}
}
