/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.northeastern.hospital_management.dao.impl;

import com.northeastern.hospital_management.dao.CommunityRepository;
import com.northeastern.hospital_management.model.Community;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author imkus
 */
public class CommunityRepositoryImpl {

    @Autowired
   CommunityRepository communityRepository;

    public int count() {
        return (int) communityRepository.count();
    }

    public ArrayList<Community> findAll() {

        return communityRepository.findAll();
    }

    public void deleteById(int id) {
        communityRepository.deleteById(id);
    }

    public Community save(Community community) {
        return communityRepository.save(community);
    }

    public Community findById(int id) {
        return communityRepository.findById(id).get();
    }

}
