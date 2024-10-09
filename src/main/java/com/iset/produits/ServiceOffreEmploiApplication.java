package com.iset.produits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.iset.produits.repository.OffreRepository;
import com.iset.produits.entity.Offre;

@SpringBootApplication
public class ServiceOffreEmploiApplication implements CommandLineRunner { 

    @Autowired 
    OffreRepository offreRepository; 

    public static void main(String[] args) { 
        SpringApplication.run(ServiceOffreEmploiApplication.class, args); 
    } 

    @Override
    public void run(String... args) throws Exception { 
        // Saving job offers to the database
        offreRepository.save(new Offre(0, "Web Design", "informatique", "AXA", 2, "France")); 
        offreRepository.save(new Offre(0, "Developpeur", "informatique", "Talys", 3, "Tunisie")); 
        offreRepository.save(new Offre(0, "Architecte", "informatique", "SIS", 2, "Allemagne")); 
    } 
}
