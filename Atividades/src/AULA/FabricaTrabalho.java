package AULA;

public class FabricaTrabalho implements FabricaDeCarro {
	
	@Override
	public Carro criarCarro() {
		return new CarroTrabalho();
	}

}
