package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

public interface CrudInterface<T> {

    Optional<T> findById(long id);

    List<T> findAll();

    T save(T t);

    List<T> saveAll(List<T> list);

    void delete(long id);

    void delete(T obj);
}
