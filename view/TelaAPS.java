package view;

import java.awt.CardLayout;

import control.ControlTela;

public class TelaAPS extends javax.swing.JFrame {
    CardLayout cl;
    CreateMenu CM = new CreateMenu();
    TableMenu TM = new TableMenu();
    SearchMenu SM = new SearchMenu();
    UpdateMenu UM = new UpdateMenu();
    ControlTela ctr = new ControlTela();
    
    public TelaAPS() {
        initComponents();
        cl = (CardLayout) MainPanel.getLayout();
        CM.setCard(cl, MainPanel);
        this.setVisible(true);}
                       
    private void initComponents() {
        MainPanel = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        menuLabel = new javax.swing.JLabel();
        create = new javax.swing.JButton();
        apagar = new javax.swing.JButton();
        QuickSort = new javax.swing.JButton();
        MergeSort = new javax.swing.JButton();
       
        createArchive = new javax.swing.JButton();
        
        openList = new javax.swing.JButton();
        search = new javax.swing.JButton();
     
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setLayout(new java.awt.CardLayout());

        menuLabel.setFont(new java.awt.Font("Dialog", 1, 48)); 
        menuLabel.setText("Menu");

        create.setFont(new java.awt.Font("Dialog", 0, 14)); 
        create.setText("ADICIONAR DADO");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
	
        apagar.setFont(new java.awt.Font("Dialog", 0, 14));
        apagar.setText("DELETAR DADO");
        apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarActionPerformed(evt);
            }
        });

        openList.setFont(new java.awt.Font("Dialog", 0, 14)); 
        openList.setText("LISTA DE DADOS");
        openList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openListActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Dialog", 0, 14));
        search.setText("PESQUISAR DADOS");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
       
      
        
        createArchive.setFont(new java.awt.Font("Dialog", 0, 14));
        createArchive.setText("CRIAR ARQUIVO");
        createArchive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createArchiveActionPerformed(evt);
            }
        });
        
        QuickSort.setFont(new java.awt.Font("Dialog", 0, 14)); 
        QuickSort.setText("QuickSort");
        QuickSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuickSortActionPerformed(evt);
            }
        });

        MergeSort.setFont(new java.awt.Font("Dialog", 0, 14)); 
        MergeSort.setText("MergeSort");
        MergeSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MergeSortActionPerformed(evt);
            }
        });

      

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(create, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addComponent(apagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(openList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuLabel)
                .addGap(485, 485, 485))
            .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createArchive)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuickSort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MergeSort)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuLabel)
                .addGap(29, 29, 29)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createArchive, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(QuickSort, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(MergeSort, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(openList, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    )
                .addGap(50, 50, 50))
       
        );
        MainPanel.add(Menu, "Menu");
        MainPanel.add(CM, "CreateMenu");
        MainPanel.add(TM, "TableMenu");
        MainPanel.add(SM, "SearchMenu");
        MainPanel.add(UM, "UpdateMenu");
        
        
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
    pack();}                     

    private void createActionPerformed(java.awt.event.ActionEvent evt) {                                       
      cl.show(MainPanel, "CreateMenu");
    }                                      

    private void openListActionPerformed(java.awt.event.ActionEvent evt) {                                         
        cl.show(MainPanel, "TableMenu");
    }                                        

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {  
    	SM.setArchiveName("entrada");
        cl.show(MainPanel, "SearchMenu");
    }           
    
    private void apagarActionPerformed(java.awt.event.ActionEvent evt) {                                       
      ctr.Delete(this);
    }
    private void createArchiveActionPerformed(java.awt.event.ActionEvent evt) {                                              
      ctr.Create(this);
    }
    private void QuickSortActionPerformed(java.awt.event.ActionEvent evt) {                                          
     ctr.QuickSort(this);
    }                                         

    private void MergeSortActionPerformed(java.awt.event.ActionEvent evt) {                                          
      ctr.MergeSort(this);
    }       
    
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton apagar;
    private javax.swing.JButton create;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JButton openList;
    private javax.swing.JButton search; 
    private javax.swing.JButton createArchive;
    private javax.swing.JButton MergeSort;
    private javax.swing.JButton QuickSort;
}