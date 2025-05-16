package AULA;

public class FabricaPasseio implements FabricaDeCarro {
	
	@Override
	public Carro criarCarro() {
		return new CarroPasseio();
	}

}
