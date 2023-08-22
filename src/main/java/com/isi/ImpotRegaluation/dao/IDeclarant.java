package com.isi.ImpotRegaluation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isi.ImpotRegaluation.entities.Declarant;

@Repository
public interface IDeclarant extends JpaRepository<Declarant, Long> {

}
