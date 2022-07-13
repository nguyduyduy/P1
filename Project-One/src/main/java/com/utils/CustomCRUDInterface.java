package com.utils;

public interface CustomCRUDInterface<T> {

    //CRUD = Create Read Update Delete
    // All basic functionality that we should be able
    // to do when storing data

    // implicitly public and static, no need for access modifiers
    // here we are returning an Integer
    // and expecting a param of type T
    Integer create(T t);

    // returning type T and expecting a param of Integer id
    T read(Integer id);

    // returning type T and expecting a param of type T
    T update(T t);

    // returning a boolean and expecting a parameter of Integer id
    boolean delete(Integer id);

}
