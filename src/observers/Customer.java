package observers;

public class Customer extends Observer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void subscribe(CommonChannel channel) {
        super.channel = channel;
        channel.add(this);
    }

    public void unSubscribe(CommonChannel channel) {
        this.channel = null;
        channel.remove(this);
    }

    @Override
    protected void notify(String message) {
        System.out.println("Observer: " + this.name + " is notified!\nMessage: " + message);
    }

}
