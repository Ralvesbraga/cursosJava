package heranca_polimorfismo.z_exercicio_resolvido_abstrato.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import heranca_polimorfismo.z_exercicio_resolvido_abstrato.entities.Circle;
import heranca_polimorfismo.z_exercicio_resolvido_abstrato.entities.Rectangle;
import heranca_polimorfismo.z_exercicio_resolvido_abstrato.entities.Shape;
import heranca_polimorfismo.z_exercicio_resolvido_abstrato.enums.Color;

public class ProgramShape {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <Shape> shapes = new ArrayList<>();
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.printf("Shape #%d data:\n", i+1);
            System.out.print("Rectangle or Circle (r/c)?");
            char res = sc.next().charAt(0);
            System.out.print("Color (BLACK, BLUE, RED): ");
            Color color = Color.valueOf(sc.next());

            if(res == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                Rectangle rec = new Rectangle(color, width, height);
                shapes.add(rec);
            } else{
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                Circle circle = new Circle(color, radius);
                shapes.add(circle);
            }

        }

        for(Shape s : shapes){
            System.out.println(String.format("%.2f", s.area()));
            
        }
        
    }
    
}
