package chocolates;

import factories.ChocolateIngedientFactory;

public class DarkChocolate extends Chocolate {
	private ChocolateIngedientFactory ingedientFactory;
	
	/**
	 * Constructor requiring ingedientFactory of type ChocolateIngedientFactory which will supply the ingredients of the Chocolate
	 * @param ChocolateIngedientFactory ingedientFactory
	 */
	public DarkChocolate(ChocolateIngedientFactory ingedientFactory) {
		this.ingedientFactory = ingedientFactory;
		this.typeOfChocolate = ChocolateType.DARK;
		prepare();
	}
	
	@Override
	protected void prepare() {
		System.out.println("Preparing " + typeOfChocolate.toString() + " Chocolate from " + getFactoryOfTheChocolate() + " factory!");
		cocoaMass = ingedientFactory.createCocoaMass();
		cocoaButter = ingedientFactory.createCocoaButter();
		sugar = ingedientFactory.createSugar();
	}

	@Override
	public String getFactoryOfTheChocolate() {
		return ingedientFactory.getName();
	}
}
