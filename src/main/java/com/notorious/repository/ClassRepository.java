package com.notorious.repository;

import com.notorious.entity.Classes;

public interface ClassRepository {
    public Classes findById(int id);
    public Classes findByIdLazy(int id);
}
