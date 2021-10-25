package Question12;

import Printer.Printer;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Employee {
    int empID,empAge;
    String empName;
    Employee(int empID, String empName,int empAge){
        this.empID = empID;
        this.empName = empName;
        this.empAge = empAge;
    }
    @Override
    public String toString() {
        return " Employee Id = " + empID +
                ", Name = " + empName +
                ",\tAge = " + empAge ;
    }

    //    Using static block as per the question requirement
    static {
//        creting two ref of BufferedReader class
        BufferedReader br,br2;
        FileReader file,file1;
        String line;
//        the lineNumber will hold the number of lines in the file
        int lineNumber = 0;
        String[] data;
        Employee[] employee = null ;
        Scanner sc =new Scanner(System.in);
        try {
            file1 =new FileReader("/home/knoldus/Assignments/JavaAssignment/src/AdvanceQuestions/Ques12/Employee.txt");

//         this will count the lines in the text file
            br2=new BufferedReader(file1);
            while (br2.readLine()!= null){
                lineNumber++;
            }
            br2.close();
            file1.close();

//            Here we will start read the file
            employee = new Employee[lineNumber];
            file = new FileReader("/home/knoldus/Assignments/JavaAssignment/src/AdvanceQuestions/Ques12/Employee.txt");
            br=new BufferedReader(file);

//            here we are getting the data line by line and storing the employee object
//            in the employee[] array after initialization of employee class objects.
            int i =0;
            while ((line = br.readLine()) != null){
                data = line.split(",");
                employee[i] = new Employee(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]));
                i++;
            }

        } catch (IOException ex){
            ex.printStackTrace();
        }
        int in;
        do {
//                It will print the list of employees
            assert employee != null;
            Arrays.stream(employee).forEach(Printer::print);
            Printer.print("=========== Enter your choice ===========\n" +
                    "Edit: Press 1 to Edit\n" +
                    "Exit: Press 2 to Exit");
            in = sc.nextInt();
            if(in == 1){
                Employee[] employees = editEmployee(employee);
//                    Calling updateFile method()
                updateFile(employees);
            }
        }while (in !=2 );
    }
    //    editEmployee will return an array of Employee type after updation
    static Employee[] editEmployee(Employee[] employees){
        Scanner sc =new Scanner(System.in);
        Printer.print("Enter employee id");
        int empid = sc.nextInt();
        for (Employee employee : employees) {
            if (employee.empID == empid) {
                Printer.print("Enter Name");
                String editName = sc.next();
                Printer.print("Enter Age");
                int editAge = sc.nextInt();
                employee.empName = editName;
                employee.empAge = editAge;
            }
        }
        return employees;
    }
    //    updateFile method will take a Employee[] type argument and update the data in Employee.txt file
    static void updateFile(Employee[] employees){
        FileWriter writer = null;
        File fileToBeModified = new File("/home/knoldus/Assignments/JavaAssignment/src/AdvanceQuestions/Ques12/Employee.txt");
        StringBuilder newContent = new StringBuilder();
        try {
            for (Employee emp:employees) {
                newContent.append(emp.empID).append(",").append(emp.empName).append(",").append(emp.empAge).append(System.lineSeparator());
            }
            Printer.print(newContent.toString());
            writer = new FileWriter(fileToBeModified);
            writer.write(newContent.toString());
            Printer.print("File updated successfully");
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            try {
                assert writer != null;
                writer.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
    }
}