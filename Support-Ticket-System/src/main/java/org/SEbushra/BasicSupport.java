package org.SEbushra;

public class BasicSupport extends SupportHandler{
    static private BasicSupport basicSupport=null;

    private BasicSupport(){
        super(TechnicalSupport.getTechnicalSupport());
    }

    public static BasicSupport getBasicSupport() {
        if(basicSupport==null) basicSupport=new BasicSupport();
        return basicSupport;
    }

    @Override
    public void handle (Ticket ticket){
        if(ticket.getPriority()==Priority.LOW && ticket.getCategory()!=Category.SECURITY ){
            System.out.println("Handled by BasicSupport");
        }
        else{
            getNextHandler().handle(ticket);
        }
    }


}
