package com.amine;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//http://localhost:8080/05_RestXml/rest/kayit
@Path("/kayit")
public class Merkez {

//http://localhost:8080/05_RestXml/rest/kayit/bilgi/100
	@GET
	@Path("/bilgi/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Musteri getMusteriBilgi(@PathParam("id") int id) {
		Musteri musteri = new Musteri();
		musteri.setMusteriId(id);
		musteri.setMusteriadi("Amine");
		musteri.setMusterisehir("Yozgat");
		return musteri;
	}

}
