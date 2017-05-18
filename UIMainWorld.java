import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * A basic GUI interface, with basic GUI elements.
 * 
 * Author: Gade Ricard
 * Teacher: Mr.Hardman
 * Assignment: #6 Objects and Classes
 * Date Last Modified: May 17th
 */
public class UIMainWorld extends World
{
    private int backgroundImage;
    
    /**
     * Constructor for objects of class UIMainWorld.
     * 
     */
    public UIMainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        testActors();
    }
    
    /**
     * testActors controls the creation and placement of the various elements of the GUI.
     * 
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    private void testActors()
    {
        addObject(new Button(12, "button-blue.png", "button-green.png", "Test Button"), 570, 370);
        addObject(new Label("Label Test", 20), getWidth()/2, 30);
        addObject(new TextBox("This is a TextBox", 15, true, Color.BLACK, Color.GREEN), 50, getHeight()/2);
        addObject(new Menu("File", "New\nOpen\nSave\nClose\nExit", 20, Color.BLACK, Color.WHITE, Color.BLACK, Color.GRAY, new FileCommands() ), 15, 20);
        addObject(new Menu("Edit", "New Class\nImport Class\nRemove Class\nPaste Image\nPreferences", 20, Color.BLACK, Color.WHITE, Color.BLACK, Color.GRAY, new EditCommands() ), 45, 20);
    }
    
    /**
     * setWorldImage is a setter method that changes the backgroundImage variable to the parameter.
     * 
     * @param int Image is the variable that backgroundImage should be changed to.
     * @return Nothing is returned.
     */
    public void setWorldImage(int image)
    {
        backgroundImage = image;
        updateImage();
    }
    
    /**
     * updateImage is called to change the background of the world to the image specified
     * by the backgroundImage variable.
     * 
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    private void updateImage()
    {
        if(backgroundImage == 0)
        {
            setBackground("Background.jpg");
        }
        else if(backgroundImage == 1)
        {
            setBackground("cancer.png");
        }
    }
}
