import interfaces.problema_diamante.devices.ComboDevice;
import interfaces.problema_diamante.devices.ConcretePrinter;
import interfaces.problema_diamante.devices.ConcreteScanner;

public class Program {
    public static void main(String[] args) {
        
        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());

        System.out.println();
        ComboDevice cb = new ComboDevice("2081");
        cb.processDoc("My dissertation");
        cb.print("My dissertation");
        System.out.println("Scan result: " + cb.scan());

    }
}
