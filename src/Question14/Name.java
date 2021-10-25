package Question14;


import java.util.Scanner;
import  java.util.Vector;

public class Name {
    String name, sname;
    public Name(String name, String sname){
        super();
        this.name=name;
        this.sname=sname;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSname(){
        return sname;
    }
    public void setSname(String sname){
        this.sname=sname;
    }
    public static class TestName{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the choice: ");
            System.out.println("\n1. Add new names in list \n2. display total name \n3.Quit.");
            int choice = sc.nextInt();
            Vector v1= new Vector();
            Vector<Name> v2 = new Vector<Name>();
            while (choice!=3){
                if(choice==1)
                {
                    System.out.println("Enter the number of entry");
                    int n=sc.nextInt();
                    for(int i=0;i<n;i++){
                        System.out.println("Enter the first name and last name");
                        v1.add(new Name(sc.next(), sc.next()));
                    }
                }
                System.out.println("Enter the choice: ");
                System.out.println("\n1.Add new names in list \n2.display total name \n3. Quit");
                choice=sc.nextInt();
                if (choice==2){
                    System.out.println("number of names: "+v1.size());
                }
            }
            System.out.println("thank you");
        }
    }
}