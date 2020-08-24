import java.util.Scanner;

public class Programming
{

        public static void main(String args[])

        {

            Scanner sc = new Scanner (System.in);

            String  str= sc.nextLine();

            if(str.length()>1)

                System.out.println( "I love " +str);

            else

                System.out.println(" I love programming languages");

        }

    }



