package com.emporium.sssistemas.ssandroid.ssandroidjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emporium.sssistemas.ssandroid.ssandroidjava.domains.Atendimento;
import com.emporium.sssistemas.ssandroid.ssandroidjava.domains.Lancamento;

@Repository
public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

	Lancamento findById(long id);
	
	Lancamento findByAtendimento(Atendimento atendimento);

	
}
