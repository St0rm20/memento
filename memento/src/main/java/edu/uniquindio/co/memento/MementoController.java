package edu.uniquindio.co.memento;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MementoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField getTextCurrentPage;

    @FXML
    private Button goToPage;

    @FXML
    private Button onUndo;

    @FXML
    private Label textCurrentPage;

    @FXML
    void goToPage(){
        String currentPage = getTextCurrentPage.getText();
        Memento memento = new Memento(currentPage);


        switch (iterador){
            case 0:
                getTextCurrentPage.setText("https://refactoring.guru/es/");
                browserHistory.saveState(memento);
                break;
            case 1:
                getTextCurrentPage.setText("https://docs.google.com/spreadsheets/");
                browserHistory.saveState(memento);
                break;
            case 2:
            getTextCurrentPage.setText("https://www.github.com");
            browserHistory.saveState(memento);
                break;
            default:
                getTextCurrentPage.setText("No hay más paginas las cuales navegar");
                break;
        }
        iterador++;
        textCurrentPage.setText(webBrowser.getName(currentPage));

    }
    private Page page;
    private Page page2;
    private Page page3;
    private Page page4;
    private WebBrowser webBrowser;
    private BrowserHistory browserHistory;
    private int iterador = 0;

    @FXML
    void initialize() {
        page = new Page("https://classroom.google.com/", "Google Classroom");
        page2 = new Page("https://refactoring.guru/es/", "Refactoring Guru");
        page3 = new Page("https://docs.google.com/spreadsheets/", "Google Sheets");
        page4 = new Page("https://www.github.com", "GitHub");
        webBrowser = new WebBrowser();
        browserHistory = new BrowserHistory();
    }


    @FXML
    void onUndo() {
        Memento memento = browserHistory.undo();
        if (memento !=null){
            webBrowser.restore(memento);
            textCurrentPage.setText(webBrowser.getName(memento.getSavedPage()));
        }


    }
}