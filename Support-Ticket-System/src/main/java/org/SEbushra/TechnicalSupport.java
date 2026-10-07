package org.SEbushra;

public class TechnicalSupport extends SupportHandler{
    private static TechnicalSupport technicalSupport=null;

    private TechnicalSupport(){
        super(SeniorSupport.getSeniorSupport());
    }

    public static TechnicalSupport getTechnicalSupport(){
        if(technicalSupport==null){
            technicalSupport=new TechnicalSupport();
        }
        return technicalSupport;
    }

    public void handle (Ticket ticket){
        if(ticket.getCategory()==Category.TECHNICAL || ticket.getCategory()==Category.PAYMENT){
            System.out.println("Handled by TechnicalSupport");
        }
        else{
            getNextHandler().handle(ticket);
        }
    }

}
