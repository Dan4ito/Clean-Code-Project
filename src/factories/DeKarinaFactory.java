package factories;
import ingredients.CocoaButter;
import ingredients.CocoaMass;
import ingredients.MilkPowder;
import ingredients.Sugar;
import ingredients.implementations.dekarina.DeKarinaCocoaButter;
import ingredients.implementations.dekarina.DeKarinaCocoaMass;
import ingredients.implementations.dekarina.DeKarinaMilkPowder;
import ingredients.implementations.dekarina.DeKarinaSugar;

public class DeKarinaFactory implements ChocolateIngedientFactory {

	@Override
	public CocoaMass createCocoaMass() {
		return new DeKarinaCocoaMass();
	}

	@Override
	public CocoaButter createCocoaButter() {
		return new DeKarinaCocoaButter();
	}

	@Override
	public Sugar createSugar() {
		return new DeKarinaSugar();
	}

	@Override
	public MilkPowder createMilkPowder() {
		return new DeKarinaMilkPowder();
	}

	@Override
	public String getName() {
		return "De Karina";
	}

}
