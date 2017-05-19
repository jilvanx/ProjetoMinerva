package com.minerva.model.dao;

import java.util.List;

import com.minerva.model.model.LivroModel;

public interface LivroDaoInterface {
	
	LivroModel salvar(LivroModel livroModel);
	
	void alterar(LivroModel livroModel);
	
	void excluir(LivroModel livroModel);
	
	List<LivroModel> getLivros();
	
}
