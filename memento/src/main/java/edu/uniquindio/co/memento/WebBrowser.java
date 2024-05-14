package edu.uniquindio.co.memento;


// Originator
public class WebBrowser {
    private String currentPage;
    private String name;
    private String version;

    public void goToPage(String url){
        this.currentPage = url;
        System.out.println("Navegar a : " + currentPage);


    }

    public  String getName(String url){
        switch (url){
            case "https://classroom.google.com/":
                return "Google Classroom";
                case "https://refactoring.guru/es/":
                    return "Refactoring Guru";
                    case "https://docs.google.com/spreadsheets/":
                        return "Google Sheets";
                        case "https://www.github.com":
                            return "GitHub";
                            default:
                                return "No encontrado";
        }
    }
    public String getCurrentPage(){
        return this.currentPage;
    }

    public Memento save(){
        return new Memento(this.currentPage);
    }

    public void restore(Memento memento) {
        this.currentPage = memento.getSavedPage();
    }
}
