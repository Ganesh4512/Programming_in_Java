

class HashcodeDemo
{
    public static void main(String A[]) 
    {
        Demo obj1 = new Demo(11,21);
        Demo obj2 = new Demo(11,21);

        if(obj1.equals(obj2))
        {
            System.out.println("Objects are same");

        }
        else
        {
             System.out.println("Objects are ddifferent");
        }
    }
}
class Demo
{
    public int No1;
    public int No2;

    public Demo(int a,int b)
    {
        No1 = a;
        No2 =b;
    }
    

}

