package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fubc on 16-12-19.
 */
public class AQI {

    public AQICity city;

    public class AQICity{

        @SerializedName("aqi")
        public String aqi;

        @SerializedName("pm25")
        public String pm25;
    }
}
