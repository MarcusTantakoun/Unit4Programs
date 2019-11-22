package Project10.assignments;

import javax.swing.DefaultListModel;

public class sortGUI extends javax.swing.JFrame {

    DefaultListModel model; //holds data for the list
    int nums[] = new int[50000]; //generate 50000 numbers

    public sortGUI() {
        initComponents();
        //connect model to list
        model = new DefaultListModel();
        numberList.setModel(model); //connects model to list
        //all sorting buttons are disabled
        selectionSort.setEnabled(false);
        insertionSort.setEnabled(false);
        bubbleSort.setEnabled(false);
        recursionSort.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        numberList = new javax.swing.JList<>();
        generatebtn = new javax.swing.JButton();
        timebox = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bubbleSort = new javax.swing.JButton();
        selectionSort = new javax.swing.JButton();
        insertionSort = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        recursionSort = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        clearListbtn = new javax.swing.JButton();
        quitbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));

        jScrollPane1.setViewportView(numberList);

        generatebtn.setText("Generate Numbers");
        generatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatebtnActionPerformed(evt);
            }
        });

        timebox.setEditable(false);
        timebox.setBackground(new java.awt.Color(51, 51, 51));
        timebox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        timebox.setForeground(new java.awt.Color(255, 255, 255));
        timebox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        timebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeboxActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sorting Algorithms");

        bubbleSort.setText("Bubble Sort");
        bubbleSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubbleSortActionPerformed(evt);
            }
        });

        selectionSort.setText("Selection Sort");
        selectionSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionSortActionPerformed(evt);
            }
        });

        insertionSort.setText("Insertion Sort");
        insertionSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertionSortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bubbleSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectionSort, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(insertionSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bubbleSort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectionSort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertionSort)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Recursion");

        recursionSort.setText("Quick Sort");
        recursionSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recursionSortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(recursionSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recursionSort)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        clearListbtn.setText("Clear List");
        clearListbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearListbtnActionPerformed(evt);
            }
        });

        quitbtn.setText("Quit");
        quitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearListbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clearListbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quitbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(generatebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timebox)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(generatebtn)
                        .addGap(13, 13, 13)
                        .addComponent(timebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatebtnActionPerformed
        //generates 50000 numbers from 1 to 50000
        for (int i = 0; i < 50000; i++) { //(range)
            nums[i] = (int) (Math.random() * 50000 + 1);
            model.addElement(nums[i]);
        }
        generatebtn.setEnabled(false);
        //all sorting buttons are enabled once generate button is clicked
        selectionSort.setEnabled(true);
        insertionSort.setEnabled(true);
        bubbleSort.setEnabled(true);
        recursionSort.setEnabled(true);
    }//GEN-LAST:event_generatebtnActionPerformed

    private void quitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitbtnActionPerformed

    private void bubbleSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubbleSortActionPerformed
        model.clear();
        //start time
        long startTime = System.nanoTime();
        bubbleSort(nums); //run method
        //print numbers
        for (int i = 0; i < 50000; i++) {
            model.addElement(nums[i]);
        }
        //end time method execution
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        timebox.setText("" + duration + " ms"); //print time box

        //disable all buttons - forces user to clear list or quit
        selectionSort.setEnabled(false);
        insertionSort.setEnabled(false);
        bubbleSort.setEnabled(false);
        recursionSort.setEnabled(false);
    }//GEN-LAST:event_bubbleSortActionPerformed

    private void selectionSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionSortActionPerformed
        model.clear();
        long startTime = System.nanoTime();
        selectionSort(nums);
        for (int i = 0; i < 50000; i++) {
            model.addElement(nums[i]);
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        timebox.setText("" + duration + " ms");

        selectionSort.setEnabled(false);
        insertionSort.setEnabled(false);
        bubbleSort.setEnabled(false);
        recursionSort.setEnabled(false);
    }//GEN-LAST:event_selectionSortActionPerformed

    private void insertionSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertionSortActionPerformed
        model.clear();
        long startTime = System.nanoTime();
        insertionSort(nums);
        for (int i = 0; i < 50000; i++) {
            model.addElement(nums[i]);
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        timebox.setText("" + duration + " ms");

        selectionSort.setEnabled(false);
        insertionSort.setEnabled(false);
        bubbleSort.setEnabled(false);
        recursionSort.setEnabled(false);
    }//GEN-LAST:event_insertionSortActionPerformed

    private void recursionSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recursionSortActionPerformed
        model.clear();
        long startTime = System.nanoTime();
        quickSort(nums,0,nums.length-1);
        for (int i = 0; i < 50000; i++) {
            model.addElement(nums[i]);
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        timebox.setText("" + duration + " ms");

        selectionSort.setEnabled(false);
        insertionSort.setEnabled(false);
        bubbleSort.setEnabled(false);
        recursionSort.setEnabled(false);
    }//GEN-LAST:event_recursionSortActionPerformed

    private void clearListbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearListbtnActionPerformed
        //resets whole code
        model.clear();
        model = new DefaultListModel();
        numberList.setModel(model);
        generatebtn.setEnabled(true);
        timebox.setText("");
    }//GEN-LAST:event_clearListbtnActionPerformed

    private void timeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeboxActionPerformed

    }//GEN-LAST:event_timeboxActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sortGUI().setVisible(true);
            }
        });
    }

//supporting findMinimum method
    public static int findMinimum(int[] a, int first) {
        //first=where to start looking from
        //assume first is also the smallest for now
        int minIndex = first;
        for (int i = first + 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void bubbleSort(int[] a) {
        int k = 0;
        boolean exchangeMade = true;
        // Make up to n - 1 passes through array, exit 
        //early if no exchanges are made on previous pass

        while ((k < a.length - 1) && exchangeMade) {
            exchangeMade = false;
            k++;
            for (int j = 0; j < a.length - k; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    exchangeMade = true;
                }
            }
        }
    }
    
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = findMinimum(a, i);
            if (minIndex != i)
            {
                swap(a, i, minIndex);
            }
        }
    }

    public static void insertionSort(int a[]) {
        int itemToInsert, j;
        boolean stillLooking;
        //on the kth pass, pass item k upwards in list
        //and insert it in its proper place amoung the
        //first k entries in an array
        for (int k = 1; k < a.length; k++) {
            //move backwards through list, looking for
            //the right place to insert a[k];
            itemToInsert = a[k];
            j = k - 1;
            stillLooking = true;
            while (j >= 0 && stillLooking) {
                if (itemToInsert < a[j]) {
                    //move item higher
                    a[j + 1] = a[j];
                    j--;
                } else {
                    //we have found new home for a[k];
                    stillLooking = false;
                }
                a[j + 1] = itemToInsert;
            }
        }
    }
    
    public static void quickSort(int[] a, int left, int right) {
        if (left >= right) return;
        int i = left;
        int j = right;
        int pivotValue = a[(left + right) / 2];
        while (i < j) {
            while (a[i] < pivotValue) i++;
            while (pivotValue < a[j]) j--;
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(a, left, j);
        quickSort(a, i, right);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bubbleSort;
    private javax.swing.JButton clearListbtn;
    private javax.swing.JButton generatebtn;
    private javax.swing.JButton insertionSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> numberList;
    private javax.swing.JButton quitbtn;
    private javax.swing.JButton recursionSort;
    private javax.swing.JButton selectionSort;
    private javax.swing.JTextField timebox;
    // End of variables declaration//GEN-END:variables
}
