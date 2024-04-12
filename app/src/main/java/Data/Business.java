package Data;

public class Business {
    private int businessID;
    private int ownerID;
    private String businessType;
    private String businessContact;
    private String businessCode;
    private String businessName;
    private String email;
    private String location;

    public Business() {

    }

    public Business(int businessID, int ownerID, String businessType, String businessContact, String businessCode, String businessName, String email, String location) {
        this.businessID = businessID;
        this.ownerID = ownerID;
        this.businessType = businessType;
        this.businessContact = businessContact;
        this.businessCode = businessCode;
        this.businessName = businessName;
        this.email = email;
        this.location = location;
    }

    public int getBusinessID() {
        return businessID;
    }

    public void setBusinessID(int businessID) {
        this.businessID = businessID;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBusinessContact() {
        return businessContact;
    }

    public void setBusinessContact(String businessContact) {
        this.businessContact = businessContact;
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public String getBusinessName() {return businessName;}

    public void setBusinessName(String businessName) {this.businessName = businessName;}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
