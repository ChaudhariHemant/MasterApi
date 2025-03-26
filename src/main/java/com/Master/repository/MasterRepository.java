package com.Master.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Master.Entity.MasterEntity;

@Repository
public interface MasterRepository extends JpaRepository<MasterEntity, Long> {
    Optional<MasterEntity> findByName(String name);

}

