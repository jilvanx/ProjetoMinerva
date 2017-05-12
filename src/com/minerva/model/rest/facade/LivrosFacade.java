package com.minerva.model.rest.facade;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.minerva.model.LivroModel;

@Path("/livros")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class LivrosFacade {

	static List<LivroModel> listaLivros = new ArrayList<LivroModel>();
	
	static {
		listaLivros.add(new LivroModel(1, "Livro 1", "Jilvan Cândido", 2000, "Estante 3", 10));
		listaLivros.add(new LivroModel(2, "Livro 2", "Jilvan Cândido", 2004, "Estante 1", 5));
		listaLivros.add(new LivroModel(3, "Livro 3", "Jilvan Cândido", 2014, "Estante 2", 60));
	}
	
	@GET
	public List<LivroModel> getLivros(){
		return listaLivros;
	}
	
}
