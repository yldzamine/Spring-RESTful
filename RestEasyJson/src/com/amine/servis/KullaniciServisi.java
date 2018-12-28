package com.amine.servis;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.amine.model.Kullanici;

@Path("/kullanici")
public class KullaniciServisi {

	// http://localhost:8080/RestEasyJson/kullanici/detay/15
	
	@GET
	@Path ("/detay/{id}")
	@Produces (MediaType.APPLICATION_JSON+ ";charset-utf-8")
	public Response getKullaniciBilgi(@PathParam("id") Integer id) {
		
		Kullanici kullanici = new Kullanici();
		
		kullanici.setKullaniciId(id);
		kullanici.setKullaniciAdi("BURAK");
		kullanici.setKullaniciSoyadi("YILMAZ");
	
		return Response.status(200).entity(kullanici).build();
		
	}

}