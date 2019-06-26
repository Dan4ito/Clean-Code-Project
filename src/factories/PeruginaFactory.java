package factories;
import ingredients.CocoaButter;
import ingredients.CocoaMass;
import ingredients.MilkPowder;
import ingredients.Sugar;
import ingredients.implementations.perugina.PeruginaCocoaButter;
import ingredients.implementations.perugina.PeruginaCocoaMass;
import ingredients.implementations.perugina.PeruginaMilkPowder;
import ingredients.implementations.perugina.PeruginaSugar;

public class PeruginaFactory implements ChocolateIngedientFactory {

	@Override
	public CocoaMass createCocoaMass() {
		return new PeruginaCocoaMass();
	}

	@Override
	public CocoaButter createCocoaButter() {
		return new PeruginaCocoaButter();
	}

	@Override
	public Sugar createSugar() {
		return new PeruginaSugar();
	}

	@Override
	public MilkPowder createMilkPowder() {
		return new PeruginaMilkPowder();
	}
	
	@Override
	public String getName() {
		return "Perugina";
	}

}
