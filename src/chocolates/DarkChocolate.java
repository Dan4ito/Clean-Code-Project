package chocolates;

import factories.ChocolateIngedientFactory;

public class DarkChocolate extends Chocolate {
	private ChocolateIngedientFactory ingedientFactory;
	
	public DarkChocolate(ChocolateIngedientFactory ingedientFactory) {
		this.ingedientFactory = ingedientFactory;
	}
	
	void prepare() {
		System.out.println("Preparing Dark Chocolate");
		cocoaMass = ingedientFactory.createCocoaMass();
		cocoaButter = ingedientFactory.createCocoaButter();
		sugar = ingedientFactory.createSugar();
	}
}
