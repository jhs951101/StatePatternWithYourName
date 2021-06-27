package pkg;

public class MitsuhaSoul implements Soul {
	
	Body mitsuhaBody;
	
	public MitsuhaSoul(Body b){
		mitsuhaBody = b;
	}

	@Override
	public void tellName() {
		System.out.println("My name is Mitsuha.");
	}

	@Override
	public void toMitsuhaSoul() {
		System.out.println("Error: Already has Mitsuha Soul.");
	}

	@Override
	public void toTakiSoul() {
		mitsuhaBody.setSoul(mitsuhaBody.getTakiSoul());
		System.out.println("has been changed to Taki Soul.");
	}

}
