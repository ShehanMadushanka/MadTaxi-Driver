package com.madapps.mad_taxi.remote;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by Shehan on 11/7/2017.
 */

public class RetrofitClient {

    private static Retrofit retrofit;

    public static Retrofit getClient(String baseURL) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        }

        return retrofit;
    }

}
