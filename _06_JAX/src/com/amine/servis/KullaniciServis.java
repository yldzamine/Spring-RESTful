package com.amine.servis;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.amine.model.Kullanici;


//http://localhost:8080/_06_JAX/rest/kullanici
@Path("/kullanici")
public class KullaniciServis {

	//http://localhost:8080/_06_JAX/kullanici/bilgi/15
	@GET
	@Path("/bilgi/{id}")
	//@Produces(MediaType.APPLICATION_XML)
	public Response getKullaniciBilgi(@PathParam("id") int id) {
		
		Kullanici kul = new Kullanici();
		kul.setKullaniciId(id);
		kul.setKullaniciadi("Burak");
		kul.setKullanicisoyadi("Yýlmaz");
		return Response.status(200).entity(kul).build();
	}
}
