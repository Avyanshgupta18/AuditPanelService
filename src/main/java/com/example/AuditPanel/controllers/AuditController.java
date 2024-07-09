package com.example.AuditPanel.controllers;

import com.example.AuditPanel.Entities.MetadataEntity;
import com.example.AuditPanel.repositories.MetadataRepository;
import com.example.AuditPanel.repositories.ServiceRepository;
import com.example.AuditPanel.specifications.DashboardResponse;
import com.example.AuditPanel.specifications.MetadataResponse;
import com.example.AuditPanel.Entities.ServiceEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/audit")
public class AuditController {

    @Autowired
    private ServiceRepository serviceRepository;

    @Autowired
    private MetadataRepository metadataRepository;



    @GetMapping("/getDashboard")
    public ResponseEntity<Map<String, Object>> getDashboard(@RequestHeader Map<String, String> headers) {
        List<ServiceEntity> services = serviceRepository.findAll();
        return ResponseEntity.ok(Map.of(
                "resHeader", Map.of(
                        "responseCode", "200",
                        "responseDesc", "Success"
                ),
                "services", services.stream().map(service -> Map.of(
                        "serviceName", service.getServiceName(),
                        "serviceId", service.getServiceId()
                )).collect(Collectors.toList())
        ));
    }

    @PostMapping("/getMetadata")
    public ResponseEntity<Map<String, Object>> getMetadata(@RequestHeader Map<String, String> headers,
                                                           @RequestBody Map<String, String> request) {
        String apiId = request.get("ApiId");
        List<MetadataEntity> metadataList = metadataRepository.findByApiId(apiId);
        return ResponseEntity.ok(Map.of(
                "resHeader", Map.of(
                        "responseCode", "200",
                        "responseDesc", "Success"
                ),
                "metadata", Map.of(
                        "apiId", apiId,
                        "filters", metadataList.stream().map(metadata -> {
                            if ("range".equals(metadata.getFilterType())) {
                                String[] range = metadata.getFilterData().split(":");
                                return Map.of(
                                        "filterType", metadata.getFilterType(),
                                        "filterData", Map.of(
                                                "from", range[0],
                                                "to", range[1]
                                        ),
                                        "unit", metadata.getUnit()
                                );
                            } else {
                                return Map.of(
                                        "filterType", metadata.getFilterType(),
                                        "filterData", metadata.getFilterData(),
                                        "unit", metadata.getUnit()
                                );
                            }
                        }).collect(Collectors.toList())
                )
        ));
    }

    @PostMapping("/getData")
    public ResponseEntity<Map<String, Object>> getData(@RequestHeader Map<String, String> headers,
                                                       @RequestBody Map<String, Object> request) {
        // Placeholder for actual data fetching logic based on the request

        // Sample static data response
        return ResponseEntity.ok(Map.of(
                "resHeader", Map.of(
                        "responseCode", "200",
                        "responseDesc", "Success"
                ),
                "records", List.of(
                        Map.of(
                                "column1", Map.of("value", "data1", "isEncrypted", false),
                                "column2", Map.of("value", "data2", "isEncrypted", true),
                                "column3", Map.of("value", "data3", "isEncrypted", false)
                        ),
                        Map.of(
                                "column1", Map.of("value", "data4", "isEncrypted", false),
                                "column2", Map.of("value", "data5", "isEncrypted", true),
                                "column3", Map.of("value", "data6", "isEncrypted", false)
                        )
                )
        ));
    }
}