import java.io.*;

class my
{
    File ff;
    my()
    {
        try {
            ff = new File("/root/Desktop/file/new.mp3");
            System.out.println(ff.createNewFile());
            System.out.println(ff.canExecute());
            System.out.println(ff.canRead());
            System.out.println(ff.canWrite());
            System.out.println(ff.exists());
            System.out.println(ff.getAbsoluteFile());
            System.out.println(ff.getAbsolutePath());
            System.out.println(ff.getFreeSpace());
            System.out.println(ff.getName());
            System.out.println(ff.getPath());
            System.out.println(ff.length());
            System.out.println(ff.setExecutable(true));

        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
public class pro {
    public static void main(String[] args) {
        new my();
    }
}
