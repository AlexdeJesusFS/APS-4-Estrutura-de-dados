

import java.awt.CardLayout;

public class TelaAPS extends javax.swing.JFrame {
    CardLayout cl;
    CreateMenu CM = new CreateMenu();
    TableMenu TM = new TableMenu();
    SearchMenu SM = new SearchMenu();
    UpdateMenu UM = new UpdateMenu();
    
    public TelaAPS() {
        initComponents();
        cl = (CardLayout) MainPanel.getLayout();
        CM.setCard(cl, MainPanel);}
                       
    private void initComponents() {
        MainPanel = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        menuLabel = new javax.swing.JLabel();
        create = new javax.swing.JButton();
        apagar = new javax.swing.JButton();
        archiveName = new javax.swing.JTextField();
        archiveLabel = new javax.swing.JLabel();
        createArchive = new javax.swing.JButton();
        chooseArchive = new javax.swing.JButton();
        openList = new javax.swing.JButton();
        search = new javax.swing.JButton();
        sort = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarActionPerformed(evt);
            }
        });

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
        sort.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        sort.setText("ORGANIZAR");
        sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortActionPerformed(evt);
            }
        });
        
        archiveName.setFont(new java.awt.Font("Dialog", 0, 14));
        
        archiveLabel.setFont(new java.awt.Font("Dialog", 0, 14));
        archiveLabel.setText("Digite o nome do arquivo:");
        
        createArchive.setFont(new java.awt.Font("Dialog", 0, 14));
        createArchive.setText("CRIAR");
        createArchive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createArchiveActionPerformed(evt);
            }
        });

        chooseArchive.setFont(new java.awt.Font("Dialog", 0, 14));
        chooseArchive.setText("ESCOLHER");
        chooseArchive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseArchiveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(create, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addComponent(sort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(openList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuLabel)
                .addGap(385, 385, 385))
            .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(archiveLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(archiveName, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createArchive)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseArchive)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuLabel)
                .addGap(29, 29, 29)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(archiveLabel)
                    .addComponent(archiveName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createArchive, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(chooseArchive))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(openList, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sort, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        cl.show(MainPanel, "SearchMenu");
    }           
    private void sortActionPerformed(java.awt.event.ActionEvent evt) {                                     
        
    }
    private void apagarActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
    }
    private void createArchiveActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
    }
    private void chooseArchiveActionPerformed(java.awt.event.ActionEvent evt) {                                              
       
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAPS().setVisible(true);}});}
   
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton apagar;
    private javax.swing.JButton create;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JButton openList;
    private javax.swing.JButton search; 
    private javax.swing.JLabel archiveLabel;
    private javax.swing.JTextField archiveName;
    private javax.swing.JButton chooseArchive;
    private javax.swing.JButton createArchive;
    private javax.swing.JButton sort;
}