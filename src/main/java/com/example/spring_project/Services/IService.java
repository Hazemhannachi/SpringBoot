package com.example.spring_project.Services;

import com.example.spring_project.Entities.Etudiant;

import java.util.List;

public interface IService <T>{
    public List<T> retrieveAll();

   public T add(T e);

   public T update (T e);

    public T retrieve(int idT);

    public void remove(int idT);
}
