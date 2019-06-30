package stores;

import chocolates.Chocolate;
import chocolates.ChocolateType;

public abstract class ChocolateStore {
	
	final public Chocolate orderChocolate(ChocolateType type) {			// template method design pattern
		Chocolate chocolate;
		chocolate = createChocolate(type);
		temperingTheChocolate(chocolate);
		mouldingTheChocolate(chocolate);
		coolingTheChocolate(chocolate);
		boxTheChocolate(chocolate);
		
		return chocolate;
	}
	
	protected abstract Chocolate createChocolate(ChocolateType type);
	
	private void temperingTheChocolate(Chocolate chocolate) {
		System.out.println("Tempering The " + chocolate.getTypeOfChocolate() + " from " + chocolate.getFactoryOfTheChocolate());
	}
	
	private void mouldingTheChocolate(Chocolate chocolate) {
		System.out.println("Moulding The " + chocolate.getTypeOfChocolate() + " from " + chocolate.getFactoryOfTheChocolate());
	}
	
	private void coolingTheChocolate(Chocolate chocolate) {
		System.out.println("Cooling The " + chocolate.getTypeOfChocolate() + " from " + chocolate.getFactoryOfTheChocolate());	
	}
	
	private void boxTheChocolate(Chocolate chocolate) {
		System.out.println("Boxing up the chocolate!\n");		
	}
}
