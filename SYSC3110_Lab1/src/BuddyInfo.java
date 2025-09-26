public class BuddyInfo {

    private String name;
    private String address;
    private String phone_number;

    // Constructor to create a BuddyInfo with phone number, address, and name
    public BuddyInfo(String phone_number, String address, String name) {
        this.phone_number = phone_number;
        this.address = address;
        this.name = name;
    }

    // Returns the buddy's name
    public String getName() {
        return name;
    }

    // Updates the buddy's name
    public void setName(String name) {
        this.name = name;
    }

    // Returns the buddy's address
    public String getAddress() {
        return address;
    }

    // Updates the buddy's address
    public void setAddress(String address) {
        this.address = address;
    }

    // Returns the buddy's phone number
    public String getPhone_number() {
        return phone_number;
    }

    // Updates the buddy's phone number
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    // Main method to run a simple test
    public static void main(String[] args) {
        BuddyInfo Homer = new BuddyInfo("6132119568", "118 Slater Ave", "Homer");
        System.out.println("Hello "+ Homer.getName());
    }

}
