package Pizza;

public abstract class PizzaBuilder {
	
	protected PizzaProduct pizza = new PizzaProduct();
	public abstract void buildPreco();
	public abstract void buildTamanhoPizza();
	public abstract void buildIngrediente1();
	public abstract void buildIngrediente2();
	public abstract void buildIngrediente3();
	
	public PizzaProduct getPizza() {
		return pizza;
	}

}
