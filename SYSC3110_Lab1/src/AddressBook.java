import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> AddressBook = new ArrayList<BuddyInfo>;

    public void addBuddy(BuddyInfo buddy)(){
        AddressBook.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy)(){
        AddressBook.remove(buddy);
    }
}
