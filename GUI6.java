//import javax.swing.*; // extend package 
import java.awt.*;
import java.awt.event.*;


class GUI6
{
    public static void main(String arg[])
    {
        MarvellousFrame mobj = new MarvellousFrame("Marvellous PPA41");
    }
}
class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
        Frame fobj = new Frame(title);    //only add J
        fobj.setSize(500,500);
        fobj.setVisible(true);

        Button bobj = new Button("ok");
        fobj.add(bobj);
        fobj.addWindowListener(new MarvellousListener());
    }
}

class MarvellousListener extends WindowAdapter
{
    
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
    
}

