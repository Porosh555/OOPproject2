package all.oopproject.poros;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class U1g3
{
    @javafx.fxml.FXML
    private Label TrackDeliveryProgressl;
    @javafx.fxml.FXML
    private Label delayedDeliveriesLabel;
    @javafx.fxml.FXML
    private Label statusmessagel;
    @javafx.fxml.FXML
    private AnchorPane titleLabel;
    @javafx.fxml.FXML
    private TableColumn<DeliveryOrder, String> delayedOrderIdColumn;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, String> delayedVehicleColumn1;
    @javafx.fxml.FXML
    private TableView<DeliveryOrder> delayedDeliveriesTable;
    @javafx.fxml.FXML
    private Label mapLabel;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, String> delayedVehicleColumn;

    private final ArrayList<DeliveryOrder> orderids = new ArrayList<>();
    private final ArrayList<DeliveryOrder> vehiclenames = new ArrayList<>();
    private final ArrayList<DeliveryOrder> delayedDeliveries = new ArrayList<>();
    @javafx.fxml.FXML
    public void initialize() {
        delayedOrderIdColumn.setCellValueFactory(new PropertyValueFactory<>(" order id"));
        delayedVehicleColumn1.setCellValueFactory(new PropertyValueFactory<>("vehicle name"));
        delayedVehicleColumn.setCellValueFactory(new PropertyValueFactory<>("delayedDeliveries"));



    }

    @javafx.fxml.FXML
    public void trackDeliveriesButtonOA(ActionEvent actionEvent) {
        delayedDeliveriesTable.getItems().clear();
        delayedDeliveriesTable.getItems().addAll(delayedDeliveries);


    }

    @javafx.fxml.FXML
    public void notifycustomeroc(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void notifycustomeronactionb(ActionEvent actionEvent) {
    }
}