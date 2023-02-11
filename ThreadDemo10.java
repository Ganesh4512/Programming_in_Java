

class ThreadDemo10
{
    public static void main(String A[])
    {
        System.out.println("Inside main method");

        System.out.println("Name of Current thread is : "+Thread.currentThread().getName());
        System.out.println("Name of Current thread is : "+Thread.currentThread().getPriority());
    }
}