package com.minerva.model.rest.facade;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.minerva.model.model.LivroModel;
import com.minerva.model.services.LivroServiceInterface;

@Path("/livros")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class LivrosFacade {

	
	/*Usando direto, sem o uso do serviço*/
	/*@Inject
	private LivroDaoImplem livroDaoImplem;
	
	@GET
	public List<LivroModel> getLivros() {		
		return livroDaoImplem.getLivros();
	}*/
	
	@Inject
	private LivroServiceInterface livroServiceInterface;

	@GET
	public List<LivroModel> getLivros() {		
		return livroServiceInterface.getLivros();
	}
	
	@POST
	public LivroModel salvar(LivroModel livroModel){
		return livroServiceInterface.salvar(livroModel);
	}
	
	@PUT
	public void atualizar(LivroModel livroModel){
		livroServiceInterface.alterar(livroModel);
	}
	
	@DELETE
	@Path("/{codigoLivro}")
	public void excluir (@PathParam("codigoLivro") Integer codigoLivro){
		LivroModel livroModel = new LivroModel();
		livroModel.setCodigo(codigoLivro);
		livroServiceInterface.excluir(livroModel);
	}
	
}
