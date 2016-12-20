package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fubc on 16-12-19.
 */
public class Now {

    @SerializedName("tmp")
    public String tmp;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
