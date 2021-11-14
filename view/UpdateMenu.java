package view;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import control.ControlTela;

public class UpdateMenu extends TelaBase{
    private static Date date = new Date();
    private static LocalDate localDate;
    private static int year;
    private static int month;
    private static int day;
    private String dataPost;
    private ControlTela ctr = new ControlTela();
    
    public UpdateMenu(){
        initComponents();
        updateSave.setVisible(false);
        this.buttonVisible(false);  
    }
    
   private void initComponents() {
        UpdateMenu = new javax.swing.JPanel();
        updateLabel = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        updateStateChoice = new javax.swing.JComboBox<>();
        yearPostedLabel = new javax.swing.JLabel();
        updateYear = new javax.swing.JLabel();
        areaLabel = new javax.swing.JLabel();
        updateArea = new javax.swing.JTextField();
        desmAreaLabel = new javax.swing.JLabel();
        updateAreaDesm = new javax.swing.JTextField();
        porRefloLabel = new javax.swing.JLabel();
        updatePorReflo = new javax.swing.JTextField();
        porIndusLabel = new javax.swing.JLabel();
        updatePorIndus = new javax.swing.JTextField();
        updateSave = new javax.swing.JButton();
        updateReturn = new javax.swing.JButton();
        adicionarInfo = new javax.swing.JButton();
        monthLabel = new javax.swing.JLabel();
        monthChoice = new javax.swing.JComboBox<>();

        updateLabel.setFont(new java.awt.Font("Dialog", 1, 48)); 
        updateLabel.setText("Atualizar");

        stateLabel.setFont(new java.awt.Font("Dialog", 0, 14)); 
        stateLabel.setText("Estado:");

        updateStateChoice.setFont(new java.awt.Font("Dialog", 0, 14));
        updateStateChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do norte", "Rio Grande do sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins", "Distrito Federal" }));

        yearPostedLabel.setFont(new java.awt.Font("Dialog", 0, 14)); 
        yearPostedLabel.setText("Ano em que a coleta de dados foi realizada:");

        updateYear.setFont(new java.awt.Font("Dialog", 0, 14)); 

        areaLabel.setFont(new java.awt.Font("Dialog", 0, 14)); 
        areaLabel.setText("Área total(km²):");

        updateArea.setFont(new java.awt.Font("Dialog", 0, 14)); 

        desmAreaLabel.setFont(new java.awt.Font("Dialog", 0, 14));
        desmAreaLabel.setText("Área desmatada este ano(km²):");

        updateAreaDesm.setFont(new java.awt.Font("Dialog", 0, 14));

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
        adicionarInfo.setFont(new java.awt.Font("Dialog", 0, 14)); 
        adicionarInfo.setText("ADICIONAR");
        adicionarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });
        
        monthLabel.setFont(new java.awt.Font("Dialog", 0, 14)); 
        monthLabel.setText("Mês que a coleta de dados foi realizada:");

        monthChoice.setFont(new java.awt.Font("Dialog", 0, 14)); 
        monthChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));


        javax.swing.GroupLayout CreateMenuLayout = new javax.swing.GroupLayout(UpdateMenu);
        UpdateMenu.setLayout(CreateMenuLayout);
        CreateMenuLayout.setHorizontalGroup(
            CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateMenuLayout.createSequentialGroup()
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateMenuLayout.createSequentialGroup()
                        .addContainerGap(440, Short.MAX_VALUE)
                        .addComponent(updateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 441, Short.MAX_VALUE))
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
                                .addComponent(desmAreaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateAreaDesm))
                            .addGroup(CreateMenuLayout.createSequentialGroup()
                                .addComponent(areaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateArea))
                            .addGroup(CreateMenuLayout.createSequentialGroup()
                                .addComponent(yearPostedLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateYear))))
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
                .addComponent(updateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateStateChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthLabel)
                    .addComponent(monthChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                
                .addGap(18, 18, 18)
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearPostedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desmAreaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateAreaDesm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    	updateSave.setVisible(false);
        this.buttonVisible(false);
    	ctr.Update(this);
    }                                          

    
    private void createReturnActionPerformed(java.awt.event.ActionEvent evt) {
        cl.show(MainPanel, "Menu");
        this.buttonVisible(false);
        adicionarInfo.setVisible(true);
        updateSave.setVisible(false);
    }   
    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        adicionarInfo.setVisible(false);
        updateSave.setVisible(true);
        this.setStateChoice(TelaBase.estado);
        this.setYearPosted(TelaBase.ano);
        localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            year = localDate.getYear();
            month = localDate.getMonthValue();
            day = localDate.getDayOfMonth();
            dataPost = year+"/"+month+"/"+day;
        this.setArea(TelaBase.areaTo);
        this.setAreaDesm(TelaBase.areaDes);
        this.setPorIndus(TelaBase.porInd);
        this.setPorReflo(TelaBase.porRef);
        this.setMonthChoice(TelaBase.mes);
        this.buttonVisible(true);
    }    
      
    private javax.swing.JPanel UpdateMenu;
    private javax.swing.JLabel updateLabel;
    private javax.swing.JButton adicionarInfo;
    private javax.swing.JTextField updateArea;
    private javax.swing.JLabel areaLabel;
    private javax.swing.JLabel updateYear;
    private javax.swing.JLabel yearPostedLabel;
    private javax.swing.JButton updateReturn;
    private javax.swing.JButton updateSave;
    private javax.swing.JTextField updateAreaDesm;
    private javax.swing.JLabel desmAreaLabel;
    private javax.swing.JTextField updatePorIndus;
    private javax.swing.JLabel porIndusLabel;
    private javax.swing.JTextField updatePorReflo;
    private javax.swing.JLabel porRefloLabel;
    private javax.swing.JComboBox<String> updateStateChoice;
    private javax.swing.JLabel stateLabel;    
    private javax.swing.JComboBox<String> monthChoice;
    private javax.swing.JLabel monthLabel;
    
    //Getters  
    public String getStateChoice(){
        return updateStateChoice.getItemAt(updateStateChoice.getSelectedIndex());
    }
    public void setStateChoice(String estado){
        updateStateChoice.setSelectedItem(estado);
    }
    public void setYearPosted(String year){
        updateYear.setText(year);
    }
    public String getYearPosted(){
        return updateYear.getText();}
    
    public String getArea(){
        return updateArea.getText();
    }
    public void setArea(String area){
        updateArea.setText(area);
    }  
    public String getAreaDesm(){
        return updateAreaDesm.getText();
    }
    public void setAreaDesm(String aread){
        updateAreaDesm.setText(aread);
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
    public String getDataPostada(){
        return dataPost;
    }
    
    
    public String getMonthChoice(){
        return monthChoice.getItemAt(monthChoice.getSelectedIndex());
    }
    public void setMonthChoice(String mes){
        monthChoice.setSelectedItem(mes);
    }
    
    private void buttonVisible(boolean botao) {
    	updateStateChoice.setVisible(botao);
    	updatePorReflo.setVisible(botao);
    	updatePorIndus.setVisible(botao);
    	updateAreaDesm.setVisible(botao);
    	updateArea.setVisible(botao);
        monthChoice.setVisible(botao);
        updateYear.setVisible(botao);
    }}