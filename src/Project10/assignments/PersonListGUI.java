package Project10.assignments;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class PersonListGUI extends javax.swing.JFrame {

    ArrayList<Person> people = new ArrayList();
    DefaultListModel model = new DefaultListModel();

    public PersonListGUI() {
        initComponents();
        people.add(new Person("Bobby", "M", 25));
        people.add(new Person("Franky", "F", 55));
        people.add(new Person("Micheal", "M", 15));
        people.add(new Person("Susan", "F", 30));
        nameList.setModel(model);
        for (Person p : people) {
            model.addElement(p.getName());
        }
    }

    public void show(Person p) {
        nameBox.setText(p.getName());
        ageBox.setText("" + p.getAge());
        if (p.getGender().equals("M")) {
            optMale.setSelected(true);
        } else {
            optFemale.setSelected(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nameList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameBox = new javax.swing.JTextField();
        ageBox = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        optMale = new javax.swing.JRadioButton();
        optFemale = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        filebtn = new javax.swing.JMenu();
        exitbtn = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        clearbtn = new javax.swing.JMenuItem();
        addbtn = new javax.swing.JMenuItem();
        deletebtn = new javax.swing.JMenuItem();
        showAllbtn = new javax.swing.JMenu();
        showAll = new javax.swing.JMenuItem();
        malebtn = new javax.swing.JMenuItem();
        femalebtn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        nameList.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nameList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(nameList);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Age:");

        nameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameBoxActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        optMale.setBackground(new java.awt.Color(255, 204, 102));
        buttonGroup1.add(optMale);
        optMale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        optMale.setText("Male");
        optMale.setActionCommand("M");
        optMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optMaleActionPerformed(evt);
            }
        });

        optFemale.setBackground(new java.awt.Color(255, 204, 102));
        buttonGroup1.add(optFemale);
        optFemale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        optFemale.setText("Female");
        optFemale.setActionCommand("F");
        optFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optFemaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(optMale)
                .addGap(18, 18, 18)
                .addComponent(optFemale)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optMale)
                    .addComponent(optFemale))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        filebtn.setText("File");

        exitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project10/assignments/exit.png"))); // NOI18N
        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        filebtn.add(exitbtn);

        jMenuBar1.add(filebtn);

        jMenu7.setText("Edit");

        clearbtn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        clearbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project10/assignments/exit.png"))); // NOI18N
        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        jMenu7.add(clearbtn);

        addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project10/assignments/insert.png"))); // NOI18N
        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jMenu7.add(addbtn);

        deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project10/assignments/delete.png"))); // NOI18N
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jMenu7.add(deletebtn);

        jMenuBar1.add(jMenu7);

        showAllbtn.setText("Filter");

        showAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project10/assignments/all.png"))); // NOI18N
        showAll.setText("Show All");
        showAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllActionPerformed(evt);
            }
        });
        showAllbtn.add(showAll);

        malebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project10/assignments/male.png"))); // NOI18N
        malebtn.setText("Male");
        malebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malebtnActionPerformed(evt);
            }
        });
        showAllbtn.add(malebtn);

        femalebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project10/assignments/female.png"))); // NOI18N
        femalebtn.setText("Female");
        femalebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femalebtnActionPerformed(evt);
            }
        });
        showAllbtn.add(femalebtn);

        jMenuBar1.add(showAllbtn);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optMaleActionPerformed

    private void optFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optFemaleActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        String name, gender;
        int age;
        try {
            name = nameBox.getText();
            age = Integer.parseInt(ageBox.getText());
            gender = buttonGroup1.getSelection().getActionCommand();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Must fill out form correctly");
            return;
        }
        //make person
        Person p = new Person(name, gender, age);
        //read through list, if it has same name, don't print
        for (int i = 0; i < people.size(); i++) {
            if (p.getName().equals(people)) {
                JOptionPane.showMessageDialog(this, "ERROR. New person must have unique name");
            } else {
                int loc = findInsertPoint(people, p);
                people.add(loc, p);
                model.add(loc, p.getName());
            }
        }

        clearForm();
        nameBox.setEditable(true);
        ageBox.setEditable(true);
    }//GEN-LAST:event_addbtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        clearForm();
        nameBox.setEditable(true);
        ageBox.setEditable(true);
    }//GEN-LAST:event_clearbtnActionPerformed

    private void femalebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femalebtnActionPerformed
        model.clear();
        for (int loc = 0; loc < people.size(); loc++) {
            if (people.get(loc).getGender().equals("F")) {
                model.addElement(people.get(loc).getName());
            }
        }
    }//GEN-LAST:event_femalebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        int loc = nameList.getSelectedIndex();
        if (loc >= 0) {
            people.remove(loc);
            model.remove(loc);
        }
        clearForm();
        nameBox.setEditable(true);
        ageBox.setEditable(true);
    }//GEN-LAST:event_deletebtnActionPerformed

    private void nameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameBoxActionPerformed

    }//GEN-LAST:event_nameBoxActionPerformed

    private void showAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllActionPerformed
        model.clear();
        for (Person p : people) {
            model.addElement(p.getName());
        }
    }//GEN-LAST:event_showAllActionPerformed

    private void malebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malebtnActionPerformed
        model.clear();
        for (int loc = 0; loc < people.size(); loc++) {
            if (people.get(loc).getGender().equals("M")) {
                model.addElement(people.get(loc).getName());
            }
        }
    }//GEN-LAST:event_malebtnActionPerformed

    private void nameListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameListMouseClicked
        String name = nameList.getSelectedValue();
        int loc = search(people, new Person(name, null, 0));
        show(people.get(loc));
        nameBox.setEditable(false);
        ageBox.setEditable(false);
    }//GEN-LAST:event_nameListMouseClicked

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
            java.util.logging.Logger.getLogger(PersonListGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonListGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonListGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonListGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonListGUI().setVisible(true);
            }
        });
    }

    public void clearForm() {
        nameBox.setText("");
        ageBox.setText("");
        buttonGroup1.clearSelection();
        nameList.clearSelection();
    }

    public static int findInsertPoint(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        int midpoint = 0;
        while (left <= right) {
            midpoint = (left + right) / 2;
            int result = ((Comparable) a.get(midpoint)).compareTo(searchValue);

            if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        if (((Comparable) a.get(midpoint)).compareTo(searchValue) < 0) {
            midpoint++;
        }
        return midpoint;
    }

    public static int search(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = ((Comparable) a.get(midpoint)).compareTo(searchValue);
            if (result == 0) {
                return midpoint;
            } else if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return -1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addbtn;
    private javax.swing.JTextField ageBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem clearbtn;
    private javax.swing.JMenuItem deletebtn;
    private javax.swing.JMenuItem exitbtn;
    private javax.swing.JMenuItem femalebtn;
    private javax.swing.JMenu filebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem malebtn;
    private javax.swing.JTextField nameBox;
    private javax.swing.JList<String> nameList;
    private javax.swing.JRadioButton optFemale;
    private javax.swing.JRadioButton optMale;
    private javax.swing.JMenuItem showAll;
    private javax.swing.JMenu showAllbtn;
    // End of variables declaration//GEN-END:variables
}
