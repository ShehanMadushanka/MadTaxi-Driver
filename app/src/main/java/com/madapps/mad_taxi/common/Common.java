package com.madapps.mad_taxi.common;

import com.madapps.mad_taxi.remote.IGoogleAPI;
import com.madapps.mad_taxi.remote.RetrofitClient;

/**
 * Created by shehan_k on 11/8/2017.
 */

public class Common {

    public static final String BaseURL = "https://maps.googleapis.com";

    public static IGoogleAPI getGoogleApi() {
        return RetrofitClient.getClient(BaseURL).create(IGoogleAPI.class);
    }
}
