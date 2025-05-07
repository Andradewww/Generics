package Ex4;

public class Main {
	
    public static void main(String[] args) {
    	
        Teste<Integer> mapa = new Teste<>();

        System.out.println("Adicionando chave 'id1': " + mapa.add("id1", 100)); //true
        System.out.println("Adicionando chave 'id2': " + mapa.add("id2", 200)); //true
        System.out.println("Adicionando chave 'id1' novamente: " + mapa.add("id1", 300)); //false

        System.out.println("\nBuscar chave 'id1': " + mapa.buscar("id1"));
        System.out.println("Buscar chave 'id3': " + mapa.buscar("id3"));

        //teste com string
        Teste<String> mapaStr = new Teste<>();
        mapaStr.add("user", "João");
        mapaStr.add("email", "joao@email.com");

        System.out.println(mapaStr.buscar("email"));
    }
}
