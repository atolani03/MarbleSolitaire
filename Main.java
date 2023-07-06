import java.io.InputStreamReader;
import controller.ImageController;
import model.ImageModelImpl;
import view.ViewModelImpl;

/**
 * main class that runs the main method.
 */
public class Main {
  /**
   * main method to run the program.
   * @param args that you want to have in main program
   */
  public static void main(String[] args) {
    ImageModelImpl model = new ImageModelImpl();
    Readable rd = new InputStreamReader(System.in);
    Appendable ap = System.out;
    ViewModelImpl view = new ViewModelImpl(ap);
    ImageController controller = new ImageController(model, view, rd);
    controller.run();
  }
}
