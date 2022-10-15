import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
class Picture2 extends JFrame {
    int WINDOW_WIDTH = 600;
    int WINDOW_HEIGHT = 600;
    String background_image_path;
    String animation_images_path = "C:/Users/Mvideo/Desktop/rabbit.png";
    int method;

    Picture2() {
        super("Some shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        //setBackground(Color.BLACK);
        setLocation(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        this.method = 0;


    }

    void set_background_image_path(String path) {
        this.background_image_path = path;
    }

    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        Image img = Toolkit.getDefaultToolkit().getImage(this.background_image_path);
        g.drawImage(img, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);


    }

    public static void main(String[] args) {
        Picture2 app = new Picture2();
        app.set_background_image_path(args[0]);
    }
}
