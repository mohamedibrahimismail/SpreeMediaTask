package com.example.spreemediatask.data.models.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Errors {
    @SerializedName("error")
    @Expose
    private List<String> error = null;

    @SerializedName("email_or_mobile")
    @Expose
    private List<String> email_or_mobile = null;

    public List<String> getEmail_or_mobile() {
        return email_or_mobile;
    }

    public void setEmail_or_mobile(List<String> email_or_mobile) {
        this.email_or_mobile = email_or_mobile;
    }

    public List<String> getError() {
        return error;
    }

    public void setError(List<String> error) {
        this.error = error;
    }

}
