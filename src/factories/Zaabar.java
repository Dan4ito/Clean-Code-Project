package factories;
import ingredients.CocoaButter;
import ingredients.CocoaMass;
import ingredients.MilkPowder;
import ingredients.Sugar;
import ingredients.implementations.zaabar.ZaabarCocoaButter;
import ingredients.implementations.zaabar.ZaabarCocoaMass;
import ingredients.implementations.zaabar.ZaabarMilkPowder;
import ingredients.implementations.zaabar.ZaabarSugar;

public class Zaabar implements ChocolateIngedientFactory {

	@Override
	public CocoaMass createCocoaMass() {
		return new ZaabarCocoaMass();
	}

	@Override
	public CocoaButter createCocoaButter() {
		return new ZaabarCocoaButter();
	}

	@Override
	public Sugar createSugar() {
		return new ZaabarSugar();
	}

	@Override
	public MilkPowder createMilkPowder() {
		return new ZaabarMilkPowder();
	}

}
