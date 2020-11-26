package com.abu.sufian.jsonexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.abu.sufian.jsonexample.adapter.UniversityAdapter;
import com.abu.sufian.jsonexample.api.ApiClient;
import com.abu.sufian.jsonexample.api.ApiInterface;
import com.abu.sufian.jsonexample.datamodel.ResponseModel;
import com.abu.sufian.jsonexample.datamodel.UniversityModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private List<ResponseModel> responseModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvUniversity = findViewById(R.id.rvUniversity);
        responseModelList = new ArrayList<>();
        UniversityAdapter adapter = new UniversityAdapter(responseModelList);

        rvUniversity.setLayoutManager(new LinearLayoutManager(this));
        rvUniversity.setItemAnimator(new DefaultItemAnimator());
        rvUniversity.setAdapter(adapter);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<List<UniversityModel>> call = apiService.getData();
        call.enqueue(new Callback<List<UniversityModel>>() {
            @Override
            public void onResponse(Call<List<UniversityModel>> call, Response<List<UniversityModel>> response) {
                for (int i = 0; i < response.body().size(); i++) {
                    responseModelList.addAll(response.body().get(i).getResponse());
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<UniversityModel>> call, Throwable t) {
                Log.e(TAG, "onFailure: "+t.getMessage());
            }
        });

    }
}