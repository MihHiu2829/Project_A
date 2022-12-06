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

    String key = "eyJraWQiOiJXcDRGMndiQVpMa1d2WWgyNDhnYjNtUHBLRzZTdDRNcG85Tmc3U2diZ2E0PSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiJiMjk2NDBmOC01M2MzLTQ1MWYtOTc3OS03NjI5NjFjNmYzNzYiLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLmFwLXNvdXRoZWFzdC0xLmFtYXpvbmF3cy5jb21cL2FwLXNvdXRoZWFzdC0xX1FiMVE4VFBzVSIsImNvZ25pdG86dXNlcm5hbWUiOiJiMjk2NDBmOC01M2MzLTQ1MWYtOTc3OS03NjI5NjFjNmYzNzYiLCJvcmlnaW5fanRpIjoiYTZiZTExYzItY2EyMy00NmMzLTk1ZGMtOWE1NzdhYmQ2MWRkIiwiYXVkIjoic2lrY25laTR0MmgzbnRrcWo1ZDQ5bHR2ciIsImV2ZW50X2lkIjoiYWI1YjA3N2EtYzQzZS00ZjI4LWE1ZDYtMzFhZWE1N2M1OGU0IiwidG9rZW5fdXNlIjoiaWQiLCJhdXRoX3RpbWUiOjE2NzAyMjU4NDQsIm5hbWUiOiJhbmhuZ3V5ZW44ODgiLCJleHAiOjE2NzAzOTkyNzYsImlhdCI6MTY3MDMxMjg3NiwianRpIjoiZDQ3MjJlMWQtMWE5OC00NWM4LTg3NzctNjIwODY3ZGIzZmE4IiwiZW1haWwiOiJkaW5oYW5odm5uM0BnbWFpbC5jb20ifQ.nhVqB3TJ5lps3C7GYmMOtmpP17ocKc2mJTkqTrWtFyjX1XKkx9heo3q2YzaVyQAYA9JBe65z6Pt6R7sFxkGX8WDLynA8dHX_zl3sKLS8pCAeA0KKCOZRTGZgLo5fsC0O9VthXy9PB0ugyt5f-pnpGrL8_8udONxSj76dSvrcFi0HSyOJkogxxbU6-O6FdZOOjigDD-vKOy7zRDqEY7hRAzMzMcQs-vRdushH8dazMG-DrFXIZz0VGHrNvH1l0jpxolMm8DC1pq1zH5Gg5p4PUJoW_9mYmqvyh4Mo_51-W1TwJmIxWD5E_YJMgKurci7IS4ZRREJObE1SdyUqXBMiPQ";
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
