package in.arasoftwares.payroll.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import in.arasoftwares.payroll.R;
import in.arasoftwares.payroll.retrofit.RetrofitClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.content.Context.MODE_PRIVATE;

public class Constants {
    public static final String BASE_URL = "http://192.168.0.101/projects/lalithaa/app/api/";
    public static final String PARAM_USERNAME = "userName";
    public static final String PARAM_PASSWORD = "passWord";
    public static final String SUCCESS_MESSAGE = "success";
    public static final int MODE = MODE_PRIVATE;
    public static final String MSG = "msg";
    public static final String USER_ID = "id";
    public static final String AUTHORIZE_TOKEN = "token";
    public static final String PREF = "user";
    public static final String PREF_USERNAME_TAG = "username";
    public static final String PREF_USERID_TAG = "id";
    public static final String PREF_TOKEN_TAG = "token";
}
