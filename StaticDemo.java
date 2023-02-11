

class StaticDemo
{       
        static
        {
            System.out.println("Inside static block of StaticDemo class which contains main");
        }
        public StaticDemo()
        {
             
            System.out.println("Inside constructor of staticDemo");
        }

        public static void main(String arg[])
        {
            System.out.println("Inside main ");
            System.out.println("Value of static No3 : "+Demo.No3); //+Demo.NO3:
            System.out.println("Value of static No4 : "+Demo.No4);
            Demo.gun();     // Demo::gun

            Demo obj1 = new Demo();
            Demo obj2 = new Demo();

            obj1.Fun();
        }
}

class Demo
{       
        public int No1;     //non static characteristics
        public int No2;     // non static characteristics
        public static int No3;  //static characteristics
        public static int No4;      //static characteristics

        static  //static block
        {
            System.out.println(" Inside static Block of Democlass ");
            No3=51;
            No4=101;

        }
        public Demo()   //constructor
        {
            System.out.println(" Inside constructor");
            No1 =11;
            No2=21;
        }
        public void Fun()
        { //Non static method can access staticas well as on static data
        // we can use this keyword
            System.out.println(" Inside non static method fun ");
            System.out.println("Value of No1 : "+this.No1);
            System.out.println("Value of No1 : "+this.No2);
            System.out.println("Value of No1 : "+this.No3);
            System.out.println("Value of No1 : "+this.No4);
        }
        public static void gun()
        {   // Static method can access only static data 
            //we cant us ethis keyword
            System.out.println(" Inside static method gun ");
           //System.out.println("VAlue of No1 : "+No1);
          // System.out.println("VAlue of No1 : "+No2);
            System.out.println("Value of No3 : "+No3);
            System.out.println("Value of No4 : "+No4);

        }     
}


