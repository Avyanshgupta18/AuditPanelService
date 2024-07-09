package com.example.AuditPanel.specifications;

import java.util.List;

public class DataRequest {
    private String apiId;
    private List<Filter> filters;
    private String sortingField;
    private String sortType;
    private String from;
    private String to;
    private int offset;
    private int size;
    private boolean isDecrypt;

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

    public String getSortingField() {
        return sortingField;
    }

    public void setSortingField(String sortingField) {
        this.sortingField = sortingField;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isDecrypt() {
        return isDecrypt;
    }

    public void setDecrypt(boolean decrypt) {
        isDecrypt = decrypt;
    }

    public static class Filter {
        private String filterType;
        private Object filterData;

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
    }
}
