package edu.uniquindio.co.memento;

import java.util.Stack;

public class BrowserHistory {
    private Stack<Memento> history = new Stack<>();

    public void saveState(Memento memento){
        history.push(memento);
    }

    public Memento undo(){
        if(!history.isEmpty()){
            return history.pop();
        }
        return null;
    }
}