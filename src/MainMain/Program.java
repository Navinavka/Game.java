package MainMain;

import javax.swing.*;
import java.awt.*;

/**
 * Графический интерфейс в разработке.
 * Как подключить comboBox к классу выбора персонажа?
 * Как выводить окна поочередно?
 */
public class Program {
    JFrame frame;
//    Play play = OptCreatePlaer.optcreatePlaer();
//    Player player = play.createPlaer();
    Program() {
        frame = new JFrame("example");
        Label label1, label2, label3, label4, label5, label6;
        JTextField jTextField1, jTextField2, jTextField3, jTextField4;
        Button button1, button2, button3;

        label1 = new Label("Против кого будете играть?");

        String courses[] = {"Troll", "Wizard", "Robot"};
        JComboBox comboBox = new JComboBox(courses);

        button1 = new Button("Готов");
        label2 = new Label("Вставить речь противника");

        jTextField1 = new JTextField();
        label3 = new Label("Отвеет1");

        jTextField2 = new JTextField();
        label4 = new Label("Отвеет2");

        jTextField3 = new JTextField();
        label5 = new Label("Отвеет3");

        label6 = new Label("Ответ4");

        button2 = new Button("Стоп");

        frame.add(label1);
        label1.setBounds(20,4, 350,20);
        frame.add(comboBox);
        comboBox.setBounds(40, 30, 90, 20);
        frame.add(button1);
        button1.setBounds(200,30,90,20);
        frame.add(label2);
        label2.setBounds(20,60,350,20);
        frame.add(jTextField1);
        jTextField1.setBounds(40,90,90,20);
        frame.add(label3);
        label3.setBounds(20,120,350,20);
        frame.add(jTextField2);
        jTextField2.setBounds(40,150,90,20);
        label4.setBounds(20,180,350,20);
        frame.add(label4);
        frame.add(jTextField3);
        jTextField3.setBounds(40,210,90,20);
        frame.add(label5);
        label5.setBounds(20,240,350,20);
        frame.add(label6);
        label6.setBounds(20,270,350,20);
        frame.add(button2);
        button2.setBounds(20,350,350,20);

        frame.setSize(400, 400);
        frame.setTitle("Угодайка");
        frame.setLayout(null);
        frame.setVisible(true);
    }

}


