package com.madapps.mad_taxi.remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by shehan_k on 11/7/2017.
 */

public interface IGoogleAPI {

    @GET
    Call<String> getPath(@Url String url);

}
