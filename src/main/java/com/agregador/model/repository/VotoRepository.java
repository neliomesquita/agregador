package com.agregador.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.agregador.model.entity.TblVoto;

@Repository
public interface  VotoRepository extends JpaRepository<TblVoto, Long>  {

}
