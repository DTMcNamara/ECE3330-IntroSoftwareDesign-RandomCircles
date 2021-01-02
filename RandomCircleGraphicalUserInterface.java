import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

/**
 * The randomCircleGUI class inherits
 * from the JPanel class. The class is used
 * to draw a random circle on start up
 * and display its attributes. The circle
 * will redraw on any resizing of the window.
 */
public class RandomCircleGraphicalUserInterface extends JPanel {

    /**
     * The double x is used to hold
     * the x position to draw the circle
     */
    private double x;

    /**
     * The double y is used to hold
     * the y position to draw the circle
     */
    private double y;

    /**
     * The double h is used to hold
     * the height of the circle to draw.
     */
    private double h;

    /**
     * The double h is used to hold
     * the width of the circle to draw.
     */
    private double w;

    /**
     * The double area is used to
     * hold the value of the area
     * of the drawn circle.
     */
    private double area;

    /**
     * The double radius is used to
     * hold the value of the radius
     * of the drawn circle.
     */
    private double radius;

    /**
     * The double diameter is used to
     * hold the value of the diameter
     * of the drawn circle.
     */
    private double diameter;

    /**
     * The double circumference is used to
     * hold the value of the circumference
     * of the drawn circle.
     */
    private double circumference;

    /**
     * The Graphics2D gc is used
     * to assign the circle to draw
     * in the paint component.
     */
    private Graphics2D gc;

    /**
     * The randCircle Shape is used to
     * hold the drawn circle after random
     * values are assigned.
     */
    private Shape randCircle;

    /**
     * The textfield JTextArea is used to
     * display the attributes of the circle
     * to the user.
     */
    private JTextArea textfield;

    /**
     * The rand Random is used to generate
     * random numbers to create the circle.
     */
    private Random rand;

    /**
     * The randomCircleGUI constructor
     * creates a new random circle GUI
     * and assigns all attributes in the
     * paint component.
     */
    RandomCircleGraphicalUserInterface(){
        setLayout(new BorderLayout());
        textfield = new JTextArea();
        add(textfield, BorderLayout.SOUTH);
    }

    /**
     * The paintComponent is used to
     * draw the circle after assigning
     * all of the random attributes.
     * Java SDK recommends overriding
     * this method instead of the paint
     * method.
     *
     * @param g Graphics g is the item to
     *          be painted in the GUI
     */
    public void paintComponent(Graphics g){
        gc=(Graphics2D)g;
        rand = new Random();
        x=(rand.nextDouble()*rand.nextInt(500));
        y=(rand.nextDouble()*rand.nextInt(500));
        w=(rand.nextDouble()*rand.nextInt(500));
        h=w;
        radius=(w/2);
        area=(Math.PI*radius*radius);
        diameter=(radius*2);
        circumference=(2*Math.PI*radius);
        randCircle = new Ellipse2D.Double(x,y,w,h);
        gc.draw(randCircle);
        textfield.setText("Area = "+area+"     Diameter = "+diameter+"     Circumference = "+circumference);
        textfield.setEditable(false);
    }
}
