package programacao_funcional_expressoes_lambdas.function.util;


import java.util.function.Function;

import programacao_funcional_expressoes_lambdas.function.entities.Product;

public class UpperCaseName implements Function<Product, String>{

    @Override
    public String apply(Product t) {
        return t.getName().toUpperCase();
    }

    

}
