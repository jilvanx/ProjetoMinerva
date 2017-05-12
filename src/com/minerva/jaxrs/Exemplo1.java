package com.minerva.jaxrs;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/exemplowsrs")
public class Exemplo1 {

	@GET
	public String mostra(){
		return "Projeto executou um metodo GET";
	}

	
}
