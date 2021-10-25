package Question8;

import java.io.FileInputStream;
import java.util.Scanner;

class Try_Catch
{
    public static void main(String[] args)
    {
        int a=5,b=0,c,d,f;
        try
        {
            Scanner s=new Scanner(System.in);
            System.out.print("Enter a:");
            a=s.nextInt();
            System.out.print("Enter b:");
            b=s.nextInt();
            System.out.print("Enter c:");
            c=s.nextInt();
            d=a/b;
            System.out.println(d);
            f=a%c;
            System.out.println(f);
            FileInputStream fis = null;
            /*This constructor FileInputStream(File filename)
             * throws FileNotFoundException which is a checked
             * exception*/
            fis = new FileInputStream("B:/myfile.txt");
            int k;
            /*Method read() of FileInputStream class also throws
             * a checked exception: IOException*/
            while(( k = fis.read() ) != -1)
            {
                System.out.print((char)k);
            }
            //*The method close() closes the file input stream It throws IOException
            fis.close();
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}