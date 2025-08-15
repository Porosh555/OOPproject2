package all.oopproject.poros;

public class Driver {
    private String driverId, name, licenseNumber, phone;

    public Driver() {
    }

    public Driver(String driverId, String name, String licenseNumber, String phone) {
        this.driverId = driverId;
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.phone = phone;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverId='" + driverId + '\'' +
                ", name='" + name + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
