package chocolates;

import factories.ChocolateIngedientFactory;

public class WhiteChocolate extends Chocolate {
	private ChocolateIngedientFactory ingedientFactory;

	/**
	 * Constructor requiring ingedientFactory of type ChocolateIngedientFactory which will supply the ingredients of the Chocolate
	 * @param ChocolateIngedientFactory ingedientFactory
	 */
	public WhiteChocolate(ChocolateIngedientFactory ingedientFactory) {
		this.ingedientFactory = ingedientFactory;
		this.typeOfChocolate = ChocolateType.WHITE;
		prepare();
	}

	@Override
	protected void prepare() {
		System.out.println("Preparing " + typeOfChocolate.toString() + " Chocolate from " + getFactoryOfTheChocolate() + " factory!");
		cocoaButter = ingedientFactory.createCocoaButter();
		sugar = ingedientFactory.createSugar();
		milkPowder = ingedientFactory.createMilkPowder();
	}
	
	@Override
	public String getFactoryOfTheChocolate() {
		return ingedientFactory.getName();
	}
}
