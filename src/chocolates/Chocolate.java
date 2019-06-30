package chocolates;
import ingredients.CocoaButter;
import ingredients.CocoaMass;
import ingredients.MilkPowder;
import ingredients.Sugar;

/**
 * Chocolate is an abstract class representing the different kinds of chocolate.
 * Each chocolate kind has six properties: CocoaMass, CocoaButter, Sugar, MilkPowder
 * @author Dan4itoLP
 *
 */
public abstract class Chocolate {
	protected CocoaMass cocoaMass;
	protected CocoaButter cocoaButter;
	protected Sugar sugar;
	protected MilkPowder milkPowder;
	
	protected ChocolateType typeOfChocolate;
	protected String factoryOfTheChocolate;
	
	protected abstract void prepare();

	public String getTypeOfChocolate() {
		return typeOfChocolate.toString();
	}

	public String getFactoryOfTheChocolate() {
		return factoryOfTheChocolate;
	}
}
