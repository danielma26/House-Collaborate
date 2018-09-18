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
	private Square ground;
    private Square bg;
    private Square wood;
    private Square wood_1;
    private Triangle tree;
    private Triangle tree1;
    private Triangle tree2;
    private Triangle tree3;
    private Triangle tree4;
    private Triangle tree_1;
    private Triangle tree1_1;
    private Triangle tree2_1;
    private Triangle tree3_1;
    private Triangle tree4_1;
    private Person slender;
    private Circle moon;
    private Triangle arm;
    private Triangle arm1;
    private boolean drawn; 
    private Square window_1;
    private Square window_2;
    private Square window_3;
    private Square window_4;
    private Square window_5;
    private Square window_6;
    private Square window_7;
    private Square window_8;
    private Square window_9;
    private Square window_10;
	 private Triangle roof_1;
	 private Person person;

    /**
     * Constructor for objects of class Picture
     */
    //public Picture()
    {
        ground = new Square();
        bg = new Square();
        window = new Square();
        tree = new Triangle();
        tree1 = new Triangle();
        tree2 = new Triangle();
        tree3 = new Triangle();
        tree4 = new Triangle();
        tree_1 = new Triangle();
        tree1_1 = new Triangle();
        tree2_1 = new Triangle();
        tree3_1 = new Triangle();
        tree4_1 = new Triangle();
        wood = new Square();
        wood_1= new Square();
        moon = new Circle();
        slender = new Person();
        arm = new Triangle();
        arm1 = new Triangle();
	 window_1 = new Square();
        window_2 = new Square();
        window_3 = new Square();
        window_4 = new Square();
        window_5 = new Square();
        window_6 = new Square();
        window_7 = new Square();
        window_8 = new Square();
        window_9 = new Square();
        window_10 = new Square ();
        roof_1 = new Triangle();
        roof = new Triangle();  
        sun = new Circle();
        person = new Person();
        drawn = false;

	    
	    
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

    public void draw_Rodriguez()
    {
        if(!drawn) {
            
            
            bg.moveHorizontal(-400);
            bg.moveVertical(-200);
            bg.changeSize(1500);
            bg.changeColor("grey");
            bg.makeVisible();
            
    
            ground.moveHorizontal(-350);
            ground.moveVertical(115);
            ground.changeSize(1500);
            ground.changeColor("dark_grey");
            ground.makeVisible();
            
            moon.changeColor("silver");
            moon.moveHorizontal(180);
            moon.moveVertical(-70);
            moon.changeSize(45);
            moon.makeVisible();
            
            tree.changeSize(35, 85);
            tree.moveHorizontal(-145);
            tree.moveVertical(-80);
            tree.makeVisible();
            tree.changeColor("black_grey");
            
            tree1.changeSize(35, 85);
            tree1.moveHorizontal(-145);
            tree1.moveVertical(-55);
            tree1.makeVisible();
            tree1.changeColor("black_grey");
            
            tree2.changeSize(35, 85);
            tree2.moveHorizontal(-145);
            tree2.moveVertical(-30);
            tree2.makeVisible();
            tree2.changeColor("black_grey");
            
            tree3.changeSize(35, 85);
            tree3.moveHorizontal(-145);
            tree3.moveVertical(-2);
            tree3.makeVisible();
            tree3.changeColor("black_grey");
            
            tree4.changeSize(35, 85);
            tree4.moveHorizontal(-145);
            tree4.moveVertical(26);
            tree4.makeVisible();
            tree4.changeColor("black_grey");
            
            tree_1.changeSize(35, 85);
            tree_1.moveHorizontal(215);
            tree_1.moveVertical(-80);
            tree_1.makeVisible();
            tree_1.changeColor("black_grey");
            
            tree1_1.changeSize(35, 85);
            tree1_1.moveHorizontal(215);
            tree1_1.moveVertical(-55);
            tree1_1.makeVisible();
            tree1_1.changeColor("black_grey");
            
            tree2_1.changeSize(35, 85);
            tree2_1.moveHorizontal(215);
            tree2_1.moveVertical(-30);
            tree2_1.makeVisible();
            tree2_1.changeColor("black_grey");
            
            tree3_1.changeSize(35, 85);
            tree3_1.moveHorizontal(215);
            tree3_1.moveVertical(-2);
            tree3_1.makeVisible();
            tree3_1.changeColor("black_grey");
            
            tree4_1.changeSize(35, 85);
            tree4_1.moveHorizontal(215);
            tree4_1.moveVertical(26);
            tree4_1.makeVisible();
            tree4_1.changeColor("black_grey");
            
            wood.moveHorizontal(-260);
            wood.moveVertical(81);
            wood.changeSize(35);
            wood.changeColor("black_grey");
            wood.makeVisible();
            
            wood_1.moveHorizontal(100);
            wood_1.moveVertical(81);
            wood_1.changeSize(35);
            wood_1.changeColor("black_grey");
            wood_1.makeVisible();
            
            slender.changeSize(140,20);
            slender.moveVertical(-20);
            slender.changeColor("silver");
            slender.makeVisible();
            
            arm.changeSize(8,40);
            arm.moveHorizontal(70);
            arm.moveVertical(38);
            arm.changeColor("silver");
            arm.makeVisible();
            
            arm1.changeSize(8,40);
            arm1.moveHorizontal(70);
            arm1.moveVertical(46);
            arm1.changeColor("silver");
            arm1.makeVisible();
    
            
            drawn = true;
        }
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
	
	  public void draw_ma()
    {
        if(!drawn) {
            wall.changeColor("green");
            wall.moveHorizontal(-180);
            wall.moveVertical(-60);
            wall.changeSize(300);
            wall.makeVisible();
            
            
            //1st floor
            window_1.changeColor("blue");
            window_1.moveHorizontal(-150);
            window_1.moveVertical(70);
            window_1.changeSize(50);
            window_1.makeVisible();
            
            window_2.changeColor("blue");
            window_2.moveHorizontal(-50);
            window_2.moveVertical(70);
            window_2.changeSize(50);
            window_2.makeVisible();
            
            
            window_3.changeColor("blue");
            window_3.moveHorizontal(50);
            window_3.moveVertical(70);
            window_3.changeSize(50);
            window_3.makeVisible();
            
            //2nd floor
            window_4.changeColor("blue");
            window_4.moveHorizontal(-150);
            window_4.moveVertical(10);
            window_4.changeSize(50);
            window_4.makeVisible();
            
            window_5.changeColor("blue");
            window_5.moveHorizontal(-50);
            window_5.moveVertical(10);
            window_5.changeSize(50);
            window_5.makeVisible();
            
            window_6.changeColor("blue");
            window_6.moveHorizontal(50);
            window_6.moveVertical(10);
            window_6.changeSize(50);
            window_6.makeVisible();  
            //3rd floor
            window_7.changeColor("blue");
            window_7.moveHorizontal(-150);
            window_7.moveVertical(-50);
            window_7.changeSize(50);
            window_7.makeVisible(); 
            
            window_8.changeColor("blue");
            window_8.moveHorizontal(-50);
            window_8.moveVertical(-50);
            window_8.changeSize(50);
            window_8.makeVisible(); 
            
            window_9.changeColor("blue");
            window_9.moveHorizontal(50);
            window_9.moveVertical(-50);
            window_9.changeSize(50);
            window_9.makeVisible(); 
            
            //entrance
            window_10.changeColor("blue");
            window_10.moveHorizontal(-50);
            window_10.moveVertical(140);
            window_10.changeSize(40);
            window_10.makeVisible();            
            
	    //small roof
            roof.changeColor("red");
            roof.changeSize(10, 40);
            roof.moveHorizontal(70);
            roof.moveVertical(110);
            roof.makeVisible();

            //big roof
            roof_1.changeColor("magenta");
            roof_1.changeSize(20, 300);
            roof_1.moveHorizontal(70);
            roof_1.moveVertical(-100);
            roof_1.makeVisible();
            
            
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-100);
            sun.changeSize(80);
            sun.makeVisible();
            
            person.changeColor("black");
            person.moveHorizontal(-130);
            person.moveVertical(70);
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
