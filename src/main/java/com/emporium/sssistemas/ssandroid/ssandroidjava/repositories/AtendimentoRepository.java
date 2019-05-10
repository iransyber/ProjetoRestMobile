package com.emporium.sssistemas.ssandroid.ssandroidjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emporium.sssistemas.ssandroid.ssandroidjava.domains.Atendimento;

@Repository
public interface AtendimentoRepository extends JpaRepository<Atendimento, Long> {
	
	Atendimento findByAtendimentoId(long id);

}
