package chocolates;

import factories.ChocolateIngedientFactory;

public class MilkChocolate extends Chocolate {
	private ChocolateIngedientFactory ingedientFactory;
	
	public MilkChocolate(ChocolateIngedientFactory ingedientFactory) {
		this.ingedientFactory = ingedientFactory;
		this.typeOfChocolate = "Milk";
		this.factoryOfTheChocolate = ingedientFactory.getName();
		prepare();
	}

	@Override
	protected void prepare() {
		System.out.println("Preparing " + typeOfChocolate + " Chocolate from " + factoryOfTheChocolate + " factory!");
		cocoaMass = ingedientFactory.createCocoaMass();
		cocoaButter = ingedientFactory.createCocoaButter();
		sugar = ingedientFactory.createSugar();
		milkPowder = ingedientFactory.createMilkPowder();
	}	
}
