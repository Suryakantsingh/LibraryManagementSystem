/**
 * 
 */
package service.admin;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author suryakant
 *
 */
@Path("/AdminService")
public class AdminService {
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addBook(
			@FormParam("name") String name
			){
		System.out.println(name);
		return Response.status(200).entity("Success").build();
	}
	

}
