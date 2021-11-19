package view;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class TelaBase extends javax.swing.JPanel {
    protected String archiveName;
    protected static int id = 0;
    protected static String ano = "";
    protected static String mes = "";
    protected static String data_atualizada = "";
    protected static String estado = "";
    protected static String area_total = "";
    protected static String area_desmatada = "";
    protected static String indice_reflorestamento = "";
    protected static String indice_industrial = "";
    protected static javax.swing.JPanel MainPanel;
    protected static CardLayout cl;
    
    public void setArchiveName(String archive){
        this.archiveName = archive;
    }
    public String getArchiveName(){
        return archiveName;
    }
    
    public int getID() {
    	return id;
    }
    
    public void setCard(CardLayout cl, JPanel Main){
        TelaBase.cl = cl;
        TelaBase.MainPanel = Main;
    }
    
    
    
}