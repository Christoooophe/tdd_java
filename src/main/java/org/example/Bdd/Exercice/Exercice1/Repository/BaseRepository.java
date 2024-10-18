package org.example.Bdd.Exercice.Exercice1.Repository;

import java.util.List;

public interface BaseRepository<T>{
    public T add(T element);
    public T update(T element);
    public boolean delete(T element);
    public List<T> findAll();
    public T findById(int id);
}
