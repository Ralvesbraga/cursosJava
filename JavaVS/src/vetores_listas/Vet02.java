package vetores_listas;
import java.util.Locale;
import java.util.Scanner;

public class Vet02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Vetor02Exemplo[] vect = new Vetor02Exemplo[n];

        for (int i=0; i<n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Vetor02Exemplo(name, price);
        }

        double sum = 0.0;
        for (int i=0; i<vect.length; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / n;
        System.out.printf("AVERAGE PRICE = %.2f\n", avg);


        sc.close();
    }
}
