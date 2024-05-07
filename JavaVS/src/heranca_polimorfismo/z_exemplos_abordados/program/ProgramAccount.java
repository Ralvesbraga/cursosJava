package heranca_polimorfismo.z_exemplos_abordados.program;

import java.util.ArrayList;
import java.util.List;

import heranca_polimorfismo.z_exemplos_abordados.entities.Account;
import heranca_polimorfismo.z_exemplos_abordados.entities.BussinessAccount;
import heranca_polimorfismo.z_exemplos_abordados.entities.SavingsAccount;

public class ProgramAccount {
    public static void main(String[] args) {
        

        //BussinessAccount bacc = new BussinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        //Account acc1 = bacc;
        //Como a BussinesAccount é uma conta, então podemos atribuir
        Account acc2 = new BussinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        BussinessAccount acc4 = (BussinessAccount) acc2;
        acc4.loan(100.0);

        // BussinessAccount acc5 = (BussinessAccount) acc3;

        if(acc3 instanceof BussinessAccount){
            BussinessAccount acc5 = (BussinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        // ---------------SOBREPOSIÇÃO -----------------------

        //Account acc6 = new Account(101, "Ale", 1000.0); não pode ser instanciado, pois se tornou abstrata
        //acc6.withDraw(200.0);
        //System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount(102, "Mari", 1000.0, 0.01);
        acc7.withDraw(200);
        System.out.println(acc7.getBalance());

        Account acc8 = new BussinessAccount(103, "Bin", 1000.0, 500.0);
        acc8.withDraw(200.0);
        System.out.println(acc8.getBalance());

        //----------------POLIMORFISMO--------------------

        //Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        //x.withDraw(50.0);
        y.withDraw(50.0);

        //System.out.println(x.getBalance());
        System.out.println(y.getBalance());


        //-------------------------CLASSE ABSTRATA-----------------

        List<Account> list = new ArrayList<>();
        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        list.add(new SavingsAccount(1001, "Maria", 1000.00, 0.01));
        list.add(new BussinessAccount(1002, "Bob", 100.00, 400.00));
        list.add(new BussinessAccount(1002, "Anna", 500.00, 500.00));

        double sum = 0.0;

        for (Account acc: list){
            sum += acc.getBalance();
        }
        System.out.printf("Total balance: %.2f\n", sum);

        for (Account acc: list){
            acc.deposit(10);;
        }

        for (Account acc: list){
            System.out.printf("Updatebalance for account %d: %.2f\n", acc.getNumber(), acc.getBalance());
        }


    }
}
