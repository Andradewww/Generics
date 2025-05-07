package Ex1;

public class Main {

	public static void main(String[] args) {
		
        Generics<Boolean> dadoBoolean = new Generics<>(true);
        Boolean bool = dadoBoolean.getDado();
        System.out.println("Boolean: " + bool);

        Generics<Integer> dadoInteger = new Generics<>(123);
        int numero = dadoInteger.getDado();
        System.out.println("Integer: " + numero);

        Carro p = new Carro("Volvo");
        Generics<Carro> dadoCarro = new Generics<>(p);
        Carro modelo = dadoCarro.getDado();
        System.out.println("Modelo do Carro: " + modelo.getModelo());
    }

}
