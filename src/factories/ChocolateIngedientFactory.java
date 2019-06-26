package factories;
import ingredients.CocoaButter;
import ingredients.CocoaMass;
import ingredients.MilkPowder;
import ingredients.Sugar;

public interface ChocolateIngedientFactory {
	public CocoaMass createCocoaMass();
	public CocoaButter createCocoaButter();
	public Sugar createSugar();
	public MilkPowder createMilkPowder();
	
	public String getName();
	
}
