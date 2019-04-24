package com.project.School.Configuration;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

@Configuration
public class SchoolConfiuration {

    @PersistenceUnit
     EntityManagerFactory entityManagerFactory;

    

}