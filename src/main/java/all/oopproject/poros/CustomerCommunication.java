package all.oopproject.poros;

import java.time.LocalDate;

public class CustomerCommunication {
    private String communicationId, customerId, orderId, message, response;
    private LocalDate timestamp;

    public CustomerCommunication() {
    }

    public CustomerCommunication(String communicationId, String customerId, String orderId, String message, String response, LocalDate timestamp) {
        this.communicationId = communicationId;
        this.customerId = customerId;
        this.orderId = orderId;
        this.message = message;
        this.response = response;
        this.timestamp = timestamp;
    }

    public String getCommunicationId() {
        return communicationId;
    }

    public void setCommunicationId(String communicationId) {
        this.communicationId = communicationId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "CustomerCommunication{" +
                "communicationId='" + communicationId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", message='" + message + '\'' +
                ", response='" + response + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
