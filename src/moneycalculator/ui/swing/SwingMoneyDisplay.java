package moneycalculator.ui.swing;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import moneycalculator.ui.MoneyDisplay;

public class SwingMoneyDisplay extends JPanel implements MoneyDisplay  {
    public SwingMoneyDisplay() {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(amount());
        add(currency());
    }
    
    private JLabel currency() {
        return new JLabel("$");
    }
    
    private JLabel amount() {
        return new JLabel("500");
    }
}
