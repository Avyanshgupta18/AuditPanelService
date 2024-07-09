package com.example.AuditPanel.specifications;

import java.util.List;

public class DashboardResponse {

    private ApiResponseHeader resHeader;
    private List<Service> services;

    // Getters and Setters
    public ApiResponseHeader getResHeader() {
        return resHeader;
    }

    public void setResHeader(ApiResponseHeader resHeader) {
        this.resHeader = resHeader;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public static class Service {
        private String serviceName;
        private String serviceId;

        // Getters and Setters
        public String getServiceName() {
            return serviceName;
        }

        public void setServiceName(String serviceName) {
            this.serviceName = serviceName;
        }

        public String getServiceId() {
            return serviceId;
        }

        public void setServiceId(String serviceId) {
            this.serviceId = serviceId;
        }
    }

}
