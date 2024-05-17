package interfaces.exercicio_fixacao.model.services;

import java.time.LocalDate;

import interfaces.exercicio_fixacao.model.entities.Contract;
import interfaces.exercicio_fixacao.model.entities.Installment;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    
    public void processContract(Contract contract, Integer months){
        double month_amount = contract.getTotalValue() / months;
        LocalDate date = contract.getDate();

        for (int i = 0; i<months; i++){
            date = date.plusMonths(1);
            System.out.println(date);
            double value = month_amount + onlinePaymentService.interest(month_amount, i+1);
            value = value  + onlinePaymentService.paymentFee(value);
            contract.getInstallment().add(new Installment(date, value));
        }
    }
}
