package com.example.project_a.API;

import com.example.project_a.API.Req.LoginReq;
import com.example.project_a.API.Req.Register;
import com.example.project_a.API.Res.GetKey;
import com.example.project_a.API.Res.LoginRes;
import com.example.project_a.API.Res.RegisterRes;
import com.example.project_a.R;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface API
{

    String key = "eyJraWQiOiJXcDRGMndiQVpMa1d2WWgyNDhnYjNtUHBLRzZTdDRNcG85Tmc3U2diZ2E0PSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI4MWViNDQ4ZS00OWIzLTQzMGQtYWJkOS03ZDMyNWM0ZTkxYmYiLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLmFwLXNvdXRoZWFzdC0xLmFtYXpvbmF3cy5jb21cL2FwLXNvdXRoZWFzdC0xX1FiMVE4VFBzVSIsImNvZ25pdG86dXNlcm5hbWUiOiI4MWViNDQ4ZS00OWIzLTQzMGQtYWJkOS03ZDMyNWM0ZTkxYmYiLCJvcmlnaW5fanRpIjoiNzY2ZTI0MmQtYmI5Ny00MThmLWFlYjEtOWJkNjljMWRlMzkzIiwiYXVkIjoic2lrY25laTR0MmgzbnRrcWo1ZDQ5bHR2ciIsImV2ZW50X2lkIjoiY2JkODgxZTktYmUwZS00YjdiLWFlMWEtMmU4MWM2MjVkMzBmIiwidG9rZW5fdXNlIjoiaWQiLCJhdXRoX3RpbWUiOjE2Njk1NDMwODUsIm5hbWUiOiJNaW5oIEhp4bq_dSIsImV4cCI6MTY3MDE1MTQxNywiaWF0IjoxNjcwMDY1MDE3LCJqdGkiOiJhMzg5YTQ0My1hMWJlLTQyMzYtOTU0NS0zNjdkNDk5YWQ4ODkiLCJlbWFpbCI6Im1oaWV1c3ouMjMuZGtjQGdtYWlsLmNvbSJ9.NrNUK_95_4rfAk_obPOwOUt7ecMTbKxzb0DoGk79pyjQ5JuwsUaeEr43N2k266OYKN5hoPU-kT3t53JZdHYW8G89eKA-gyQRYvuJuHES_yo4UUJRuf4BtAhBzOvjqq-elWgObunQdIinXIZVTi9fVR7PdhAh9LC73cBuNOanba93MeM6wvhMIXxwxkgh-9X7C0E_ewIXOupd8pBJGYURFul7_yxzFW4XNg3J4gCWFiuVUlYktWYgTT2bCb_EGOIKV_eBuqyQEIe98tDYULYqskIgbFnFBgysdS6rsIZ6d4mp1FgOr0n_yuwHm82Gt_uOoavPNCZZ6V30d42-ntqS-g";
    @Headers({"accept: application/json",
            "x-api-key: hutech_hackathon@123456",
            "access-token: "+key})
    @GET("get_key")
     Call<GetKey> GetKeyAuthen() ;


    @POST("register")
    @Headers({"accept: application/json",
            "x-api-key: hutech_hackathon@123456",
            "Content-Type: application/json",
            "access-token: "+ key})
    Call<RegisterRes>getAccount(@Body Register acc) ;


    @POST("login")
    @Headers({"accept: application/json",
            "x-api-key: hutech_hackathon@123456",
            "Content-Type: application/json",
            "access-token: "+ key})
    Call<LoginRes>LoginAcount(@Body LoginReq acc) ;

}
