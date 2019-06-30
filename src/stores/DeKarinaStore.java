package stores;

import chocolates.Chocolate;
import chocolates.ChocolateType;
import chocolates.DarkChocolate;
import chocolates.MilkChocolate;
import chocolates.WhiteChocolate;
import factories.ChocolateIngedientFactory;
import factories.DeKarinaFactory;

public class DeKarinaStore extends ChocolateStore {

	@Override
	protected Chocolate createChocolate(ChocolateType type) {
		Chocolate chocolate = null;
		ChocolateIngedientFactory ingedientFactory = new DeKarinaFactory();
		
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
