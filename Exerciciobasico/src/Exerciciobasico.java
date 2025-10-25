public class Exerciciobasico {
    public static void main(String[] args) {
        double nota1 = 8.5;
        double nota2 = 7.3;
        double media = (nota1 + nota2) / 2;
        System.out.printf("A média das notas é:%.2f%n", + media);
        double numeroDecimal = 9.25;
        int numeroInteiro = (int) numeroDecimal;
        System.out.println("Valgior Original (double):" + numeroDecimal);
        System.out.println("Valor Convertido (int):" + numeroInteiro);



        double preçoProduto = 9.75;
        int quantidadeProduto = 3;
        double ValorTotal = preçoProduto+quantidadeProduto;
        System.out.println("Valor total do produto: " + ValorTotal);
        double valorEmDolares = 10;
        double valorEmReais = valorEmDolares * 4.94;
        System.out.printf("valor em reais: %.2f%n", + valorEmReais);


        double PrecoOriginal = 50;
        double PercentualDesconto = 10;
        double valorDesconto = PrecoOriginal * (PercentualDesconto /100);
        double NovoPreco = PrecoOriginal - valorDesconto;
        System.out.printf("Novo preço com desconto: %.2f%n", NovoPreco);
    }
}
