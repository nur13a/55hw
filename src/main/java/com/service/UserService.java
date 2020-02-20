package com.service;

import com.dao.UserDao;
import com.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Path("/users")
public class UserService {
    UserDao userDao=new UserDao();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User>getUsers_JSON(){

        return userDao.getUsers_JSON();
    } @GET
    @Path("/{userId}")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public User getUser(@PathParam("userId") Integer userId){
        return userDao.getUserById(userId);
    }


}
