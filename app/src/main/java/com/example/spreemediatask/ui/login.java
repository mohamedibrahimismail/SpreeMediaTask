package com.example.spreemediatask.ui;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.spreemediatask.R;
import com.example.spreemediatask.data.GetDataService;
import com.example.spreemediatask.data.RetrofitClientInstance;
import com.example.spreemediatask.data.models.login.LoginModel;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static androidx.navigation.fragment.NavHostFragment.findNavController;


public class login extends Fragment {

    @BindView(R.id.editTextTextEmailAddress)
    EditText editTextTextEmailAddress;
    @BindView(R.id.editTextTextPassword)
    EditText editTextTextPassword;
    @BindView(R.id.login)
    LinearLayout loginbtn;
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
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.bind(this, view);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
        return view;
    }

    public void login(){
        if(!editTextTextEmailAddress.getText().toString().trim().equals("")){
            if(!editTextTextPassword.getText().toString().trim().equals("")){
                sendData(editTextTextEmailAddress.getText().toString().trim(),editTextTextPassword.getText().toString().trim());
            }else {
                Toast.makeText(getContext(),"please enter the password", Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(getContext(),"please enter your email", Toast.LENGTH_SHORT).show();
        }
    }

    private void sendData(String email, String pass) {
         String player_id = "a0fb941c-ba42-450d-9a09-4e38258f5adb";
        if (checkNetworkConnection()) {
            loginbtn.setVisibility(View.GONE);
            progressbar.setVisibility(View.VISIBLE);
            GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
            Call<LoginModel> call = service.login(email,pass,player_id);
            call.enqueue(new Callback<LoginModel>() {
                @Override
                public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {
                    Log.e("before", "-----------------" );
                    if (response.code() == 200) {
                        Log.e("after", "-----------------" );
                        gotoHome(response.body().getToken());
                    } else {
                        loginbtn.setVisibility(View.VISIBLE);
                        progressbar.setVisibility(View.GONE);
                        Toast.makeText(getActivity(), "please check inputs !", Toast.LENGTH_SHORT).show();
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
                public void onFailure(Call<LoginModel> call, Throwable t) {
//                    SwipeRefreshLayout.setRefreshing(false);
//                    Utilities.ShowToast(context, "----------------------");
                    loginbtn.setVisibility(View.VISIBLE);
                    progressbar.setVisibility(View.GONE);
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
            Toast.makeText(getContext(),"please check network connection", Toast.LENGTH_SHORT).show();
            connected = false;
        }

        return connected;
    }

    public void gotoHome(String token){
        Bundle bundle = new Bundle();
        bundle.putString("token", token);
        Navigation.findNavController(loginbtn).navigate(R.id.action_login_to_companies, bundle);
    }

}