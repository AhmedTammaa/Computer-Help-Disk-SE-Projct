package javaapplication13;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tammaa
 */
public class Table {
    private DefaultTableModel model;
    
     public Table(DefaultTableModel m){
         model = m;
     }
     void setModel(DefaultTableModel m){
         model = m;
     }
     public static void fillRequest(DefaultTableModel m){
        ArrayList<Request> list = Request.requestList();
         
        Object[] row = new Object[6];
        for (Request itr : list) {
            row[0] = itr.getUserID();
            row[1] = itr.getItemID();
            row[2] = itr.getPcsCnt();
            m.addRow(row);
        }
        
     }
     public static void fillTech(DefaultTableModel m){
        ArrayList<TechTask> list = TechTask.TechList();
         
        Object[] row = new Object[6];
        for (TechTask itr : list) {
            row[0] = itr.getTech();
            row[1] = itr.getAva();
            row[2] = itr.getTask();
            m.addRow(row);
        }
     }
    
}
