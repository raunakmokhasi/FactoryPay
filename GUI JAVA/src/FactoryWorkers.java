//Raunak Srikant Mokhasi 2017085


// I have used resources from the internet for some part of the code. I have also learnt GUI Programming in Java in my 11th and 12th grade so I might have used some stuff that may be not taught yet.

import javax.swing.JOptionPane; //import JOptionPane for Message Dialog Box

public class FactoryWorkers extends javax.swing.JFrame {

    public FactoryWorkers() {
        createComponents();
    }

    @SuppressWarnings("unchecked")                          
    private void createComponents() {  //Creates All Components required in the GUI

    	// I have used Radio Buttons instead of CheckBoxes
    	// For the Insurance Radio buttons i have not put them in a button Group so that we can select multiple options

        buttonGroup1 = new javax.swing.ButtonGroup();
        Logo = new javax.swing.JLabel();
        ename = new javax.swing.JLabel();
        eid = new javax.swing.JLabel();
        empName = new javax.swing.JTextField();
        empID = new javax.swing.JTextField();
        noHours = new javax.swing.JLabel();
        numHours = new javax.swing.JTextField();
        SkillPanel = new javax.swing.JPanel();
        SkillLab = new javax.swing.JLabel();
        num1 = new javax.swing.JRadioButton();
        num2 = new javax.swing.JRadioButton();
        num3 = new javax.swing.JRadioButton();
        InsurancePanel = new javax.swing.JPanel();
        InsLab = new javax.swing.JLabel();
        medIns = new javax.swing.JRadioButton();
        dentIns = new javax.swing.JRadioButton();
        longIns = new javax.swing.JRadioButton();
        refresh = new javax.swing.JButton();
        calculate = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Output = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); //Exits the Program whenever we close
        setTitle("Factory Workers Application");

        Logo.setBackground(new java.awt.Color(255, 255, 255));
        Logo.setFont(new java.awt.Font("Tahoma", 1, 48)); 
        Logo.setText("ABC COMPANY");

        ename.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        ename.setText("Enter Employee Name");

        eid.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        eid.setText("Enter Employee ID");

        empName.setFont(new java.awt.Font("Tahoma", 0, 20)); 

        empID.setFont(new java.awt.Font("Tahoma", 0, 20)); 

        noHours.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        noHours.setText("Number of Hours Worked");

        numHours.setFont(new java.awt.Font("Tahoma", 0, 20)); 

        SkillPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        SkillLab.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        SkillLab.setText("Skill Level");

