
package com.ads.sdk.g5f6g.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class NetSettings {

    @SerializedName("settings")
    @Expose
    private IpSettings settings;

    public IpSettings getSettings() {
        return settings;
    }

    public void setSettings(IpSettings settings) {
        this.settings = settings;
    }

}
