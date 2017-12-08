package com.example.anu.customarrayadapter.data;

/**
 * Created by Design on 25-11-2017.
 */

public class AndroidFlavor {
    public String getVersionName() {
        return versionName;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public int getImage() {
        return image;
    }

    private String versionName;
    private String versionNumber;
    private int image;

    public AndroidFlavor(String versionName, String versionNumber, int image) {
        this.versionName = versionName;
        this.versionNumber = versionNumber;
        this.image = image;
    }
}
