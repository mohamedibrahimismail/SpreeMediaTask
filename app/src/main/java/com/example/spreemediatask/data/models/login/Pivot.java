
package com.example.spreemediatask.data.models.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pivot {

    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("store_id")
    @Expose
    private Integer storeId;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("role_id")
    @Expose
    private Integer roleId;
    @SerializedName("branch_id")
    @Expose
    private Integer branchId;
    @SerializedName("invited_at")
    @Expose
    private String invitedAt;
    @SerializedName("show_redeemed_vouchers")
    @Expose
    private Integer showRedeemedVouchers;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_by")
    @Expose
    private Integer updatedBy;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getInvitedAt() {
        return invitedAt;
    }

    public void setInvitedAt(String invitedAt) {
        this.invitedAt = invitedAt;
    }

    public Integer getShowRedeemedVouchers() {
        return showRedeemedVouchers;
    }

    public void setShowRedeemedVouchers(Integer showRedeemedVouchers) {
        this.showRedeemedVouchers = showRedeemedVouchers;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

}
