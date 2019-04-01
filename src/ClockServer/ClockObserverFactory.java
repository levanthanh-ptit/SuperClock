package ClockServer;
//demo Factory patterm
public class ClockObserverFactory {
	public ClockObserver getClockObserver(ClockType type, ClockServer clockServer) {
		if(type == ClockType.MOBILE) {
			return new MobileClock(clockServer);
		} else
		if(type == ClockType.WATCH) {
			return new WatchClock(clockServer);
		}
		return null;
	}
}
