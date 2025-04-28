import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        if (limite < 0) {
            throw new IllegalArgumentException("O limite não pode ser negativo.");
        }

        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {
        if (this.saldo >= compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            System.out.println("Compra realizada com sucesso! - " + compra);
            return true;

        } else {
            System.out.println("Saldo insuficiente! - Saldo disponível: R$" + String.format("%.2f", this.saldo) + " - Valor da compra: R$" + String.format("%.2f", compra.getValor()));
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }


}
