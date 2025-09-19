module com.tarefas {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;

    opens com.tarefas to javafx.fxml;
    exports com.tarefas;
}
