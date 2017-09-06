package com.bbq.dto.appUser;

import com.bbq.rest.response.appUser.CouponResponse;

import java.util.List;

public class CustomerDTO {
    private String fullName;
    private String email;
    private String date;
    private String timeSlot;
    private String mobile;
    private String locality;
    private String token;
    private String gender;
    private String remark;
    private String dob;
    private String resource;
    private int noOfPerson;
    private int id;
    private String isAvailable;
    private List<CouponResponse> availableSlots;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public int getNoOfPerson() {
        return noOfPerson;
    }

    public void setNoOfPerson(int noOfPerson) {
        this.noOfPerson = noOfPerson;
    }

    public String getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
    }

    public List<CouponResponse> getAvailableSlots() {
        return availableSlots;
    }

    public void setAvailableSlots(List<CouponResponse> availableSlots) {
        this.availableSlots = availableSlots;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerDTO that = (CustomerDTO) o;

        if (noOfPerson != that.noOfPerson) return false;
        if (id != that.id) return false;
        if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (timeSlot != null ? !timeSlot.equals(that.timeSlot) : that.timeSlot != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (locality != null ? !locality.equals(that.locality) : that.locality != null) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (dob != null ? !dob.equals(that.dob) : that.dob != null) return false;
        if (resource != null ? !resource.equals(that.resource) : that.resource != null) return false;
        if (isAvailable != null ? !isAvailable.equals(that.isAvailable) : that.isAvailable != null) return false;
        return availableSlots != null ? availableSlots.equals(that.availableSlots) : that.availableSlots == null;
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (timeSlot != null ? timeSlot.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (locality != null ? locality.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + (resource != null ? resource.hashCode() : 0);
        result = 31 * result + noOfPerson;
        result = 31 * result + id;
        result = 31 * result + (isAvailable != null ? isAvailable.hashCode() : 0);
        result = 31 * result + (availableSlots != null ? availableSlots.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", date='" + date + '\'' +
                ", timeSlot='" + timeSlot + '\'' +
                ", mobile='" + mobile + '\'' +
                ", locality='" + locality + '\'' +
                ", token='" + token + '\'' +
                ", gender='" + gender + '\'' +
                ", remark='" + remark + '\'' +
                ", dob='" + dob + '\'' +
                ", resource='" + resource + '\'' +
                ", noOfPerson=" + noOfPerson +
                ", id=" + id +
                ", isAvailable='" + isAvailable + '\'' +
                ", availableSlots=" + availableSlots +
                '}';
    }
}

