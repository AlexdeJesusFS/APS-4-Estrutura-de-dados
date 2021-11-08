

public class UpdateMenu extends TelaBase{
    
    public UpdateMenu(){
        initComponents();
        updateSave.setVisible(false);
    }
   private void initComponents() {
        UpdateMenu = new javax.swing.JPanel();
        updateLabel = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        updateStateChoice = new javax.swing.JComboBox<>();
        areaNameLabel = new javax.swing.JLabel();
        updateAreaName = new javax.swing.JTextField();
        areaLabel = new javax.swing.JLabel();
        updateArea = new javax.swing.JTextField();
        defAreaLabel = new javax.swing.JLabel();
        updateDefArea = new javax.swing.JTextField();
        porRefloLabel = new javax.swing.JLabel();
        updatePorReflo = new javax.swing.JTextField();
        porIndusLabel = new javax.swing.JLabel();
        updatePorIndus = new javax.swing.JTextField();
        updateSave = new javax.swing.JButton();
        updateReturn = new javax.swing.JButton();
        adicionarInfo = new javax.swing.JButton();

        updateLabel.setFont(new java.awt.Font("Dialog", 1, 48)); 
        updateLabel.setText("Atualizar");

        stateLabel.setFont(new java.awt.Font("Dialog", 0, 14)); 
        stateLabel.setText("Estado:");

        updateStateChoice.setFont(new java.awt.Font("Dialog", 0, 14));
        updateStateChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauá", "Rio de Janeiro", "Rio Grande do norte", "Rio Grande do sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins", "Distrito Federal" }));

        areaNameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); 
        areaNameLabel.setText("Nome da área:");

        updateAreaName.setFont(new java.awt.Font("Dialog", 0, 14)); 

        areaLabel.setFont(new java.awt.Font("Dialog", 0, 14)); 
        areaLabel.setText("área total(km²):");

        updateArea.setFont(new java.awt.Font("Dialog", 0, 14)); 

        defAreaLabel.setFont(new java.awt.Font("Dialog", 0, 14));
        defAreaLabel.setText("área desmatada este ano(km²):");

        updateDefArea.setFont(new java.awt.Font("Dialog", 0, 14));

        porRefloLabel.setFont(new java.awt.Font("Dialog", 0, 14)); 
        porRefloLabel.setText("Porcentagem anual de reflorestamento:");

        updatePorReflo.setFont(new java.awt.Font("Dialog", 0, 14)); 

        porIndusLabel.setFont(new java.awt.Font("Dialog", 0, 14)); 
        porIndusLabel.setText("Porcentagem anual usada industrialmente:");

        updatePorIndus.setFont(new java.awt.Font("Dialog", 0, 14)); 

        updateSave.setFont(new java.awt.Font("Dialog", 0, 14)); 
        updateSave.setText("SALVAR");
        updateSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSaveActionPerformed(evt);
            }
        });

        updateReturn.setFont(new java.awt.Font("Dialog", 0, 14));
        updateReturn.setText("VOLTAR");
        updateReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createReturnActionPerformed(evt);
            }
        });
        adicionarInfo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        adicionarInfo.setText("ADICIONAR");
        adicionarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CreateMenuLayout = new javax.swing.GroupLayout(UpdateMenu);
        UpdateMenu.setLayout(CreateMenuLayout);
        CreateMenuLayout.setHorizontalGroup(
            CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateMenuLayout.createSequentialGroup()
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateMenuLayout.createSequentialGroup()
                        .addContainerGap(340, Short.MAX_VALUE)
                        .addComponent(updateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 341, Short.MAX_VALUE))
                    .addGroup(CreateMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CreateMenuLayout.createSequentialGroup()
                                .addComponent(porRefloLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updatePorReflo))
                            .addGroup(CreateMenuLayout.createSequentialGroup()
                                .addComponent(porIndusLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updatePorIndus))
                            .addGroup(CreateMenuLayout.createSequentialGroup()
                                .addComponent(defAreaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateDefArea))
                            .addGroup(CreateMenuLayout.createSequentialGroup()
                                .addComponent(areaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateArea))
                            .addGroup(CreateMenuLayout.createSequentialGroup()
                                .addComponent(areaNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateAreaName))))
                    .addGroup(CreateMenuLayout.createSequentialGroup()
                        .addComponent(updateReturn)
                        .addGap(303, 303, 303)
                        .addComponent(adicionarInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateSave)))
                .addContainerGap())
            .addGroup(CreateMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateStateChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CreateMenuLayout.setVerticalGroup(
            CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateMenuLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(updateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateStateChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateAreaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defAreaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateDefArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatePorReflo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(porRefloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(porIndusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatePorIndus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateSave)
                    .addComponent(updateReturn)
                    .addComponent(adicionarInfo))
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
                    .addComponent(UpdateMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(UpdateMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }
      
    private void createSaveActionPerformed(java.awt.event.ActionEvent evt) {          
    	adicionarInfo.setVisible(true);
    	
    }                                          

    
    private void createReturnActionPerformed(java.awt.event.ActionEvent evt) {
        cl.show(MainPanel, "Menu");
    }   
    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        adicionarInfo.setVisible(false);
        updateSave.setVisible(true);
        this.setStateChoice(TelaBase.estado);
        this.setAreaName(TelaBase.nome);
        this.setArea(TelaBase.areaTo);
        this.setAreaDef(TelaBase.areaDes);
        this.setPorIndus(TelaBase.porInd);
        this.setPorReflo(TelaBase.porRef);
    }    
      
    private javax.swing.JPanel UpdateMenu;
    private javax.swing.JLabel updateLabel;
    private javax.swing.JButton adicionarInfo;
    private javax.swing.JTextField updateArea;
    private javax.swing.JLabel areaLabel;
    private javax.swing.JTextField updateAreaName;
    private javax.swing.JLabel areaNameLabel;
    private javax.swing.JButton updateReturn;
    private javax.swing.JButton updateSave;
    private javax.swing.JTextField updateDefArea;
    private javax.swing.JLabel defAreaLabel;
    private javax.swing.JTextField updatePorIndus;
    private javax.swing.JLabel porIndusLabel;
    private javax.swing.JTextField updatePorReflo;
    private javax.swing.JLabel porRefloLabel;
    private javax.swing.JComboBox<String> updateStateChoice;
    private javax.swing.JLabel stateLabel;    
    
    //Getters  
    public String getStateChoice(){
        return updateStateChoice.getItemAt(updateStateChoice.getSelectedIndex());
    }
    public void setStateChoice(String estado){
        updateStateChoice.setSelectedItem(estado);
    }
    
    public String getAreaName(){
        return updateAreaName.getText();
    }
    public void setAreaName(String nome){
        updateAreaName.setText(nome);
    }
    
    public String getArea(){
        return updateAreaName.getText();
    }
    public void setArea(String area){
        updateArea.setText(area);
    }
    
    public String getAreaDef(){
        return updateDefArea.getText();
    }
    public void setAreaDef(String aread){
        updateDefArea.setText(aread);
    }
    
    public String getPorIndus(){
        return updatePorIndus.getText();
    }
    public void setPorIndus(String porInd){
        updatePorIndus.setText(porInd);}
    
    public String getPorReflo(){
        return updatePorReflo.getText();
    }  
    public void setPorReflo(String porRef){
        updatePorReflo.setText(porRef);
    }
}