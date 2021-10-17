import java.io.*;

public class ExceptionHandlingDemo
{
      public static void main(String args[])throws IOException // IOException is thrown due to the usage of ISR, BR
      {
             InputStreamReader read = new InputStreamReader(System.in); // Used to read data given by the user
             BufferedReader in= new BufferedReader(read); // Reads data line by line
             int a,b;
             try // Code which contains error
             {
                    System.out.println("Enter 2 Numbers:");
                    a = Integer.parseInt(in.readLine());
                    b = Integer.parseInt(in.readLine());
	                int c = a/b;
             }
             catch(NumberFormatException e) 
             {
	               System.out.println("Input A Number and Not Any Character!");
             }
             catch(ArithmeticException e1)
             {
	               throw new ArithmeticException("Dividing By Zero gives An Error!!");
             }
             finally
             {
                    System.out.println("Exception is Handled.");//It is executed after try and catch block
             }
       }
}