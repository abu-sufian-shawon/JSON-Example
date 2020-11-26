package com.abu.sufian.jsonexample.datamodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UniversityModel {
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("response")
    @Expose
    private List<ResponseModel> response = null;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<ResponseModel> getResponse() {
        return response;
    }

    public void setResponse(List<ResponseModel> response) {
        this.response = response;
    }
}
