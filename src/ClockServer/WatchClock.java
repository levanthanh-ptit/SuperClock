package ClockServer;

import ClockTypes.IWatchClock;
import watchColection.Watch;

public class WatchClock extends ClockObserver implements IWatchClock {
	private String Brand = "Watch";
	private Watch watch;
	
	public void setBrand(String brand) {
		Brand = brand;
	}
	
	public void setWatch(Watch watch) {
		this.watch = watch;
	}
	
	public WatchClock(ClockServer clockServer) {
		this.clockServer = clockServer;
		this.clockServer.attach(this);
	}
	
	@Override
	public void printTime() {
		System.out.println("Time: "+this.clockServer.getTime());
		
	}

	@Override
	public void printBrand() {
		System.out.println(Brand);
		
	}

	@Override
	public void update() {
		printBrand();
		printTime();
		watch.showItems();
		System.out.println("Cost: $"+watch.getCost());
		
	}

}
