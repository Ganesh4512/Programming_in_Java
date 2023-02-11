import java.util.*; //Inbuilt package

import Marvellous.Arithmetic; //user defined package
import Marvellous.PPA.LoopX;

class Demopackage
{
    public static void main(String arr[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter first number ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter Second number ");
        int iNo2 = sobj.nextInt();

        Arithmetic aobj = new Arithmetic(iNo1,iNo2);
        
        int iResult=aobj.Addition();
        System.out.println("Addition is "+iResult);

        iResult=aobj.Substraction();
        System.out.println("Substraction is "+iResult);

        LoopX lobj= new LoopX();
        lobj.Display();

    }
    


}