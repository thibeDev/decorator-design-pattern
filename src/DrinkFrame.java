import baseEntities.Coffee;
import baseEntities.Drink;
import baseEntities.Espresso;
import baseEntities.Tea;
import decoratorEntities.Caramel;
import decoratorEntities.Chocolate;
import decoratorEntities.Milk;
import decoratorEntities.Sugar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class DrinkFrame extends JFrame {

    private JButton btnCoffee = new JButton("Coffee");
    private JButton btnTea = new JButton("Tea");
    private JButton btnEspresso = new JButton("Espresso");
    private JButton btnDecoMilk = new JButton("Milk");
    private JButton btnDecoSugar = new JButton("Sugar");
    private JButton btnDecoChocolate = new JButton("Chocolate");
    private JButton btnDecoCaramel = new JButton("Caramel");
    private Drink drink;
    private ArrayList<JButton> drinkList = new ArrayList<>();
    private ArrayList<JButton> decoList = new ArrayList<>();

    private JLabel jLabelDesc = new JLabel("Description: ");
    private JLabel jLabelPrice = new JLabel("Price: ");


    public DrinkFrame() {
        drinkList.add(btnCoffee);
        drinkList.add(btnEspresso);
        drinkList.add(btnTea);
        decoList.add(btnDecoChocolate);
        decoList.add(btnDecoCaramel);
        decoList.add(btnDecoMilk);
        decoList.add(btnDecoSugar);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        JPanel jpNord = new JPanel();
        jpNord.setLayout(new GridLayout(2,1));
        JPanel jpanel1 = new JPanel();
        jpanel1.setLayout(new FlowLayout());

        jpanel1.add(btnCoffee);
        jpanel1.add(btnTea);
        jpanel1.add(btnEspresso);

        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new FlowLayout());

        jPanel2.add(btnDecoMilk);
        jPanel2.add(btnDecoSugar);
        jPanel2.add(btnDecoChocolate);
        jPanel2.add(btnDecoCaramel);

        jpNord.add(jpanel1);
        jpNord.add(jPanel2);

        this.add(jpNord, BorderLayout.NORTH);

        this.setSize(400, 300);

        JPanel jpanelCenter = new JPanel();
        jpanelCenter.setLayout(new FlowLayout());
        jpanelCenter.add(jLabelDesc);
        jpanelCenter.add(jLabelPrice);
        this.add(jpanelCenter, BorderLayout.CENTER);
        this.setVisible(true);
        drinkList.forEach(b -> {
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    switch (b.getText()){
                        case "Coffee":
                            drink = new Coffee();
                            break;
                        case "Tea":
                            drink = new Tea();
                            break;
                        case "Espresso":
                            drink = new Espresso();
                            break;
                    }
                    jLabelDesc.setText(drink.getDescription());
                    jLabelPrice.setText(String.valueOf(drink.getPrice()));
                }
            });
        });
        decoList.forEach(d ->{
            d.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    switch (d.getText()){
                        case "Chocolate":
                            drink = new Chocolate(drink);
                            break;
                        case "Caramel":
                            drink = new Caramel(drink);
                            break;
                        case "Milk":
                            drink = new Milk(drink);
                            break;
                        case "Sugar":
                            drink = new Sugar(drink);
                            break;
                    }
                    jLabelDesc.setText(drink.getDescription());
                    jLabelPrice.setText(String.valueOf(drink.getPrice()));
                }
            });
        });
    }
}
