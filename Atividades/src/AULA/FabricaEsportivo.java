package AULA;

public class FabricaEsportivo implements FabricaDeCarro {
	
	@Override
	public Carro criarCarro() {
		return new CarroEsportivo();
	}

}
