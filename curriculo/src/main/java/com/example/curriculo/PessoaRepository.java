package com.example.curriculo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.curriculo.Pessoa; // Substitua pelo caminho correto do seu modelo Pessoa

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    // Aqui, você pode adicionar métodos personalizados, se necessário
}
