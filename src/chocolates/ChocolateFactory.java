package chocolates;

import factories.ChocolateIngedientFactory;

public class ChocolateFactory {
	public Chocolate createChocolate(ChocolateType type, ChocolateIngedientFactory ingedientFactory) {
		Chocolate chocolate = null;
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
