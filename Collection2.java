import java.util.*;

class Collection2
{
    public static void main(String arg[])
    {
        LinkedList <String> lobj = new LinkedList<String>();

        lobj.add("Kapil");
        lobj.add("Aditya");
        lobj.add("Rohan");
        lobj.add("Rutik");
        lobj.add("Tejas");

        System.out.println("Elemensts of linked list are are:"+lobj);

        lobj.addFirst("Pooja");

        System.out.println("Elemensts of linked list are are:"+lobj);

        lobj.addLast("Snaha");
        System.out.println("Elemensts of linked list are are:"+lobj);

        Iterator iobj = lobj.iterator();
        System.out.println("DAta using iterator is :");
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        if(lobj.contains("Rohan"))
        {
            System.out.println("Rohan is present in LL");
        }
        else
        {
            System.out.println("Rohan is absent in LL");
        }


        lobj.remove();
        System.out.println("Elemensts of linked list are are:"+lobj);

        lobj.remove(0);
        System.out.println("Elemensts of linked list are are:"+lobj);

        lobj.removeLast();
        System.out.println("Elemensts of linked list are are:"+lobj);

        System.out.println("Number of elemesnts are :"+lobj.size());

        lobj.set(1,"Dipak");
        System.out.println("Elemensts of linked list are are:"+lobj);
        
        lobj.clear();
        System.out.println("Elemensts of linked list are are:"+lobj);
        
        
    }
}