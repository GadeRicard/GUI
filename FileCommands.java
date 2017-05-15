import greenfoot.*;
/**
 * Write a description of class FileCommands here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FileCommands implements MenuCommands
{
    /**
     * Constructor for objects of class FileCommands
     */
    public FileCommands()
    {
    }

    /**
     * execute creates system feedback in the console in response to which menu item is 
     * clicked.
     * 
     * @param int idx is a variable that controls which message is called in the Greenfoot
     * console.
     * @param World w is a reference to the world that allows this program to run methods contained
     * in that World class
     */
    public void execute(int idx, World w)
    {
        if(idx == 0)
        {
            System.out.println("Running New Command...");
        }
        else if(idx == 1)
        {
            System.out.println("Running Open Command...");
        }
        else if(idx == 2)
        {
            System.out.println("Running Save Command...");
        }
        else if(idx == 3)
        {
            System.out.println("Running Close Command...");
        }
        else if(idx == 4)
        {
            System.out.println("Running Exit Command...");
        }
    }
}
