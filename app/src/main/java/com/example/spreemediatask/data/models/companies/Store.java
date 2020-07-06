
package com.example.spreemediatask.data.models.companies;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Store {

    @SerializedName("data")
    @Expose
    private Data__ data;

    public Data__ getData() {
        return data;
    }

    public void setData(Data__ data) {
        this.data = data;
    }

}
