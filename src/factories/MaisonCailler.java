package factories;
import ingredients.CocoaButter;
import ingredients.CocoaMass;
import ingredients.MilkPowder;
import ingredients.Sugar;
import ingredients.implementations.maisoncailler.MaisonCaillerCocoaButter;
import ingredients.implementations.maisoncailler.MaisonCaillerCocoaMass;
import ingredients.implementations.maisoncailler.MaisonCaillerMilkPowder;
import ingredients.implementations.maisoncailler.MaisonCaillerSugar;

public class MaisonCailler implements ChocolateIngedientFactory {

	@Override
	public CocoaMass createCocoaMass() {
		return new MaisonCaillerCocoaMass();
	}

	@Override
	public CocoaButter createCocoaButter() {
		return new MaisonCaillerCocoaButter();
	}

	@Override
	public Sugar createSugar() {
		return new MaisonCaillerSugar();
	}

	@Override
	public MilkPowder createMilkPowder() {
		return new MaisonCaillerMilkPowder();
	}

}
