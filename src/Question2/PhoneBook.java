package Question2;
import java.util.*;

class Contact {

    private String firstName;
    private String lastName;
    private long  phoneNumber;
    public Contact(){}
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class PhoneBook
{
    private final List<Contact> phoneBook= new ArrayList<>();

    public void addContact(Contact contactObj)
    {
        phoneBook.add(contactObj);
    }
    public List<Contact> viewAllContacts()
    {
        return phoneBook;
    }
    public Contact viewContactGivenPhone(long phoneNumber)
    {
        Contact obj=new Contact();
        for(Contact obj1:phoneBook)
        {
            if(obj1.getPhoneNumber()==phoneNumber)
            {
                obj=obj1;
            }
        }
        return obj;
    }
    public boolean removeContact(long phoneNumber)
    {
        boolean f=false;
        for(Contact obj:phoneBook)
        {
            if(obj.getPhoneNumber()==phoneNumber)
            {
                f=true;
                phoneBook.remove(obj);
                break;
            }
        }
        return f;
    }
}
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        PhoneBook objmain=new PhoneBook();
        while(true)
        {
            System.out.println("Menu\n1.Add Contact\n2.Display all contacts\n3.Search contact by phone\n4.Remove contact\n5.Exit");
            System.out.println("Enter your choice: ");
            int n=Integer.parseInt(sc.nextLine());
            if(n==1)
            {
                Contact obj=new Contact();
                System.out.println("Add a contact: ");
                System.out.println("Enter the First Name: ");
                obj.setFirstName(sc.nextLine());
                System.out.println("Enter the Last Name: ");
                obj.setLastName(sc.nextLine());
                System.out.println("Enter the Phone No. : ");
                obj.setPhoneNumber(Long.parseLong(sc.nextLine()));
                objmain.addContact(obj);
            }
            if(n==2)
            {
                System.out.println("The contacts in the List are: \n");
                List<Contact>obj=objmain.viewAllContacts();
                for(Contact temp:obj)
                {
                    System.out.println("First Name: "+temp.getFirstName());
                    System.out.println("Last Name: "+temp.getLastName());
                    System.out.println("Phone No.: "+temp.getPhoneNumber());
                    System.out.println("\n");
                }
            }
            if(n==3)
            {
                System.out.println("Enter the Phone number to search contact:");
                long n1=Long.parseLong(sc.nextLine());
                Contact obj1=objmain.viewContactGivenPhone(n1);
                System.out.println("The contact is:");
                System.out.println("First Name:"+obj1.getFirstName());
                System.out.println("Last Name:"+obj1.getLastName());
                System.out.println("Phone No.:"+obj1.getPhoneNumber());
            }
            if(n==4)
            {
                System.out.println("Enter the Phone number to remove:");
                long n1=Long.parseLong(sc.nextLine());
                System.out.println("Do you want to remove the contact(Y/N):");
                char ch=sc.nextLine().charAt(0);
                if(ch=='Y')
                {
                    boolean f1=objmain.removeContact(n1);
                    if(f1)
                        System.out.println("The contact is successfully deleted");
                    else
                        System.out.println("Contact is not found");
                }
                if(ch=='N')
                {
                    System.out.println("ok");
                }

            }
            if(n==5)
            {
                System.exit(0);
            }
        }
    }
}