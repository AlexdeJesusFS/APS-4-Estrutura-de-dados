package view;

import java.awt.CardLayout;

public class TelaAPS extends javax.swing.JFrame {
    //Objeto que deposita e torna possivel mudar as telas
    CardLayout cl;
    
    public TelaAPS() {
        initComponents();
        cl = (CardLayout) MainPanel.getLayout();}
                       
    private void initComponents() {
    	//Instancia todos objetos v
	        MainPanel = new javax.swing.JPanel();
	        Menu = new javax.swing.JPanel();
	        menuLabel = new javax.swing.JLabel();
	        create = new javax.swing.JButton();
	        apagar = new javax.swing.JButton();
	        openList = new javax.swing.JButton();
	        search = new javax.swing.JButton();
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
	        TableMenu = new javax.swing.JPanel();
	        tableScroll = new javax.swing.JScrollPane();
	        table = new javax.swing.JTable();
	        infoLabel = new javax.swing.JLabel();
	        infoReturn = new javax.swing.JButton();
	        select = new javax.swing.JButton();
	        SearchMenu = new javax.swing.JPanel();
	        searchReturn = new javax.swing.JButton();
	        searchSelect = new javax.swing.JButton();
	        infoLabel1 = new javax.swing.JLabel();
	        searchChoice = new javax.swing.JComboBox<>();
	        searchChosen = new javax.swing.JTextField();
	        filter = new javax.swing.JButton();
	        fScrollTable = new javax.swing.JScrollPane();
	        filteredTable = new javax.swing.JTable();
	        UpdateMenu = new javax.swing.JPanel();
	        updateLabel = new javax.swing.JLabel();
	        stateLabel1 = new javax.swing.JLabel();
	        updateStateChoice = new javax.swing.JComboBox<>();
	        areaNameLabel1 = new javax.swing.JLabel();
	        updateAreaName = new javax.swing.JTextField();
	        areaLabel1 = new javax.swing.JLabel();
	        updateArea = new javax.swing.JTextField();
	        defAreaLabel1 = new javax.swing.JLabel();
	        updateDefArea = new javax.swing.JTextField();
	        porRefloLabel1 = new javax.swing.JLabel();
	        updatePorReflo = new javax.swing.JTextField();
	        porIndusLabel1 = new javax.swing.JLabel();
	        updatePorIndus = new javax.swing.JTextField();
	        update = new javax.swing.JButton();
	        updateReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //Tela do menu principal v
	        MainPanel.setLayout(new java.awt.CardLayout());
	
	        menuLabel.setFont(new java.awt.Font("Dialog", 1, 48)); 
	        menuLabel.setText("Menu");
	
	        create.setFont(new java.awt.Font("Dialog", 0, 14)); 
	        create.setText("CREATE");
	        create.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                createActionPerformed(evt);
	            }
	        });
	
	        apagar.setFont(new java.awt.Font("Dialog", 0, 14));
	        apagar.setText("DELETE");
	
	        openList.setFont(new java.awt.Font("Dialog", 0, 14)); 
	        openList.setText("LIST");
	        openList.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                openListActionPerformed(evt);
	            }
	        });
	
	        search.setFont(new java.awt.Font("Dialog", 0, 14));
	        search.setText("SEARCH");
	        search.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                searchActionPerformed(evt);
	            }
	        });
	
	        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
	        Menu.setLayout(MenuLayout);
	        MenuLayout.setHorizontalGroup(
	            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(create, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addComponent(apagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addComponent(openList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addGroup(MenuLayout.createSequentialGroup()
	                .addContainerGap(387, Short.MAX_VALUE)
	                .addComponent(menuLabel)
	                .addContainerGap(387, Short.MAX_VALUE))
	            .addComponent(search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        MenuLayout.setVerticalGroup(
	            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(MenuLayout.createSequentialGroup()
	                .addGap(36, 36, 36)
	                .addComponent(menuLabel)
	                .addGap(32, 32, 32)
	                .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(openList, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        MainPanel.add(Menu, "Menu");

        //Tela para adicionar dados v
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
	        );
	        CreateMenuLayout.setVerticalGroup(
	            CreateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(CreateMenuLayout.createSequentialGroup()
	                .addGap(36, 36, 36)
	                .addComponent(addLabel)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
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
	        MainPanel.add(CreateMenu, "CreateMenu");

        //Tabela com todos os dados v
	        table.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {
	                {null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null}
	            },
	            new String [] {
	                "Nome da área", "Data postada", "Ultima vez atualizado", "Estado", "Area Total(km²)", "Area desmatada(km²)", "Porcentagem reflorestada", "Porcentagem usada industrialmente"
	            }
	        ) {
	            Class[] types = new Class [] {
	                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
	            };
	            boolean[] canEdit = new boolean [] {
	                false, false, false, false, false, false, false, false
	            };
	
	            public Class getColumnClass(int columnIndex) {
	                return types [columnIndex];
	            }
	
	            public boolean isCellEditable(int rowIndex, int columnIndex) {
	                return canEdit [columnIndex];
	            }
	        });
	        table.setToolTipText("");
	        table.getTableHeader().setReorderingAllowed(false);
	        tableScroll.setViewportView(table);
	
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
	
	        javax.swing.GroupLayout TableMenuLayout = new javax.swing.GroupLayout(TableMenu);
	        TableMenu.setLayout(TableMenuLayout);
	        TableMenuLayout.setHorizontalGroup(
	            TableMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(TableMenuLayout.createSequentialGroup()
	                .addContainerGap(307, Short.MAX_VALUE)
	                .addComponent(infoLabel)
	                .addContainerGap(307, Short.MAX_VALUE))
	            .addComponent(tableScroll)
	            .addGroup(TableMenuLayout.createSequentialGroup()
	                .addComponent(infoReturn)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(select))
	        );
	        TableMenuLayout.setVerticalGroup(
	            TableMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TableMenuLayout.createSequentialGroup()
	                .addGap(36, 36, 36)
	                .addComponent(infoLabel)
	                .addGap(35, 35, 35)
	                .addComponent(tableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addGroup(TableMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(infoReturn)
	                    .addComponent(select))
	                .addContainerGap())
	        );
	        MainPanel.add(TableMenu, "TableMenu");

        //Tela para pesquisar dados v
	        searchReturn.setFont(new java.awt.Font("Dialog", 0, 14));
	        searchReturn.setText("VOLTAR");
	        searchReturn.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                searchReturnActionPerformed(evt);
	            }
	        });
	
	        searchSelect.setFont(new java.awt.Font("Dialog", 0, 14)); 
	        searchSelect.setText("SELECT");
	        searchSelect.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                searchSelectActionPerformed(evt);
	            }
	        });
	
	        infoLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); 
	        infoLabel1.setText("Informações");
	
	        searchChoice.setFont(new java.awt.Font("Dialog", 0, 14)); 
	        searchChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Estado", "Area total", "Area desmatada", "Porcentagem reflorestada", "Porcentagem usada industrialmente" }));
	
	        searchChosen.setFont(new java.awt.Font("Dialog", 0, 14));
	
	        filter.setFont(new java.awt.Font("Dialog", 0, 14)); 
	        filter.setText("FILTRAR");
	        filter.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                filterActionPerformed(evt);
	            }
	        });
	
	        filteredTable.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {
	                {null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null, null}
	            },
	            new String [] {
	                "Nome da área", "Data postada", "Ultima vez atualizado", "Estado", "Area Total(km²)", "Area desmatada(km²)", "Porcentagem reflorestada", "Porcentagem usada industrialmente"
	            }
	        ) {
	            Class[] types = new Class [] {
	                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
	            };
	            boolean[] canEdit = new boolean [] {
	                false, false, false, false, false, false, false, false
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
	            .addComponent(fScrollTable, javax.swing.GroupLayout.Alignment.TRAILING)
	        );
	        SearchMenuLayout.setVerticalGroup(
	            SearchMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchMenuLayout.createSequentialGroup()
	                .addGap(25, 25, 25)
	                .addComponent(infoLabel1)
	                .addGap(25, 25, 25)
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
	                .addContainerGap(15, Short.MAX_VALUE))
	        );
	        MainPanel.add(SearchMenu, "SearchMenu");
        
        
        //Tela para atualizar dados v
	        updateLabel.setFont(new java.awt.Font("Dialog", 1, 48));
	        updateLabel.setText("Atualizar");
	
	        stateLabel1.setFont(new java.awt.Font("Dialog", 0, 14));
	        stateLabel1.setText("Estado:");
	
	        updateStateChoice.setFont(new java.awt.Font("Dialog", 0, 14));
	        updateStateChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do norte", "Rio Grande do sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins", "Distrito Federal" }));
	
	        areaNameLabel1.setFont(new java.awt.Font("Dialog", 0, 14));
	        areaNameLabel1.setText("Nome da área:");
	
	        updateAreaName.setFont(new java.awt.Font("Dialog", 0, 14));
	
	        areaLabel1.setFont(new java.awt.Font("Dialog", 0, 14));
	        areaLabel1.setText("Área total(km²):");
	
	        updateArea.setFont(new java.awt.Font("Dialog", 0, 14));
	
	        defAreaLabel1.setFont(new java.awt.Font("Dialog", 0, 14));
	        defAreaLabel1.setText("Área desmatada este ano(km²):");
	
	        updateDefArea.setFont(new java.awt.Font("Dialog", 0, 14));
	
	        porRefloLabel1.setFont(new java.awt.Font("Dialog", 0, 14));
	        porRefloLabel1.setText("Porcentagem anual de reflorestamento:");
	
	        updatePorReflo.setFont(new java.awt.Font("Dialog", 0, 14));
	
	        porIndusLabel1.setFont(new java.awt.Font("Dialog", 0, 14));
	        porIndusLabel1.setText("Porcentagem anual usada industrialmente:");
	
	        updatePorIndus.setFont(new java.awt.Font("Dialog", 0, 14));
	
	        update.setFont(new java.awt.Font("Dialog", 0, 14));
	        update.setText("ATUALIZAR");
	        update.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                updateActionPerformed(evt);
	            }
	        });
	
	        updateReturn.setFont(new java.awt.Font("Dialog", 0, 14));
	        updateReturn.setText("VOLTAR");
	        updateReturn.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                updateReturnActionPerformed(evt);
	            }
	        });
	
	        javax.swing.GroupLayout UpdateMenuLayout = new javax.swing.GroupLayout(UpdateMenu);
	        UpdateMenu.setLayout(UpdateMenuLayout);
	        UpdateMenuLayout.setHorizontalGroup(
	            UpdateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(UpdateMenuLayout.createSequentialGroup()
	                .addGroup(UpdateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateMenuLayout.createSequentialGroup()
	                        .addContainerGap(349, Short.MAX_VALUE)
	                        .addComponent(updateLabel)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, Short.MAX_VALUE))
	                    .addGroup(UpdateMenuLayout.createSequentialGroup()
	                        .addContainerGap()
	                        .addGroup(UpdateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(UpdateMenuLayout.createSequentialGroup()
	                                .addComponent(porRefloLabel1)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(updatePorReflo))
	                            .addGroup(UpdateMenuLayout.createSequentialGroup()
	                                .addComponent(porIndusLabel1)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(updatePorIndus))
	                            .addGroup(UpdateMenuLayout.createSequentialGroup()
	                                .addComponent(defAreaLabel1)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(updateDefArea))
	                            .addGroup(UpdateMenuLayout.createSequentialGroup()
	                                .addComponent(areaLabel1)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(updateArea))
	                            .addGroup(UpdateMenuLayout.createSequentialGroup()
	                                .addComponent(areaNameLabel1)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                                .addComponent(updateAreaName))))
	                    .addGroup(UpdateMenuLayout.createSequentialGroup()
	                        .addComponent(updateReturn)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addComponent(update)))
	                .addContainerGap())
	            .addGroup(UpdateMenuLayout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(stateLabel1)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(updateStateChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        UpdateMenuLayout.setVerticalGroup(
	            UpdateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(UpdateMenuLayout.createSequentialGroup()
	                .addGap(36, 36, 36)
	                .addComponent(updateLabel)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
	                .addGroup(UpdateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(stateLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(updateStateChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(UpdateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(areaNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(updateAreaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(UpdateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(areaLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(updateArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(UpdateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(defAreaLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(updateDefArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(UpdateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(updatePorReflo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(porRefloLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(29, 29, 29)
	                .addGroup(UpdateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(porIndusLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(updatePorIndus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(104, 104, 104))
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateMenuLayout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addGroup(UpdateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(update)
	                    .addComponent(updateReturn))
	                .addContainerGap())
	        );
	        MainPanel.add(UpdateMenu, "UpdateMenu");

        //Tamanho de todas as telas v
	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );

        pack();
    }                     

    
    //Ações dos botões
    private void createActionPerformed(java.awt.event.ActionEvent evt) {                                       
      cl.show(MainPanel, "CreateMenu");
    }                                      

    private void openListActionPerformed(java.awt.event.ActionEvent evt) {                                         
        cl.show(MainPanel, "TableMenu");
    }                                        

    private void infoReturnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        cl.show(MainPanel, "Menu");
    }                                          

    private void createReturnActionPerformed(java.awt.event.ActionEvent evt) {                                             
        cl.show(MainPanel, "Menu");
    }                                            

    private void searchReturnActionPerformed(java.awt.event.ActionEvent evt) {                                             
        cl.show(MainPanel, "Menu");
    }                                            

    private void searchSelectActionPerformed(java.awt.event.ActionEvent evt) {                                             
        //Botão para selecionar uma informação para atualizar na parte com informações filtradas
    }                                            

    private void filterActionPerformed(java.awt.event.ActionEvent evt) {                                       
        //Botão para salvar a informação e utilizar para adicionar as informações a tabela
    }                                      

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {                                       
        cl.show(MainPanel, "SearchMenu");
    }                                      

    private void createSaveActionPerformed(java.awt.event.ActionEvent evt) {                                           
        //Botão para salvar e adicionar a informação ao array
    }                                          

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {                                       
        //Botão para selecionar uma informação para atualizar na parte com todas informações
    }                                      

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {                                       
        //Botão para salvar as informações atualizadas
    }                                      

    private void updateReturnActionPerformed(java.awt.event.ActionEvent evt) {                                             
        cl.show(MainPanel, "Menu");
    }                                            

    
    //Método main
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAPS().setVisible(true);}});}

    // Declaração das variaveis
    private javax.swing.JPanel CreateMenu;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel SearchMenu;
    private javax.swing.JPanel TableMenu;
    private javax.swing.JPanel UpdateMenu;
    private javax.swing.JLabel addLabel;
    private javax.swing.JButton apagar;
    private javax.swing.JTextField area;
    private javax.swing.JLabel areaLabel;
    private javax.swing.JLabel areaLabel1;
    private javax.swing.JTextField areaName;
    private javax.swing.JLabel areaNameLabel;
    private javax.swing.JLabel areaNameLabel1;
    private javax.swing.JButton create;
    private javax.swing.JButton createReturn;
    private javax.swing.JButton createSave;
    private javax.swing.JTextField defArea;
    private javax.swing.JLabel defAreaLabel;
    private javax.swing.JLabel defAreaLabel1;
    private javax.swing.JScrollPane fScrollTable;
    private javax.swing.JButton filter;
    private javax.swing.JTable filteredTable;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel infoLabel1;
    private javax.swing.JButton infoReturn;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JButton openList;
    private javax.swing.JTextField porIndus;
    private javax.swing.JLabel porIndusLabel;
    private javax.swing.JLabel porIndusLabel1;
    private javax.swing.JTextField porReflo;
    private javax.swing.JLabel porRefloLabel;
    private javax.swing.JLabel porRefloLabel1;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> searchChoice;
    private javax.swing.JTextField searchChosen;
    private javax.swing.JButton searchReturn;
    private javax.swing.JButton searchSelect;
    private javax.swing.JButton select;
    private javax.swing.JComboBox<String> stateChoice;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JLabel stateLabel1;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JButton update;
    private javax.swing.JTextField updateArea;
    private javax.swing.JTextField updateAreaName;
    private javax.swing.JTextField updateDefArea;
    private javax.swing.JLabel updateLabel;
    private javax.swing.JTextField updatePorIndus;
    private javax.swing.JTextField updatePorReflo;
    private javax.swing.JButton updateReturn;
    private javax.swing.JComboBox<String> updateStateChoice;            
}