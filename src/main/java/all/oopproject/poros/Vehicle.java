package all.oopproject.poros;

public class Vehicle {
    private String vehicleId;
    private String capacity;
    private String status, assignedDriverId;

    public Vehicle() {
    }

    public Vehicle(String vehicleId, String capacity, String status, String assignedDriverId) {
        this.vehicleId = vehicleId;
        this.capacity = capacity;
        this.status = status;
        this.assignedDriverId = assignedDriverId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAssignedDriverId() {
        return assignedDriverId;
    }

    public void setAssignedDriverId(String assignedDriverId) {
        this.assignedDriverId = assignedDriverId;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId='" + vehicleId + '\'' +
                ", capacity='" + capacity + '\'' +
                ", status='" + status + '\'' +
                ", assignedDriverId='" + assignedDriverId + '\'' +
                '}';
    }
}
