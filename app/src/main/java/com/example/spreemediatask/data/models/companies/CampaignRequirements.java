
package com.example.spreemediatask.data.models.companies;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CampaignRequirements {

    @SerializedName("minimum_quantity")
    @Expose
    private Object minimumQuantity;
    @SerializedName("specific_product")
    @Expose
    private Object specificProduct;
    @SerializedName("specific_department")
    @Expose
    private Object specificDepartment;
    @SerializedName("minimum_purchase_amount")
    @Expose
    private Object minimumPurchaseAmount;

    public Object getMinimumQuantity() {
        return minimumQuantity;
    }

    public void setMinimumQuantity(Object minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    public Object getSpecificProduct() {
        return specificProduct;
    }

    public void setSpecificProduct(Object specificProduct) {
        this.specificProduct = specificProduct;
    }

    public Object getSpecificDepartment() {
        return specificDepartment;
    }

    public void setSpecificDepartment(Object specificDepartment) {
        this.specificDepartment = specificDepartment;
    }

    public Object getMinimumPurchaseAmount() {
        return minimumPurchaseAmount;
    }

    public void setMinimumPurchaseAmount(Object minimumPurchaseAmount) {
        this.minimumPurchaseAmount = minimumPurchaseAmount;
    }

}
