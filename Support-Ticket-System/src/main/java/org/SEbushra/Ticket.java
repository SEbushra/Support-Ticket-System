package org.SEbushra;

public class Ticket {
    private static int numberOfTickets=0;
    private int ticketId;
    private String customerName;
    private String description;
    private Priority priority;
    private Category category;

    public Priority getPriority(){
        return this.priority;
    }

    public Category getCategory(){
        return this.category;
    }

    Ticket(String customerName,String description,Priority priority,Category category){
        this.ticketId= numberOfTickets++;
        this.customerName=customerName;
        this.description=description;
        this.priority=priority;
        this.category=category;
    }

}
