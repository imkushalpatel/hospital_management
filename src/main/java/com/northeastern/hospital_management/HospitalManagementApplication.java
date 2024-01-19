/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.northeastern.hospital_management;

import com.northeastern.hospital_management.view.MainJFrame;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author imkus
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.northeastern.hospital_management.*"})
@EnableJpaRepositories(basePackages = {"com.northeastern.hospital_management.*"})
@EntityScan(basePackages = {"com.northeastern.hospital_management.*"})
public class HospitalManagementApplication implements CommandLineRunner {

    public static void main(String[] args) {
//      SpringApplication.run(HospitalManagementApplication.class, args);
        new SpringApplicationBuilder(HospitalManagementApplication.class)
                .headless(false).bannerMode(Banner.Mode.OFF).run(args);
    }

    @Override
    public void run(String... args) throws Exception {

        SwingUtilities.invokeLater(() -> {
            MainJFrame frame = new MainJFrame();
            frame.setVisible(true);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        });
    }

}
