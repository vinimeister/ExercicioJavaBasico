public class ExercicioBasico2 {
    public static void main(String[] args) {
        String produto ="Lápis";
        char letra= 'L';
        double preco = 2.50;
        int quantidade = 3;
        double valorTotal = preco*quantidade;
        double PercetualDesconto = 10;
        double valorDesconto = valorTotal * (PercetualDesconto /100);
        double valorTotalComDesconto = valorTotal - valorDesconto;
        System.out.printf("valor total com desconto: %.2f%n", valorTotalComDesconto);
        double valorEmDolares = 6.75;
        double valorEmReais = valorEmDolares / 4.94;
        System.out.printf("Valor em reais é: %.2f%n", valorEmReais);
        System.out.println("Produto:"+ produto);
        System.out.println("letra: "+ letra);
        System.out.println("Quantidade: "+ quantidade);
        System.out.println("preço: "+ preco);
        System.out.println("Valor total com desconto: "+ valorTotalComDesconto);
        System.out.println("Valor em dolares: "+ valorEmDolares);



    }
}
