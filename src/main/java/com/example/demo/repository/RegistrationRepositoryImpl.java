package com.example.demo.repository;

import com.example.demo.model.Registration;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class RegistrationRepositoryImpl implements RegistrationRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Registration Save(Registration registration) {
        entityManager.persist(registration);
        return registration;
    }
}
