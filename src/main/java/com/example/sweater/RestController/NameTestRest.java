package com.example.sweater.RestController;

import com.example.sweater.Repository.NameTestDao;
import com.example.sweater.Service.NameTestService;
import com.example.sweater.model.NameTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class NameTestRest {


    @Autowired
    NameTestService nameTestService;

    @Autowired
    NameTestDao nameTestDao;

    @RequestMapping(method = RequestMethod.GET, name = "/all")
    ResponseEntity <List<NameTest>> getAll(){

        List<NameTest>    allUser = nameTestService.getAll();
        System.out.println("/all ADDED!!!!!!!!!");

        return new ResponseEntity<>(allUser, HttpStatus.ACCEPTED);
    }


    @RequestMapping(value = "/employee", method = RequestMethod.POST,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                         MediaType.APPLICATION_XML_VALUE })
    public NameTest addEmployee(@RequestBody NameTest empForm) {

        System.out.println("(Service Side) Creating employee with empNo: " + empForm.getEmpId());
        return nameTestService.addTest(empForm);
    }


    @RequestMapping(value = "/employees", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE , //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public List<NameTest> getEmployees() {
        List<NameTest> list = nameTestDao.findAll();
        return list;
    }

    // URL:
    // http://localhost:8080/SomeContextPath/employee/{empId}
    // http://localhost:8080/SomeContextPath/employee/{empId}.xml
    // http://localhost:8080/SomeContextPath/employee/{empId}.json
    @RequestMapping(value = "/employee/{empId}", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public NameTest getEmployee(@PathVariable("empId") Long empId) {
        return nameTestDao.getOne(empId);
    }

    // URL:
    // http://localhost:8080/SomeContextPath/employee
    // http://localhost:8080/SomeContextPath/employee.xml
    // http://localhost:8080/SomeContextPath/employee.json



    // URL:
    // http://localhost:8080/SomeContextPath/employee
    // http://localhost:8080/SomeContextPath/employee.xml
    // http://localhost:8080/SomeContextPath/employee.json
    @RequestMapping(value = "/employee", //
            method = RequestMethod.PUT, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public NameTest updateEmployee(@RequestBody NameTest empForm) {

        System.out.println("(Service Side) Editing employee with Id: " + empForm.getEmpId());

        return nameTestDao.save(empForm);
    }

    // URL:
    // http://localhost:8080/SomeContextPath/employee/{empId}
    @RequestMapping(value = "/employee/{empId}", //
            method = RequestMethod.DELETE, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void deleteEmployee(@PathVariable("empId") Long empId) {

        System.out.println("(Service Side) Deleting employee with Id: " + empId);

        nameTestDao.deleteById(empId);
    }

}
