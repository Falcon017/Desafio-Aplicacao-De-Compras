public class Compra implements Comparable<Compra>{
    private String produto;
    private double valor;

    public Compra(String produto, double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor da compra não pode ser negativo.");
        }
        this.produto = produto;
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public double getValor() {
        return valor;

    }

    @Override
    public String toString() {
        return "Produto: " + produto + " | Valor: R$" + String.format("%.2f", valor);
    }
    @Override
    public int compareTo(Compra outraCompra) {
        return Double.compare(this.valor, outraCompra.valor);
    }
}

