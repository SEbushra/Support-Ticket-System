package org.SEbushra;
// Don't add complexity unless you need it
public class Main {
    static void main() {
        Ticket ticket1=new Ticket("bushra","",Priority.LOW,Category.SECURITY);
        Ticket ticket2=new Ticket("bushra","",Priority.LOW,Category.TECHNICAL);
        Ticket ticket3=new Ticket("bushra","",Priority.HIGH,Category.SECURITY);
        Ticket ticket4=new Ticket("bushra","",Priority.CRITICAL,Category.TECHNICAL);
        Ticket ticket5=new Ticket("bushra","",Priority.HIGH,Category.OTHER);
        Ticket ticket6=new Ticket("bushra","",Priority.MEDIUM,Category.OTHER);

        BasicSupport basicSupport = BasicSupport.getBasicSupport();

        basicSupport.handle (ticket1);
        basicSupport.handle (ticket2);
        basicSupport.handle (ticket3);
        basicSupport.handle (ticket4);
        basicSupport.handle (ticket5);
        basicSupport.handle (ticket6);


    }
    }

