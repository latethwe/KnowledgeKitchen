module com.example.knowledgekitchen {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.mail;


    opens com.example.knowledgekitchen to javafx.fxml;
    exports com.example.knowledgekitchen;
}