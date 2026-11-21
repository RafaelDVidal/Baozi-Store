package com.rafaeldvidal.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rafaeldvidal.baozistore.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> { }
