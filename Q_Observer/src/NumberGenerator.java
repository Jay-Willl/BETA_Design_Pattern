import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(){
        Iterator it = observers.iterator();
        while(it.hasNext()){
            Observer temp = (Observer) it.next();
            temp.update(this);
        }
    }

    public abstract int getNumber();

    public abstract void execute();
}