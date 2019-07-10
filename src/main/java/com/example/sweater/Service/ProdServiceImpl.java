package com.example.sweater.Service;

import com.example.sweater.Repository.ProductDao;
import com.example.sweater.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ProdServiceImpl implements ProdService {


    @Autowired
    ProductDao productDao;

    @Override
    public List<Product> getAll() {
        return productDao.findAll();
    }
}
