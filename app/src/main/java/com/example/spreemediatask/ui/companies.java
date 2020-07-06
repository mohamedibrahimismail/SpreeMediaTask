package com.example.spreemediatask.ui;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.spreemediatask.R;
import com.example.spreemediatask.data.GetDataService;
import com.example.spreemediatask.data.RetrofitClientInstance;
import com.example.spreemediatask.data.models.companies.Campaigns;
import com.example.spreemediatask.data.models.companies.CampaniesModel;
import com.example.spreemediatask.data.models.login.LoginModel;
import com.example.spreemediatask.ui.adapters.RecyclerViewAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class companies extends Fragment {

    @BindView(R.id.recyclerview)
    RecyclerView recyclerView;
    @BindView(R.id.progressbar)
    ProgressBar progressbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_companies, container, false);
        ButterKnife.bind(this, view);

        getData(getArguments().getString("token"));
        return view;
    }

    public void setupRecyclerView(Campaigns campaigns) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),campaigns);
        recyclerView.setAdapter(recyclerViewAdapter);
        progressbar.setVisibility(View.GONE);
        recyclerView.setVisibility(View.VISIBLE);
    }

    private void getData(String token) {
        if (checkNetworkConnection()) {
            //    loginbtn.setVisibility(View.GONE);
            //    progressbar.setVisibility(View.VISIBLE);
            GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
            Call<CampaniesModel> call = service.getCampanies(token);
            call.enqueue(new Callback<CampaniesModel>() {
                @Override
                public void onResponse(Call<CampaniesModel> call, Response<CampaniesModel> response) {
                    Log.e("before", "-----------------");
                    if (response.code() == 200) {
                        Log.e("after", "-----------------");
                        //        gotoHome();
                        setupRecyclerView(response.body().getCampaigns());
                    } else {
//                        loginbtn.setVisibility(View.VISIBLE);
//                        progressbar.setVisibility(View.GONE);
                        Toast.makeText(getActivity(), "error happens please try again!", Toast.LENGTH_SHORT).show();
//                      //  SwipeRefreshLayout.setRefreshing(false);
//                     //   progressbar.setVisibility(View.GONE);
//                        //   Utilities.ShowToast(context, "----------------------");
//                        if(response.errorBody()==null) {
//                            Log.e("Login", "null-------------" );
//                        }else {
//                            Log.e("Login", "onResponse: -----------" );
//                            try {
//                                if(response.body().getErrors().getEmail_or_mobile()!=null) {}
//                            }catch (java.lang.NullPointerException e){
//                                Toast.makeText(getActivity(), response.body().getErrors().getEmail_or_mobile().get(0), Toast.LENGTH_SHORT).show();
//                            }
//
//                            try {
//                                if(response.body().getErrors().getError()!=null) {}
//                            }catch (java.lang.NullPointerException e){
//                                Toast.makeText(getActivity(), response.body().getErrors().getError().get(0), Toast.LENGTH_SHORT).show();
//                            }
//
//                            // progressbar.setVisibility(View.GONE);
//                        }
                    }
                }

                @Override
                public void onFailure(Call<CampaniesModel> call, Throwable t) {
//                    SwipeRefreshLayout.setRefreshing(false);
//                    Utilities.ShowToast(context, "----------------------");
//                    loginbtn.setVisibility(View.VISIBLE);
//                    progressbar.setVisibility(View.GONE);
                }
            });
        } else {

        }
    }

    public boolean checkNetworkConnection() {
        boolean connected = false;
        ConnectivityManager connectivityManager = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            //we are connected to a network
            connected = true;
        } else {
            Toast.makeText(getContext(), "please check network connection", Toast.LENGTH_SHORT).show();
            connected = false;
        }

        return connected;
    }


}