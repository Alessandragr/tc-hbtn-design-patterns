import java.util.ArrayList;
import java.util.List;

public class BebidaComAcucar extends BebidaDecorator{
    public BebidaComAcucar(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }
    @Override
    public List<String> obterIngredientes() {
        List<String> stringList = new ArrayList<>();
        stringList.addAll(super.obterIngredientes());
        stringList.add("acucar");

        return stringList;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 1.9;
    }
}
