package com.app.waseem.iconfinderapp.Rest;


import com.app.waseem.iconfinderapp.ResponseBody.IconResponseBody;
import com.app.waseem.iconfinderapp.ResponseBody.IconSetResponseBody;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface IconFinderApi {

    @GET("/v3/iconsets")
    Call<IconSetResponseBody>
    getIconsets(@Query("client_id") String apiClientId,@Query("client_secret") String apiClientSecret, @Query("count") String count, @Query("after") String afterIconsetId);


    @GET("/v3/iconsets/{iconset_identifier}/icons")
    Call<IconResponseBody> getIcons(@Path(value = "iconset_identifier", encoded = true) String idendifier, @Query("client_id") String apiClientId, @Query("client_secret") String apiClientSearch);



}
