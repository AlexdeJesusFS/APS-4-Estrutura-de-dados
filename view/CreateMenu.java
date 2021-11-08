
public class CreateMenu extends TelaBase {
    
    
    public CreateMenu() {
        initComponents();
    }
     
    private void initComponents() {
        CreateMenu = new javax.swing.JPanel();
        addLabel = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        stateChoice = new javax.swing.JComboBox<>();
        areaNameLabel = new javax.swing.JLabel();
        areaName = new javax.swing.JTextField();
        areaLabel = new javax.swing.JLabel();
        area = new javax.swing.JTextField();
        defAreaLabel = new javax.swing.JLabel();
        defArea = new javax.swing.JTextField();
        porRefloLabel = new javax.swing.JLabel();
        porReflo = new javax.swing.JTextField();
        porIndusLabel = new javax.swing.JLabel();
        porIndus = new javax.swing.JTextField();
        createSave = new javax.swing.JButton();
        createReturn = new javax.swing.JButton();
        yearLabel = new javax.swing.JLabel();
        year = new javax.swing.JTextField();

        addLabel.setFont(new java.awt.Font("Dialog", 1, 48)); 
        addLabel.setText("Adicionar");

        stateLabel.setFont(new java.awt.Font("Dialog", 0, 14)); 
        stateLabel.setText("Estado:");

        stateChoice.setFont(new java.awt.Font("Dialog", 0, 14));
        stateChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauá", "Rio de Janeiro", "Rio Grande do norte", "Rio Grande do sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins", "Distrito Federal" }));

        areaNameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); 
        areaNameLabel.setText("Nome da área:");

        areaName.setFont(new java.awt.Font("Dialog", 0, 14)); 

        areaLabel.setFont(new java.awt.Font("Dialog", 0, 14)); 
        areaLabel.setText("área total(km²):");

        area.setFont(new java.awt.Font("Dialog", 0, 14)); 

        defAreaLabel.setFont(new java.awt.Font("Dialog", 0, 14));
        defAreaLabel.setText("área desmatada este ano(km²):");

        defArea.setFont(new java.awt.Font("Dialog", 0, 14));

        porRefloLabel.setFont(new java.awt.Font("Dialog", 0, 14)); 
        porRefloLabel.setText("Porcentagem anual de reflorestamento:");

        porReflo.setFont(new java.awt.Font("Dialog", 0, 14)); 

        porIndusLabel.setFont(new java.awt.Font("Dialog", 0, 14)); 
        porIndusLabel.setText("Porcentagem anual usada industrialmente:");

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
        
        yearLabel.setFont(new java.awt.Font("Dialog", 0, 14));
        yearLabel.setText("Ano que os dados foram recolhidos:");

        year.setFont(new java.awt.Font("Dialog", 0, 14)); 

        javax.swing.GroupLayout CreateMenuLayout = new javax.swing.GroupLayout(CreateMenu);
        CreateMenu.setLayout(CreateMenuLayout);
        CreateMenuLayout.setHorizontalGroup(
            CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateMenuLayout.createSequentialGroup()
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateMenuLayout.createSequentialGroup()
                        .addContainerGap(340, Short.MAX_VALUE)
                        .addComponent(addLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 341, Short.MAX_VALUE))
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
                                .addComponent(defAreaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(defArea))
                            .addGroup(CreateMenuLayout.createSequentialGroup()
                                .addComponent(areaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(area))
                            .addGroup(CreateMenuLayout.createSequentialGroup()
                                .addComponent(areaNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(areaName))))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(CreateMenuLayout.createSequentialGroup()
                                .addComponent(yearLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(year))
        );
        CreateMenuLayout.setVerticalGroup(
            CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateMenuLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(addLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                    .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearLabel)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defAreaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGap(0, 900, Short.MAX_VALUE)
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
    }                                          

    
    private void createReturnActionPerformed(java.awt.event.ActionEvent evt) {
        cl.show(MainPanel, "Menu");
    }    
      
    private javax.swing.JPanel CreateMenu;
    private javax.swing.JLabel addLabel;
    private javax.swing.JTextField area;
    private javax.swing.JLabel areaLabel;
    private javax.swing.JTextField areaName;
    private javax.swing.JLabel areaNameLabel;
    private javax.swing.JButton createReturn;
    private javax.swing.JButton createSave;
    private javax.swing.JTextField defArea;
    private javax.swing.JLabel defAreaLabel;
    private javax.swing.JTextField porIndus;
    private javax.swing.JLabel porIndusLabel;
    private javax.swing.JTextField porReflo;
    private javax.swing.JLabel porRefloLabel;
    private javax.swing.JComboBox<String> stateChoice;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JTextField year;
    private javax.swing.JLabel yearLabel;    
    
    //Getters  
    public String getStateChoice(){
        return stateChoice.getItemAt(stateChoice.getSelectedIndex());
    }
    public String getAreaName(){
        return areaName.getText();
    }
    public String getArea(){
        return area.getText();
    }
    public String getAreaDesm(){
        return defArea.getText();
    }
    public String getPorIndus(){
        return porIndus.getText();
    }
    public String getPorReflo(){
        return porReflo.getText();
    }  
}