package javaapplication13;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sameh
 */
public class TechTask 
{
    private String tech;
    private boolean ava;
    private String task;

    public TechTask(String tech, boolean ava, String task) {
        this.tech = tech;
        this.ava = ava;
        this.task = task;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public boolean getAva() {
        return ava;
    }

    public void setAva(boolean ava) {
        this.ava = ava;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

  public static ArrayList<TechTask> TechList(){
        try {
            ArrayList<TechTask> list = new ArrayList<TechTask>();
            ResultSet rs =  DatabaseController.select("TECH_TASK");
            TechTask techh;
            while(rs.next())
            {
                techh = new TechTask(rs.getString(1),rs.getBoolean(2),rs.getString(3));
               list.add(techh);
            }
            return list;    
        } catch (SQLException ex) {
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
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
