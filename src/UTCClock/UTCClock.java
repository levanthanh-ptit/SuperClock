package UTCClock;

//demo of singleton
public class UTCClock {
	private int UTCSeconds = 0;
	private int UTCMinute = 0;
	private int UTCHour = 0;
	private static UTCClock instance = new UTCClock();

	private UTCClock() {
	};

	public static UTCClock getInstance() {
		return instance;
	}

	public void tick() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		UTCSeconds++;
		if (UTCSeconds == 60) {
			UTCSeconds = 0;
			UTCMinute++;
		}
		if (UTCMinute == 60) {
			UTCMinute = 0;
			UTCHour++;
		}
		if (UTCHour == 24) {
			UTCHour = 0;
		}
	}

	public String getTime(double UTCTimeZone) {
		double zone = UTCTimeZone;
		int hour = (int) (24 + UTCHour + zone) % 24;
		int minute = ((int) (UTCMinute + (zone - (int) zone) * 60)) % 60;
		return hour + ":" + minute + ":" + UTCSeconds;
	}
}