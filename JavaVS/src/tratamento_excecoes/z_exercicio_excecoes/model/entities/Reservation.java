package tratamento_excecoes.z_exercicio_excecoes.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import tratamento_excecoes.z_exercicio_excecoes.model.exceptions.DomainException;

public class Reservation {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Integer room_number;
    private Date checkin;
    private Date checkout;


    public Reservation(){

    }
    public Reservation(Integer room_number, Date checkin, Date checkout) {
        if (!checkout.after(checkin)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
        this.room_number = room_number;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoom_number() {
        return room_number;
    }
    public void setRoom_number(Integer room_number) {
        this.room_number = room_number;
    }
    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    //transforma as datas em milisegundos e faz a difereça, armazenada em diff
    //usando o TimeUnit converte os milisegundos para dias 
    public long duration(){
        long  diff = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date chekin, Date checkout) throws DomainException{
        Date now = new Date();
        if (checkin.before(now) || checkout.before(now)){
            throw new DomainException("Reservation dates for updates must be future dates");
        } if (!checkout.after(chekin)){
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.checkin = chekin;
        this.checkout = checkout;
    }

    @Override
    public String toString(){
        return "Room " + getRoom_number() + ", check-in: " 
                + sdf.format(getCheckout()) + ", check-out: " 
                + sdf.format(getCheckout()) + ", nights: " + duration();
    }


    
}
