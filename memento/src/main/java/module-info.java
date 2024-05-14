module edu.uniquindio.co.memento {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.uniquindio.co.memento to javafx.fxml;
    exports edu.uniquindio.co.memento;
}