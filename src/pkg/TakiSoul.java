package pkg;

public class TakiSoul implements Soul {
	
	Body takiBody;
	
	public TakiSoul(Body b){
		takiBody = b;
	}

	@Override
	public void tellName() {
		System.out.println("My name is Taki.");
	}

	@Override
	public void toMitsuhaSoul() {
		takiBody.setSoul(takiBody.getMitsuhaSoul());
		System.out.println("has been changed to Mitsuha Soul.");
	}

	@Override
	public void toTakiSoul() {
		System.out.println("Error: Already has Taki Soul.");
	}

}
