package com.oscar.career.myapi2;

import com.oscar.career.myapi2.request.MainRequest;
import com.oscar.career.myapi2.responce.RequestResponseData;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface myApiMethods {

    @POST("User/Authenticate")
    Call<RequestResponseData> loginUser(@Body MainRequest r);
}
