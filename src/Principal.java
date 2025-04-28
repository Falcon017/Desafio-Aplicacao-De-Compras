import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao =new CartaoDeCredito(limite);

        int sair = 1;

        leitura.nextLine();

        while (sair != 0){
            System.out.println("Digite o produto: ");
            String produto = leitura.nextLine();

            System.out.println("Digite o valor da compra: ");
            double valor = leitura.nextDouble();

            leitura.nextLine();

            Compra compra = new Compra(produto, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            System.out.println();

            if (compraRealizada){
                System.out.println("Novo saldo: R$" +String.format("%.2f", cartao.getSaldo()));
                System.out.println();
                System.out.println("Digite 1 para realizar nova compra ou 0 para sair.");
                sair =leitura.nextInt();

            }else{
                sair = 1;
            }

            leitura.nextLine();
        }

        System.out.println("***********************************");
        System.out.println("Lista de compras:");
        Collections.sort(cartao.getCompras());

        double totalCompras = 0;

        for (Compra compras : cartao.getCompras()){
            System.out.println( compras.getProduto() + " - " + String.format("%.2f", compras.getValor()));
            totalCompras += compras.getValor();
        }

        System.out.println();
        System.out.println("valor total da compra: R$"+ String.format("%.2f", totalCompras));
        System.out.println("***********************************");
        System.out.println();
        System.out.println("Saldo do cartão: R$" + String.format("%.2f", cartao.getSaldo()));

        leitura.close();
    }
}
