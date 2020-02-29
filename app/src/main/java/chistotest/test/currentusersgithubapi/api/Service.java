package chistotest.test.currentusersgithubapi.api;

import chistotest.test.currentusersgithubapi.model.ItemResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET ("/search/users?q=language:java+location:lagos") // Заменить на своё? https://api.github.com/repositories
    Call<ItemResponse> getItems();
}
