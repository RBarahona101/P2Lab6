package p2lab6_rigobertobarahona;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        Categoria Ca = new Categoria("Pasta");
        Alimento Aa = new Alimento("Lasagna", Ca, 850, 120);
        Billetera Ba = new Billetera(80, 8000);

        Jugador J = new Jugador("Rodrick", "Dr.Powner", "N1", 200, Ba, Aa, Amigos, Solicitudes);
        jugadores.add(J);
        alimentos.add(Aa);
        categorias.add(Ca);
        billeteras.add(Ba);
        DefaultComboBoxModel Alimentos = (DefaultComboBoxModel) Jugador_Alimento.getModel();
        Alimentos = new DefaultComboBoxModel(alimentos.toArray());
        Jugador_Alimento.setModel(Alimentos);
        Asignar_Alimento.setModel(Alimentos);
        DefaultComboBoxModel Jugadores = (DefaultComboBoxModel) Asignar_Jugador.getModel();
        Jugadores = new DefaultComboBoxModel(jugadores.toArray());
        Asignar_Jugador.setModel(Jugadores);
        Jugadores_Jugadores.setModel(Jugadores);
    }

    @SuppressWarnings("unchecked")
    ArrayList<Categoria> categorias = new ArrayList();
    ArrayList<Jugador> jugadores = new ArrayList();
    ArrayList<Alimento> alimentos = new ArrayList();
    ArrayList<Billetera> billeteras = new ArrayList();
    ArrayList<Jugador> Usuario = new ArrayList();
            ArrayList<Jugador> Amigos = new ArrayList();
        ArrayList<Jugador> Solicitudes = new ArrayList();
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Arbol = new javax.swing.JTree();
        Jugadores_Jugador = new javax.swing.JLabel();
        Jugadores_Jugadores = new javax.swing.JComboBox<>();
        Jugadores_Set = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        Jugadores_Friend = new javax.swing.JComboBox<>();
        Jugadores_Send = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Billetera_Jugador = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Billetera_Tabla = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Billetera_Comer = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Friend_Jugador = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Friend_Tabla = new javax.swing.JTable();
        Friend_Requests = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Aceptar = new javax.swing.JButton();
        Rechazar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Asignar_Jugador = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Asignar_Alimento = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Asignar_Button = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Jugador_Nombre = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        Jugador_Username = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        Jugador_Consumo = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Billetera_Consumo = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        Billetera_Maximo = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        Jugador_Alimento = new javax.swing.JComboBox<>();
        Jugador_Crear = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Alimento_Nombre = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        Alimento_Categoria = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        Alimento_Calorias = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        Alimento_Costo = new javax.swing.JFormattedTextField();
        Alimento_Crear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Categoria");
        Arbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(Arbol);

        Jugadores_Jugador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Jugadores_Jugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jugadores_Jugador.setText("Jugador Seleccionado: ");

        Jugadores_Jugadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        Jugadores_Set.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Jugadores_Set.setText("Update");
        Jugadores_Set.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jugadores_Set.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jugadores_SetMouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Mandar Friend Request");

        Jugadores_Send.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Jugadores_Send.setText("Send");
        Jugadores_Send.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jugadores_Send.setEnabled(false);
        Jugadores_Send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jugadores_SendMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(Jugadores_Jugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(Jugadores_Set))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(Jugadores_Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(Jugadores_Friend, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(Jugadores_Send, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 265, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Jugadores_Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Jugadores_Jugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(Jugadores_Set)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(Jugadores_Friend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(Jugadores_Send)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Jugadores", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        Billetera_Jugador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Billetera_Jugador.setText("Jugador Seleccionado: ");

        Billetera_Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Username", "Nivel", "Puntos", "Alimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Billetera_Tabla);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel20.setText("Average American Citizen Simulator");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Billetera_Comer.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Billetera_Comer.setText("EAT EAT EAT");
        Billetera_Comer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Billetera_Comer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Billetera_ComerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(Billetera_Comer, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Billetera_Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Billetera_Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Billetera_Comer, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Billetera", jPanel2);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        Friend_Jugador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Friend_Jugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Friend_Jugador.setText("Jugador Seleccionado: ");

        Friend_Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Nivel", "Puntos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Friend_Tabla);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Friend List");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Friend Requests");

        Aceptar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Aceptar.setText("Aceptar");
        Aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AceptarMouseClicked(evt);
            }
        });

        Rechazar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Rechazar.setText("Rechazar");
        Rechazar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Rechazar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RechazarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Friend_Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Aceptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Rechazar))
                            .addComponent(Friend_Requests, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Friend_Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(Friend_Requests, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aceptar)
                    .addComponent(Rechazar))
                .addGap(54, 54, 54))
        );

        jTabbedPane1.addTab("Friend List", jPanel4);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jugador");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alimentos");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Asignar");

        Asignar_Jugador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Jugadores");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Alimentos");

        Asignar_Button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Asignar_Button.setText("Asignar");
        Asignar_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Asignar_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Asignar_ButtonMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Username");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Puntos de Gordura");

        Jugador_Consumo.setActionCommand("<Not Set>");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Billetera");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Puntos de Consumo");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Puntos Maximos");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Alimento");

        Jugador_Alimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        Jugador_Crear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Jugador_Crear.setText("Crear Jugador");
        Jugador_Crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jugador_Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jugador_CrearMouseClicked(evt);
            }
        });
        Jugador_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jugador_CrearActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Nombre");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Categoria");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Calorias");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Costo");

        Alimento_Crear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Alimento_Crear.setText("Crear Alimento");
        Alimento_Crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Alimento_Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Alimento_CrearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Alimento_Crear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Alimento_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Billetera_Maximo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Jugador_Username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                        .addComponent(Jugador_Nombre, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(Jugador_Consumo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Jugador_Alimento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(142, 142, 142)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Billetera_Consumo)
                                    .addComponent(Jugador_Crear, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Alimento_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel15))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(Alimento_Calorias, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Alimento_Costo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(355, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(Asignar_Button)
                                .addGap(99, 99, 99))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Asignar_Jugador, 0, 99, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(26, 26, 26))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Asignar_Alimento, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jugador_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jugador_Consumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Billetera_Consumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Billetera_Maximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jugador_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jugador_Alimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Jugador_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Asignar_Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Asignar_Alimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Alimento_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Alimento_Calorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Alimento_Costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Alimento_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(Asignar_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Alimento_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void Jugador_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jugador_CrearActionPerformed
        
    }//GEN-LAST:event_Jugador_CrearActionPerformed

    private void Alimento_CrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Alimento_CrearMouseClicked
        DefaultComboBoxModel Alimentos = (DefaultComboBoxModel) Jugador_Alimento.getModel();
        DefaultComboBoxModel Alimentos2 = (DefaultComboBoxModel) Asignar_Alimento.getModel();
        
        String nombre = Alimento_Nombre.getText();
        Categoria categoria = new Categoria (Alimento_Categoria.getText() );
        boolean fucko = false;
        if (categorias.size() > 0){
            for (int i = 0; i < categorias.size(); i++){
                if (categoria == categorias.get(i) ){
                    fucko = true;
                }
            }
        }
        if (fucko == true){
            JOptionPane.showMessageDialog(this, "Repeticion Detectada");
        }else{
            categorias.add(categoria);
            String cat = Alimento_Categoria.getText();
        int calorias = Integer.parseInt(Alimento_Calorias.getText() );
        int costo = Integer.parseInt(Alimento_Costo.getText() );
        
        alimentos.add(new Alimento( nombre, categoria, costo, calorias ) );
        
        Alimentos = new DefaultComboBoxModel(alimentos.toArray());
        
        Jugador_Alimento.setModel(Alimentos);
        Asignar_Alimento.setModel(Alimentos);
        

        JOptionPane.showMessageDialog(this, "Alimento Agregado Exitosamente");
        
        Alimento_Nombre.setText("");
        Alimento_Categoria.setText("");
        Alimento_Calorias.setText("");
        Alimento_Costo.setText("");
        Jugador_Crear.setEnabled(true);
        
        // Arbol Time
        DefaultTreeModel Tree = (DefaultTreeModel) Arbol.getModel();
        DefaultMutableTreeNode Root = (DefaultMutableTreeNode) Tree.getRoot();
        
        int repeat = 0;
        DefaultMutableTreeNode n = new DefaultMutableTreeNode (cat);
        
        for (int i = 0; i < Root.getChildCount(); i++) {
            if (Root.getChildAt(i).toString().equalsIgnoreCase(cat)) {

            }else{
                DefaultMutableTreeNode n1 = new DefaultMutableTreeNode(cat);
                Root.add(n1);
            }
        }
    }
        
        
    }//GEN-LAST:event_Alimento_CrearMouseClicked

    private void Jugador_CrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jugador_CrearMouseClicked
        DefaultComboBoxModel Jugadores = (DefaultComboBoxModel) Asignar_Jugador.getModel();
        String nombre = Jugador_Nombre.getText();
        boolean fucko = false;
        String username = Jugador_Username.getText();
        if (jugadores.size() < 0){
            for (int i = 0; i < jugadores.size() ; i++){
                if (username.equalsIgnoreCase(jugadores.get(i).getUsername() ) ){
                    fucko = true;
                }
            }
        }
        if (fucko == true){
            JOptionPane.showMessageDialog(this, "Repeticion Detectada");
        }else{
            String gordura = "";
            int consumo = Integer.parseInt(Jugador_Consumo.getText() ) ;
            if (consumo < 500){
                gordura = "N0";
            } else if (consumo > 500 && consumo < 1000){
                gordura = "N1";
                consumo = 1000 - consumo;
            } else if (consumo > 1000 && consumo < 2000){
                gordura = "N2";
                consumo = 2000 - consumo;
            } else if (consumo > 2000 && consumo < 4000){
                gordura = "N3";
                consumo = 4000 - consumo;
            } else if (consumo > 4000 && consumo < 8000){
                gordura = "N4";
                consumo = 8000 - consumo;
            } else if (consumo > 8000 && consumo < 16000){
                gordura = "N5";
                consumo = 16000 - consumo;
            }
            Alimento alimento = (Alimento) Jugador_Alimento.getSelectedItem();

            int costo = Integer.parseInt(Billetera_Consumo.getText() );
            int maximo = Integer.parseInt(Billetera_Maximo.getText() );

            Billetera billetera = new Billetera(costo, maximo);
            billeteras.add(billetera);

            jugadores.add( new Jugador (nombre, username, gordura, consumo, billetera, alimento, Amigos, Solicitudes ) );
            
            JOptionPane.showMessageDialog(this, "Jugador Creado Exitosamente");
            
            Jugadores = new DefaultComboBoxModel(jugadores.toArray() );
            
            Asignar_Jugador.setModel(Jugadores);
            Jugadores_Jugadores.setModel(Jugadores);
            
            
            Jugador_Nombre.setText("");
            Jugador_Username.setText("");
            Jugador_Consumo.setText("");
            Billetera_Consumo.setText("");
            Billetera_Maximo.setText("");   
            Asignar_Button.setEnabled(true);
        }
    }//GEN-LAST:event_Jugador_CrearMouseClicked

    private void AceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseClicked
    DefaultTableModel Friends = (DefaultTableModel) Friend_Tabla.getModel();
     DefaultComboBoxModel Requests = (DefaultComboBoxModel) Friend_Requests.getModel(); 
    if (( (Jugador) Usuario.get(0) ).getAmigos().isEmpty() ){
        JOptionPane.showMessageDialog(this, "Tienes que dejarla ir Nuila");
    } else{
        ( (Jugador) Usuario.get(0) ).getAmigos().add( (Jugador) Friend_Requests.getSelectedItem() );
        ( (Jugador) Usuario.get(0) ).getSolicitudes().remove( (Jugador) Friend_Requests.getSelectedItem() );

        Friends.setRowCount(0);
           ArrayList<Jugador> temp = Usuario.get(0).getAmigos(); 
           for (int i = 0; i < temp.size() ; i++){
               Object [] obj = { ( (Jugador) temp.get(i) ).getUsername(), ( (Jugador) temp.get(i) ).getGordura(), ( (Jugador) temp.get(i) ).getConsumo() } ;
               Friends.addRow(obj);
           }
        Friend_Tabla.setModel(Friends);
        Requests = new DefaultComboBoxModel(Usuario.get(0).getSolicitudes().toArray() );
        Friend_Requests.setModel(Requests);
        JOptionPane.showMessageDialog(this, "Hola Amigo");
    }
    }//GEN-LAST:event_AceptarMouseClicked

    private void Asignar_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asignar_ButtonMouseClicked
        try{
           ( (Jugador) Asignar_Jugador.getSelectedItem() ).setAlimento( ( (Alimento) Asignar_Alimento.getSelectedItem() ) );
            JOptionPane.showMessageDialog(this, "Cambio Exitoso");
        } catch(Exception  e ){
            JOptionPane.showMessageDialog(this, "Oops");
        }
    }//GEN-LAST:event_Asignar_ButtonMouseClicked

    private void Jugadores_SetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jugadores_SetMouseClicked
        DefaultTableModel Comer = (DefaultTableModel) Billetera_Tabla.getModel();
        DefaultTableModel Friends = (DefaultTableModel) Friend_Tabla.getModel();
        
        DefaultComboBoxModel Requests = (DefaultComboBoxModel) Friend_Requests.getModel();
        DefaultComboBoxModel All = (DefaultComboBoxModel) Jugadores_Friend.getModel();
        
        if (Usuario.isEmpty() ){
           Usuario.add( (Jugador) Jugadores_Jugadores.getSelectedItem() );           
       } else {
           Usuario.clear();
           Usuario.add( (Jugador) Jugadores_Jugadores.getSelectedItem() );
       }
       Jugadores_Send.setEnabled(true);
       
       Jugadores_Jugador.setText("Usuario Actual: " + ( (Jugador) Usuario.get(0) ).getUsername() );
       Billetera_Jugador.setText("Usuario Actual: " + ( (Jugador) Usuario.get(0) ).getUsername() );
       Friend_Jugador.setText("Usuario Actual: " + ( (Jugador) Usuario.get(0) ).getUsername() );
       
       //Friend Requesting
       ArrayList<Jugador> butMe = jugadores;
       for (int i = 0; i < jugadores.size(); i++){
           if (Usuario.get(0) == butMe.get(i) ){
               butMe.remove(i);
           }
       }
       All = new DefaultComboBoxModel(butMe.toArray());
       Jugadores_Friend.setModel(All);
       //Friend Requests
       Requests = new DefaultComboBoxModel(Usuario.get(0).getSolicitudes().toArray() );
       Friend_Requests.setModel(Requests);
       //Simulacion Tabla
       Comer.setRowCount(0);
       Object[] objs = {Usuario.get(0).getNombre(), Usuario.get(0).getUsername(), Usuario.get(0).getGordura(), Usuario.get(0).getConsumo(), Usuario.get(0).getAlimento() };
       Comer.addRow(objs);
       Billetera_Tabla.setModel(Comer);
       // Current Friends
       Friends.setRowCount(0);
       ArrayList<Jugador> temp = Usuario.get(0).getAmigos(); 
       for (int i = 0; i < temp.size() ; i++){
           Object [] obj = { ( (Jugador) temp.get(i) ).getUsername(), ( (Jugador) temp.get(i) ), ( (Jugador) temp.get(i) ).getGordura(), ( (Jugador) temp.get(i) ).getConsumo() } ;
           Friends.addRow(obj);
       }
       Friend_Tabla.setModel(Friends);
       
       JOptionPane.showMessageDialog(this, "Usuario Cargado");
    }//GEN-LAST:event_Jugadores_SetMouseClicked

    private void Jugadores_SendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jugadores_SendMouseClicked
     DefaultComboBoxModel Requests = (DefaultComboBoxModel) Friend_Requests.getModel();    
    ( (Jugador) Usuario.get(0) ).getSolicitudes().add( (Jugador) Jugadores_Friend.getSelectedItem() );
    Requests = new DefaultComboBoxModel(Usuario.get(0).getSolicitudes().toArray() );
    Friend_Requests.setModel(Requests);
    JOptionPane.showMessageDialog(this, "Se ha mandado su solicitud de amistad" );
    }//GEN-LAST:event_Jugadores_SendMouseClicked

    private void RechazarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RechazarMouseClicked
    DefaultComboBoxModel Requests = (DefaultComboBoxModel) Friend_Requests.getModel();  
    if (( (Jugador) Usuario.get(0) ).getSolicitudes().isEmpty() ){
        JOptionPane.showMessageDialog(this, "Y a quien estas rechazando?");
    }else{
        ( (Jugador) Usuario.get(0) ).getSolicitudes().remove( (Jugador) Friend_Requests.getSelectedItem() );
        Requests = new DefaultComboBoxModel(Usuario.get(0).getSolicitudes().toArray() );
        Friend_Requests.setModel(Requests);
        JOptionPane.showMessageDialog(this, "Rechazado Papo");
    }
    }//GEN-LAST:event_RechazarMouseClicked

    private void Billetera_ComerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Billetera_ComerMouseClicked
        DefaultTableModel Comer = (DefaultTableModel) Billetera_Tabla.getModel();
        int limite = 0; 
        int start;
        int cont = 6;
        String ver = Usuario.get(0).getGordura();
        switch(ver){
            case "N0": {
                limite = 500;
                break;
            }
            case "N1": {
                limite = 1000;
                break;
            }
            case "N2": {
                limite = 2000;
                break;
            }
            case "N3": {
                limite = 4000;
                break;
            }
            case "N4": {
                limite = 8000;
                break;
            }
            case "N5": {
                limite = 16000;
                break;
            }
        }
        start = Usuario.get(0).getConsumo();
        int inc = ( (Alimento) Usuario.get(0).getAlimento() ).getCalorias();
        start = start + inc;
        if (start >= limite){
            switch(ver){
                case "N0": {
                    ver = "N1";
                    start = 1000 - start;
                    break;
                }
                case "N1": {
                    ver = "N2";
                    start = 2000 - start;
                    break;
                }
                case "N2": {
                    ver = "N3";
                    start = 4000 - start;
                    break;
                }
                case "N3": {
                    ver = "N4";
                    start = 8000 - start;
                    break;
                }
                case "N4": {
                    ver = "N5";
                    start = 16000 - start;
                    break;
                }
                case "N5": {
                    cont++;
                    ver = "N" + cont;
                    break;
                }
                default: {
                    cont++;
                    ver = "N" + cont;
                    break;
                }
            }
            JOptionPane.showMessageDialog(this, "OHM OHM NOHM");
        }
        Usuario.get(0).setConsumo(start);
        Usuario.get(0).setGordura(ver);
        Comer.setRowCount(0);
        Object[] objs = {Usuario.get(0).getNombre(), Usuario.get(0).getUsername(), Usuario.get(0).getGordura(), Usuario.get(0).getConsumo(), Usuario.get(0).getAlimento()};
        Comer.addRow(objs);
        Billetera_Tabla.setModel(Comer);
    }//GEN-LAST:event_Billetera_ComerMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JFormattedTextField Alimento_Calorias;
    private javax.swing.JFormattedTextField Alimento_Categoria;
    private javax.swing.JFormattedTextField Alimento_Costo;
    private javax.swing.JButton Alimento_Crear;
    private javax.swing.JFormattedTextField Alimento_Nombre;
    private javax.swing.JTree Arbol;
    private javax.swing.JComboBox<String> Asignar_Alimento;
    private javax.swing.JButton Asignar_Button;
    private javax.swing.JComboBox<String> Asignar_Jugador;
    private javax.swing.JButton Billetera_Comer;
    private javax.swing.JFormattedTextField Billetera_Consumo;
    private javax.swing.JLabel Billetera_Jugador;
    private javax.swing.JFormattedTextField Billetera_Maximo;
    private javax.swing.JTable Billetera_Tabla;
    private javax.swing.JLabel Friend_Jugador;
    private javax.swing.JComboBox<String> Friend_Requests;
    private javax.swing.JTable Friend_Tabla;
    private javax.swing.JComboBox<String> Jugador_Alimento;
    private javax.swing.JFormattedTextField Jugador_Consumo;
    private javax.swing.JButton Jugador_Crear;
    private javax.swing.JFormattedTextField Jugador_Nombre;
    private javax.swing.JFormattedTextField Jugador_Username;
    private javax.swing.JComboBox<String> Jugadores_Friend;
    private javax.swing.JLabel Jugadores_Jugador;
    private javax.swing.JComboBox<String> Jugadores_Jugadores;
    private javax.swing.JButton Jugadores_Send;
    private javax.swing.JButton Jugadores_Set;
    private javax.swing.JButton Rechazar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
