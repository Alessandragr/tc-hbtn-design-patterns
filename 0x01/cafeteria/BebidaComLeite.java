import java.util.ArrayList;
import java.util.List;

public class BebidaComLeite extends BebidaDecorator{
    public BebidaComLeite(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> stringList = new ArrayList<>();
        stringList.addAll(super.obterIngredientes());
        stringList.add("leite");

        return stringList;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 3.2;
    }
}
