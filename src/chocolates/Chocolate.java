package chocolates;
import ingredients.CocoaButter;
import ingredients.CocoaMass;
import ingredients.MilkPowder;
import ingredients.Sugar;

public abstract class Chocolate {
	protected CocoaMass cocoaMass;
	protected CocoaButter cocoaButter;
	protected Sugar sugar;
	protected MilkPowder milkPowder;
	
	protected String typeOfChocolate;
	protected String factoryOfTheChocolate;
	
	protected abstract void prepare();

	public String getTypeOfChocolate() {
		return typeOfChocolate;
	}

	public String getFactoryOfTheChocolate() {
		return factoryOfTheChocolate;
	}
}
