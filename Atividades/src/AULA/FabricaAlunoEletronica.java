package AULA;

public class FabricaAlunoEletronica implements FabricaDeAluno {
	
	@Override
	public Aluno criarAluno() {
		return new AlunoEletronica();
	}
}
