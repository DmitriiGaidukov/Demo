package com.example.demo.repository;

import com.example.demo.model.Registration;
import com.example.demo.model.RegistrationReport;

import java.util.List;

public interface RegistrationRepository {
    Registration Save(Registration registration);

    List<Registration> findAll();

    List<RegistrationReport> findAllReports();
}
