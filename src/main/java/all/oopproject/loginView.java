package all.oopproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class loginView {
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private PasswordField passwordField;
    @javafx.fxml.FXML
    private TextField usernameTextField;

    private Admin admin1;

    @javafx.fxml.FXML
    public void initialize() {
        admin1 = new Admin("admin", "1234");
    }

    @javafx.fxml.FXML
    public void loginButtonOnClick(ActionEvent actionEvent) throws IOException {
        String username = usernameTextField.getText();
        String password = passwordField.getText();

        if (username.equals(admin1.getUsername()) && password.equals(admin1.getPassword())) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/all/oopproject/u1g1.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } else {
            outputLabel.setText("Username and password do not match");
        }
    }
}