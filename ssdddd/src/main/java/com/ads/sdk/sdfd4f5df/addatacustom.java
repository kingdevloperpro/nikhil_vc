package com.ads.sdk.sdfd4f5df;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class addatacustom {
    @SerializedName("Team_Pinky_Producation_House_cust_id")
    @Expose
    private String id;
    @SerializedName("Team_Pinky_Producation_House_cust_name")
    @Expose
    private String name;
    @SerializedName("Team_Pinky_Producation_House_cust_url")
    @Expose
    private String url;
    @SerializedName("Team_Pinky_Producation_House_cust_appopen_image")
    @Expose
    private String appopenImage;
    @SerializedName("Team_Pinky_Producation_House_cust_interstitial_image")
    @Expose
    private String interstitialImage;
    @SerializedName("Team_Pinky_Producation_House_cust_small_native_image")
    @Expose
    private String smallNativeImage;
    @SerializedName("Team_Pinky_Producation_House_cust_native_image")
    @Expose
    private String nativeImage;

    public addatacustom(String id, String name, String url, String appopenImage, String interstitialImage, String smallNativeImage, String nativeImage) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.appopenImage = appopenImage;
        this.interstitialImage = interstitialImage;
        this.smallNativeImage = smallNativeImage;
        this.nativeImage = nativeImage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAppopenImage() {
        return appopenImage;
    }

    public void setAppopenImage(String appopenImage) {
        this.appopenImage = appopenImage;
    }

    public String getInterstitialImage() {
        return interstitialImage;
    }

    public void setInterstitialImage(String interstitialImage) {
        this.interstitialImage = interstitialImage;
    }

    public String getSmallNativeImage() {
        return smallNativeImage;
    }

    public void setSmallNativeImage(String smallNativeImage) {
        this.smallNativeImage = smallNativeImage;
    }

    public String getNativeImage() {
        return nativeImage;
    }

    public void setNativeImage(String nativeImage) {
        this.nativeImage = nativeImage;
    }

}
