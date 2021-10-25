package Question3;

import java.util.Scanner;

class Sender
{
    public void SenderMsg(String msg)
    {
        System.out.println("\nSending a Message: "  + msg);
        try
        {
            for (int i=0;i<10;i++){
                System.out.print(".");
                Thread.sleep(500);
            }

        }
        catch (Exception e)
        {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\nMessage Sent");
    }
}
// A Sender class for sending a message using Threads
class SenderWThreads extends Thread
{
    private String msg;
    Sender sd;

    // Receiver method to receive a message object and a message to be sent
    SenderWThreads(String m, Sender obj)
    {
        msg = m;
        sd = obj;
    }

    public void run()
    {
        // Checks that only one thread sends a message at a time.
//        synchronized block
        synchronized(sd)
        {
            // synchronizing the sender object
            sd.SenderMsg(msg);
        }
    }
}
public class SynchronizationBlock {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int choice;
        Sender sender = new Sender();
        SenderWThreads sender1 = new SenderWThreads( "Good morning Knolder! " , sender);
        SenderWThreads sender2 =  new SenderWThreads( "Welcome to Knoldus Family ", sender);
        SenderWThreads sender3 =  new SenderWThreads( "How are you today ?", sender);

        // Start three threads of SenderWThreads type
        sender1.start();
        sender2.start();
        sender3.start();

    }
}
