
class Loops
{
   public static void main(String arg[])
   {
      int Arr[] = {10,20,30,40};
      int iCnt = 0;

      System.out.println("Traversal of array usimg for loop ");
      for(iCnt =0; iCnt < Arr.length; iCnt++)   //same in c,c++,java
      {
         System.out.println(Arr[iCnt]);
      }
      System.out.println("Traversal of array usimg for while loop ");
      iCnt =0;
      while(iCnt < Arr.length)   //same in c,c++,java
      {
         System.out.println(Arr[iCnt]);
         iCnt++;
      }
      System.out.println("Traversal of array usimg do while loop ");
       iCnt = 0;
       do //same in c,c++,java
      {
         System.out.println(Arr[iCnt]);
         iCnt++;
      } while(iCnt < Arr.length);
      System.out.println("Traversal of array usimg for-each loop ");
      for(int iNo : Arr)
      {
         System.out.println(iNo);
      }
   }
} 