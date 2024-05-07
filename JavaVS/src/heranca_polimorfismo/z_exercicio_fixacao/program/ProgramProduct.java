package heranca_polimorfismo.z_exercicio_fixacao.program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import heranca_polimorfismo.z_exercicio_fixacao.entities.ImportedProduct;
import heranca_polimorfismo.z_exercicio_fixacao.entities.Product;
import heranca_polimorfismo.z_exercicio_fixacao.entities.UsedProduct;

public class ProgramProduct {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();


        for(int i = 0; i < n; i++){
            System.out.printf("Product #%d data: \n", i+1);
            System.out.print("Common, used or imported (c/u/i)? ");
            char res = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if(res == 'i'){
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, fee);
                products.add(product);

            } else if(res == 'c'){
                Product product = new Product(name, price);
                products.add(product);
            } else{
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufaDate = sdf.parse(sc.next());
                Product product = new UsedProduct(name, price, manufaDate);
                products.add(product);
            }
        }

        for(Product p: products){
            System.out.println(p.priceTag());
        }
        sc.close();
    }
}
