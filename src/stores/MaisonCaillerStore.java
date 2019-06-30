package stores;

import chocolates.Chocolate;
import chocolates.ChocolateFactory;
import chocolates.ChocolateType;
import factories.ChocolateIngedientFactory;
import factories.MaisonCaillerFactory;

public class MaisonCaillerStore extends ChocolateStore {

	@Override
	protected Chocolate createChocolate(ChocolateType type) {
		ChocolateIngedientFactory ingedientFactory = new MaisonCaillerFactory();
		ChocolateFactory chocolateFactory = new ChocolateFactory();
		Chocolate chocolate = chocolateFactory.createChocolate(type, ingedientFactory);
		return chocolate;
	}

}
