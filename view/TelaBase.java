package view;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class TelaBase extends javax.swing.JPanel {
    protected String archiveName;
    protected static int id = 0;
    protected static String nome = "";
    protected static String ano = "";
    protected static String atualizada = "";
    protected static String estado = "";
    protected static String areaTo = "";
    protected static String areaDes = "";
    protected static String porRef = "";
    protected static String porInd = "";
    protected static javax.swing.JPanel MainPanel;
    protected static CardLayout cl;
    
    public void setArchiveName(String archive){
        this.archiveName = archive;
    }
    public String getArchiveName(){
        return archiveName;
    }
    public void setCard(CardLayout cl, JPanel Main){
        TelaBase.cl = cl;
        TelaBase.MainPanel = Main;
    }
    
    
    
}