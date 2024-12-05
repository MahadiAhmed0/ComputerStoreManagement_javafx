package main.rangpurcomputersoftwarejavafx;
import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;


public class AuthenticationController implements Initializable {


    @FXML
    private Button back_Button;

    @FXML
    private AnchorPane coverForm;

    @FXML
    private AnchorPane coverForm_loginForm;

    @FXML
    private Hyperlink forgetPasswordLink;

    @FXML
    private AnchorPane loginForm;

    @FXML
    private AnchorPane resetForm;

    @FXML
    private SplitPane splitPane;


    public void switchForm(ActionEvent event) {
        TranslateTransition slider = new TranslateTransition();
        slider.setNode(coverForm);
        slider.setDuration(Duration.seconds(0.3));
        slider.setInterpolator(Interpolator.EASE_BOTH);

        TranslateTransition slider2 = new TranslateTransition();
        slider2.setNode(loginForm);
        slider2.setDuration(Duration.seconds(0.3));
        slider2.setInterpolator(Interpolator.EASE_BOTH);

        double splitPaneWidth = splitPane.getWidth();

        if (event.getSource() == forgetPasswordLink) {

            slider.setToX(splitPaneWidth / 2);
            slider2.setToX(splitPaneWidth / 2);

            slider.setOnFinished(event1 -> slider2.play());
        } else if (event.getSource() == back_Button) {
            slider2.setToX(0);
            slider.setToX(0);

            slider2.setOnFinished(event1 -> slider.play());

            slider2.play();
        }
        
        if (event.getSource() == forgetPasswordLink) {
            slider.play();
        }
    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

