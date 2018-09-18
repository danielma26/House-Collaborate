/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    //public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
    }
    
    public void draw_Legocki()
    {
        Circle outerBow;
        Circle innerBow;
        Person dude;
        Circle ring1;
        Circle ring2;
        Circle ring3;
        Circle ring4;
        Triangle outerFeet;
        Triangle innerFeet;
        Square tip;
        Square shaft1;
        Square shaft2;
        Square shaft3;
        
        outerBow = new Circle(40,260,180,"red");
        innerBow = new Circle(40,265,178,"white");
        dude = new Person();
        ring1 = new Circle(60,110,150,"magenta");
        ring2 = new Circle(50,115,155,"yellow");
        ring3 = new Circle(30,125,165,"green");
        ring4 = new Circle(10,135,175,"red");
        outerFeet = new Triangle(40,50,140,185,"black");
        innerFeet = new Triangle(60,70,140,200,"white");
        tip = new Square(10,200,180,"black");
        shaft1 = new Square(10,210,180,"red");
        shaft2 = new Square(10,220,180,"red");
        shaft3 = new Square(10,230,180,"red");
        
        outerBow.makeVisible();
        innerBow.makeVisible();
        dude.makeVisible();
        outerFeet.makeVisible();
        innerFeet.makeVisible();
        ring1.makeVisible();
        ring2.makeVisible();
        ring3.makeVisible();
        ring4.makeVisible();
        tip.makeVisible();
        shaft1.makeVisible();
        shaft2.makeVisible();
        shaft3.makeVisible();
    }


    private Square square1;
    private Square square2;
    private Square square3;
    private Square square4;
    private Triangle triangle1;
    private Triangle triangle2;
    private Circle circle;
    private Person person;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        square1 = new Square();
        square2 = new Square();
        square3 = new Square();
        square4 = new Square();
        triangle1 = new Triangle();
        triangle2 = new Triangle();
        circle = new Circle();
        person = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw_Raymond()
    {
        if(!drawn) {
            square2.changeColor("blue");
            square2.changeSize(2000);
            square2.moveHorizontal(-310);
            square2.moveVertical(-300);
            square2.makeVisible();
            
            square3.changeColor("green");
            square3.changeSize(2000);
            square3.moveHorizontal(-310);
            square3.moveVertical(100);
            square3.makeVisible();
            
            square1.changeColor("brown");
            square1.moveVertical(100);
            square1.moveHorizontal(-115);
            square1.changeSize(30);
            square1.makeVisible();
            
            square4.changeColor("brown");
            square4.moveVertical(70);
            square4.moveHorizontal(-115);
            square4.changeSize(30);
            square4.makeVisible();
            
            triangle1.changeColor("green");
            triangle1.makeVisible();
            
            triangle2.moveVertical(-30);
            triangle2.makeVisible();
            
            circle.changeColor("yellow");
            circle.moveHorizontal(150);
            circle.moveVertical(-50);
            circle.makeVisible();
            
            person.moveVertical(-10);
            person.makeVisible();
            
            drawn = true;
        }
    }
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
