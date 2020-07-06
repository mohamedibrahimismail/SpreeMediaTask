
package com.example.spreemediatask.data.models.companies;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum__ {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("invited_user_id")
    @Expose
    private Object invitedUserId;
    @SerializedName("current_store_role_id")
    @Expose
    private Integer currentStoreRoleId;
    @SerializedName("cashier_branches")
    @Expose
    private Object cashierBranches;
    @SerializedName("show_redeemed_vouchers")
    @Expose
    private Integer showRedeemedVouchers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getInvitedUserId() {
        return invitedUserId;
    }

    public void setInvitedUserId(Object invitedUserId) {
        this.invitedUserId = invitedUserId;
    }

    public Integer getCurrentStoreRoleId() {
        return currentStoreRoleId;
    }

    public void setCurrentStoreRoleId(Integer currentStoreRoleId) {
        this.currentStoreRoleId = currentStoreRoleId;
    }

    public Object getCashierBranches() {
        return cashierBranches;
    }

    public void setCashierBranches(Object cashierBranches) {
        this.cashierBranches = cashierBranches;
    }

    public Integer getShowRedeemedVouchers() {
        return showRedeemedVouchers;
    }

    public void setShowRedeemedVouchers(Integer showRedeemedVouchers) {
        this.showRedeemedVouchers = showRedeemedVouchers;
    }

}
