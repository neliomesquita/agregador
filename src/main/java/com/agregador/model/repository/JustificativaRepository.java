package com.agregador.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.agregador.model.entity.TblJustificativa;

@Repository
public interface  JustificativaRepository extends JpaRepository<TblJustificativa, Long>  {

}
