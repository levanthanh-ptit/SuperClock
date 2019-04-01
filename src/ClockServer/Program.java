package ClockServer;

import UTCClock.UTCClock;
import watchColection.*;

public class Program {
	public static void main(String args[]) {
		UTCClock clock = UTCClock.getInstance();
		ClockServer clockServer = new ClockServer(clock);
		ClockObserverFactory factory = new ClockObserverFactory();
		MobileClock mobileClock_1 = (MobileClock) factory.getClockObserver(ClockType.MOBILE, clockServer);
		mobileClock_1.setName("hand");
		mobileClock_1.setDevice("Xiaomi redmi note 4X");
		
		MobileClock mobileClock_2 = (MobileClock) factory.getClockObserver(ClockType.MOBILE, clockServer);
		mobileClock_2.setName("KhaBanh");
		mobileClock_2.setDevice("Samsung A7");
		
		WatchClock watchClock_1 = (WatchClock) factory.getClockObserver(ClockType.WATCH, clockServer);
		watchClock_1.setWatch(new WatchBuilder().Model200U());
		WatchClock watchClock_2 = (WatchClock) factory.getClockObserver(ClockType.WATCH, clockServer);
		watchClock_2.setWatch(new WatchBuilder().ModelG201());
		while (true) {
			
			//begin ticking
			clockServer.setTime();
		}

	}

}
