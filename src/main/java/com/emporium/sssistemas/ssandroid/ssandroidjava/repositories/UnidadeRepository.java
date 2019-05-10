package com.emporium.sssistemas.ssandroid.ssandroidjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emporium.sssistemas.ssandroid.ssandroidjava.domains.Unidade;

@Repository
public interface UnidadeRepository extends JpaRepository<Unidade, Long> {

	Unidade findByUnidadeId(Integer id);
	
}
