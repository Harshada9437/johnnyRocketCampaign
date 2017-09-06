package com.bbq.rest.request.appUser;

/**
 * Created by Shubham on 6/29/2017.
 */
public class OtpRquest {
    private String mobileNo;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OtpRquest otpRquest = (OtpRquest) o;

        if (mobileNo != null ? !mobileNo.equals(otpRquest.mobileNo) : otpRquest.mobileNo != null) return false;
        return email != null ? email.equals(otpRquest.email) : otpRquest.email == null;
    }

    @Override
    public int hashCode() {
        int result = mobileNo != null ? mobileNo.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OtpRquest{" +
                "mobileNo='" + mobileNo + '\'' +
                '}';
    }
}
