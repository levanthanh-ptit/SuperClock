package watchColection;

public abstract class Engine implements Item {
	@Override
	public FragType fragType() {
		return new Tech();
	}
	@Override
	public abstract float price();
}
	