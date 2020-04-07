
package observers;


public abstract class  Observer {
    protected CommonChannel channel;
    protected abstract void notify(String message);
 
}
