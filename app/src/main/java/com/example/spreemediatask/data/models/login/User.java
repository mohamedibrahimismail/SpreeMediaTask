
package com.example.spreemediatask.data.models.login;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("vendor")
    @Expose
    private Integer vendor;
    @SerializedName("sponser")
    @Expose
    private Integer sponser;
    @SerializedName("provider")
    @Expose
    private Object provider;
    @SerializedName("provider_id")
    @Expose
    private Object providerId;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("locale")
    @Expose
    private String locale;
    @SerializedName("country")
    @Expose
    private Object country;
    @SerializedName("city")
    @Expose
    private Object city;
    @SerializedName("district")
    @Expose
    private Integer district;
    @SerializedName("sub_district")
    @Expose
    private Integer subDistrict;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("birthdate")
    @Expose
    private Object birthdate;
    @SerializedName("sms_notifications")
    @Expose
    private Integer smsNotifications;
    @SerializedName("email_notifications")
    @Expose
    private Integer emailNotifications;
    @SerializedName("verification_token")
    @Expose
    private Object verificationToken;
    @SerializedName("last_login_at")
    @Expose
    private String lastLoginAt;
    @SerializedName("banned")
    @Expose
    private Integer banned;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("otp")
    @Expose
    private Object otp;
    @SerializedName("stores")
    @Expose
    private List<Store> stores = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getVendor() {
        return vendor;
    }

    public void setVendor(Integer vendor) {
        this.vendor = vendor;
    }

    public Integer getSponser() {
        return sponser;
    }

    public void setSponser(Integer sponser) {
        this.sponser = sponser;
    }

    public Object getProvider() {
        return provider;
    }

    public void setProvider(Object provider) {
        this.provider = provider;
    }

    public Object getProviderId() {
        return providerId;
    }

    public void setProviderId(Object providerId) {
        this.providerId = providerId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Object getCountry() {
        return country;
    }

    public void setCountry(Object country) {
        this.country = country;
    }

    public Object getCity() {
        return city;
    }

    public void setCity(Object city) {
        this.city = city;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public Integer getSubDistrict() {
        return subDistrict;
    }

    public void setSubDistrict(Integer subDistrict) {
        this.subDistrict = subDistrict;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Object getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Object birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getSmsNotifications() {
        return smsNotifications;
    }

    public void setSmsNotifications(Integer smsNotifications) {
        this.smsNotifications = smsNotifications;
    }

    public Integer getEmailNotifications() {
        return emailNotifications;
    }

    public void setEmailNotifications(Integer emailNotifications) {
        this.emailNotifications = emailNotifications;
    }

    public Object getVerificationToken() {
        return verificationToken;
    }

    public void setVerificationToken(Object verificationToken) {
        this.verificationToken = verificationToken;
    }

    public String getLastLoginAt() {
        return lastLoginAt;
    }

    public void setLastLoginAt(String lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }

    public Integer getBanned() {
        return banned;
    }

    public void setBanned(Integer banned) {
        this.banned = banned;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getOtp() {
        return otp;
    }

    public void setOtp(Object otp) {
        this.otp = otp;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

}
