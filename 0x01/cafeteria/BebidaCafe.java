import java.util.ArrayList;
import java.util.List;

public class BebidaCafe extends Bebida{
    @Override
    public List<String> obterIngredientes() {
        List<String> stringList = new ArrayList<>();
        stringList.add("cafe");
        return stringList;
    }

    @Override
    public double obterPreco() {
        return 5.35;
    }
}
