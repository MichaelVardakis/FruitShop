
package observers;

import java.util.ArrayList;
import java.util.List;

public class CommonChannel {

    private List<Observer> customers;
    private String name;

    public CommonChannel(String name) {
        this.name = name;
        customers = new ArrayList();
    }

    public CommonChannel() {
        customers = new ArrayList();
    }

    public List<Observer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Observer> customers) {
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(Customer customer) {
        customers.add(customer);
        String successMessage = customer.getName() + " you are now subscribed to channel " + name;
        notifyStudent(customer, successMessage);
    }

    void remove(Customer customer) {
        customers.remove(customer);
        String successMessage = customer.getName() + " you are now unsubscribed from channel " + name;
        notifyStudent(customer, successMessage);
    }

    public void printCustomer() {
        Customer c;
        System.out.println("Channel " + name + " has the following members:");
        for (Observer o : customers) {
            c = (Customer) o;
            System.out.println(c.getName());
        }
    }

    public void notifyAllCustomers(String message) {
        Customer s;
        for (Observer o : customers) {
            s = (Customer) o;
            s.notify(message);
        }
    }

    private void notifyStudent(Observer o, String successMessage) {
        o.notify(successMessage);
    }
}
