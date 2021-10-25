package Question3;
import Printer.*;
import java.util.concurrent.ThreadLocalRandom;

public class WaitAndNotify {
    public static void main(String[] args) {
        Data data = new Data();
        Thread sender = new Thread(new MessageSender(data));
        Thread receiver = new Thread(new MessageReceiver(data));
        sender.start();
        receiver.start();
    }

}
class Data {
    private String packet;

    // True if receiver should wait
    // False if sender should wait
    private boolean transfer = true;

    public synchronized void send(String packet) {
        while (!transfer) {
            try {
                wait();
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt();

            }
        }
        transfer = false;
        this.packet = packet;
        notifyAll();
    }
    public synchronized String receive() {
        while (transfer) {
            try {
                wait();
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
        transfer = true;

        notifyAll();
        return packet;
    }
}
class MessageSender implements Runnable {
    private final Data data;
    MessageSender(Data data){
        this.data = data;
    }
    public void run() {
        String[] packets = {
                "Hello",
                "Knolder",
                "How are you",
                "Welcome to knoldus family",
                "End"
        };

        for (String packet : packets) {
            Printer.print("\nSending Message : "+packet);
            data.send(packet);
            Printer.print("Message Sent: "+packet);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
    }
}
class MessageReceiver implements Runnable {
    private final Data data;

    public MessageReceiver(Data data) {
        this.data = data;
    }
    public void run() {
        for(String receivedMessage = data.receive();
            !"End".equals(receivedMessage);
            receivedMessage = data.receive()) {
            System.out.println("Message Received: "+receivedMessage);
            try {
                Printer.print("Wating for next message");
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}