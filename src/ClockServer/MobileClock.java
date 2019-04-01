package ClockServer;

import ClockTypes.IMobileClock;

public class MobileClock extends ClockObserver implements IMobileClock {
	private String name;
	private String device;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public MobileClock(ClockServer clockServer) {
		this.clockServer = clockServer; 
		this.clockServer.attach(this); //add custom update method to event listener.
	}

	@Override
	public void printTime() {
		System.out.println("Time: " + this.clockServer.getTime());

	}

	@Override
	public void printDate() {
		System.out.println(this.clockServer.getTime());

	}

	@Override
	public void printName() {
		System.out.println("Name: "+name);

	}

	@Override
	public void printPhoneName() {
		System.out.println("Device: "+device);

	}

	@Override
	public void update() {
		printName();
		printPhoneName();
		printTime();
		printDate();
	}
}
