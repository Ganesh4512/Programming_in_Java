// Same as constant charactristics of class from C++
class Demo
{
    public int No1;
    public final int No2;
    public final int No3;

    public Demo()
    {
        No1=0;
        No3=21;
    }
}


class final1
{
    public static void  main(String arr[])
    {
        Demo obj=new Demo();
        obj.No1++;
        obj.No2++;
        obj.No3++;
    }


}