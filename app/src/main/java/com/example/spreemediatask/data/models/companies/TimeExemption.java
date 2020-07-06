
package com.example.spreemediatask.data.models.companies;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TimeExemption {

    @SerializedName("day_or_date")
    @Expose
    private String dayOrDate;
    @SerializedName("time")
    @Expose
    private String time;

    public String getDayOrDate() {
        return dayOrDate;
    }

    public void setDayOrDate(String dayOrDate) {
        this.dayOrDate = dayOrDate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
