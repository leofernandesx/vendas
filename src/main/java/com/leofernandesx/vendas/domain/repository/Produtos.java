package com.leofernandesx.vendas.domain.repository;

import com.leofernandesx.vendas.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {

}
