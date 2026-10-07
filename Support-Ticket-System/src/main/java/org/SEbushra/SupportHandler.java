package org.SEbushra;

public abstract class SupportHandler {
    private SupportHandler nextHandler;

    SupportHandler(SupportHandler nextHandler){
        this.nextHandler=nextHandler;
    }

    SupportHandler(){
    }

    public  abstract void  handle(Ticket ticket);

    public SupportHandler getNextHandler(){
        return nextHandler;
    }

}
