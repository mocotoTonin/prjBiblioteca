package com.marco.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marco.demo.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
