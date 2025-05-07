package Ex2;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Date fabr1 = new Date(124, 4, 6); //6 maio 2024
        Date venc1 = new Date(125, 4, 6); //6 maio 2025
        
        //Id Integer
        Produto<Integer> produtoInt = new Produto<>(1001, 50.00, fabr1, venc1);
        System.out.println("Produto com Id Integer:");
        System.out.println(produtoInt);

        //Id String
        Produto<String> produtoStr = new Produto<>("1AA1", 50.00, fabr1, venc1);
        System.out.println("\nProduto com Id String:");
        System.out.println(produtoStr);
    }
}
