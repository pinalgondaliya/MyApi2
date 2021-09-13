package com.oscar.career.myapi2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.oscar.career.myapi2.request.MainRequest;
import com.oscar.career.myapi2.responce.RequestResponseData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    myApiMethods myApiMethods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://saloon.mycodelibraries.com/api/").addConverterFactory(GsonConverterFactory.create()).build();
        myApiMethods = retrofit.create(myApiMethods.class);
    }

    public void loginUser(View view) {
        MainRequest mainRequest = new MainRequest();
        mainRequest.setEmail("soc.rutvik.panchal@gmail.com");
        mainRequest.setPassword("rutvik123");

        Call<RequestResponseData> requestResponseDataCall = myApiMethods.loginUser(mainRequest);
        requestResponseDataCall.enqueue(new Callback<RequestResponseData>() {
            @Override
            public void onResponse(Call<RequestResponseData> call, Response<RequestResponseData> response) {
                if(response.isSuccessful()){
                    RequestResponseData myfinaldata = response.body();
                    Log.d("tag1", "onResponse: "+myfinaldata.getData().getToken());
                }
            }

            @Override
            public void onFailure(Call<RequestResponseData> call, Throwable t) {

            }
        });
    }
}