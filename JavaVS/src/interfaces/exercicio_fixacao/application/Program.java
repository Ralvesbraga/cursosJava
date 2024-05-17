package interfaces.exercicio_fixacao.application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import interfaces.exercicio_fixacao.model.entities.Contract;
import interfaces.exercicio_fixacao.model.entities.Installment;
import interfaces.exercicio_fixacao.model.services.ContractService;
import interfaces.exercicio_fixacao.model.services.PaypalService;

public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato:");
        System.out.print("Numero: ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double value = sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int n = sc.nextInt();

        Contract contract = new Contract(num, date, value);
        ContractService cs = new ContractService(new PaypalService());
        cs.processContract(contract, n);

        System.out.println("Parcelas: ");
        for(Installment i : contract.getInstallment()){
            System.out.println(i);
        }

        sc.close();
    }
    
}
