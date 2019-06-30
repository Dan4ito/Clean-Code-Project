package chocolates;

import factories.ChocolateIngedientFactory;

public class WhiteChocolate extends Chocolate {
	private ChocolateIngedientFactory ingedientFactory;

	public WhiteChocolate(ChocolateIngedientFactory ingedientFactory) {
		this.ingedientFactory = ingedientFactory;
		this.typeOfChocolate = "White";
		this.factoryOfTheChocolate = ingedientFactory.getName();
		prepare();
	}

	@Override
	protected void prepare() {
		System.out.println("Preparing " + typeOfChocolate + " Chocolate from " + factoryOfTheChocolate + " factory!");
		cocoaButter = ingedientFactory.createCocoaButter();
		sugar = ingedientFactory.createSugar();
		milkPowder = ingedientFactory.createMilkPowder();
	}
}
