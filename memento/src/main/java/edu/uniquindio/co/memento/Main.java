package edu.uniquindio.co.memento;


public class Main {

    public static void main(String[] args) {
        WebBrowser browser = new WebBrowser();
        BrowserHistory history = new BrowserHistory();

        browser.goToPage("https://classroom.google.com/");
        history.saveState(browser.save());

        browser.goToPage("https://refactoring.guru/");
        history.saveState(browser.save());

        browser.goToPage("https://docs.google.com/spreadsheets/");
        history.saveState(browser.save());

        browser.goToPage("https://www.github.com");

        // Deshacer dos veces
        browser.restore(history.undo());
        browser.restore(history.undo());

        System.out.println();
        System.out.println("I'm going to return to the refactoring page");
        System.out.println("I returned to : " +browser.getCurrentPage());
        System.out.println();
    }
}