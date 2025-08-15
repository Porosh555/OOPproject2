package all.oopproject.poros;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class U1g2
{
    @javafx.fxml.FXML
    private TableColumn<DeliveryOrder, String> orderIdColumn;
    @javafx.fxml.FXML
    private ComboBox<String> driverSelectorCB;
    @javafx.fxml.FXML
    private TableView<Vehicle> availableVehiclesTable;
    @javafx.fxml.FXML
    private TableView<DeliveryOrder> ordersTable;
    @javafx.fxml.FXML
    private Label confirmationLabel;
    @javafx.fxml.FXML
    private Label availableVehiclesLabel;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, String> orderRequiredCapacityColumn;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,String > orderAssignedVehicleColumn;
    @javafx.fxml.FXML
    private Label assignDriverLabel;
    @javafx.fxml.FXML
    private Label ordersLabel;

    @javafx.fxml.FXML
    public void initialize() {
        driverSelectorCB.getItems().addAll("Bisal", "Joti", "Poros", "Abir");

        orderIdColumn.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        orderRequiredCapacityColumn.setCellValueFactory(new PropertyValueFactory<>("orderRequiredCapacity"));
        orderAssignedVehicleColumn.setCellValueFactory(new PropertyValueFactory<>("orderAssignedVehicle"));
    }


    @javafx.fxml.FXML
    public void assignVehiclesButton(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Assign_Vehicles.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        // actionEvent = buttonClick
        // actionEvent.getSource() = button
        // (Node) actionEvent.getSource() = Node
        // (Node) actionEvent.getSource().getScene() = Scene
        // ((Node) actionEvent.getSource()).getScene().getWindow() = Window
        // (Stage) ((Node) actionEvent.getSource()).getScene().getWindow() = Stage

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);

        stage.show();
    }


    @javafx.fxml.FXML
    public void saveAssignmentsButtonOA(ActionEvent actionEvent) {
        if (driverSelectorCB.getSelectionModel().getSelectedItem() == null) {
            confirmationLabel.setText("Please select a Driver");
            return;
        }

        String Driver = driverSelectorCB.getValue();



    }


}