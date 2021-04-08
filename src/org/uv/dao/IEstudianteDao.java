/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uv.dao;

import java.util.List;

/**
 *
 * @author jahazielBH
 * @param <T>
 */
public interface IEstudianteDao <T> {
    public boolean add(T pojo);
    public boolean update (T pojo);
    public boolean delete (Long id);
    public T getById (Long id);
    public List<T> getAll();
}
