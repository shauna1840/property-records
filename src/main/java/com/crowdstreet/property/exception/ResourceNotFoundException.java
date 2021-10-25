package com.crowdstreet.property.exception;

public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionID = 1L;

    private String resourceName;
    private String fieldName;
    private Object fieldValue;

    public ResourceNotFoundException(Throwable cause, String resourceName, String fieldName, Object fieldValue) {
        super(String.format("%s not found with %s : '%s" , resourceName, fieldName, fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public ResourceNotFoundException(String seller, String id, long id1) {

    }

    public String getResourceName() {
        return resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }

}
