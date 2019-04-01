package watchColection;
//Demo of Builder pattern
public class WatchBuilder {
	public Watch ModelG201() {
		Watch watch = new Watch();
		watch.addItem(new GoldFrame());
		watch.addItem(new PlantiumFrame());
		watch.addItem(new RolexEngine());
		return watch;
	}
	public Watch Model200U() {
		Watch watch = new Watch();
		watch.addItem(new GoldFrame());
		watch.addItem(new OmegaEngine());
		return watch;
	}
}
