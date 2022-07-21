package com.agregador.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.agregador.model.entity.TblZonaEleitoral;

@Repository
public interface  ZonaEleitoralRepository extends JpaRepository	<TblZonaEleitoral, Long> {

}
