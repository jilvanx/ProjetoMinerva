package com.minerva.model.services;

import java.util.List;

import com.minerva.model.model.LivroModel;

public interface LivroServiceInterface {

	LivroModel salvar(LivroModel livroModel);
	
	void alterar(LivroModel livroModel);
	
	void excluir(LivroModel livroModel);
	
	List<LivroModel> getLivros();	
	
}
