package com.example.knowledgekitchen;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.Properties;

public class BookingControl extends KnowKi {
    bookings book = KnowKi.bookings;
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private MenuItem amBtn;

    @FXML
    private MenuButton atp;

    @FXML
    private Button completeBtn;

    @FXML
    private Button contactBtn;

    @FXML
    private Label countPerson;

    @FXML
    private DatePicker datep;

    @FXML
    private TextField emailf;

    @FXML
    private Button galleryBtn;

    @FXML
    private Button homeBtn;

    @FXML
    private Button menuBtn;

    @FXML
    private TextField namef;

    @FXML
    private TextField phonef;

    @FXML
    private MenuItem pmBtn;

    @FXML
    private TextArea specialreqf;

    @FXML
    private TextField surnamef;

    @FXML
    private TextField timef;
    @FXML
    private Button historyBtn;

    public static String time = "00:00";
    public static String at = "pm";

    public static boolean edit = false;

    int c = 1;
    @FXML
    protected void add() {
        c++;
        countPerson.setText(String.valueOf(c));
    }
    @FXML
    protected void takeAw() {
        if(c>1) {
            c--;
            countPerson.setText(String.valueOf(c));
        }
    }
    @FXML
    public void initialize(){
        if(edit){
            namef.setText(book.name);
            surnamef.setText(book.surname);
            emailf.setText(book.email);
            phonef.setText(book.phone);
            countPerson.setText(String.valueOf(book.size));
            datep.setPromptText(book.date.substring(0,10));
            timef.setText(time);
            atp.setText(at);
            specialreqf.setText(book.spec);
        }
        contactBtn.setOnAction(event -> {
            try {
                root = FXMLLoader.load(getClass().getResource("Contact.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root,1120,800);
            stage.setScene(scene);
            stage.show();
        });
        homeBtn.setOnAction(event -> {
            try {
                root = FXMLLoader.load(getClass().getResource("Home.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root,1120,800);
            stage.setScene(scene);
            stage.show();
        });
        menuBtn.setOnAction(event -> {
            try {
                root = FXMLLoader.load(getClass().getResource("menu-view.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root,1120,800);
            stage.setScene(scene);
            stage.show();
        });

        pmBtn.setOnAction(event -> {
            atp.setText("pm");
        });

        amBtn.setOnAction(event -> {
            atp.setText("am");
        });
        galleryBtn.setOnAction(event -> {
            try {
                root = FXMLLoader.load(getClass().getResource("gallery.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root,1120,800);
            stage.setScene(scene);
            stage.show();
        });

        completeBtn.setOnAction(event -> {
            bookings book = new bookings(namef.getText(), surnamef.getText(),emailf.getText(),
                    phonef.getText(),datep.getValue().toString(),timef.getText()+" " + atp.getText(),
                    c,specialreqf.getText());
            System.out.println(book);
            time = timef.getText();
            at = atp.getText();

            KnowKi.bookings = book;
            emailSender(book);



            try {
                root = FXMLLoader.load(getClass().getResource("home.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root,1120,800);
            stage.setScene(scene);
            stage.show();
        });
        historyBtn.setOnAction(event -> {
            try {
                root = FXMLLoader.load(getClass().getResource("booking-edit.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root,1120,800);
            stage.setScene(scene);
            stage.show();
        });
    }
    void emailSender(bookings book){
        String senderEmail = "sender@gmail.com";
        String senderPassword = "passwordSender@gmail.com";

        String recipientEmail = "recipient";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject("Coffee Time!");
            message.setText("Your reservation details\n" + String.valueOf(book) + "\nWe are waiting for you " +
                    "at the address ➡\uFE0FKaskelen city Abylai khan avenue 1/1⬅\uFE0F");


            Transport.send(message);

            System.out.println("Сообщение успешно отправлено.");
        } catch (MessagingException e) {
            System.out.println("Ошибка при отправке сообщения: " + e.getMessage());
        }

    }
}