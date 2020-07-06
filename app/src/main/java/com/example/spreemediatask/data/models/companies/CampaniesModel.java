
package com.example.spreemediatask.data.models.companies;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CampaniesModel {

    @SerializedName("campaigns")
    @Expose
    private Campaigns campaigns;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("activeCount")
    @Expose
    private Integer activeCount;
    @SerializedName("notSubmittedCount")
    @Expose
    private Integer notSubmittedCount;
    @SerializedName("canceledCount")
    @Expose
    private Integer canceledCount;
    @SerializedName("rejectedCount")
    @Expose
    private Integer rejectedCount;
    @SerializedName("pendingCount")
    @Expose
    private Integer pendingCount;
    @SerializedName("holdCount")
    @Expose
    private Integer holdCount;
    @SerializedName("expiredCount")
    @Expose
    private Integer expiredCount;
    @SerializedName("terminatedCount")
    @Expose
    private Integer terminatedCount;
    @SerializedName("archivedCount")
    @Expose
    private Integer archivedCount;

    public Campaigns getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(Campaigns campaigns) {
        this.campaigns = campaigns;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getActiveCount() {
        return activeCount;
    }

    public void setActiveCount(Integer activeCount) {
        this.activeCount = activeCount;
    }

    public Integer getNotSubmittedCount() {
        return notSubmittedCount;
    }

    public void setNotSubmittedCount(Integer notSubmittedCount) {
        this.notSubmittedCount = notSubmittedCount;
    }

    public Integer getCanceledCount() {
        return canceledCount;
    }

    public void setCanceledCount(Integer canceledCount) {
        this.canceledCount = canceledCount;
    }

    public Integer getRejectedCount() {
        return rejectedCount;
    }

    public void setRejectedCount(Integer rejectedCount) {
        this.rejectedCount = rejectedCount;
    }

    public Integer getPendingCount() {
        return pendingCount;
    }

    public void setPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
    }

    public Integer getHoldCount() {
        return holdCount;
    }

    public void setHoldCount(Integer holdCount) {
        this.holdCount = holdCount;
    }

    public Integer getExpiredCount() {
        return expiredCount;
    }

    public void setExpiredCount(Integer expiredCount) {
        this.expiredCount = expiredCount;
    }

    public Integer getTerminatedCount() {
        return terminatedCount;
    }

    public void setTerminatedCount(Integer terminatedCount) {
        this.terminatedCount = terminatedCount;
    }

    public Integer getArchivedCount() {
        return archivedCount;
    }

    public void setArchivedCount(Integer archivedCount) {
        this.archivedCount = archivedCount;
    }

}
