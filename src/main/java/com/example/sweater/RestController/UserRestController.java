package com.example.sweater.RestController;


import com.example.sweater.Repository.UserDao;
import com.example.sweater.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRestController {


    // fixed adding to DB

    @Autowired
    UserDao userDao;


    @Autowired
    UserDao notUserDao;

    @RequestMapping(value = "/user1", method = RequestMethod.POST,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    public void addUser1(@RequestBody User user){

        System.out.println("User " + user.getId() + "add");
        this.userDao.save(user);
    }



    @RequestMapping(value = "/user", method = RequestMethod.POST,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    public void addUser(@RequestBody User user){

        System.out.println("User " + user.getId() + "add");
        this.userDao.save(user);
    }


    @RequestMapping(value = "/user", //
            method = RequestMethod.PUT, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public User updateEmployee(@RequestBody User empForm) {

        System.out.println("(Service Side) Editing employee with Id: " + empForm.getId());

        return userDao.save(empForm);
    }



    // URL:
    // http://localhost:8080/SomeContextPath/employee/{empId}
    @RequestMapping(value = "/user/{empId}", //
            method = RequestMethod.DELETE, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void deleteEmployee(@PathVariable("empId") Long empId) {

        System.out.println("(Service Side) Deleting employee with Id: " + empId);

        userDao.deleteById(empId);
    }



    @RequestMapping(value = "/user/{empId}", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public User getEmployee(@PathVariable("empId") Long empId) {

        System.out.println("USER get one");

        return userDao.getOne(empId);

    }

    @RequestMapping(value = "/users", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE , //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public List<User> getEmployees() {
        List<User> list = userDao.findAll();

        System.out.println("user get All");
        return list;
    }


}
