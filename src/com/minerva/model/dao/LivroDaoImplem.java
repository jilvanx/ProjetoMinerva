package com.minerva.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.minerva.model.model.LivroModel;

public class LivroDaoImplem implements LivroDaoInterface {
	
	@PersistenceContext(unitName="ProjetoMinervaUnit")
	private EntityManager entityManager;

	@Override
	public LivroModel salvar(LivroModel livroModel) {
		entityManager.persist(livroModel);
		
		return livroModel;
	}

	@Override
	public void alterar(LivroModel livroModel) {
		LivroModel livroModelMerge = entityManager.merge(livroModel);
		entityManager.persist(livroModelMerge);
	}

	@Override
	public void excluir(LivroModel livroModel) {
		LivroModel livroModelMerge = entityManager.merge(livroModel);
		entityManager.remove(livroModelMerge);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LivroModel> getLivros() {
		Query query = entityManager.createQuery("from LivroModel");
		return query.getResultList();
	}

}
