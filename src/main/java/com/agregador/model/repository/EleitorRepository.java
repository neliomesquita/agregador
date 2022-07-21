package com.agregador.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.agregador.model.entity.TblEleitor;

@Repository
public interface  EleitorRepository extends JpaRepository<TblEleitor, Long>  {

}
