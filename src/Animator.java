import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;


class Animator extends JFrame {
    int WINDOW_WIDTH = 600;
    int WINDOW_HEIGHT = 600;
    String background_image_path;
    String animation_images_path = "C:/Users/MVideo/OneDrive/Рабочий стол/Java_task_8";
    int method;


    Animator() {
        super("Some shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        //setBackground(Color.BLACK);
        setLocation(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        this.method = 0;

        // Btn "Start animation"
        Button btn = new Button("Start animation");
        btn.setSize(200, 100);
        btn.setLocation(0, 0);
        btn.addActionListener(
                new ActionListener () {
                    public void actionPerformed(ActionEvent event) {
                        method = 1;
                        setTitle("Animation");
                        setSize(WINDOW_WIDTH + 1, WINDOW_HEIGHT);
                        setSize(WINDOW_WIDTH - 1, WINDOW_HEIGHT);
                    }
                }
        );
        add(btn);
    }

    void set_background_image_path(String path) {
        this.background_image_path = path;
    }

    void set_animation_images_path(String path) {
        this.animation_images_path = path;
    }


    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        Image img = Toolkit.getDefaultToolkit().getImage(this.background_image_path);
        g.drawImage(img, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);

        switch (this.method) {
            case 0:
                random_shapes_paint(50, g);
                break;

            case 1:
                animate(this.animation_images_path, g);
                break;

            default:
                break;
        }
    }

    void random_shapes_paint(int shapes, Graphics2D g) {

    }

    void animate(String frames_path, Graphics2D g) {
        File dir = new File(frames_path);
        for (File file : dir.listFiles()) {
            Image frame = Toolkit.getDefaultToolkit().getImage(file.getPath());
            g.drawImage(frame, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }

    // Start app
    public static void main(String[] args) {
        Animator app = new Animator();
        if (args.length == 1) {
            app.set_background_image_path(args[0]);
        }
        else if (args.length == 2) {
            app.set_background_image_path(args[0]);
            app.set_animation_images_path(args[1]);
        }
        else {
            System.out.println("[!] Background image path is empty");
        }

    }
}