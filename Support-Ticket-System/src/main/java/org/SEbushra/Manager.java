package org.SEbushra;

public class Manager extends SupportHandler {
    private static Manager manager =null;

    private Manager(){

    }

    public static Manager getManager(){
        if(manager ==null){
            manager=new Manager();
        }
        return manager;
    }

    @Override
    public void handle (Ticket ticket){
        if(ticket.getPriority()==Priority.CRITICAL ||ticket.getCategory()== Category.SECURITY){
            System.out.println("Handled by Manager");
        }
        else{
            System.out.println("Cannot handle this ticket");
        }
    }
}
