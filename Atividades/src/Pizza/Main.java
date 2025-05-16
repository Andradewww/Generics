package Pizza;

public class Main {
	
	public static void main(String[] args) {
		
		PizzariaDirector pizzaria = new PizzariaDirector(new FrangoBuilder());
		pizzaria.prepararPizza();
		PizzaProduct pizza = pizzaria.getPizza();
		System.out.println(pizza);
		
		pizzaria = new PizzariaDirector(new MussarelaBuilder());
		pizzaria.prepararPizza();
		pizza = pizzaria.getPizza();
		System.out.println(pizza);
		
	}

}
