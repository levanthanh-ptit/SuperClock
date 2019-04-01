package ClockServer;

import java.util.ArrayList;
import java.util.List;
import UTCClock.*;

//Observer centre
public class ClockServer {
	private List<ClockObserver> observers = new ArrayList<ClockObserver>();
	private String time;
	private String date;
	private double UTCTimeZone = 7.25;
	private UTCClock clock;

	public ClockServer(UTCClock clock) {
		this.clock = clock;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setTime() {
		this.time = UTCClock.getInstance().getTime(UTCTimeZone);
		System.out.println(UTCClock.getInstance().getTime(UTCTimeZone));
		clock.tick();
		System.out.println("===Time setted=================================");
		notifyAllObservers();

	}

	public String getTime() {
		return time;
	}

	public void attach(ClockObserver clockObserver) {
		this.observers.add(clockObserver);
	}

	public void notifyAllObservers() {
		for (ClockObserver observer : observers) {
			System.out.println("-------------------------------------");
			observer.update();
			System.out.println("-------------------------------------");
		}
	}
}
