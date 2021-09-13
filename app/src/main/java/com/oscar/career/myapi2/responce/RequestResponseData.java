package com.oscar.career.myapi2.responce;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RequestResponseData {
    @SerializedName("errors")
    @Expose
    private List<Object> errors = null;
    @SerializedName("data")
    @Expose
    private DataResponse data;
    @SerializedName("hasErrors")
    @Expose
    private Boolean hasErrors;

    public List<Object> getErrors() {
        return errors;
    }

    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    public DataResponse getData() {
        return data;
    }

    public void setData(DataResponse data) {
        this.data = data;
    }

    public Boolean getHasErrors() {
        return hasErrors;
    }

    public void setHasErrors(Boolean hasErrors) {
        this.hasErrors = hasErrors;
    }
}
