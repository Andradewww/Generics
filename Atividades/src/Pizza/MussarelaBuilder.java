package Pizza;

public class MussarelaBuilder extends PizzaBuilder {
	
	@Override
	public void buildPreco() {
		pizza.setPreco(75.00);
	}
	
	@Override
	public void buildTamanhoPizza() {
		pizza.setTamanhoPizza("Grande");
	}
	
	@Override
	public void buildIngrediente1() {
		pizza.setIngrediente1("3 Queijos");
	}
	
	@Override
	public void buildIngrediente2() {
		pizza.setIngrediente2("Alho");
	}
	
	@Override
	public void buildIngrediente3() {
		pizza.setIngrediente3("Azeite de Oliva");
	}

}
