import chocolates.Chocolate;
import ingredients.Sugar;
import ingredients.implementations.dekarina.DeKarinaSugar;
import stores.ChocolateStore;
import stores.DeKarinaStore;

public class Main {
	public static void main(String[] args) throws Exception {
		ChocolateStore chocolateStore = new DeKarinaStore();
		Chocolate whiteDeKarinaChocolate = chocolateStore.orderChocolate("White");
	}
}
