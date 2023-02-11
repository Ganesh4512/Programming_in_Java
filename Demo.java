//Class Defination

class Demo
{
        public static void main(String arr[])
        {
            System.out.println("Inside main fuction "); 

            Maths mobj1 = new Maths();
            Maths mobj2 = new Maths();

            int iRet = 0;
            iRet = mobj1.Addition();
            System.out.println("Addition is : "+iRet);

            iRet = mobj2.Addition();
            System.out.println("Addition is : "+iRet);


        }


}

class Maths
{
    public int iNo1;  //chara
    public int iNo2;    //chara.

    public
    
        iNo1 = 0;
        System.out.println("Enter the first number");
        iNo2 = 0;
        System.out.println("Enter the Second number");
        
    
    
    public int Addition()
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }
    public int Substraction()
    {
        int iAns = 0;
        iAns = iNo1 - iNo2;
        return iAns;
    }
}//End of Maths class

