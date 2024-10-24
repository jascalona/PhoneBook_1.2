package phonebook;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Img_table extends DefaultTableCellRenderer{
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object o, boolean isSelected, 
            boolean hasFocus, int row, int column) {
        if(o instanceof JTable){
            JLabel lbl = (JLabel)o;
            return lbl;
        }
        
        return super.getTableCellRendererComponent(table, o, isSelected, hasFocus, row, column); 
    }
    
    
}
