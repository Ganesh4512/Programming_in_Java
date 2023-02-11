class Single
{
        public static void main(String arg[])
        {
                //Base bobj1 = new Base(); //no casting
                //Derived dobj1=new Derived();  //no casting
                Base bobj2 = new Derived();  //upcasting
                //Derived dobj2 = new BAse();//  downcasting(NA)

                bobj1.fun();    //Base fun
                bobj1.fun(11); //BAse fun
                bobj1.gun();   //Derived gun
                //bobj1.sun();   //Derived sun
        }
}

class Base
{
        public int A,B;
        public Base()
        {
                System.out.println("Base constructor");
                this.A=10;
                this.B=20;
        }
        public void fun()       //Defination
        {
                System.out.println("Inside BAse fun");
        }
        public void gun()  //Defination
        {
                System.out.println("Inside BAse gun");
        }
        public void fun(int No) //overloaded Defination
        {
                System.out.println("Inside BAse fun with one intenger");
        }
}       

class Derived extends Base   // class Derived: public Base
{
        public int X,Y;
        public Derived()
        {
                System.out.println("Derived constructor");
                this.X=30;
                this.Y=40;
        }
        public void sun()       //Defination
        {
                System.out.println("Inside Derived sun");
        }
        public void gun()       // overrider defination
        {
                System.out.println("nside Derived gun");
        }
}
