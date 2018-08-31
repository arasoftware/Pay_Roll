package in.arasoftwares.payroll.retrofit;

import java.util.List;

import in.arasoftwares.payroll.Model.User;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitClient {

    @POST
    List<User> login(@Body User user);

}
