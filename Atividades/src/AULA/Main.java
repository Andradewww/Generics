package AULA;

public class Main {

	public static void main(String[] args) {

		Comunica com1 = Comunica.getInstance();	//singleton
		Comunica com2 = Comunica.getInstance();
		Comunica com3 = Comunica.getInstance();
		
		com1.setCodigo(1);
		com2.setMsg("Teste");
		com3.setTipo(true);
		
		System.out.println(com1);
		System.out.println(com2);
		System.out.println(com3);
		
		System.out.println("\n-----------------------------------------\n");
		
		FabricaDeAluno fabrica = new FabricaAlunoInformatica();
		Aluno aluno = fabrica.criarAluno();
		System.out.println(aluno.exibirInfo());
		
		fabrica = new FabricaAlunoMecatronica();
		aluno = fabrica.criarAluno();
		System.out.println(aluno.exibirInfo());
		
		fabrica = new FabricaAlunoEletronica();
		aluno = fabrica.criarAluno();
		System.out.println(aluno.exibirInfo());
		
		System.out.println("\n-----------------------------------------\n");
		
		FabricaDeCarro fabrica2 = new FabricaEsportivo();
		Carro carro = fabrica2.criarCarro();
		System.out.println(carro.exibirInfo());
		
		fabrica2 = new FabricaTrabalho();
		carro = fabrica2.criarCarro();
		System.out.println(carro.exibirInfo());
		
		fabrica2 = new FabricaPasseio();
		carro = fabrica2.criarCarro();
		System.out.println(carro.exibirInfo());
		
		System.out.println("\n-----------------------------------------\n");
		
		CarroBuilder fabricaCarro = new FiatBuilder();
		CarroProduct carro2 = fabricaCarro.getCarro();
		System.out.println(carro2);


	
		
	}
}
