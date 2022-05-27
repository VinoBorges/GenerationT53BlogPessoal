package com.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Postagem;

@Repository //indica que é um repositório
public interface PostagemRepository extends JpaRepository<Postagem,Long>{ //refencia a herança da interface através da JpaRepository
	

}
