package com.riwi.clanes_crud.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.clanes_crud.domain.entities.Cohort;

/**
 * CohortRepository
 */
@Repository
public interface CohortRepository extends JpaRepository<Cohort,Long> {

    
}