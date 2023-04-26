/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.northeastern.hospital_management.view;

import com.northeastern.hospital_management.data.MainDataList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import com.northeastern.hospital_management.model.Community;
import com.northeastern.hospital_management.model.Doctor;
import com.northeastern.hospital_management.model.Hospital;
import com.northeastern.hospital_management.model.table.DoctorModelFilter;

/**
 *
 * @author imkus
 */
public class PatientDirectory extends javax.swing.JPanel {

    /**
     * Creates new form PatientDirectory
     */
    DoctorModelFilter dm;

    public PatientDirectory() {
        initComponents();
        dm = new DoctorModelFilter(MainDataList.doctorList);
        doctorTable.setModel(dm);
//        communityComboBox.setModel(new DefaultComboBoxModel<>(MainDataList.communityList.toArray(new Community[0])));
        communityComboBox.setSelectedIndex(-1);
        cityComboBox.setModel(new DefaultComboBoxModel<>(Community.City.values()));
        cityComboBox.setSelectedIndex(-1);
//        hospitalComboBox.setModel(new DefaultComboBoxModel<>(MainDataList.hospitalList.toArray(new Hospital[0])));
        hospitalComboBox.setSelectedIndex(-1);

        cityComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (cityComboBox.getSelectedIndex() != -1) {
                    communityComboBox.setModel(new DefaultComboBoxModel<>(MainDataList.communityList.stream().filter((c) -> c.getCity() == cityComboBox.getSelectedItem()).toArray(Community[]::new)));
                    communityComboBox.setSelectedIndex(-1);
                }
            }
        });
        communityComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (communityComboBox.getSelectedIndex() != -1) {
                    hospitalComboBox.setModel(new DefaultComboBoxModel<>(MainDataList.hospitalList.stream().filter((h) -> h.getCommunityId() == ((Community) communityComboBox.getSelectedItem()).getCommunityId()).toArray(Hospital[]::new)));
                    hospitalComboBox.setSelectedIndex(-1);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        firstNameField = new javax.swing.JTextField();
        viewButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorTable = new javax.swing.JTable();
        emailField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hospitalField = new javax.swing.JTextField();
        genderField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cityComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        communityComboBox = new javax.swing.JComboBox<>();
        hospitalComboBox = new javax.swing.JComboBox<>();
        applyButton = new javax.swing.JButton();

        jLabel3.setText("Last Name:");

        jLabel4.setText("Gender");

        lastNameField.setEnabled(false);

        jLabel5.setText("Email:");

        phoneField.setEnabled(false);

        jLabel6.setText("Phone:");

        clearButton.setText("Clear Selection");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        firstNameField.setEnabled(false);

        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        doctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        doctorTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(doctorTable);

        emailField.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Doctor Directory");

        jLabel7.setText("Hospital:");

        jLabel2.setText("First Name");

        hospitalField.setEnabled(false);

        genderField.setEnabled(false);

        jLabel8.setText("City:");

        jLabel9.setText("Community:");

        jLabel10.setText("Hospital:");

        applyButton.setText("Apply");
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameField)
                                    .addComponent(lastNameField)
                                    .addComponent(phoneField)
                                    .addComponent(emailField)
                                    .addComponent(hospitalField)
                                    .addComponent(genderField)))
                            .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cityComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(communityComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hospitalComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(applyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(communityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(hospitalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(applyButton)
                        .addGap(17, 17, 17)
                        .addComponent(viewButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(hospitalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        firstNameField.setText("");
        lastNameField.setText("");
        emailField.setText("");
        phoneField.setText("");
        genderField.setText("");
        hospitalField.setText("");
        cityComboBox.setSelectedIndex(-1);
        communityComboBox.setSelectedIndex(-1);
        hospitalComboBox.setSelectedIndex(-1);
        dm = new DoctorModelFilter(MainDataList.doctorList);
        doctorTable.setModel(dm);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        if (doctorTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select doctor from list", "No doctor selected", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Doctor d = MainDataList.doctorList.get(doctorTable.getSelectedRow());
        firstNameField.setText(d.getFirstName());
        lastNameField.setText(d.getLastName());
        emailField.setText(d.getEmail());
        phoneField.setText(d.getPhone());
        Hospital hospital = MainDataList.hospitalList.stream().filter((h) -> h.getHospitalId() == d.getHospitalId()).findAny().get();
        hospitalField.setText(hospital.getName());
        genderField.setText(d.getGender().toString());
    }//GEN-LAST:event_viewButtonActionPerformed

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
        if (hospitalComboBox.getSelectedIndex() != -1) {
            dm = new DoctorModelFilter(MainDataList.doctorList.stream().filter((h) -> h.getHospitalId() == ((Hospital) hospitalComboBox.getSelectedItem()).getHospitalId()).collect(Collectors.toCollection(ArrayList::new)));
            doctorTable.setModel(dm);
//            dm.fireTableDataChanged();
        } else if (communityComboBox.getSelectedIndex() != -1) {

        } else if (communityComboBox.getSelectedIndex() != -1) {

        }
    }//GEN-LAST:event_applyButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyButton;
    private javax.swing.JComboBox<Community.City> cityComboBox;
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<Community> communityComboBox;
    private javax.swing.JTable doctorTable;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JTextField genderField;
    private javax.swing.JComboBox<Hospital> hospitalComboBox;
    private javax.swing.JTextField hospitalField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
