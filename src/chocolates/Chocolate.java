package chocolates;
import ingredients.CocoaButter;
import ingredients.CocoaMass;
import ingredients.MilkPowder;
import ingredients.Sugar;

/**
 * Chocolate is an abstract class representing the different kinds of chocolate.
 * Each chocolate kind has six properties: CocoaMass, CocoaButter, Sugar, MilkPowder, ChocolateType, 
 * @author Dan4itoLP
 *
 */
public abstract class Chocolate {
	protected CocoaMass cocoaMass;
	protected CocoaButter cocoaButter;
	protected Sugar sugar;
	protected MilkPowder milkPowder;
	
	protected ChocolateType typeOfChocolate;
	
	protected abstract void prepare();

	/**
	 * This method returns the string representation of the chocolate type.
	 * @return the string representation of the chocolate type
	 */
	public String getTypeOfChocolate() {
		return typeOfChocolate.toString();
	}

	/**
	 * This method return which factory the chocolate was made in.
	 * @return the string representation of the factory of the chocolate
	 */
	public abstract String getFactoryOfTheChocolate();
}
