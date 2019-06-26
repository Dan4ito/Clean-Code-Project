package stores;

import chocolates.Chocolate;
import chocolates.DarkChocolate;
import chocolates.MilkChocolate;
import chocolates.WhiteChocolate;
import factories.ChocolateIngedientFactory;
import factories.ZaabarFactory;

public class ZaabarStore extends ChocolateStore {

	@Override
	protected Chocolate createChocolate(String type) {
		Chocolate chocolate = null;
		ChocolateIngedientFactory ingedientFactory = new ZaabarFactory();
		
		if(type.equals("Milk")) {
			chocolate = new MilkChocolate(ingedientFactory);
		} else if (type.equals("Dark")) {
			chocolate = new DarkChocolate(ingedientFactory);
		} else if (type.equals("White")) {
			chocolate = new WhiteChocolate(ingedientFactory);
		}
		return chocolate;
	}

}
