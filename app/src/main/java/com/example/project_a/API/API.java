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

    String key = "eyJraWQiOiJXcDRGMndiQVpMa1d2WWgyNDhnYjNtUHBLRzZTdDRNcG85Tmc3U2diZ2E0PSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI4MWViNDQ4ZS00OWIzLTQzMGQtYWJkOS03ZDMyNWM0ZTkxYmYiLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLmFwLXNvdXRoZWFzdC0xLmFtYXpvbmF3cy5jb21cL2FwLXNvdXRoZWFzdC0xX1FiMVE4VFBzVSIsImNvZ25pdG86dXNlcm5hbWUiOiI4MWViNDQ4ZS00OWIzLTQzMGQtYWJkOS03ZDMyNWM0ZTkxYmYiLCJvcmlnaW5fanRpIjoiNzY2ZTI0MmQtYmI5Ny00MThmLWFlYjEtOWJkNjljMWRlMzkzIiwiYXVkIjoic2lrY25laTR0MmgzbnRrcWo1ZDQ5bHR2ciIsImV2ZW50X2lkIjoiY2JkODgxZTktYmUwZS00YjdiLWFlMWEtMmU4MWM2MjVkMzBmIiwidG9rZW5fdXNlIjoiaWQiLCJhdXRoX3RpbWUiOjE2Njk1NDMwODUsIm5hbWUiOiJNaW5oIEhp4bq_dSIsImV4cCI6MTY2OTkyOTYyMiwiaWF0IjoxNjY5ODQzMjIyLCJqdGkiOiJmN2Y1NmQ0Yi1iNDg4LTQ0MzEtOTAzYy1iOWM4YWQ3MjI4NTIiLCJlbWFpbCI6Im1oaWV1c3ouMjMuZGtjQGdtYWlsLmNvbSJ9.0QkgxpRVhi49UZe0BGeQ7PHLvNfDKazNiFSpMafnDZrzCZVGMC9lk3W5cuDzmQjFOc-ruebg1y26f82bXDmBJE8C0I_AuYBknAZl0D4VPpiP2HqEoAgM10W-_g8BCA5HTGctOpSpP8jQqxjQTLBTauJNR6k1JWKL8XgSARMw-IRreRqQ6kH8ETDAAm2kO7r7Usj3VA2eusuqjLW69I_fbSRrysiAqY5Gpvat9uJ5x15a6qpolJIB4VSKkUu5Zdgx8Vvcx_uGXYHED1yQ4Aga7KILGCCoUUw7Rbgh-Ci1f4qFjcNwlZca1Sjl4G6FB5BLPbzZbBPxAnoV16WD7eM0Rw";
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
