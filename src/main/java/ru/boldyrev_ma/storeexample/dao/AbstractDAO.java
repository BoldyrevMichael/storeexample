package ru.boldyrev_ma.storeexample.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AbstractDAO {

    @PersistenceContext(unitName = "storeexample-persistence-unit")
    protected EntityManager em;
}
