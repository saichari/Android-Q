package com.sai.androidq;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RecyclerInterface.JSONURL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RecyclerInterface api = retrofit.create(RecyclerInterface.class);
        try {
            JSONObject paramObject = new JSONObject();
            paramObject.put("EMP_LOGIN_ID","ho3");
            paramObject.put("area_id","43");
            /*paramObject.put("StartDate","10/21/2019");
            paramObject.put("EndDate","10/21/2019");*/

            Call<String> userCall = api.getUser(paramObject.toString());
            userCall.enqueue(new Callback<String>() {
                @Override
                public void onResponse(@NonNull Call<String> call, @NonNull Response<String> response) {

                    String resp = "";

                    resp = response.body().toString();

                    if(resp.toString().contains("\\\\")){
                        resp = resp.toString().replaceAll("\\\\","");
                    }else{
                        resp = resp.toString();
                    }

                    Log.d("response",resp.toString());

                    GsonBuilder builder = new GsonBuilder();
                    Gson gson = builder.create();
                    List<RetrofitResponse> finalresponce = Arrays.asList(gson.fromJson(resp, RetrofitResponse[].class));

                    // spinner adapter must be given parameter as finalresponce if it has only on single responce

                    // in case of getting multiple responces and want to iterate for inserting or updating in databse. -- as below

                    int areaid = 0;

                    for(RetrofitResponse retresp : finalresponce){

                        areaid = retresp.getAREAID();

                    }



                }

                @Override
                public void onFailure(@NonNull Call<String> call, @NonNull Throwable t) {
                    Log.e("Retrofit Error : ",t.getMessage().toString());
                }
            });

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

}