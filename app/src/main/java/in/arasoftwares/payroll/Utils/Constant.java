package in.arasoftwares.payroll.Utils;

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

public class Constant {
    public static final String BASE_URL = "http://192.168.0.101/projects/lalithaa/app/api/";
    public static final String PARAM_USERNAME = "userName";
    public static final String PARAM_PASSWORD = "passWord";
    public static final String SUCCESS_MESSAGE = "success";
    public static final int MODE = MODE_PRIVATE;
    //    ---------------------Login Response PARAM--------------------------
    public static final String MSG = "msg";
    public static final String USER_ID = "id";
    public static final String AUTHORIZE_TOKEN = "token";
    //    -----------------------------------------------

    //    --------------------------preference ---------------------
    public static final String PREF = "user";
    public static final String PREF_USERNAME_TAG = "username";
    public static final String PREF_USERID_TAG = "id";
    public static final String PREF_TOKEN_TAG = "token";
    //    -----------------------------------------------


    private static Retrofit retrofit = null;

    public static RetrofitClient service() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        RetrofitClient api = retrofit.create(RetrofitClient.class);
        return api;
    }

    //    -----------------------------------------------
    public static void toast(Context context, String message) {
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        View view1 = toast.getView();
        toast.getView().setPadding(20, 20, 20, 20);
        view1.setBackgroundResource(R.color.grass);
        TextView text = (TextView) view1.findViewById(android.R.id.message);
        text.setTextColor(context.getResources().getColor(R.color.snow));
        toast.show();
    }

    public static void snack(View view, String message) {
        final Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_INDEFINITE);
        View sbView = snackbar.getView();
        TextView snackViewText = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
        Button snackViewButton = (Button) sbView.findViewById(android.support.design.R.id.snackbar_action);
        sbView.setBackgroundColor(view.getResources().getColor(R.color.grass));
        snackViewText.setTextColor(view.getResources().getColor(R.color.snow));
        snackViewButton.setTextColor(view.getResources().getColor(R.color.snow));
        snackbar.setAction("ok", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });
        snackbar.show();
    }


    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static ProgressDialog dialog(Context context, String message) {
        final ProgressDialog progressDialog = new ProgressDialog(context, R.style.AppTheme_Dark_Dialog);
        progressDialog.setMessage(message);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        return progressDialog;
    }
}
