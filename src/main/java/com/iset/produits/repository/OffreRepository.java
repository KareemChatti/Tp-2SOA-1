package com.iset.produits.repository;

import org.springframework.stereotype.Repository;

import com.iset.produits.entity.Offre;

import org.springframework.data.jpa.repository.JpaRepository; 

@Repository
public interface OffreRepository extends JpaRepository<Offre, Long> {
   
}
