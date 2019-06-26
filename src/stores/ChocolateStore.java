package stores;

import chocolates.Chocolate;

public abstract class ChocolateStore {
	
	public Chocolate orderChocolate(String type) {
		Chocolate chocolate;
		chocolate = createChocolate(type);
		chocolate.prepare();
		chocolate.box();
		
		return chocolate;
	}
	
	protected abstract Chocolate createChocolate(String type);
}
