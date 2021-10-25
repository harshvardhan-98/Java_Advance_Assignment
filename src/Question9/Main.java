package Question9;
import Question9.P1.TwoDim;
import Question9.P2.ThreeDim;

public class Main {
    public static void main(String[] args) {
        TwoDim ref;
        ref = new TwoDim(10, 20);
        System.out.println(ref);
        ref = new ThreeDim(30, 40, 50);
        System.out.println(ref);
    }
}