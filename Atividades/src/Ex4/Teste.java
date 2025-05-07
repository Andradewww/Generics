package Ex4;
import java.util.ArrayList;
import java.util.List;

public class Teste<T> {
	
	private static class Par<T> {
        String chave;
        T valor;

        Par(String chave, T valor) {
            this.chave = chave;
            this.valor = valor;
        }

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Par [chave=");
			builder.append(chave);
			builder.append(", valor=");
			builder.append(valor);
			builder.append("]");
			return builder.toString();
		}
    }

	
    private List<Par<T>> lista = new ArrayList<>();

    
    public boolean add(String chave, T valor) {
        for (Par<T> par : lista) {
            if (par.chave.equals(chave)) {
                return false; //já existe a chave
            }
        }
        lista.add(new Par<>(chave, valor));
        return true;
    }

    public String buscar(String chave) {
        for (Par<T> par : lista) {
            if (par.chave.equals(chave)) {
                return par.toString();
            }
        }
        return "Chave não encontrada.";
    }

}
