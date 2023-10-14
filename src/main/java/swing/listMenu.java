package swing;

import event.eventCallBack;
import event.eventSelected;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import model.model_menu;

public class listMenu<E extends Object> extends JList<E> {

    public void addEventSelectedMenu(eventSelected event) {
        events.add(event);
    }

    private final DefaultListModel model;
    private final List<eventSelected> events;
    private int selectedIndex = -1;

    public listMenu() {
        model = new DefaultListModel();
        events = new ArrayList<>();
        super.setModel(model);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    int index = locationToIndex(me.getPoint());
                    Object obj = model.getElementAt(index);
                    if (obj instanceof model_menu) {
                        model_menu data = (model_menu) obj;
                        if (data.getType() == model_menu.MenuType.MENU) {
                            if (index != selectedIndex) {
                                selectedIndex = -1;
                                runEvent(index);
                            }
                        }
                    } else {
                        if (index != selectedIndex) {
                            selectedIndex = -1;
                            runEvent(index);
                        }
                    }
                }
            }
        });
    }

    private void runEvent(int indexChange) {
        for (eventSelected event : events) {
            event.menuSelected(indexChange, new eventCallBack() {
                @Override
                public void call(int index) {
                    //  This call back event run when animation done
                    selectedIndex = index;
                    repaint();
                }
            });
        }
    }

@Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus) {
                model_menu data;
                if (o instanceof model_menu) {
                    data = (model_menu) o;
                } else {
                    data = new model_menu("1", o + "", model_menu.MenuType.MENU);
                }
                menuItem item = new menuItem(data);
                item.setSelected(index == selectedIndex);
                return item;
            }

        };
    }

   @Override
    public void setModel(ListModel<E> lm) {
        for (int i = 0; i < lm.getSize(); i++) {
            model.addElement(lm.getElementAt(i));
        }
    }

    public void addItem(model_menu data) {
        model.addElement(data);
    }
}
