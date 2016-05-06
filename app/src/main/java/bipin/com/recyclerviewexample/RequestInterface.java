package bipin.com.recyclerviewexample;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Bipin on 4/25/2016.
 */

@SuppressWarnings("ALL")
public interface RequestInterface {

    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();
}