package org.SEbushra;

public class SeniorSupport extends SupportHandler{
    private static SeniorSupport seniorSupport = null;


    public static SeniorSupport getSeniorSupport(){
        if(seniorSupport == null) seniorSupport=new SeniorSupport();
        return seniorSupport;
    }

    private SeniorSupport(){
        super(Manager.getManager());
    }


    @Override
    public void handle (Ticket ticket){
        if(ticket.getPriority()==Priority.HIGH){
            System.out.println("Handled by SeniorSupport");
        }
        else{
            getNextHandler().handle(ticket);
        }
    }
}
