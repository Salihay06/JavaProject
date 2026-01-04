/*
AWT kullanarak basit bir GUI uygulaması yazınız:

Başlığı "Advanced Programming Exam" olan bir Frame

GridLayout kullanılacak

"Hello World" yazan bir Label

Altında "Click Me" butonu

Butona basılınca label yazısı "Button Clicked!" olsun
*/

import java.awt.*;
import java.awt.event.*;

public class SimpleAWT {
    public static void main(String[] args) {
        Frame frame = new Frame("Advanced Programming Exam");
        frame.setLayout(new GridLayout(2, 1));

        Label label = new Label("Hello World", Label.CENTER);
        Button button = new Button("Click Me");

        button.addActionListener(e -> label.setText("Button Clicked!"));

        frame.add(label);
        frame.add(button);

        frame.setSize(300, 200);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
