
package com.example.spreemediatask.data.models.companies;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data__ {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("photo")
    @Expose
    private String photo;
    @SerializedName("unreadNotifications")
    @Expose
    private Integer unreadNotifications;
    @SerializedName("role")
    @Expose
    private Role role;
    @SerializedName("campaigns_count")
    @Expose
    private Integer campaignsCount;
    @SerializedName("branches_count")
    @Expose
    private Integer branchesCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getUnreadNotifications() {
        return unreadNotifications;
    }

    public void setUnreadNotifications(Integer unreadNotifications) {
        this.unreadNotifications = unreadNotifications;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Integer getCampaignsCount() {
        return campaignsCount;
    }

    public void setCampaignsCount(Integer campaignsCount) {
        this.campaignsCount = campaignsCount;
    }

    public Integer getBranchesCount() {
        return branchesCount;
    }

    public void setBranchesCount(Integer branchesCount) {
        this.branchesCount = branchesCount;
    }

}
