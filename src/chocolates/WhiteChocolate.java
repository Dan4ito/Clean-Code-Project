package chocolates;

import factories.ChocolateIngedientFactory;

public class WhiteChocolate extends Chocolate {
	private ChocolateIngedientFactory ingedientFactory;

	public WhiteChocolate(ChocolateIngedientFactory ingedientFactory) {
		this.ingedientFactory = ingedientFactory;
	}

	void prepare() {
		System.out.println("Preparing White Chocolate");
		cocoaButter = ingedientFactory.createCocoaButter();
		sugar = ingedientFactory.createSugar();
		milkPowder = ingedientFactory.createMilkPowder();
	}
}
