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

public class CommonUtils {
    private static Retrofit retrofit = null;
    public static RetrofitClient service() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        RetrofitClient api = retrofit.create(RetrofitClient.class);
        return api;
    }
    public static void showToast(Context context, String message) {
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        View view1 = toast.getView();
        toast.getView().setPadding(20, 20, 20, 20);
        view1.setBackgroundResource(R.color.grass);
        TextView text = (TextView) view1.findViewById(android.R.id.message);
        text.setTextColor(context.getResources().getColor(R.color.snow));
        toast.show();
    }

    public static void showSnack(View view, String message) {
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

    public static ProgressDialog showDialog(Context context, String message) {
        final ProgressDialog progressDialog = new ProgressDialog(context, R.style.AppTheme_Dark_Dialog);
        progressDialog.setMessage(message);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        return progressDialog;
    }
}
