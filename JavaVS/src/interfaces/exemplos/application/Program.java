package interfaces.exemplos.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import interfaces.exemplos.entities.CarRental;
import interfaces.exemplos.entities.Vehicle;
import interfaces.exemplos.services.BrazilTaxService;
import interfaces.exemplos.services.RentalService;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();

        System.out.print("Retirada(dd/MM/yyyy): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(),fmt);
        System.out.print("Retorno (dd/MM/yyyy): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        Double pricePerHour = sc.nextDouble();
        System.out.print("Enter com o preço por dia: ");
        Double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("FATURA: ");
        System.out.println("Pagamento básico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());

        sc.close();
    }
}
