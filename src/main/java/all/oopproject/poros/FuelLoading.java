package all.oopproject.poros;

import java.time.LocalDate;

public class FuelLoading {
    private String loadingId, orderId, quantity, depotId, status;
    private LocalDate loadingTime;

    public FuelLoading() {
    }

    public FuelLoading(String loadingId, String orderId, String quantity, String depotId, String status, LocalDate loadingTime) {
        this.loadingId = loadingId;
        this.orderId = orderId;
        this.quantity = quantity;
        this.depotId = depotId;
        this.status = status;
        this.loadingTime = loadingTime;
    }

    public String getLoadingId() {
        return loadingId;
    }

    public void setLoadingId(String loadingId) {
        this.loadingId = loadingId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getLoadingTime() {
        return loadingTime;
    }

    public void setLoadingTime(LocalDate loadingTime) {
        this.loadingTime = loadingTime;
    }

    @Override
    public String toString() {
        return "FuelLoading{" +
                "loadingId='" + loadingId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", quantity='" + quantity + '\'' +
                ", depotId='" + depotId + '\'' +
                ", status='" + status + '\'' +
                ", loadingTime=" + loadingTime +
                '}';
    }
}
