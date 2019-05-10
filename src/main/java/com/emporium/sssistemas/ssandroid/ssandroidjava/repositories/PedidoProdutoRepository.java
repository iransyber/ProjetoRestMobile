package com.emporium.sssistemas.ssandroid.ssandroidjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emporium.sssistemas.ssandroid.ssandroidjava.domains.PedidoProduto;

@Repository
public interface PedidoProdutoRepository extends JpaRepository<PedidoProduto, Long> {

}
