package com.example.demo.service;

import com.example.demo.model.Registration;

import javax.transaction.Transactional;

public interface RegistrationService {

    @Transactional
    Registration addRegistration(Registration registration);
}
