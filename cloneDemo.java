

class Emplyee implements Cloneable
{   
    public int Eid;
    public String Name;
    public int Salary;

    public Emplyee(int No,String str , int value)
    {
        this.Eid = No;
        this.Name = str;
        this.Salary = value;
    }
    public Object Clone() throws CloneNotupportedException
    {
        return super.clone();
    }


}

class CloneDemo
{
    public static void main(String A[])
    {
        try 
        {   
           
            Emplyee eobj1 =new Emplyee(101,"Rahul",11000);
            Emplyee eobj2 = (Emplyee)eobj1.clone();
            

            System.out.println("Name of first employee:"+eobj1.Name);
            System.out.println("Name of Second employee:"+eobj2.Name);

            System.out.println("Salaryof first employee:"+eobj1.Salary);
            System.out.println("Salary  of Second employee:"+eobj2.Salary);

            eobj1.Name = "Sagar";

            System.out.println("Name of first employee:"+eobj1.Name);
            System.out.println("Name of Second employee:"+eobj2.Name);




        }
        catch(CloneNotupportedException obj)
        {}

    }

}