        buttonGroup1.add(num1);
        num1.setFont(new java.awt.Font("Times New Roman", 1, 30)); 
        num1.setText("1");
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(num2);
        num2.setFont(new java.awt.Font("Times New Roman", 1, 30)); 
        num2.setText("2");
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(num3);
        num3.setFont(new java.awt.Font("Times New Roman", 1, 30)); 
        num3.setText("3");
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SkillPanelLayout = new javax.swing.GroupLayout(SkillPanel);
        SkillPanel.setLayout(SkillPanelLayout);
        SkillPanelLayout.setHorizontalGroup(
            SkillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SkillPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SkillLab)
                .addGap(212, 212, 212))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SkillPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(num1)
                .addGap(198, 198, 198)
                .addComponent(num2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(num3)
                .addContainerGap())
        );
        SkillPanelLayout.setVerticalGroup(
            SkillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SkillPanelLayout.createSequentialGroup()
                .addComponent(SkillLab)
                .addGap(18, 18, 18)
                .addGroup(SkillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num2)
                    .addComponent(num3)
                    .addComponent(num1)))
        );

        InsurancePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        InsurancePanel.setEnabled(false);

        InsLab.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        InsLab.setText("INSURANCE");

        medIns.setFont(new java.awt.Font("Times New Roman", 1, 20)); 
        medIns.setText("Medical Insurance");
        medIns.setEnabled(false);

        dentIns.setFont(new java.awt.Font("Times New Roman", 1, 20)); 
        dentIns.setText("Dental Insurance");
        dentIns.setEnabled(false);

        longIns.setFont(new java.awt.Font("Times New Roman", 1, 20)); 
        longIns.setText("Long Term Insurance");
        longIns.setEnabled(false);

        javax.swing.GroupLayout InsurancePanelLayout = new javax.swing.GroupLayout(InsurancePanel);
        InsurancePanel.setLayout(InsurancePanelLayout);
        InsurancePanelLayout.setHorizontalGroup(
            InsurancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InsurancePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InsurancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(InsurancePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(InsLab))
                    .addGroup(InsurancePanelLayout.createSequentialGroup()
                        .addComponent(medIns)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(dentIns)))
                .addGap(18, 18, 18)
                .addComponent(longIns)
                .addContainerGap())
        );
        InsurancePanelLayout.setVerticalGroup(
            InsurancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InsurancePanelLayout.createSequentialGroup()
                .addComponent(InsLab)
                .addGap(18, 18, 18)
                .addGroup(InsurancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dentIns)
                    .addComponent(longIns)
                    .addComponent(medIns))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        refresh.setBackground(new java.awt.Color(255, 255, 255));
        refresh.setFont(new java.awt.Font("Tahoma", 1, 36)); 
        refresh.setText("REFRESH");
        refresh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        calculate.setBackground(new java.awt.Color(255, 255, 255));
        calculate.setFont(new java.awt.Font("Tahoma", 1, 36)); 
        calculate.setText("CALCULATE");
        calculate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setFont(new java.awt.Font("Tahoma", 1, 36)); 
        exit.setText("EXIT");
        exit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        Output.setEditable(false);
        Output.setColumns(20);
        Output.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); 
        Output.setLineWrap(true);
        Output.setRows(5);
        Output.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Output);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logo)
                .addGap(488, 488, 488))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(SkillPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(noHours)
                            .addGap(29, 29, 29)
                            .addComponent(numHours, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ename)
                        .addGap(57, 57, 57)
                        .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eid)
                        .addGap(59, 59, 59)
                        .addComponent(empID, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(InsurancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ename)
                    .addComponent(eid)
                    .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noHours)
                    .addComponent(numHours, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(InsurancePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SkillPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }    

    // The Insurance JPanel is Enabled only if Skill Level 2 or 3 is selected. Else it is set to False

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {    


        if(num1.isSelected()){
            InsurancePanel.setEnabled(false);
            medIns.setEnabled(false);
            dentIns.setEnabled(false);
            longIns.setEnabled(false);
        }

    }                                                     

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {                                     

        if(num2.isSelected()){
            InsurancePanel.setEnabled(true);
            medIns.setEnabled(true);
            dentIns.setEnabled(true);
            longIns.setEnabled(true);
        }
        else{
            InsurancePanel.setEnabled(false);
            medIns.setEnabled(false);
            dentIns.setEnabled(false);
            longIns.setEnabled(false);
        }
        
    }                                                                      

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {                                     

        if(num3.isSelected()){
            InsurancePanel.setEnabled(true);
            medIns.setEnabled(true);
            dentIns.setEnabled(true);
            longIns.setEnabled(true);
        }
        else{
            InsurancePanel.setEnabled(false);
            medIns.setEnabled(false);
            dentIns.setEnabled(false);
            longIns.setEnabled(false);
        }
    }                                    

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {                                     

        System.exit(0); //Exits the Application
        
    }                                    

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {      

    	// Refreshes the program to Start the calculation for a new employee                                  

        empID.setText("");
        empName.setText("");
        numHours.setText("");
        num1.setSelected(false);
        num2.setSelected(false);
        num3.setSelected(false);
        medIns.setSelected(false);
        dentIns.setSelected(false);
        longIns.setSelected(false);
        InsurancePanel.setEnabled(false);
        medIns.setEnabled(false);
        dentIns.setEnabled(false);
        longIns.setEnabled(false);
        
    }                                       

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {  // Calculates the Total Amount                                         
        
        Output.setText("");
        
        if(empName.getText().equals("") || empName.getText().equals("") || numHours.getText().equals("")){
            JOptionPane.showMessageDialog(this,"ENTER ALL THE INFORMATION PLEASE!");
            
        }
        else{
            String name = empName.getText();
            String ID = empID.getText();
            double hours = Double.parseDouble(numHours.getText());
            double totalPay = 0;
            double regularPay = 0;
            int payRate = 0;
            double totDed = 0;
            double totwithout = 0;
            if(num1.isSelected()){
                payRate = 170;
                totalPay = payRate * hours;
                regularPay = payRate * 40;
                totwithout = totalPay;
            }
            else if(num2.isSelected()){
                payRate = 200;
                totalPay = payRate * hours;
                totwithout = totalPay;
                regularPay = payRate * 40;
                if(medIns.isSelected()){
                    totalPay -= 32.5;
                    totDed += 32.5;
                }
                if(dentIns.isSelected()){
                    totalPay -= 20;
                    totDed += 20;
                }
                if(longIns.isSelected()){
                    totalPay -= 10;
                    totDed += 10;
                }
            }
            else if(num3.isSelected()){
                payRate = 450;
                totalPay = payRate * hours;
                regularPay = payRate * 40;
                totwithout = totalPay;
                if(medIns.isSelected()){
                    totalPay -= 32.5;
                    totDed += 32.5;
                }
                if(dentIns.isSelected()){
                    totalPay -= 20;
                    totDed += 20;
                }
                if(longIns.isSelected()){
                    totalPay -= 10;
                    totDed += 10;
                }
            }
            if((num1.isSelected() == false) && (num2.isSelected() == false) && (num3.isSelected() == false)){
                JOptionPane.showMessageDialog(this, "Please Select A Skill Level");
            }
            else{
                Output.append("Employee Name is " + name + "\n" + "Employee ID is " + ID + "\n");
                Output.append("The Total Hours worked = " + hours + "\n" + "The Hourly Pay Rate = " + payRate + "\n" + "The Regular Pay for 40 hours = " + regularPay + "\n" + "The Total of Regular and OverTime Pay = " + totwithout +  "\n" + "Total Itemised Deductions = " + totDed +  "\n" );
                if(totDed > totalPay){
                    JOptionPane.showMessageDialog(this,"ERROR! Deductions are exceeding the Gross Pay");
                }
                else{
                    Output.append("The Net Pay after all deductions  = " + totalPay +  "\n");
                }
            }
        }
        
        num1.setSelected(false);
        num2.setSelected(false);
        num3.setSelected(false);
        medIns.setSelected(false);
        dentIns.setSelected(false);
        longIns.setSelected(false);
        
    }                        

    //The Try and Catch methods have been taken from the internet just to ensure that no errors take place.                 

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FactoryWorkers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FactoryWorkers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FactoryWorkers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FactoryWorkers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FactoryWorkers().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel InsLab;
    private javax.swing.JPanel InsurancePanel;
    private javax.swing.JLabel Logo;
    private javax.swing.JTextArea Output;
    private javax.swing.JLabel SkillLab;
    private javax.swing.JPanel SkillPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calculate;
    private javax.swing.JRadioButton dentIns;
    private javax.swing.JLabel eid;
    private javax.swing.JTextField empID;
    private javax.swing.JTextField empName;
    private javax.swing.JLabel ename;
    private javax.swing.JButton exit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton longIns;
    private javax.swing.JRadioButton medIns;
    private javax.swing.JLabel noHours;
    private javax.swing.JRadioButton num1;
    private javax.swing.JRadioButton num2;
    private javax.swing.JRadioButton num3;
    private javax.swing.JTextField numHours;
    private javax.swing.JButton refresh;
    
}
