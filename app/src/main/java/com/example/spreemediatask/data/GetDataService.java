package com.example.spreemediatask.data;

import com.example.spreemediatask.data.models.companies.CampaniesModel;
import com.example.spreemediatask.data.models.login.LoginModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface GetDataService {

    @POST("api/login")
    Call<LoginModel> login(
            @Query("email_or_mobile") String email_or_mobile,
            @Query("password") String password,
            @Query("player_id") String player_id);

    @GET("api/stores/1/campaigns/list")
    Call<CampaniesModel> getCampanies(
            @Query("token") String token);
}
