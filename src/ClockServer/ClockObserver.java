package ClockServer;
//demo of Observer patterm
public abstract class ClockObserver {
	protected ClockServer clockServer;
	public abstract void update();
}
