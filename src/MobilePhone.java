import java.util.ArrayList;

class Contact{

    private String name;
    private String number;

    public Contact(String name, String number){
        this.name = name;
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
    public static Contact createContact(String name, String number){
        return new Contact(name,number);
    }
}

class Phone{
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public Phone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    private int findContact(String name){
        for (int i = 0; i< myContacts.size(); i++){
            Contact tempContact = myContacts.get(i);
            if (tempContact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}

public class MobilePhone {
    public static void main(String[] args) {

    }
}
