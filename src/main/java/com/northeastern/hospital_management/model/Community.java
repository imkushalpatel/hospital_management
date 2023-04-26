/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.northeastern.hospital_management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



/**
 *
 * @author imkus
 */
@Entity
@Table(name = "community")
public class Community {

    public static int ID = 1001;

    public Community(int communityId, String area, String district, String pinCode, City city) {
        this.communityId = communityId;
        this.area = area;
        this.district = district;
        this.pinCode = pinCode;
        this.city = city;
    }

    public Community() {

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int communityId;

    @Column(name = "area")
    String area;
    @Column(name = "district")

    String district;
    @Column(name = "pincode")

    String pinCode;

    public enum City {
        Toronto, Etobicoke, Ottawa;
    }

    @Enumerated(EnumType.STRING)
    City city;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getCommunityId() {
        return communityId;
    }

    public void setCommunityId(int communityId) {
        this.communityId = communityId;
    }

    @Override
    public String toString() {
        return area + ',' + district + ',' + city.toString();
    }

}
