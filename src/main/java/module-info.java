module com.example.serwer {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.oracle.database.jdbc;


    opens com.example.serwer to javafx.fxml;
    exports com.example.serwer;
}