/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.zaki;

import me.zaki.Controller.MahasiswaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Ibra
 */
@SpringBootApplication
public class Pertemuan5_50421620 implements CommandLineRunner {

    @Autowired
    private MahasiswaController mhscontroller;
   
    public static void main(String[] args) {
        SpringApplication.run(Pertemuan5_50421620.class, args);
    }
    
    @Override
    public void run (String... args)throws Exception{
        mhscontroller.tampilkanMenu();
    
    }
}
