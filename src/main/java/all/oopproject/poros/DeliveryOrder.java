package all.oopproject.poros;

import java.time.LocalDateTime;

public class DeliveryOrder {
    private String orderId, customerId, location;
    private int quantity;
    private LocalDateTime scheduledDate;
    private String status;

    public DeliveryOrder(String text, String quantityTFText, int i) {
    }

    public DeliveryOrder(String orderId, String customerId, String location, int quantity, LocalDateTime scheduledDate, String status) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.location = location;
        this.quantity = quantity;
        this.scheduledDate = scheduledDate;
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(LocalDateTime scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DeliveryOrder{" +
                "orderId='" + orderId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", location='" + location + '\'' +
                ", quantity=" + quantity +
                ", scheduledDate=" + scheduledDate +
                ", status='" + status + '\'' +
                '}';
    }
}
