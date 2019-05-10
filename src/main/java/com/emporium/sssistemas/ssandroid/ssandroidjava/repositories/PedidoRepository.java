package com.emporium.sssistemas.ssandroid.ssandroidjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emporium.sssistemas.ssandroid.ssandroidjava.domains.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {	
	Pedido findById(long id);	
}
