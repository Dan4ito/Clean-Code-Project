package stores;

import chocolates.Chocolate;
import chocolates.ChocolateFactory;
import chocolates.ChocolateType;
import factories.ChocolateIngedientFactory;
import factories.DeKarinaFactory;

public class DeKarinaStore extends ChocolateStore {

	@Override
	protected Chocolate createChocolate(ChocolateType type) {
		ChocolateIngedientFactory ingedientFactory = new DeKarinaFactory();
		ChocolateFactory chocolateFactory = new ChocolateFactory();
		Chocolate chocolate = chocolateFactory.createChocolate(type, ingedientFactory);
		return chocolate;
	}

}
