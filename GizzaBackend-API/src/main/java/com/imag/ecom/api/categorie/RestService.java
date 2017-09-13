package com.imag.ecom.api.categorie;

import java.util.List;

import javax.enterprise.context.RequestScoped;
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

import com.imag.ecom.categorie.Categorie;
import com.imag.ecom.categorie.Repository;

@Path("/categorie")
@RequestScoped
public class RestService {
	@Inject
	private Repository repository;

	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Categorie add(Categorie c) {
		return repository.add(c);
	}

	@DELETE
	@Path("/delete/{id}")
	public void delete(@PathParam(value = "id") Long id) {
		repository.delete(id);
	}

	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Categorie> getAll() {
		return repository.getAll();
	}

	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Categorie getByID(@PathParam(value = "id") Long id) {
		return repository.getByID(id);
	}

	@GET
	@Path("/get/{nom}")
	@Produces(MediaType.APPLICATION_JSON)
	public Categorie getByName(@PathParam(value = "nom") String name) {
		return repository.getByName(name);
	}

	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Categorie update(Categorie p) {
		return repository.update(p);
	}

}
