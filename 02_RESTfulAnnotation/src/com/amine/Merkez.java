package com.amine;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.Response;

//http://localhost:8080/02_RESTfulAnnotation/rest/kullanici
@Path(value="/kullanici")
public class Merkez {

	//http://localhost:8080/02_RESTfulAnnotation/rest/kullanici
	@GET
	public Response SelamVer() {
		return Response.status(200).entity("selamlar").build();
	}
	

	//http://localhost:8080/02_RESTfulAnnotation/rest/kullanici/selamla
	@GET
	@Path("/selamla")
	public Response SelamVer2() {
		return Response.status(200).entity("selamlama yapýlýyor").build();
	}
	

	//http://localhost:8080/02_RESTfulAnnotation/rest/kullanici/selamla/Muhammed
	@GET
	@Path("/selamla/{adi}")
	public Response SelamVer3(@PathParam("adi") String adi) {
		return Response.status(200).entity("selamlar" + adi).build();
	}
	
	//http://localhost:8080/02_RESTfulAnnotation/rest/kullanici/{66}/{YOZGAT}
		@GET
		@Path("/{plakanumarasi}/{sehirADÝ}")
		@Produces("text/html")
		public Response SelamVer4(@PathParam("plakanumarasi") String plakanumarasi ,
				@PathParam("sehirADÝ") String sehirADÝ
				) {
			String sonuc = "DETAYLAR :" + plakanumarasi +"_" + sehirADÝ;
			return Response.status(200).entity(sonuc).build();
		}
	
//http://localhost:8080/02_RESTfulAnnotation/rest/kullanici/regex/Muhammed
	@GET
	@Path("/regex/{adi :[a-zA-Z][a-zA-Z_0-9]+ }")
	public Response SelamVerRegex(@PathParam("adi") String adi) {
		return Response.status(200).entity("selamlar" + adi).build();
	}
	
	//http://localhost:8080/02_RESTfulAnnotation/rest/kullanici/1/Muhammed
		@GET
		@Path("/1/{adi}")
		public Response SelamVer5(@PathParam("adi") String adi) {
			return Response.status(200).entity("selamlar" + adi).build();
		}
	
	//http://localhost:8080/02_RESTfulAnnotation/rest/kullanici/2/Muhammed/24
		@GET
		@Path("/2/{adi}/{yasi}")
		public Response SelamVer6(@PathParam("adi") String adi, @PathParam("yasi") String yasi) {
			return Response.status(200).entity("ADI:" + adi + "\nYAÞI :" + yasi).build();
		}
		
		//http://localhost:8080/02_RESTfulAnnotation/rest/kullanici;adi=Süleyman;ulke=Türkiye
				@GET
				@Produces("text/html"+";charset=utf-8")
				public Response personelBilgisi(@MatrixParam("adi") String adi, @MatrixParam("ulke") String ulke) {
					return Response.status(200).entity("ADI:" + adi + "\nÜLKE :" + ulke).build();
				}
				//http://localhost:8080/02_RESTfulAnnotation/rest/kullanici/3/detay;adi=Süleyman;meslek=Yazýlýmcý;tecrube=7
				@GET
				@Path("/3/{detay}")
				@Produces("text/html"+";charset=utf-8")
				public Response personelBilgisi1(@PathParam("detay") PathSegment detay) {
					String personel ="PERSONEL :";
					MultivaluedMap<String,String> matrix = detay.getMatrixParameters();
					for(String key :matrix.keySet()) {
						personel += personel + key + matrix.get(key) +" ";
					}
					personel += " ";
					return Response.status(200).entity(personel).build();
				}
	}
