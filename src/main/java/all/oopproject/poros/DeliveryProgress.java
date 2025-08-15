package all.oopproject.poros;

import java.time.LocalDate;

public class DeliveryProgress {
    private  String orderId, vehicleId, gpsCoordinates, status, e;
    private LocalDate lastUpdate;
    public DeliveryProgress() {
    }

    public DeliveryProgress(String orderId, String vehicleId, String gpsCoordinates, String status, String e, LocalDate lastUpdate) {
        this.orderId = orderId;
        this.vehicleId = vehicleId;
        this.gpsCoordinates = gpsCoordinates;
        this.status = status;
        this.e = e;
        this.lastUpdate = lastUpdate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getGpsCoordinates() {
        return gpsCoordinates;
    }

    public void setGpsCoordinates(String gpsCoordinates) {
        this.gpsCoordinates = gpsCoordinates;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public LocalDate getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDate lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "DeliveryProgress{" +
                "orderId='" + orderId + '\'' +
                ", vehicleId='" + vehicleId + '\'' +
                ", gpsCoordinates='" + gpsCoordinates + '\'' +
                ", status='" + status + '\'' +
                ", e='" + e + '\'' +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
