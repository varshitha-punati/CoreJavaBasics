package com.abstraction;

public abstract class Remote {
	abstract public void powerSwitch();

	abstract public int increaseVolume();

	abstract public int decreaseVolume();

	abstract public void channelTunning(int channel);
}

class Television extends Remote {
	int volume;
	int maxVolume;
	boolean power;
	int channel;

	public Television(int volume, boolean power, int maxVolume) {
		this.volume = volume;
		this.power = power;
//		this.channel = channel;
		this.maxVolume = maxVolume;
		if (power == true) {
			System.out.println("power switch is in on mode");
		} else {
			System.out.println("power switch is in off mode");
		}

	}

	@Override
	public void powerSwitch() {
		// TODO Auto-generated method stub
		this.power = !power;
		if (power == true) {
			System.out.println("The power switches to on");
		} else {
			System.out.println("power switches to off");
		}

	}

	@Override
	public int increaseVolume() {
		// TODO Auto-generated method stub
		System.out.println("The volume is:" + volume);
		if (maxVolume > volume) {
			volume=volume+10;
		}
		System.out.println("increasing volume to:" + volume);
		return volume;
	}

	@Override
	public int decreaseVolume() {
		// TODO Auto-generated method stub
		if (0 < volume) {
			volume = volume - 5;

		}
		System.out.println("Decreasing volume to:" + volume);
		return volume;

	}

	@Override
	public void channelTunning(int channel) {
		// TODO Auto-generated method stub
		switch (channel) {
		
		case 1:	
			System.out.println("Now the channel is 512 ABN");
		case 2:
			System.out.println("Now the channel is 514 Tv9");

		case 3:
			System.out.println("Now the channel is 516 ZeeTelugu");

		case 4:
			System.out.println("Now the channel is 518 MaaTv");

		}

	}
}