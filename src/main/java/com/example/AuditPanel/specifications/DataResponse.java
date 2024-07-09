package com.example.AuditPanel.specifications;

import java.util.List;

public class DataResponse {
    private ApiResponseHeader resHeader;
    private List<Record> records;

    // Getters and Setters
    public ApiResponseHeader getResHeader() {
        return resHeader;
    }

    public void setResHeader(ApiResponseHeader resHeader) {
        this.resHeader = resHeader;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public static class Record {
        private Column column1;
        private Column column2;
        private Column column3;

        // Getters and Setters
        public Column getColumn1() {
            return column1;
        }

        public void setColumn1(Column column1) {
            this.column1 = column1;
        }

        public Column getColumn2() {
            return column2;
        }

        public void setColumn2(Column column2) {
            this.column2 = column2;
        }

        public Column getColumn3() {
            return column3;
        }

        public void setColumn3(Column column3) {
            this.column3 = column3;
        }

        public static class Column {
            private String value;
            private boolean isEncrypted;

            // Getters and Setters
            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public boolean isEncrypted() {
                return isEncrypted;
            }

            public void setEncrypted(boolean isEncrypted) {
                this.isEncrypted = isEncrypted;
            }
        }
    }
}

