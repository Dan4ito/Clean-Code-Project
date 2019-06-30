package chocolates;

import factories.ChocolateIngedientFactory;

public class DarkChocolate extends Chocolate {
	private ChocolateIngedientFactory ingedientFactory;
	
	public DarkChocolate(ChocolateIngedientFactory ingedientFactory) {
		this.ingedientFactory = ingedientFactory;
		this.typeOfChocolate = "Dark";
		this.factoryOfTheChocolate = ingedientFactory.getName();
		prepare();
	}
	
	@Override
	protected void prepare() {
		System.out.println("Preparing " + typeOfChocolate + " Chocolate from " + factoryOfTheChocolate + " factory!");
		cocoaMass = ingedientFactory.createCocoaMass();
		cocoaButter = ingedientFactory.createCocoaButter();
		sugar = ingedientFactory.createSugar();
	}
}
