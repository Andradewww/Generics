package Pizza;

public class PizzariaDirector {
	
protected PizzaBuilder pizzaria;
	
	public PizzariaDirector(PizzaBuilder pizzaria) {
		this.pizzaria = pizzaria;
	}
	
	public void prepararPizza() {
		pizzaria.buildPreco();
		pizzaria.buildTamanhoPizza();
		pizzaria.buildIngrediente1();
		pizzaria.buildIngrediente2();
		pizzaria.buildIngrediente3();
	}
	
	public PizzaProduct getPizza() {
		return pizzaria.getPizza();
	}

}
