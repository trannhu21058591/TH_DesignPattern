package org.example;

public interface Subject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObservers();
    public Object getUpdate(Observer o);
}
