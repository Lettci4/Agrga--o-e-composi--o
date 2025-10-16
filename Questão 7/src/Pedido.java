import java.util.ArrayList;
import java.util.List;

public class Pedido {
    class ItemPedido {
        private String nomeProduto;
        private int quantidade;
        private double precoUnitario;

        public ItemPedido(String nomeProduto, int quantidade, double precoUnitario) {
            this.nomeProduto = nomeProduto;
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
        }

        public double calcularSubtotal() {
            return quantidade * precoUnitario;
        }

        public String getNomeProduto() {
            return nomeProduto;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public double getPrecoUnitario() {
            return precoUnitario;
        }
    }

    private List<ItemPedido> itens;

    public Pedido() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(String nomeProduto, int quantidade, double precoUnitario) {
        ItemPedido item = new ItemPedido(nomeProduto, quantidade, precoUnitario);
        itens.add(item);
    }

    public double valorTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarItem("Teclado", 2, 150.0);
        pedido.adicionarItem("Mouse", 1, 80.0);

        System.out.println("Valor total do pedido: R$ " + pedido.valorTotal());
    }
}