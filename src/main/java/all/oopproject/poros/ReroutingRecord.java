package all.oopproject.poros;

import java.time.LocalDate;

public class ReroutingRecord  {
    private String rerouteId, orderId, oldRoute, newRoute, reason;
    private LocalDate timestamp;

    public ReroutingRecord() {
    }

    public ReroutingRecord(String rerouteId, String orderId, String oldRoute, String newRoute, String reason, LocalDate timestamp) {
        this.rerouteId = rerouteId;
        this.orderId = orderId;
        this.oldRoute = oldRoute;
        this.newRoute = newRoute;
        this.reason = reason;
        this.timestamp = timestamp;
    }

    public String getRerouteId() {
        return rerouteId;
    }

    public void setRerouteId(String rerouteId) {
        this.rerouteId = rerouteId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOldRoute() {
        return oldRoute;
    }

    public void setOldRoute(String oldRoute) {
        this.oldRoute = oldRoute;
    }

    public String getNewRoute() {
        return newRoute;
    }

    public void setNewRoute(String newRoute) {
        this.newRoute = newRoute;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "ReroutingRecord{" +
                "rerouteId='" + rerouteId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", oldRoute='" + oldRoute + '\'' +
                ", newRoute='" + newRoute + '\'' +
                ", reason='" + reason + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
