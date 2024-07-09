package com.example.AuditPanel.repositories;

import com.example.AuditPanel.Entities.MetadataEntity;
import org.hibernate.boot.Metadata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MetadataRepository extends JpaRepository<MetadataEntity, Long> {
    public List<MetadataEntity> findByApiId(String apiId);
}

