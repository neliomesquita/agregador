package com.agregador.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.agregador.model.entity.TblSecaoEleitoral;

@Repository
public interface  SecaoEleitoralRepository extends JpaRepository<TblSecaoEleitoral, Long>  {

}
