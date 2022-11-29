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
    String key = "eyJraWQiOiJXcDRGMndiQVpMa1d2WWgyNDhnYjNtUHBLRzZTdDRNcG85Tmc3U2diZ2E0PSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI4MWViNDQ4ZS00OWIzLTQzMGQtYWJkOS03ZDMyNWM0ZTkxYmYiLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLmFwLXNvdXRoZWFzdC0xLmFtYXpvbmF3cy5jb21cL2FwLXNvdXRoZWFzdC0xX1FiMVE4VFBzVSIsImNvZ25pdG86dXNlcm5hbWUiOiI4MWViNDQ4ZS00OWIzLTQzMGQtYWJkOS03ZDMyNWM0ZTkxYmYiLCJvcmlnaW5fanRpIjoiNzY2ZTI0MmQtYmI5Ny00MThmLWFlYjEtOWJkNjljMWRlMzkzIiwiYXVkIjoic2lrY25laTR0MmgzbnRrcWo1ZDQ5bHR2ciIsImV2ZW50X2lkIjoiY2JkODgxZTktYmUwZS00YjdiLWFlMWEtMmU4MWM2MjVkMzBmIiwidG9rZW5fdXNlIjoiaWQiLCJhdXRoX3RpbWUiOjE2Njk1NDMwODUsIm5hbWUiOiJNaW5oIEhp4bq_dSIsImV4cCI6MTY2OTgyMTc0MCwiaWF0IjoxNjY5NzM1MzQwLCJqdGkiOiJiZDM5MmMwOS0wZDMzLTRiY2MtYjFhNS0wNDA1ZmU1NTJmNjQiLCJlbWFpbCI6Im1oaWV1c3ouMjMuZGtjQGdtYWlsLmNvbSJ9.0rhLW3MT-ijA-bH7ObshOjO6iklS7dI4JI_7tW79gsm7Iik19KWEC-LxkpXj03mXD532lW2KZwBe9w2tZpt9ifK-u-LWdm55195opU0F935TQIK8kvT__IaBOImazzPGouRaG4HNJH3uRWS84zQf76rW5mL3GEqqRAKgGUamDplUJ2_-1UOoUBjk082Quz96F1ZYLzBKwvYRw9hJcR59OzLOHkQ4F1cUjOwJD_OMj5s7HaUM6YI487UmtXO_RM_Rs-MqEkbgh5xuF0FdKmWCwmDcuM4XEm4Q7hVTET0hOIQ4rm7r_LC8Y0KkfU7Lupg52JWOPoBizPaZ7XHGUn7e5Q";
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
