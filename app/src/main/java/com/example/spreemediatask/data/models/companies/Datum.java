
package com.example.spreemediatask.data.models.companies;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("terms_and_conditions")
    @Expose
    private List<String> termsAndConditions = null;
    @SerializedName("full_terms_and_conditions")
    @Expose
    private FullTermsAndConditions fullTermsAndConditions;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("end_date")
    @Expose
    private String endDate;
    @SerializedName("valid_from")
    @Expose
    private String validFrom;
    @SerializedName("valid_to")
    @Expose
    private String validTo;
    @SerializedName("campaign_type")
    @Expose
    private String campaignType;
    @SerializedName("campaign_for")
    @Expose
    private String campaignFor;
    @SerializedName("brands")
    @Expose
    private Object brands;
    @SerializedName("minimum_count")
    @Expose
    private Integer minimumCount;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("goomla_minimum_count")
    @Expose
    private Integer goomlaMinimumCount;
    @SerializedName("goomla_maximum_count")
    @Expose
    private Integer goomlaMaximumCount;
    @SerializedName("offer_type")
    @Expose
    private String offerType;
    @SerializedName("offer_value")
    @Expose
    private Object offerValue;
    @SerializedName("offer_percentage")
    @Expose
    private Object offerPercentage;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("tags")
    @Expose
    private Object tags;
    @SerializedName("goldCoins")
    @Expose
    private String goldCoins;
    @SerializedName("standardCoins")
    @Expose
    private Integer standardCoins;
    @SerializedName("views")
    @Expose
    private Integer views;
    @SerializedName("case_scenario")
    @Expose
    private Object caseScenario;
    @SerializedName("campaign_details")
    @Expose
    private CampaignDetails campaignDetails;
    @SerializedName("campaign_requirements")
    @Expose
    private CampaignRequirements campaignRequirements;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("product_name")
    @Expose
    private Object productName;
    @SerializedName("department_name")
    @Expose
    private Object departmentName;
    @SerializedName("quantity")
    @Expose
    private Object quantity;
    @SerializedName("min_coins_case")
    @Expose
    private Object minCoinsCase;
    @SerializedName("vouchers_limit")
    @Expose
    private Integer vouchersLimit;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("coin_case")
    @Expose
    private Object coinCase;
    @SerializedName("valid_date_exception")
    @Expose
    private Object validDateException;
    @SerializedName("thumbnail")
    @Expose
    private Thumbnail thumbnail;
    @SerializedName("cover")
    @Expose
    private Cover cover;
    @SerializedName("gallery")
    @Expose
    private Gallery gallery;
    @SerializedName("store")
    @Expose
    private Store store;

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

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public List<String> getTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(List<String> termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    public FullTermsAndConditions getFullTermsAndConditions() {
        return fullTermsAndConditions;
    }

    public void setFullTermsAndConditions(FullTermsAndConditions fullTermsAndConditions) {
        this.fullTermsAndConditions = fullTermsAndConditions;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    public String getCampaignType() {
        return campaignType;
    }

    public void setCampaignType(String campaignType) {
        this.campaignType = campaignType;
    }

    public String getCampaignFor() {
        return campaignFor;
    }

    public void setCampaignFor(String campaignFor) {
        this.campaignFor = campaignFor;
    }

    public Object getBrands() {
        return brands;
    }

    public void setBrands(Object brands) {
        this.brands = brands;
    }

    public Integer getMinimumCount() {
        return minimumCount;
    }

    public void setMinimumCount(Integer minimumCount) {
        this.minimumCount = minimumCount;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getGoomlaMinimumCount() {
        return goomlaMinimumCount;
    }

    public void setGoomlaMinimumCount(Integer goomlaMinimumCount) {
        this.goomlaMinimumCount = goomlaMinimumCount;
    }

    public Integer getGoomlaMaximumCount() {
        return goomlaMaximumCount;
    }

    public void setGoomlaMaximumCount(Integer goomlaMaximumCount) {
        this.goomlaMaximumCount = goomlaMaximumCount;
    }

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    public Object getOfferValue() {
        return offerValue;
    }

    public void setOfferValue(Object offerValue) {
        this.offerValue = offerValue;
    }

    public Object getOfferPercentage() {
        return offerPercentage;
    }

    public void setOfferPercentage(Object offerPercentage) {
        this.offerPercentage = offerPercentage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public String getGoldCoins() {
        return goldCoins;
    }

    public void setGoldCoins(String goldCoins) {
        this.goldCoins = goldCoins;
    }

    public Integer getStandardCoins() {
        return standardCoins;
    }

    public void setStandardCoins(Integer standardCoins) {
        this.standardCoins = standardCoins;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Object getCaseScenario() {
        return caseScenario;
    }

    public void setCaseScenario(Object caseScenario) {
        this.caseScenario = caseScenario;
    }

    public CampaignDetails getCampaignDetails() {
        return campaignDetails;
    }

    public void setCampaignDetails(CampaignDetails campaignDetails) {
        this.campaignDetails = campaignDetails;
    }

    public CampaignRequirements getCampaignRequirements() {
        return campaignRequirements;
    }

    public void setCampaignRequirements(CampaignRequirements campaignRequirements) {
        this.campaignRequirements = campaignRequirements;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Object getProductName() {
        return productName;
    }

    public void setProductName(Object productName) {
        this.productName = productName;
    }

    public Object getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(Object departmentName) {
        this.departmentName = departmentName;
    }

    public Object getQuantity() {
        return quantity;
    }

    public void setQuantity(Object quantity) {
        this.quantity = quantity;
    }

    public Object getMinCoinsCase() {
        return minCoinsCase;
    }

    public void setMinCoinsCase(Object minCoinsCase) {
        this.minCoinsCase = minCoinsCase;
    }

    public Integer getVouchersLimit() {
        return vouchersLimit;
    }

    public void setVouchersLimit(Integer vouchersLimit) {
        this.vouchersLimit = vouchersLimit;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getCoinCase() {
        return coinCase;
    }

    public void setCoinCase(Object coinCase) {
        this.coinCase = coinCase;
    }

    public Object getValidDateException() {
        return validDateException;
    }

    public void setValidDateException(Object validDateException) {
        this.validDateException = validDateException;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public Gallery getGallery() {
        return gallery;
    }

    public void setGallery(Gallery gallery) {
        this.gallery = gallery;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

}
