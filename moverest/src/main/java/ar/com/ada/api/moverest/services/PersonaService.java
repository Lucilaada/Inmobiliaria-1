package ar.com.ada.api.moverest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.moverest.repositories.PersonaRepository;

/**
 * PersonaService
 */
@Service
public class PersonaService {

    @Autowired
    PersonaRepository repoPersona;
    

}