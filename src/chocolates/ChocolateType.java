package chocolates;

public enum ChocolateType {
	MILK("Milk"), DARK("Dark"), WHITE("White");
	
	private final String enumValue;

    private ChocolateType(String enumValue) {
    	this.enumValue = enumValue;
    }

    @Override
    public String toString() {
        return enumValue;
    }
}
