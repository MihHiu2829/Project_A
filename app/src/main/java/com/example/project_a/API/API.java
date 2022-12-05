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

    String key = "eyJraWQiOiJXcDRGMndiQVpMa1d2WWgyNDhnYjNtUHBLRzZTdDRNcG85Tmc3U2diZ2E0PSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI4MWViNDQ4ZS00OWIzLTQzMGQtYWJkOS03ZDMyNWM0ZTkxYmYiLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLmFwLXNvdXRoZWFzdC0xLmFtYXpvbmF3cy5jb21cL2FwLXNvdXRoZWFzdC0xX1FiMVE4VFBzVSIsImNvZ25pdG86dXNlcm5hbWUiOiI4MWViNDQ4ZS00OWIzLTQzMGQtYWJkOS03ZDMyNWM0ZTkxYmYiLCJvcmlnaW5fanRpIjoiNzY2ZTI0MmQtYmI5Ny00MThmLWFlYjEtOWJkNjljMWRlMzkzIiwiYXVkIjoic2lrY25laTR0MmgzbnRrcWo1ZDQ5bHR2ciIsImV2ZW50X2lkIjoiY2JkODgxZTktYmUwZS00YjdiLWFlMWEtMmU4MWM2MjVkMzBmIiwidG9rZW5fdXNlIjoiaWQiLCJhdXRoX3RpbWUiOjE2Njk1NDMwODUsIm5hbWUiOiJNaW5oIEhp4bq_dSIsImV4cCI6MTY3MDI5MjAzNiwiaWF0IjoxNjcwMjA1NjM2LCJqdGkiOiIyZDE2OTVhNy1jODYxLTQ0YTQtOGNiOC03NjA2N2Q2MjdkZTAiLCJlbWFpbCI6Im1oaWV1c3ouMjMuZGtjQGdtYWlsLmNvbSJ9.ts8PNyG9XfoNvNOCacyfy1gwk7XEMEwlZis6jVovuOHVAKCLZjiH73m1nCllqB4wV-qBkRiwenlpwbKeSFF2sYpf29ZIuPe1MyFLzR6FaDA8LX7lKYdD5EgXOzZlM0UlEzawC7fHP3vVnHVG1PwY2mW0_kxqmIBuOpRgitVpJ9UwB6Yfk1y50p-BgaB1Z20nynXKpc_iYPtdWDngsjmhDn-mBW6fgyK2jRCiyJSKl1R2I-KW17QX7e772iadm6YxDOSFTwSF7vUXZmceSu8FFuXOZ4_QDSgXtmNAFgWdITKPvQDwISrj4AjhweoY3TkBowhBIQ2FQo9aetPRUiQyGw";
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
