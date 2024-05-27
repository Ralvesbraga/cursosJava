package programacao_funcional_expressoes_lambdas.consumer.util;


import java.util.function.Consumer;

import programacao_funcional_expressoes_lambdas.consumer.entities.Product;

public class PriceUpdate implements Consumer<Product>{

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }

}
