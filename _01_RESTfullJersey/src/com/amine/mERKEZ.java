package com.amine;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.QueryParam;
//Pathin anlamý bir adres oluþturma örneðin: http://_01_RESTfullJersey/rest/selam
@Path(value = "/selam")
public class mERKEZ {

	
 //http://_01_RESTfullJersey/rest/selam
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String metot1() {
		return "Selamlar RESTful";
	}

	@GET
	@Produces("text/html")
	public Response metot2() {
	String sonuc= "<font face = verdana size=40 color=red>METOT2</font>";
		return Response.status(200).entity(sonuc).build();
	}

	//http://_01_RESTfullJersey/rest/selam/sorgu1
	@GET
	@Path(value = "/sorgu3")
	@Produces("text/html")
	public Response metot3() {
	String sonuc= "<font face = verdana size=60 color=blue>METOT3</font>";
		return Response.status(200).entity(sonuc).build();
	}

	//http://_01_RESTfullJersey/rest/selam/sorgu4
		@GET
		@Path("/{benimParametrem}")
		@Produces(MediaType.TEXT_XML)
		public Response metot4(@PathParam("benimParametrem") String benimParametrem) {
		String sonuc= "<?xml version=\"1.0\"?><soyle>"+ benimParametrem +"</soyle>";
			return Response.status(200).entity(sonuc).build();
		}

		//http://_01_RESTfullJersey/rest/selam/sorgu4
				@GET
				@Path("sorgu5/{benimParametrem}")
				@Produces(MediaType.TEXT_XML)
				public Response metot5(@QueryParam("adi") String adi) {
				String sonuc= "SELAM"+ adi +" :) ";
					return Response.ok(sonuc, MediaType.TEXT_XML).build();
				}

}
