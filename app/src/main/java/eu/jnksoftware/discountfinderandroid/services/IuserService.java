package eu.jnksoftware.discountfinderandroid.services;

import eu.jnksoftware.discountfinderandroid.models.DiscountPreferencesPostResponse;
import eu.jnksoftware.discountfinderandroid.models.DiscountPreferencesRequest;
import eu.jnksoftware.discountfinderandroid.models.DiscountPreferencesResponse;
import eu.jnksoftware.discountfinderandroid.models.RegisterTokenRequest;
import eu.jnksoftware.discountfinderandroid.models.UserTokenRequest;
import eu.jnksoftware.discountfinderandroid.models.UserTokenResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;

/**
 * Created by nikos on 1/12/2017.
 */

public interface IuserService {
    @POST("login")
    Call<UserTokenResponse> getTokenAcess(@Body UserTokenRequest userTokenRequest);

    @POST("register")
    Call<UserTokenResponse> register(@Body RegisterTokenRequest registerTokenRequest);

    @PUT("requestDiscount/3")
    Call<DiscountPreferencesResponse> putDiscountPreferences(@Body DiscountPreferencesRequest discountPreferencesRequest);
    @POST("requestedDiscount")
    Call<Void>postDiscoutPreferencesHeader(@Header("Authorization")String auth);
    @POST("requestedDiscount")
    Call<DiscountPreferencesPostResponse> postDiscountPreferences(@Body DiscountPreferencesRequest discountPreferencesRequest);

    @GET("requestedDiscount/1")
    Call<DiscountPreferencesResponse> getOneDiscountPreference();

    @GET("requestedDiscount")
    Call<DiscountPreferencesResponse>getDiscountsPreference();

    @DELETE("requestedDiscount/3")
    Call<Void> deleteDiscountPreference();


}