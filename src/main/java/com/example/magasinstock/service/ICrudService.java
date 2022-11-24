package com.example.magasinstock.service;

import java.util.List;

public interface ICrudService<object>{
    object add(object object);
    object update(object object);
    void  delete(long id);
    List<object> getAll();
    object getOne(long id);
}
