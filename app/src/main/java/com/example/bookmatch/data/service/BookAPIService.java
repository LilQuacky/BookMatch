package com.example.bookmatch.data.service;

import static com.example.bookmatch.utils.Constants.API_SEARCH_BOOK_ENDPOINT;
import static com.example.bookmatch.utils.Constants.API_SEARCH_BOOK_QUERY;

import com.example.bookmatch.model.BooksListApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface BookAPIService {

    //TODO: implement response objects
    @GET(API_SEARCH_BOOK_ENDPOINT)
    Call<BooksListApiResponse> getBooks(
            @Query(API_SEARCH_BOOK_QUERY) String subject);

    /*
    @GET(API_RETRIEVE_BOOK_BY_KEY_ENDPOINT)
    Call<BookByKeyApiResponse> getBookByKey(
            @Path("key") String bookKey);*/
}
