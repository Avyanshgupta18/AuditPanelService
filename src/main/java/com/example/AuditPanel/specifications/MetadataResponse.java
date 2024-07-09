package com.example.AuditPanel.specifications;

import java.util.List;

public class MetadataResponse {

    private ApiResponseHeader resHeader;
    private Metadata metadata;

    // Getters and Setters
    public ApiResponseHeader getResHeader() {
        return resHeader;
    }

    public void setResHeader(ApiResponseHeader resHeader) {
        this.resHeader = resHeader;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public static class Metadata {
        private String apiId;
        private List<Filter> filters;

        // Getters and Setters
        public String getApiId() {
            return apiId;
        }

        public void setApiId(String apiId) {
            this.apiId = apiId;
        }

        public List<Filter> getFilters() {
            return filters;
        }

        public void setFilters(List<Filter> filters) {
            this.filters = filters;
        }

        public static class Filter {
            private String filterType;
            private Object filterData;
            private String unit;

            // Getters and Setters
            public String getFilterType() {
                return filterType;
            }

            public void setFilterType(String filterType) {
                this.filterType = filterType;
            }

            public Object getFilterData() {
                return filterData;
            }

            public void setFilterData(Object filterData) {
                this.filterData = filterData;
            }

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }
        }
    }
}
