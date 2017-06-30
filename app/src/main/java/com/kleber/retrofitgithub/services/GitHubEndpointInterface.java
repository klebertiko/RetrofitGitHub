package com.kleber.retrofitgithub.services;

import com.kleber.retrofitgithub.models.Repository;
import com.kleber.retrofitgithub.models.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by kleber on 06/06/17.
 */

public interface GitHubEndpointInterface {

    @GET("/users/{user}/repos")
    Call<List<Repository>> getUserRepos(@Path("user") String user);

    @GET("users/{username}")
    Call<User> getUser(@Path("username") String username);

    @GET("/search/repositories?q=language:Java&sort=stars&page=1")
    Call<List<Repository>> getTopJavaRepos(@Query("page") Integer page);

}
