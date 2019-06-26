import chocolates.Chocolate;
import stores.ChocolateStore;
import stores.DeKarinaStore;
import stores.MaisonCaillerStore;
import stores.OliveSinclairStore;
import stores.PeruginaStore;
import stores.ZaabarStore;

public class Main {
	public static void main(String[] args) throws Exception {
		ChocolateStore dekarinaStore = new DeKarinaStore();
		Chocolate whiteDeKarinaChocolate = dekarinaStore.orderChocolate("White");
		
		ChocolateStore maisonCaillerStore = new MaisonCaillerStore();
		Chocolate darkMaisonCaillerChocolate = maisonCaillerStore.orderChocolate("White");
		
		ChocolateStore oliveSinclairStore = new OliveSinclairStore();
		Chocolate milkOliveSincalirChocolate = oliveSinclairStore.orderChocolate("White");
		
		ChocolateStore peruginaStore = new PeruginaStore();
		Chocolate darkPeruginaChocolate = peruginaStore.orderChocolate("White");
		
		ChocolateStore zaabarStore = new ZaabarStore();
		Chocolate milkZaabarChocolate = zaabarStore.orderChocolate("White");
	}
}
