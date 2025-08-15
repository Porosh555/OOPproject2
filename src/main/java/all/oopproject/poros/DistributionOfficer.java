package all.oopproject.poros;

public class DistributionOfficer extends User{
    private String assignedRegion;

    public DistributionOfficer(String assignedRegion) {
        this.assignedRegion = assignedRegion;
    }

    public DistributionOfficer(String userId, String name, String username, String role, String contactInfo, String email, String password, String assignedRegion) {
        super(userId, name, username, role, contactInfo, email, password);
        this.assignedRegion = assignedRegion;
    }

    public String getAssignedRegion() {
        return assignedRegion;
    }

    public void setAssignedRegion(String assignedRegion) {
        this.assignedRegion = assignedRegion;
    }

    @Override
    public String toString() {
        return "DistributionOfficer{" +
                "assignedRegion='" + assignedRegion + '\'' +
                '}';
    }
}
