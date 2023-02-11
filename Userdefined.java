import java.util.*;

class AgeInvalidException extends Exception
{
    AgeInvalidException(String str)
    {
        super(str);
    }
}

class Userdefined
{
    public static void main(String arg[]);
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter ur age ");
        int iAge = sobj.nextInt();

        try
        {
            if(iAge < 15)
            {
                throw new AgeInvalidEXception("Your age is less than 15 ");
            }
            else
            {
                System.out.println("Age is valid");
            }

        }
        catch(AgeInvalidEXception obj)
        {
            System.out.println("obj");
        }
    }
}