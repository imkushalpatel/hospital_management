/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.northeastern.hospital_management.model;

/**
 *
 * @author imkus
 */
public class Encounter {

    public static int ID = 1001;

    int encounterId;
    int doctorId;
    int patientId;
    VitalSign vitalSign;

    public Encounter() {
    }

    public Encounter(int encounterId, int doctorId, int patientId, VitalSign vitalSign) {
        this.encounterId = encounterId;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.vitalSign = vitalSign;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public VitalSign getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
    }

    public int getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(int encounterId) {
        this.encounterId = encounterId;
    }

}
