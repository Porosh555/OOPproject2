package all.oopproject.poros;

public class InventoryController extends User {
    private String depotId;

    public InventoryController(String depotId) {
        this.depotId = depotId;
    }

    public InventoryController(String userId, String name, String username, String role, String contactInfo, String email, String password, String depotId) {
        super(userId, name, username, role, contactInfo, email, password);
        this.depotId = depotId;
    }

    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }

    @Override
    public String toString() {
        return "InventoryController{" +
                "depotId='" + depotId + '\'' +
                '}';
    }
}
