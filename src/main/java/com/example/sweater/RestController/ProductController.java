package com.example.sweater.RestController;

import com.example.sweater.Repository.ProductDao;
import com.example.sweater.Service.ProdService;
import com.example.sweater.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController  {


    @Autowired
    ProdService productDao;

    @Autowired
    ProductDao productDao1;

    public int i;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    @ResponseBody
    public List<Product> products(){

        System.out.println("GETING ALLLLL"+ ++i);

        return  productDao1.findAll();
    }

}
