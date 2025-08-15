package all.oopproject.poros;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class U1g1Controler
{
    @javafx.fxml.FXML
    private TableColumn<DeliveryOrder,Integer> quantityColumn;
    @javafx.fxml.FXML
    private TableColumn<DeliveryOrder, String> locationColumn;
    @javafx.fxml.FXML
    private Button btnLoadSchedule;
    @javafx.fxml.FXML
    private TableView<DeliveryOrder> ordersTable;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextField QuantityTF;
    @javafx.fxml.FXML
    private TextField LocationTF;

    private final ArrayList<DeliveryOrder> quntitys  = new ArrayList<>();
    private final ArrayList<DeliveryOrder> locations  = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        locationColumn.setCellValueFactory(new PropertyValueFactory<>("location"));


    }

    @javafx.fxml.FXML
    public void SubmitButtonOA(ActionEvent actionEvent) {
        if (QuantityTF.getText().trim().isEmpty()) {
            statusLabel.setText("Please enter proper Quantity, Quantity cant be empty");
            return;
        }
        String quantity = QuantityTF.getText();

        if (LocationTF.getText().trim().isEmpty()) {
            statusLabel.setText("Please enter proper Location, Location cant be empty");
            return;
        }
        String location = LocationTF.getText();

        DeliveryOrder D = new DeliveryOrder(
                LocationTF.getText(),
                QuantityTF.getText(),
                Integer.parseInt(QuantityTF.getText()));

        quntitys.add(D);

        ordersTable.getItems().clear();
        for(DeliveryOrder st: quntitys){
            ordersTable.getItems().add(st);
        }
        System.out.println(quntitys);



    }

    @javafx.fxml.FXML
    public void loadDailySchedule(ActionEvent actionEvent) {


        ordersTable.getItems().clear();
        ordersTable.getItems().addAll(quntitys);
        ordersTable.getItems().addAll(locations);


    }
}