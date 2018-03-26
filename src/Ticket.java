/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahate
 */
public class Ticket {

    private Double price;
    private String DateOfReturn;
    private String TimeOfDeparture;
    private String ticketNumber;
    private String Seat;
    private String type;
    private String way;

    public Ticket(Double price, String DateOfReturn, String TimeOfDeparture, String ticketNumber, String Seat, String type, String way) {
        this.price = price;
        this.DateOfReturn = DateOfReturn;
        this.TimeOfDeparture = TimeOfDeparture;
        this.ticketNumber = ticketNumber;
        this.Seat = Seat;
        this.type = type;
        this.way = way;
    }



 
    Ticket() {
   
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDateOfReturn() {
        return DateOfReturn;
    }

    public void setDateOfReturn(String DateOfReturn) {
        this.DateOfReturn = DateOfReturn;
    }

    public String getTimeOfDeparture() {
        return TimeOfDeparture;
    }

    public void setTimeOfDeparture(String TimeOfDeparture) {
        this.TimeOfDeparture = TimeOfDeparture;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getSeat() {
        return Seat;
    }

    public void setSeat(String Seat) {
        this.Seat = Seat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }
    
}
