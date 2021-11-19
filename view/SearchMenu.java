package view;
import static java.lang.Integer.parseInt;

import control.ControlTela;

public class SearchMenu extends TelaBase{
    public SearchMenu(){
        initComponents();
        filteredTable.setVisible(false);
    }
    
    private void initComponents() {
	SearchMenu = new javax.swing.JPanel();
	searchReturn = new javax.swing.JButton();
	searchSelect = new javax.swing.JButton();
	infoLabel1 = new javax.swing.JLabel();
	searchChoice = new javax.swing.JComboBox<>();
	searchChosen = new javax.swing.JTextField();
	filter = new javax.swing.JButton();
	fScrollTable = new javax.swing.JScrollPane();
	filteredTable = new javax.swing.JTable();
    archiveSelected = new javax.swing.JComboBox<>();
    archiveLabel = new javax.swing.JLabel();

	searchReturn.setFont(new java.awt.Font("Dialog", 0, 14));
	searchReturn.setText("VOLTAR");
	searchReturn.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	        searchReturnActionPerformed(evt);}});
	
	searchSelect.setFont(new java.awt.Font("Dialog", 0, 14)); 
	searchSelect.setText("MODIFICA");
	searchSelect.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	        searchSelectActionPerformed(evt);}});
	
	infoLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); 
	infoLabel1.setText("Pesquisar");
	
	searchChoice.setFont(new java.awt.Font("Dialog", 0, 14)); 
	searchChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ano","Mês", "Data Atualizada","Estado", "Area total", "Area desmatada", "Porcentagem reflorestada", "Porcentagem usada industrialmente" }));
	
	searchChosen.setFont(new java.awt.Font("Dialog", 0, 14));
	
	filter.setFont(new java.awt.Font("Dialog", 0, 14)); 
	filter.setText("FILTRAR");
	filter.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterActionPerformed(evt);}});
        
        archiveSelected.setFont(new java.awt.Font("Dialog", 0, 14)); 
        archiveSelected.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "entrada", "QuickSort", "MergeSort" }));
        archiveSelected.addActionListener(new java.awt.event.ActionListener() {
    		public void actionPerformed(java.awt.event.ActionEvent evt) {
    			archiveSelectedActionPerformed(evt);}});
        archiveLabel.setFont(new java.awt.Font("Dialog", 0, 14)); 
        archiveLabel.setText("Arquivo:");
	
	filteredTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Ano da coleta de dados", "Mês da coleta de dados", "Ultima atualização", "Estado", "Area Total(km²)", "Area desmatada(km²)", "Porcentagem reflorestada", "Porcentagem usada industrialmente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        filteredTable.getTableHeader().setReorderingAllowed(false);
        fScrollTable.setViewportView(filteredTable);
        if (filteredTable.getColumnModel().getColumnCount() > 0) {
            filteredTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            filteredTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            filteredTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            filteredTable.getColumnModel().getColumn(3).setPreferredWidth(70);
            filteredTable.getColumnModel().getColumn(4).setPreferredWidth(25);
            filteredTable.getColumnModel().getColumn(5).setPreferredWidth(60);
            filteredTable.getColumnModel().getColumn(6).setPreferredWidth(90);
            filteredTable.getColumnModel().getColumn(7).setPreferredWidth(110);
            filteredTable.getColumnModel().getColumn(8).setPreferredWidth(150);
        }
	
	javax.swing.GroupLayout SearchMenuLayout = new javax.swing.GroupLayout(SearchMenu);
	SearchMenu.setLayout(SearchMenuLayout);
	SearchMenuLayout.setHorizontalGroup(
	    SearchMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    .addGroup(SearchMenuLayout.createSequentialGroup()
                .addContainerGap(307, Short.MAX_VALUE)
                .addComponent(infoLabel1)
                .addContainerGap(307, Short.MAX_VALUE))
            .addGroup(SearchMenuLayout.createSequentialGroup()
                .addComponent(searchChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchChosen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filter, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SearchMenuLayout.createSequentialGroup()
	    .addComponent(searchReturn)
	    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    .addComponent(searchSelect))
	        .addComponent(fScrollTable, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(SearchMenuLayout.createSequentialGroup()
                .addGroup(SearchMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SearchMenuLayout.createSequentialGroup()
                        .addComponent(archiveLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(archiveSelected, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
	        ;
	SearchMenuLayout.setVerticalGroup(
	    SearchMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchMenuLayout.createSequentialGroup()
	    .addGap(25, 25, 25)
	    .addComponent(infoLabel1)
	    .addGap(25, 25, 25)
                .addGroup(SearchMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(archiveSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(archiveLabel))
	    .addGroup(SearchMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	        .addComponent(searchChosen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
	        .addComponent(searchChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	        .addComponent(filter))
	    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	    .addComponent(fScrollTable, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
	    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	    .addGroup(SearchMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	        .addComponent(searchReturn)
	        .addComponent(searchSelect))
	    .addContainerGap(15, Short.MAX_VALUE)));
                
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(SearchMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(SearchMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))));}
    
    private void searchReturnActionPerformed(java.awt.event.ActionEvent evt){
        cl.show(MainPanel, "Menu");
        filteredTable.setVisible(false);
    }                                            

    private void searchSelectActionPerformed(java.awt.event.ActionEvent evt){                                             
        //Botão para selecionar uma informação para atualizar na parte com informações filtradas
    	
        int row = filteredTable.getSelectedRow();
        if(row>=0) {
        	if(archiveSelected.getSelectedIndex()!= 0){
        		ctr.show("Não é possivel modificar os dados do arquivo ordenado.");
        		return;
        	}
        	for(int i = 0; i <9;i++){
                switch(i){
                    case 0:
                        int g = parseInt(filteredTable.getModel().getValueAt(row, i).toString());
                        TelaBase.id = g;
                        break;
                    case 1:
                        String ano = filteredTable.getModel().getValueAt(row, i).toString();
                        TelaBase.ano = ano;
                        break;
                    case 2:
                        String mes = filteredTable.getModel().getValueAt(row, i).toString();
                        TelaBase.mes = mes;
                        break;
                    case 3:
                        String atualizada = filteredTable.getModel().getValueAt(row, i).toString();
                        TelaBase.data_atualizada = atualizada;
                        break;
                    case 4:
                        String estado = filteredTable.getModel().getValueAt(row, i).toString();
                        TelaBase.estado = estado;
                        break;
                    case 5:
                        String areatotal = filteredTable.getModel().getValueAt(row, i).toString();
                        TelaBase.area_total = areatotal;
                        break;
                    case 6:
                        String areades = filteredTable.getModel().getValueAt(row, i).toString();
                        TelaBase.area_desmatada = areades;
                        break;
                    case 7:
                        String porref = filteredTable.getModel().getValueAt(row, i).toString();
                        TelaBase.indice_reflorestamento = porref;
                        break;
                    case 8:
                        String porind = filteredTable.getModel().getValueAt(row, i).toString();
                        TelaBase.indice_industrial = porind;
                        break;  
                }
            }
            cl.show(MainPanel, "UpdateMenu");
            filteredTable.setVisible(false);
        }
    }                                            

    private void filterActionPerformed(java.awt.event.ActionEvent evt) {
        //Botão para salvar a informação e utilizar para adicionar as informações a tabela
        this.setArchiveName(archiveSelected.getItemAt(archiveSelected.getSelectedIndex()));
    	filteredTable.setVisible(true);
        ctr.Search(this);	
    }
     
    private void archiveSelectedActionPerformed(java.awt.event.ActionEvent evt) {
    	javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) getTable().getModel();
    	modelo.setRowCount(0);
    	getTable().setModel(modelo);
    }
    
    private ControlTela ctr = new ControlTela();
    private javax.swing.JPanel SearchMenu;
    private javax.swing.JScrollPane fScrollTable;
    private javax.swing.JButton filter;
    private javax.swing.JTable filteredTable;
    private javax.swing.JLabel infoLabel1;
    private javax.swing.JComboBox<String> searchChoice;
    private javax.swing.JTextField searchChosen;
    private javax.swing.JButton searchReturn;
    private javax.swing.JButton searchSelect;
    private javax.swing.JLabel archiveLabel;
    private javax.swing.JComboBox<String> archiveSelected;

    public String getSearchChoice(){
        return searchChoice.getItemAt(searchChoice.getSelectedIndex());
    }
    public String getSearchChosen(){
        return searchChosen.getText();
    }
    
    public javax.swing.JTable getTable(){
    	return filteredTable;
    }
}