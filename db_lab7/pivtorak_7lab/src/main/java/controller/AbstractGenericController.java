package controller;

import model.dao.AbstractGenericDaoImpl;

import java.util.List;

public interface AbstractGenericController<E> {

    AbstractGenericDaoImpl<E> getDao();

    List<E> findAll();

    E findOne(Integer id);

    void create(E entity);

    void update(Integer id, E entity);

    void delete(Integer id);
}