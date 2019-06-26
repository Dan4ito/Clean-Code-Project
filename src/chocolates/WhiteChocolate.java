package chocolates;

import factories.ChocolateIngedientFactory;

public class WhiteChocolate extends Chocolate {
	private ChocolateIngedientFactory ingedientFactory;

	public WhiteChocolate(ChocolateIngedientFactory ingedientFactory) {
		this.ingedientFactory = ingedientFactory;
	}

	public void prepare() {
		System.out.println("Preparing White Chocolate from the " + ingedientFactory.getName() + " factory!");
		cocoaButter = ingedientFactory.createCocoaButter();
		sugar = ingedientFactory.createSugar();
		milkPowder = ingedientFactory.createMilkPowder();
	}
}
