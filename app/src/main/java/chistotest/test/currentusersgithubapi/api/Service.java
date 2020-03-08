package chistotest.test.currentusersgithubapi.api;

import chistotest.test.currentusersgithubapi.model.ItemResponse;
import retrofit2.Call;
import retrofit2.http.GET;

// /search/users?q=language:java+location:lagos
public interface Service {
    @GET ("search/users?q=language:java%26language:kotlin+location:tyumen") // Заменить на своё? https://api.github.com/repositories
    Call<ItemResponse> getItems();
}
