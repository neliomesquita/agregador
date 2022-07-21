package com.agregador.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.agregador.model.entity.TblMesario;

@Repository
public interface  MesarioRepository extends JpaRepository<TblMesario, Long>  {

}
