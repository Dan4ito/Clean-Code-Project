package stores;

import chocolates.Chocolate;
import chocolates.ChocolateFactory;
import chocolates.ChocolateType;
import factories.ChocolateIngedientFactory;
import factories.OliveSinclairFactory;

public class OliveSinclairStore extends ChocolateStore {

	@Override
	protected Chocolate createChocolate(ChocolateType type) {
		ChocolateIngedientFactory ingedientFactory = new OliveSinclairFactory();
		ChocolateFactory chocolateFactory = new ChocolateFactory();
		Chocolate chocolate = chocolateFactory.createChocolate(type, ingedientFactory);
		return chocolate;
	}

}
