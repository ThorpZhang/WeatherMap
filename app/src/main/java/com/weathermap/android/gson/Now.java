package com.weathermap.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Lenovo on 2018/5/13.
 */

public class Now {

    @SerializedName("tem")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;

    }

}
