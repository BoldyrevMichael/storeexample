package ru.boldyrev.ma.storeexample.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractDAO {

    @PersistenceContext(unitName = "storeexample-persistence-unit")
    protected EntityManager em;
}
