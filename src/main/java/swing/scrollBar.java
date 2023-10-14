
package swing;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;


public class scrollBar extends JScrollBar {
    
    public scrollBar() {
        setUI(new modernScrollBar());
        setPreferredSize(new Dimension(5, 5));
        setBackground(new Color(242, 242, 242));
        setUnitIncrement(20);
    }
    
}
