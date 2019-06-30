package chocolates;

import factories.ChocolateIngedientFactory;

public class MilkChocolate extends Chocolate {
	private ChocolateIngedientFactory ingedientFactory;
	
	public MilkChocolate(ChocolateIngedientFactory ingedientFactory) {
		this.ingedientFactory = ingedientFactory;
		this.typeOfChocolate = ChocolateType.MILK;
		this.factoryOfTheChocolate = ingedientFactory.getName();
		prepare();
	}

	@Override
	protected void prepare() {
		System.out.println("Preparing " + typeOfChocolate.toString() + " Chocolate from " + factoryOfTheChocolate + " factory!");
		cocoaMass = ingedientFactory.createCocoaMass();
		cocoaButter = ingedientFactory.createCocoaButter();
		sugar = ingedientFactory.createSugar();
		milkPowder = ingedientFactory.createMilkPowder();
	}	
}
