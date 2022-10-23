package com.example.demo.repository;

import com.example.demo.model.Registration;
import com.example.demo.model.RegistrationReport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RegistrationRepositoryImpl implements RegistrationRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Registration Save(Registration registration) {
        if (registration.getId() == null) {
            entityManager.persist(registration);
        }
        else {
            entityManager.merge(registration);
        }


        return registration;
    }

    @Override
    public List<Registration> findAll() {

        List<Registration> registrations = entityManager
                .createQuery("Select r from Registration r")
                .getResultList();

        return registrations;
    }

    @Override
    public List<RegistrationReport> findAllReports() {

        String jpql = "Select new com.example.demo.model.RegistrationReport" +
                "(r.name, c.name, c.description) " +
                "from Registration r, Course c " +
                "where r.id = c.registration.id";

        List<RegistrationReport> res = entityManager
                .createNamedQuery(Registration.REGISTRATION_REPORT)
                .getResultList();

        return res;
    }
}
