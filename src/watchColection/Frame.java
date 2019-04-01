package watchColection;

public abstract class Frame implements Item{
	@Override
	public FragType fragType() {
		return new DiamondCut();
	}
	@Override
	public abstract float price();
}
