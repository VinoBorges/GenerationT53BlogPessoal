package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Postagem;

@Repository //indica que é um repositório
public interface PostagemRepository extends JpaRepository<Postagem,Long>{ //refencia a herança da interface através da JpaRepository
	
	public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo); //criando método que não é nativo
	//select * from tb_postagens where titulo like "%titulo%";

}
