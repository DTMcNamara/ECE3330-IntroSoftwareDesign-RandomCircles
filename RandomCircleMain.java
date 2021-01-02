import javax.swing.*;

/**
 * The RandomCircleMain is used to
 * test the RandomCircleGraphicalUserInterface
 */
public class RandomCircleMain {

    /**
     * The main method creates a JFrame to
     * add the RandomCircleGraphicalUserInterface to and sets the
     * attributes of the JFrame.
     *
     * @param args No args are passed.
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Circle GUI");
        frame.add(new RandomCircleGraphicalUserInterface());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setVisible(true);
    }
}
