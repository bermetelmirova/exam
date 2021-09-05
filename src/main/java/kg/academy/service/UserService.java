package kg.academy.service;

import kg.academy.dao.impl.UserDaoImpl;
import kg.academy.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Path("/user")
public class UserService {
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public Response createUser(User user){
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.save(user);
        if(user.getBirtYear() > 2000)
            return Response.accepted().entity("ОШИБКА!!!").build();
        return Response.accepted().entity(user.toString()).build();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getAll(){
        UserDaoImpl userDao = new UserDaoImpl();
        return Response.accepted().entity(userDao.getAll()).build();
    }
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getById(@PathParam("id") Long id){
        UserDaoImpl userDao = new UserDaoImpl();
        return Response.accepted().entity(userDao.getById(id)).build();
    }

    @DELETE
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response deleteById(@PathParam("id") Long id){
        UserDaoImpl userDao = new UserDaoImpl();
        return Response.accepted().entity(userDao.deleteById(id)).build();
    }

    @GET
    @Path("/searchname/{name}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getByName(@PathParam("name") String name){
        UserDaoImpl userDao = new UserDaoImpl();
        return Response.accepted().entity(userDao.getByName(name)).build();
    }

    @GET
    @Path("/searchyear/{year}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getByYear(@PathParam("year") int year) throws SQLException {
        UserDaoImpl userDao = new UserDaoImpl();
        return Response.accepted().entity(userDao.getByBirthYear(year)).build();
    }

    @GET
    @Path("/searchgender/{gender}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getByGender(@PathParam("gender") boolean gender){
        UserDaoImpl userDao = new UserDaoImpl();
        return Response.accepted().entity(userDao.getByGender(gender)).build();
    }
}
