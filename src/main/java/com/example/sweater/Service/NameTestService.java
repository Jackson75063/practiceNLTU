package com.example.sweater.Service;

import com.example.sweater.model.NameTest;

import java.util.List;

public interface NameTestService {

    NameTest addTest(NameTest nameTest);
    NameTest getById(Long id);
    void delById(Long id);
    List<NameTest> getAll();

}
