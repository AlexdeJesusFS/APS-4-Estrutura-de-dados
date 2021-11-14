package view;

import static java.lang.Integer.parseInt;

import control.ControlTela;

public class TableMenu extends TelaBase {
	
	
    public TableMenu() {
        initComponents();
        table.setVisible(false);
    } 
    
    private void initComponents() {
	TableMenu = new javax.swing.JPanel();
	tableScroll = new javax.swing.JScrollPane();
	table = new javax.swing.JTable();
	infoLabel = new javax.swing.JLabel();
	infoReturn = new javax.swing.JButton();
	select = new javax.swing.JButton();
        archiveSelected = new javax.swing.JComboBox<>();
        listAddInfo = new javax.swing.JButton();
        archiveLabel = new javax.swing.JLabel();
	       
        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.getTableHeader().setReorderingAllowed(false);
        tableScroll.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(20);
            table.getColumnModel().getColumn(1).setPreferredWidth(100);
            table.getColumnModel().getColumn(2).setPreferredWidth(100);
            table.getColumnModel().getColumn(3).setPreferredWidth(70);
            table.getColumnModel().getColumn(4).setPreferredWidth(25);
            table.getColumnModel().getColumn(5).setPreferredWidth(60);
            table.getColumnModel().getColumn(6).setPreferredWidth(90);
            table.getColumnModel().getColumn(7).setPreferredWidth(110);
            table.getColumnModel().getColumn(8).setPreferredWidth(150);
        }
        
        table.setToolTipText("");
        
	
	        infoLabel.setFont(new java.awt.Font("Dialog", 1, 48)); 
	        infoLabel.setText("Informações");
	
	        infoReturn.setFont(new java.awt.Font("Dialog", 0, 14)); 
	        infoReturn.setText("VOLTAR");
	        infoReturn.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                infoReturnActionPerformed(evt);
	            }
	        });
	
	        select.setFont(new java.awt.Font("Dialog", 0, 14)); 
	        select.setText("SELECT");
	        select.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                selectActionPerformed(evt);
	            }
	        });
                
                archiveSelected.setFont(new java.awt.Font("Dialog", 0, 14)); 
                archiveSelected.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "entrada", "QuickSort", "MergeSort"}));

                listAddInfo.setFont(new java.awt.Font("Dialog", 0, 14)); 
                listAddInfo.setText("SELECIONAR");
                listAddInfo.addActionListener(new java.awt.event.ActionListener() {
    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
    	                listAddInfoActionPerformed(evt);
    	            }
    	        });

                archiveLabel.setFont(new java.awt.Font("Dialog", 0, 14)); 
                archiveLabel.setText("Arquivo:");
	
	        javax.swing.GroupLayout TableMenuLayout = new javax.swing.GroupLayout(TableMenu);
	        TableMenu.setLayout(TableMenuLayout);
	        TableMenuLayout.setHorizontalGroup(
	            TableMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(TableMenuLayout.createSequentialGroup()
	                .addContainerGap(307, Short.MAX_VALUE)
	                .addComponent(infoLabel)
	                .addContainerGap(307, Short.MAX_VALUE))
	            .addComponent(tableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
	            .addGroup(TableMenuLayout.createSequentialGroup()
	                .addComponent(infoReturn)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(select))
                    .addGroup(TableMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(archiveLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(archiveSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listAddInfo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        TableMenuLayout.setVerticalGroup(
	            TableMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TableMenuLayout.createSequentialGroup()
	                .addGap(36, 36, 36)
	                .addComponent(infoLabel)
	                .addGap(25, 25, 25)
                        .addGroup(TableMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(archiveSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listAddInfo)
                            .addComponent(archiveLabel))
	                .addComponent(tableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addGroup(TableMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(infoReturn)
	                    .addComponent(select))
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
                    .addComponent(TableMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TableMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );}
    
    private void infoReturnActionPerformed(java.awt.event.ActionEvent evt) {
        cl.show(MainPanel, "Menu");
        table.setVisible(false);
    }
    private void listAddInfoActionPerformed(java.awt.event.ActionEvent evt) {
    	this.setArchiveName(archiveSelected.getItemAt(archiveSelected.getSelectedIndex()));
        ctr.Read(this);
        table.setVisible(true);
    }

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {                                       
        //Botão para selecionar uma informação para atualizar na parte com todas informações
        int row = table.getSelectedRow();
        if(row>=0) {
        	for(int i = 0; i <9;i++){
                switch(i){
                    case 0:
                        int id = parseInt(table.getModel().getValueAt(row, i).toString());
                        TelaBase.id = id;
                        break;
                    case 1:
                        String ano = table.getModel().getValueAt(row, i).toString();
                        TelaBase.ano = ano;
                        break;
                    case 2:
                        String mes = table.getModel().getValueAt(row, i).toString();
                        TelaBase.mes = mes;
                        break;
                    case 3:
                        String atualizada = table.getModel().getValueAt(row, i).toString();
                        TelaBase.atualizada = atualizada;
                        break;
                    case 4:
                        String estado = table.getModel().getValueAt(row, i).toString();
                        TelaBase.estado = estado;
                        break;
                    case 5:
                        String areatotal = table.getModel().getValueAt(row, i).toString();
                        TelaBase.areaTo = areatotal;
                        break;
                    case 6:
                        String areades = table.getModel().getValueAt(row, i).toString();
                        TelaBase.areaDes = areades;
                        break;
                    case 7:
                        String porref = table.getModel().getValueAt(row, i).toString();
                        TelaBase.porRef = porref;
                        break;
                    case 8:
                        String porind = table.getModel().getValueAt(row, i).toString();
                        TelaBase.porInd = porind;
                        break;
                }
            }
            cl.show(MainPanel, "UpdateMenu");
            table.setVisible(false);
        }
    }            
    
    public javax.swing.JTable getTable(){
    	return table;
    }
    
    private ControlTela ctr = new ControlTela();
    private javax.swing.JPanel TableMenu;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JButton infoReturn;
    private javax.swing.JButton select;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JLabel archiveLabel;
    private javax.swing.JComboBox<String> archiveSelected;
    private javax.swing.JButton listAddInfo;
}