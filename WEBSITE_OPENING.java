import java.awt.Desktop;
import java.io.*;
import java.net.URI;
  
class WEBSITE_OPENING 
{
    public static void main(String[] args)
             throws Exception
    {
        Desktop desk = Desktop.getDesktop();
        desk.browse(new URI("https://github.com/Achyuth-Papisetty/JAVA-PROGRAMS.git"));
    }
}