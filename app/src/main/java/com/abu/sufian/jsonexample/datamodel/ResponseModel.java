package com.abu.sufian.jsonexample.datamodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseModel {
    @SerializedName("uniid")
    @Expose
    private String uniid;
    @SerializedName("university_name")
    @Expose
    private String universityName;
    @SerializedName("present_campus")
    @Expose
    private String presentCampus;
    @SerializedName("permanent_campus")
    @Expose
    private String permanentCampus;
    @SerializedName("vc")
    @Expose
    private String vc;
    @SerializedName("pro_vc")
    @Expose
    private String proVc;
    @SerializedName("registrar")
    @Expose
    private String registrar;
    @SerializedName("treasurer")
    @Expose
    private String treasurer;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("contact")
    @Expose
    private String contact;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("fax")
    @Expose
    private String fax;
    @SerializedName("estd_year")
    @Expose
    private String estdYear;
    @SerializedName("type")
    @Expose
    private String type;

    public String getUniid() {
        return uniid;
    }

    public void setUniid(String uniid) {
        this.uniid = uniid;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getPresentCampus() {
        return presentCampus;
    }

    public void setPresentCampus(String presentCampus) {
        this.presentCampus = presentCampus;
    }

    public String getPermanentCampus() {
        return permanentCampus;
    }

    public void setPermanentCampus(String permanentCampus) {
        this.permanentCampus = permanentCampus;
    }

    public String getVc() {
        return vc;
    }

    public void setVc(String vc) {
        this.vc = vc;
    }

    public String getProVc() {
        return proVc;
    }

    public void setProVc(String proVc) {
        this.proVc = proVc;
    }

    public String getRegistrar() {
        return registrar;
    }

    public void setRegistrar(String registrar) {
        this.registrar = registrar;
    }

    public String getTreasurer() {
        return treasurer;
    }

    public void setTreasurer(String treasurer) {
        this.treasurer = treasurer;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEstdYear() {
        return estdYear;
    }

    public void setEstdYear(String estdYear) {
        this.estdYear = estdYear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
