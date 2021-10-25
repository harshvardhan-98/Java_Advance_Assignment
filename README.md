# Java_Advance_Assignment

**Java Advance Assignment Questions**

Q1.  Write a java program as per the below given specification:

i) Design a Dish class having dishID, dishName, creationTime as the attributes. To initialize the attributes of the class and create a parameterized constructor. Also override the toString() method to print the object's details on the console.
ii) Design a Menu class having menuList as an attribute which is a static ArrayList. Load the menuList with a Dish object comprising some sample dishes using a static block.
iii) Design a Restaurant class comprising the main method. It should give a menu driven interface to a user as follows:
Press 1 to display Dishes.
Press 2 to search Dish.
iv) On the click of 1 all the dishes offered by the restaurant should be displayed to a user.
v) On the click of 2 it prompts the user to enter the dishID, if the ID entered matches with the dish, its details should be printed on the console.

Q2. Write a java program to maintain a Phone book using Map. Program should give a menu driven interface as shown below:
Press 1 to Add new phone book entry
Press 2 to Search a Phone Number
Press 3 to Quit.
On the click of 1 a user is prompted to enter his name and phone number. The details entered by the user should be maintain in a Map phonebook, where the name is the key and the phone number is the value.
On the click of 2 a user is prompted to enter the name of the user whose number needs to be searched. Once the name entered correctly his number is displayed on the console.
On the click of 3 programs terminates. 
Use HashMap to store phone book entries.

Q3.Create and Run a Thread using Runnable Interface and Thread class.
Use sleep and join methods with thread.
Use a singleThreadExecutor to submit multiple threads.
Try shutdown() and shutdownNow() and observe the difference.
Use isShutDown() and isTerminated() with ExecutorService.
Return a Future from ExecutorService by using callable and use get(), isDone(), isCancelled() with the Future object to know the status of the task submitted.
Submit List of tasks to ExecutorService and wait for the completion of all the tasks.
Schedule task using schedule(), scheduleAtFixedRate() and scheduleAtFixedDelay()
Increase concurrency with Thread pools using newCachedThreadPool() and newFixedThreadPool().
Use the Synchronize method to enable synchronization between multiple threads trying to access the method at same time.
Use the Synchronize block to enable synchronization between multiple threads trying to access the method at same time.
Use Atomic Classes instead of Synchronize methods and blocks.
Coordinate 2 threads using wait() and notify().
Coordinate multiple threads using wait() and notifyAll()
Use Reentrantlock for coordinating 2 threads with signal(), signalAll() and wait().
Create a deadlock and Resolve it using tryLock().

Q4. Create an application that, in turn, accesses each record in the lowerclassman file and then in the upperclassman file created in the LowerAndUpper application. Display an appropriate heading before
each student.

Q5.Write a program WordCount that reads a file and reports how many lines, words, and characters appear in it. Suppose, for example, that the file lear.txt contains the following passage from Shakespeare’s King Lear:

Poor naked wretches, wheresoe'er you are,
That bide the pelting of this pitiless storm,
How shall your houseless heads and unfed sides,
Your loop'd and window'd raggedness, defend you
From seasons such as these? O, I have ta'en
Too little care of this!
Given this file, your program should be able to generate the following sample run:
File: lear.txt
Lines = 6
Words = 47
Chars = 248

Q6. Write a program that reads a list of exam scores from the file MidtermScores.txt (which contains one score per line) and then displays a histogram of those numbers, divided into the ranges 0–9, 10–19, 20–29, and so forth, up to the range containing only the value 100. 
If, for example, MidtermScores.txt contains the data shown in the right margin, your program should then be able to generate a histogram that looks as much as possible like the following sample run:

00-09 : 
10-19 : *
20-29 : *
30-39 : **
40-49 : *
50-59 : *****
60-69 : *******
70-79 : *****************
80-89 : ******
90-99 : **********
   100 : *

Q7. Write and explain the output of the following program? 

public class JavaHungry {
    public static void main(String args[])
    {
        try 
        {   
            int arr[]= {1, 2, 3, 4, 5}; 
            for (int i = 0; i <= 5; i++) 
            { 
                System.out.print ("Array elements are : " + arr[i] + "\n"); 
            } 
        } 
        catch (Exception e) 
        { 
            System.out.println ("Exception : " + e); 
        } 
        catch (ArrayIndexOutOfBoundsException ex) 
        { 
            System.out.println ("ArrayIndexOutOfBoundsException : "+ ex); 
        }  
    }
}.

Q8. WAP to handle the exception using try and multiple catch blocks.

Q9. Create a class TwoDim which contains private members as x and y coordinates in package P1. Define the default constructor, a parameterized constructor and override toString() method to display the coordinates. Now reuse this class and in package P2 create another class ThreeDim, adding a new dimension as z as its private member. Define the constructors for the subclass and override toString() method in the subclass also. Write appropriate methods to show dynamic method dispatch. The main() function should be in a package P.

Q10. Is the below code written correctly? If not then give reason. 

class A
{
	String s = "AAA";
	
	void methodA()
	{
		System.out.println(s);
	}
	
	static class B
	{
		void methodB()
		{
			methodA();
		}
	}
}.

Q11. Write the output of the following code. 

class Outer { 
void outerMethod() { 
System.out.println("Inside outerMethod"); 
// Inner class is local to outerMethod() 
class Inner { 
void innerMethod() { 
System.out.println("Inside innerMethod"); 
} 
} 
Inner y = new Inner(); 
y.innerMethod(); 
} 
} 
class Test1 { 
public static void main(String[] args) { 
Outer x = new Outer(); 
x.outerMethod(); 
} 
}.
Q12. Design an Employee class having attributes as empID, empName & empAge. The sample data of Employees is stored in a text file Employee.txt where the details are separated by “,”. Load an array of Employee using static block which comprises the Employee object created from the sample data stored in Employee.txt file. Allow the user to modify the Employee details in the array and save the updated information back to the file Employee.txt.
Q13. Write a Java program that implements a multi-thread application that has three threads. First thread generates a random integer every 1 second and if the value is even, the second thread computes the square of the number and prints. If the value is odd, the third thread will print the value of the cube of the number.
Q14. Write a program having user interface like
4. accept first name and surname
5. display total name
6. exit
Option A should accept First Name and SurName from command prompt and save that to Vector object
Option B it has to display how many names entered in the vector object
This menu should be repeated till users select exit.
To store first name and surname, create a class Name with these two attributes.
Q15. Write a Java program to get the last modified time of a file. 
