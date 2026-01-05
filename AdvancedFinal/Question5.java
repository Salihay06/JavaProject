import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question5 extends Frame {
    private Label label;
    private Button button;

    public Question5() {
        setTitle("Advanced Programming Exam");
        setLayout(new GridLayout(2, 1));

        label = new Label("Hello World!");
        button = new Button("Click Me");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });

        add(label);
        add(button);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Question5();
    }
}