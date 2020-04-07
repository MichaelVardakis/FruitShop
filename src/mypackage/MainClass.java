
package mypackage;

import java.util.ArrayList;
import java.util.List;
import observers.Customer;
import observers.CommonChannel;

public class MainClass {

    static String message1 = "Hello! Please note Mango fruit will be available soon at our shop!";
    static String message2 = "Hello! Please note Mango fruit is now available  at our shop!";
    static String message3 = "Hello! Please note Mango fruit will be soon repriced at +1.5 Euros!";
    static String message4 = "Hello! Please note Mango fruit now costs +1.50Euros !";
    static String message5 = "Hello! Please note Mango fruit is now out of stock!";

    public static void main(String[] args) {
        CommonChannel cChannel = new CommonChannel("AllCustomersChannel");
        List<Customer> cList = new ArrayList();

        for (int i = 1; i <= 500; i++) {
            cList.add(new Customer("Customer " + i));
            cList.get(i - 1).subscribe(cChannel);
        }

        ;
        cChannel.notifyAllCustomers(message1);
        cChannel.notifyAllCustomers(message2);
        cChannel.notifyAllCustomers(message3);
        cChannel.notifyAllCustomers(message4);
        cChannel.notifyAllCustomers(message5);

    }

}
