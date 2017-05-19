package com.minerva.model.services;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.minerva.model.dao.LivroDaoInterface;
import com.minerva.model.model.LivroModel;

public class LivroServiceImplem implements LivroServiceInterface{

	@Inject
	private LivroDaoInterface livroDaoInterface;
	
	@Override
	public List<LivroModel> getLivros() {
		return livroDaoInterface.getLivros();
	}
	
	@Override
	@Transactional 
	public LivroModel salvar(LivroModel livroModel) {
		return livroDaoInterface.salvar(livroModel);
	}

	@Override
	@Transactional
	public void alterar(LivroModel livroModel) {
		livroDaoInterface.alterar(livroModel);
	}

	@Override
	@Transactional
	public void excluir(LivroModel livroModel) {
		livroDaoInterface.excluir(livroModel);
	}

}
