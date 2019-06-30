package stores;

import chocolates.Chocolate;
import chocolates.ChocolateType;
import chocolates.DarkChocolate;
import chocolates.MilkChocolate;
import chocolates.WhiteChocolate;
import factories.ChocolateIngedientFactory;
import factories.ZaabarFactory;

public class ZaabarStore extends ChocolateStore {

	@Override
	protected Chocolate createChocolate(ChocolateType type) {
		Chocolate chocolate = null;
		ChocolateIngedientFactory ingedientFactory = new ZaabarFactory();
		
		if(type == ChocolateType.MILK) {
			chocolate = new MilkChocolate(ingedientFactory);
		} else if (type == ChocolateType.DARK) {
			chocolate = new DarkChocolate(ingedientFactory);
		} else if (type == ChocolateType.WHITE) {
			chocolate = new WhiteChocolate(ingedientFactory);
		}
		return chocolate;
	}

}
