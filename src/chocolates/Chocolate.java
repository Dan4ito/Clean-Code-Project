package chocolates;
import ingredients.CocoaButter;
import ingredients.CocoaMass;
import ingredients.MilkPowder;
import ingredients.Sugar;

public abstract class Chocolate {
	// String name?
	protected CocoaMass cocoaMass;
	protected CocoaButter cocoaButter;
	protected Sugar sugar;
	protected MilkPowder milkPowder;
	
	public abstract void prepare();
	
	public void box() {
		System.out.println("Boxing up the chocolate!");		
	}
}
