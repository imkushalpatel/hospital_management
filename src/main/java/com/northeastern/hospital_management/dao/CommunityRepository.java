/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.northeastern.hospital_management.dao;

import com.northeastern.hospital_management.model.Community;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author imkus
 */
@Repository("communityRepository")
public class CommunityRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Community save(Community community) {
        entityManager.persist(community);
        return community;

    }

    public Community findById(int id) {
        return entityManager.find(Community.class, id);
    }

    public int count() {
        return (int) entityManager.createNativeQuery("select count(c) from Community c").getSingleResult();
    }

}
