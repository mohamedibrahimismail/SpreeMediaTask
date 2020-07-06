
package com.example.spreemediatask.data.models.companies;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FullTermsAndConditions {

    @SerializedName("general_terms")
    @Expose
    private List<String> generalTerms = null;
    @SerializedName("campaign_terms")
    @Expose
    private List<String> campaignTerms = null;
    @SerializedName("time_exemptions_caption")
    @Expose
    private String timeExemptionsCaption;
    @SerializedName("time_exemptions")
    @Expose
    private List<TimeExemption> timeExemptions = null;
    @SerializedName("validity")
    @Expose
    private String validity;
    @SerializedName("branches_caption")
    @Expose
    private String branchesCaption;
    @SerializedName("branches")
    @Expose
    private List<Branch> branches = null;

    public List<String> getGeneralTerms() {
        return generalTerms;
    }

    public void setGeneralTerms(List<String> generalTerms) {
        this.generalTerms = generalTerms;
    }

    public List<String> getCampaignTerms() {
        return campaignTerms;
    }

    public void setCampaignTerms(List<String> campaignTerms) {
        this.campaignTerms = campaignTerms;
    }

    public String getTimeExemptionsCaption() {
        return timeExemptionsCaption;
    }

    public void setTimeExemptionsCaption(String timeExemptionsCaption) {
        this.timeExemptionsCaption = timeExemptionsCaption;
    }

    public List<TimeExemption> getTimeExemptions() {
        return timeExemptions;
    }

    public void setTimeExemptions(List<TimeExemption> timeExemptions) {
        this.timeExemptions = timeExemptions;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getBranchesCaption() {
        return branchesCaption;
    }

    public void setBranchesCaption(String branchesCaption) {
        this.branchesCaption = branchesCaption;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

}
