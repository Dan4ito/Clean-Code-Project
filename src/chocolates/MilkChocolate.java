package chocolates;

import factories.ChocolateIngedientFactory;

public class MilkChocolate extends Chocolate {
	private ChocolateIngedientFactory ingedientFactory;
	
	public MilkChocolate(ChocolateIngedientFactory ingedientFactory) {
		this.ingedientFactory = ingedientFactory;
	}
	
	public void prepare() {
		System.out.println("Preparing Milk Chocolate");
		cocoaMass = ingedientFactory.createCocoaMass();
		cocoaButter = ingedientFactory.createCocoaButter();
		sugar = ingedientFactory.createSugar();
		milkPowder = ingedientFactory.createMilkPowder();
	}
}
