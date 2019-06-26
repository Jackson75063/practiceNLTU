package com.example.sweater.Service;


import com.example.sweater.Repository.NameTestDao;
import com.example.sweater.model.NameTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameTestSevice implements NameTestService {

    @Autowired
    NameTestDao nameTestDao;


    @Override
    public NameTest addTest(NameTest nameTest) {
        return nameTestDao.save(nameTest);
    }

    @Override
    public NameTest getById(Long id) {
        return nameTestDao.getOne(id);
    }

    @Override
    public void delById(Long id) {
        nameTestDao.deleteById(id);
    }

    @Override
    public List<NameTest> getAll() {
        return nameTestDao.findAll();
    }
}
