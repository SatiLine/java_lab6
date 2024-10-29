module org.example.java_lab6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.java_lab6 to javafx.fxml;
    exports org.example.java_lab6;
}