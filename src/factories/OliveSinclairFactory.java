package factories;
import ingredients.CocoaButter;
import ingredients.CocoaMass;
import ingredients.MilkPowder;
import ingredients.Sugar;
import ingredients.implementations.olivesinclair.OliveSinclairCocoaButter;
import ingredients.implementations.olivesinclair.OliveSinclairCocoaMass;
import ingredients.implementations.olivesinclair.OliveSinclairMilkPowder;
import ingredients.implementations.olivesinclair.OliveSinclairSugar;

public class OliveSinclairFactory implements ChocolateIngedientFactory {

	@Override
	public CocoaMass createCocoaMass() {
		return new OliveSinclairCocoaMass();
	}

	@Override
	public CocoaButter createCocoaButter() {
		return new OliveSinclairCocoaButter();
	}

	@Override
	public Sugar createSugar() {
		return new OliveSinclairSugar();
	}

	@Override
	public MilkPowder createMilkPowder() {
		return new OliveSinclairMilkPowder();
	}
	
	@Override
	public String getName() {
		return "Olive & Sinclair";
	}

}
