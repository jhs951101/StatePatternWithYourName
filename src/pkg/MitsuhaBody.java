package pkg;

public class MitsuhaBody implements Body {
	Soul mitsuhaSoul;
	Soul takiSoul;
	
	Soul currentSoul;
	
	public MitsuhaBody(){
		mitsuhaSoul = new MitsuhaSoul(this);
		takiSoul = new TakiSoul(this);
		
		currentSoul = mitsuhaSoul;
	}
	
	public void setSoul(Soul s){
		currentSoul = s;
	}

	@Override
	public void tellName() {
		currentSoul.tellName();
	}

	@Override
	public void toMitsuhaSoul() {
		currentSoul.toMitsuhaSoul();
	}

	@Override
	public void toTakiSoul() {
		currentSoul.toTakiSoul();
	}

	public Soul getMitsuhaSoul() {
		return mitsuhaSoul;
	}

	public Soul getTakiSoul() {
		return takiSoul;
	}
}
