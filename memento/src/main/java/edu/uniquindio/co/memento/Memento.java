package edu.uniquindio.co.memento;

public class Memento {
    private final String savedPage;

    public Memento(String page){
        this.savedPage = page;
    }
    public String getSavedPage(){
        return savedPage;
    }
}