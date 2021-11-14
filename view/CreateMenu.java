package view;

import control.ControlTela;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public class CreateMenu extends TelaBase {
    private static Date date = new Date();
    private static LocalDate localDate;
    private static int year;
    private static int month;
    private static int day;
    private static String dataPost;
    
    
    public CreateMenu() {
        initComponents();
    }
     
    private void initComponents() {
        CreateMenu = new javax.swing.JPanel();
        addLabel = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        stateChoice = new javax.swing.JComboBox<>();
        yearPostedLabel = new javax.swing.JLabel();
        yearPosted = new javax.swing.JTextField();
        areaLabel = new javax.swing.JLabel();
        area = new javax.swing.JTextField();
        desmAreaLabel = new javax.swing.JLabel();
        desmArea = new javax.swing.JTextField();
        porRefloLabel = new javax.swing.JLabel();
        porReflo = new javax.swing.JTextField();
        porIndusLabel = new javax.swing.JLabel();
        porIndus = new javax.swing.JTextField();
        createSave = new javax.swing.JButton();
        createReturn = new javax.swing.JButton();
        monthLabel = new javax.swing.JLabel();
        monthChoice = new javax.swing.JComboBox<>();
       

        addLabel.setFont(new java.awt.Font("Dialog", 1, 48)); 
        addLabel.setText("Adicionar");

        stateLabel.setFont(new java.awt.Font("Dialog", 0, 14)); 
        stateLabel.setText("Estado:");

        stateChoice.setFont(new java.awt.Font("Dialog", 0, 14));
        stateChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do norte", "Rio Grande do sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins", "Distrito Federal" }));

        yearPostedLabel.setFont(new java.awt.Font("Dialog", 0, 14)); 
        yearPostedLabel.setText("Ano em que a coleta de dados foi realizada:");

        yearPosted.setFont(new java.awt.Font("Dialog", 0, 14)); 

        areaLabel.setFont(new java.awt.Font("Dialog", 0, 14)); 
        areaLabel.setText("Área total(km²):");

        area.setFont(new java.awt.Font("Dialog", 0, 14)); 

        desmAreaLabel.setFont(new java.awt.Font("Dialog", 0, 14));
        desmAreaLabel.setText("Área desmatada(km²):");

        desmArea.setFont(new java.awt.Font("Dialog", 0, 14));

        porRefloLabel.setFont(new java.awt.Font("Dialog", 0, 14)); 
        porRefloLabel.setText("Porcentagem reflorestada:");

        porReflo.setFont(new java.awt.Font("Dialog", 0, 14)); 

        porIndusLabel.setFont(new java.awt.Font("Dialog", 0, 14)); 
        porIndusLabel.setText("Porcentagem usada industrialmente:");

        porIndus.setFont(new java.awt.Font("Dialog", 0, 14)); 

        createSave.setFont(new java.awt.Font("Dialog", 0, 14)); 
        createSave.setText("SALVAR");
        createSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSaveActionPerformed(evt);
            }
        });

        createReturn.setFont(new java.awt.Font("Dialog", 0, 14));
        createReturn.setText("VOLTAR");
        createReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createReturnActionPerformed(evt);
            }
        });
        
        monthLabel.setFont(new java.awt.Font("Dialog", 0, 14)); 
        monthLabel.setText("Mês que a coleta de dados foi realizada:");

        monthChoice.setFont(new java.awt.Font("Dialog", 0, 14)); 
        monthChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

       

        javax.swing.GroupLayout CreateMenuLayout = new javax.swing.GroupLayout(CreateMenu);
        CreateMenu.setLayout(CreateMenuLayout);
        CreateMenuLayout.setHorizontalGroup(
            CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateMenuLayout.createSequentialGroup()
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateMenuLayout.createSequentialGroup()
                        .addContainerGap(440, Short.MAX_VALUE)
                        .addComponent(addLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 441, Short.MAX_VALUE))
                    .addGroup(CreateMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CreateMenuLayout.createSequentialGroup()
                                .addComponent(porRefloLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(porReflo))
                            .addGroup(CreateMenuLayout.createSequentialGroup()
                                .addComponent(porIndusLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(porIndus))
                            .addGroup(CreateMenuLayout.createSequentialGroup()
                                .addComponent(desmAreaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(desmArea))
                            .addGroup(CreateMenuLayout.createSequentialGroup()
                                .addComponent(areaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(area))
                            .addGroup(CreateMenuLayout.createSequentialGroup()
                                .addComponent(yearPostedLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(yearPosted))))
                    .addGroup(CreateMenuLayout.createSequentialGroup()
                        .addComponent(createReturn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createSave)))
                .addContainerGap())
            .addGroup(CreateMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stateChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monthLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monthChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            
        );
        CreateMenuLayout.setVerticalGroup(
            CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateMenuLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(addLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthLabel)
                    .addComponent(monthChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearPostedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearPosted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desmAreaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desmArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(porReflo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(porRefloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(porIndusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(porIndus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createSave)
                    .addComponent(createReturn))
                .addContainerGap())
        );
	          
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CreateMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CreateMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }
      
    private void createSaveActionPerformed(java.awt.event.ActionEvent evt) { 
    	if(Verifica()) {
    		localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            year = localDate.getYear();
            month = localDate.getMonthValue();
            day = localDate.getDayOfMonth();
            dataPost = year+"/"+month+"/"+day;
    		ctr.Insert(this);
    		
        }
    }                                          
    
    private void createReturnActionPerformed(java.awt.event.ActionEvent evt) {
        cl.show(MainPanel, "Menu");
    }    
    private ControlTela ctr = new ControlTela();
    private javax.swing.JPanel CreateMenu;
    private javax.swing.JLabel addLabel;
    private javax.swing.JTextField area;
    private javax.swing.JLabel areaLabel;
    private javax.swing.JTextField yearPosted;
    private javax.swing.JLabel yearPostedLabel;
    private javax.swing.JButton createReturn;
    private javax.swing.JButton createSave;
    private javax.swing.JTextField desmArea;
    private javax.swing.JLabel desmAreaLabel;
    private javax.swing.JTextField porIndus;
    private javax.swing.JLabel porIndusLabel;
    private javax.swing.JTextField porReflo;
    private javax.swing.JLabel porRefloLabel;
    private javax.swing.JComboBox<String> stateChoice;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JComboBox<String> monthChoice;
    private javax.swing.JLabel monthLabel;
    
    
    //Getters  
    public String getStateChoice(){
        return stateChoice.getItemAt(stateChoice.getSelectedIndex());
    }
    public String getYearPosted(){
        return yearPosted.getText();
    }
    public String getArea(){
        return area.getText();
    }
    public String getAreaDesm(){
        return desmArea.getText();
    }
    public String getPorIndus(){
        return porIndus.getText();
    }
    public String getPorReflo(){
        return porReflo.getText();
    }  
    public String getDataPostada(){
        return dataPost;
    }
    public String getMonthChoice(){
        return monthChoice.getItemAt(monthChoice.getSelectedIndex());
    }
   
   
    private boolean Verifica() {
    	if(this.getArea()!=null || this.getAreaDesm()!= null || this.getPorIndus()!=null || this.getPorReflo()!=null || this.getYearPosted()!= null ) {
                
    		return true;
                
    	}
    	return false;
    }
}