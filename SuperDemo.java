




class SuperDemo
{
    public static void main(String a[])
    {
        Derived dobj =new Derived(11,12,51,101);
        dobj.gun();
    }
   
   
}
class Base
{
    public int A,B;
    public Base(int No1,int No2)
    {
        this.A=No1;
        this.B=No2;
    }
    public void fun()
    {
        System.out.println("Inside Base fun");
        System.out.println("Value of A from funmethod is :"+this.A);
    }
}

class Derived extends Base
{
    public int X,Y;
    public Derived(int i,int j,int K,int L)
    {
        super(K,L);     //1usecase
        this.X=i;
        this.Y=j;
    }
    public void gun()
    {
        System.out.println("Value of A from method is :"+super.A);   //2usecase
        super.fun();  //3usecase
    }

}


