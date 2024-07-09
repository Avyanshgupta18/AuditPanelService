package com.example.AuditPanel.repositories;

import com.example.AuditPanel.Entities.ServiceEntity;
import org.apache.catalina.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<ServiceEntity, Long> {
}
