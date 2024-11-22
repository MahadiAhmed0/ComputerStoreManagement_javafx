package main.rangpurcomputersoftwarejavafx;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;


public class AuthenticationController implements Initializable {

    @FXML
    private Button loginButton;

    @FXML
    private Hyperlink loginForgetPassword;

    @FXML
    private AnchorPane loginPane;

    @FXML
    private PasswordField loginPassword;

    @FXML
    private TextField loginUsername;

    @FXML
    private AnchorPane resetPassswordPane;

    @FXML
    private Button resetPasswordBackButton;

    @FXML
    private TextField resetPasswordID;

    @FXML
    private PasswordField resetPasswordNewPassword;

    @FXML
    private Button resetPasswordResetButton;

    @FXML
    private TextField resetPasswordUsername;

    @FXML
    private AnchorPane staticPicture;

    public void switchForm(ActionEvent event) {
        TranslateTransition slider = new TranslateTransition();
        slider.setNode(staticPicture);
        slider.setDuration(Duration.seconds(0.5));

        if (event.getSource() == loginForgetPassword) {
            slider.setToX(960);
        } else if (event.getSource() == resetPasswordBackButton) {
            slider.setToX(0);
        }

        slider.play(); // Start the animation
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

