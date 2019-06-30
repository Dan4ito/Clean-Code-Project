package stores;

import chocolates.Chocolate;
import chocolates.ChocolateFactory;
import chocolates.ChocolateType;
import factories.ChocolateIngedientFactory;
import factories.ZaabarFactory;

public class ZaabarStore extends ChocolateStore {

	@Override
	protected Chocolate createChocolate(ChocolateType type) {
		ChocolateIngedientFactory ingedientFactory = new ZaabarFactory();
		ChocolateFactory chocolateFactory = new ChocolateFactory();
		Chocolate chocolate = chocolateFactory.createChocolate(type, ingedientFactory);
		return chocolate;
	}

}
