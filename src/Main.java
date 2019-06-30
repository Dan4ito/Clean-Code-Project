import java.util.List;

import chocolates.Chocolate;
import chocolates.ChocolateType;
import chocolates.DarkChocolate;
import stores.ChocolateStore;
import stores.DeKarinaStore;
import stores.MaisonCaillerStore;
import stores.OliveSinclairStore;
import stores.PeruginaStore;
import stores.ZaabarStore;

public class Main {
	public static void main(String[] args) throws Exception {
		ChocolateStore dekarinaStore = new DeKarinaStore();
		Chocolate whiteDeKarinaChocolate = dekarinaStore.orderChocolate(ChocolateType.MILK);	
		
		ChocolateStore maisonCaillerStore = new MaisonCaillerStore();
		Chocolate darkMaisonCaillerChocolate = maisonCaillerStore.orderChocolate(ChocolateType.WHITE);
		
		ChocolateStore oliveSinclairStore = new OliveSinclairStore();
		Chocolate milkOliveSincalirChocolate = oliveSinclairStore.orderChocolate(ChocolateType.DARK);
		
		ChocolateStore peruginaStore = new PeruginaStore();
		Chocolate darkPeruginaChocolate = peruginaStore.orderChocolate(ChocolateType.WHITE);
		
		ChocolateStore zaabarStore = new ZaabarStore();
		Chocolate milkZaabarChocolate = zaabarStore.orderChocolate(ChocolateType.WHITE);
		
	}
}
