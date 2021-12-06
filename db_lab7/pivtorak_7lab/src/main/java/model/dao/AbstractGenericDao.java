package model.dao;

import java.util.Collection;

import java.sql.SQLException;

public interface AbstractGenericDao<E> {
    Collection<E> findAll() throws SQLException;

    E findOne(Integer id) throws SQLException;

    void create(E object) throws SQLException;

    void update(Integer id, E object) throws SQLException;

    void delete(Integer id) throws SQLException;
}