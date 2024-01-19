/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.northeastern.hospital_management.data;

import java.util.ArrayList;
import com.northeastern.hospital_management.model.Admin;
import com.northeastern.hospital_management.model.Community;
import com.northeastern.hospital_management.model.Doctor;
import com.northeastern.hospital_management.model.Encounter;
import com.northeastern.hospital_management.model.Hospital;
import com.northeastern.hospital_management.model.Patient;

/**
 *
 * @author imkus
 */
public class MainDataList {

    private MainDataList() {

    }
    private static MainDataList mainDataList = new MainDataList();

    public static ArrayList<Hospital> hospitalList = new ArrayList<>();
    public static ArrayList<Doctor> doctorList = new ArrayList<>();
    public static ArrayList<Patient> patientList = new ArrayList<>();
    public static ArrayList<Admin> adminList = new ArrayList<>();
    public static ArrayList<Encounter> encounters = new ArrayList<>();

    public static MainDataList getMainDataListInstance() {
        return mainDataList;
    }

}
