package stores;

import chocolates.Chocolate;
import chocolates.ChocolateType;

/**
 * An abstract class representing all different chocolate factory stores
 * @author Dan4itoLP
 *
 */
public abstract class ChocolateStore {
	
	/**
	 * This method return a Chocolate object result. This method also is a template method 
	 * defining the algorithm with some of the steps going to be decided by the subclasses.
	 * @param type as ChocolateType object
	 * @return Chocolate
	 */
	final public Chocolate orderChocolate(ChocolateType type) {			// template method design pattern
		Chocolate chocolate;
		chocolate = createChocolate(type);
		temperingTheChocolate(chocolate);
		mouldingTheChocolate(chocolate);
		coolingTheChocolate(chocolate);
		boxTheChocolate(chocolate);
		
		return chocolate;
	}
	
	/**
	 * This method is overriden by the subclasses and is used in the template method algorithm
	 * @param type as ChocolateType object
	 * @return Chocolate
	 */
	protected abstract Chocolate createChocolate(ChocolateType type);
	
	private void temperingTheChocolate(Chocolate chocolate) {
		System.out.println("Tempering The " + chocolate.getTypeOfChocolate() + " Chocolate from " + chocolate.getFactoryOfTheChocolate());
	}
	
	private void mouldingTheChocolate(Chocolate chocolate) {
		System.out.println("Moulding The " + chocolate.getTypeOfChocolate() + " Chocolate from " + chocolate.getFactoryOfTheChocolate());
	}
	
	private void coolingTheChocolate(Chocolate chocolate) {
		System.out.println("Cooling The " + chocolate.getTypeOfChocolate() + " Chocolate from " + chocolate.getFactoryOfTheChocolate());	
	}
	
	private void boxTheChocolate(Chocolate chocolate) {
		System.out.println("Boxing up the chocolate!\n");		
	}
}
