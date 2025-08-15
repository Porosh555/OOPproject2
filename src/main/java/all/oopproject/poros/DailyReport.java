package all.oopproject.poros;

import java.time.LocalDate;

public class DailyReport {
    private String reportId, date, ordersList, totalDelivered;
    private LocalDate onTimePercentage;

    public DailyReport() {
    }

    public DailyReport(String reportId, String date, String ordersList, String totalDelivered, LocalDate onTimePercentage) {
        this.reportId = reportId;
        this.date = date;
        this.ordersList = ordersList;
        this.totalDelivered = totalDelivered;
        this.onTimePercentage = onTimePercentage;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(String ordersList) {
        this.ordersList = ordersList;
    }

    public String getTotalDelivered() {
        return totalDelivered;
    }

    public void setTotalDelivered(String totalDelivered) {
        this.totalDelivered = totalDelivered;
    }

    public LocalDate getOnTimePercentage() {
        return onTimePercentage;
    }

    public void setOnTimePercentage(LocalDate onTimePercentage) {
        this.onTimePercentage = onTimePercentage;
    }

    @Override
    public String toString() {
        return "DailyReport{" +
                "reportId='" + reportId + '\'' +
                ", date='" + date + '\'' +
                ", ordersList='" + ordersList + '\'' +
                ", totalDelivered='" + totalDelivered + '\'' +
                ", onTimePercentage=" + onTimePercentage +
                '}';
    }
}
