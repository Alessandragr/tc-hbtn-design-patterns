import java.util.HashSet;

public class Pedido {
    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();

    public void adicionarItemDentroCaixa(ItemPedido item) {
        this.itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item) {
        this.itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        String itensFora = "\tFora da Caixa:";
        String itensDentro = "\tDentro da Caixa:";

        for (ItemPedido itemPedido : itensForaCaixa) {
            itensFora += "\n\t\t- " + itemPedido.getTipo() + " " + itemPedido.getNome();
        }

        for (ItemPedido itemPedido : itensDentroCaixa) {
            itensDentro += "\n\t\t- " + itemPedido.getTipo() + " " + itemPedido.getNome();
        }

        return itensFora + "\n" + itensDentro + "\n";
    }
}
