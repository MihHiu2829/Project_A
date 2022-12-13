package com.example.project_a.API;

import com.example.project_a.API.Req.BalancReq;
import com.example.project_a.API.Req.LoginReq;
import com.example.project_a.API.Req.Register;
import com.example.project_a.API.Req.TranhisReq;
import com.example.project_a.API.Req.transferReq;
import com.example.project_a.API.Res.BalanceRes;
import com.example.project_a.API.Res.GetKey;
import com.example.project_a.API.Res.LoginRes;
import com.example.project_a.API.Res.RegisterRes;
import com.example.project_a.API.Res.TranhisRes;
import com.example.project_a.API.Res.transferRes;
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

    String key = "eyJraWQiOiJXcDRGMndiQVpMa1d2WWgyNDhnYjNtUHBLRzZTdDRNcG85Tmc3U2diZ2E0PSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiJiMjk2NDBmOC01M2MzLTQ1MWYtOTc3OS03NjI5NjFjNmYzNzYiLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLmFwLXNvdXRoZWFzdC0xLmFtYXpvbmF3cy5jb21cL2FwLXNvdXRoZWFzdC0xX1FiMVE4VFBzVSIsImNvZ25pdG86dXNlcm5hbWUiOiJiMjk2NDBmOC01M2MzLTQ1MWYtOTc3OS03NjI5NjFjNmYzNzYiLCJvcmlnaW5fanRpIjoiYTZiZTExYzItY2EyMy00NmMzLTk1ZGMtOWE1NzdhYmQ2MWRkIiwiYXVkIjoic2lrY25laTR0MmgzbnRrcWo1ZDQ5bHR2ciIsImV2ZW50X2lkIjoiYWI1YjA3N2EtYzQzZS00ZjI4LWE1ZDYtMzFhZWE1N2M1OGU0IiwidG9rZW5fdXNlIjoiaWQiLCJhdXRoX3RpbWUiOjE2NzAyMjU4NDQsIm5hbWUiOiJhbmhuZ3V5ZW44ODgiLCJleHAiOjE2NzA5OTY4NDMsImlhdCI6MTY3MDkxMDQ0MywianRpIjoiNmM1Mjg5MDktMDYxNS00OWJkLWFmMTctZDE0N2EwMDcyOTMyIiwiZW1haWwiOiJkaW5oYW5odm5uM0BnbWFpbC5jb20ifQ.bleFQiujQHctOaAu7LwxGL0fDomxW3Hgebb_9OJH415vobkBuzWd-u1_3ByuoWMNWCRvpz3KFvsMTj2iuqV3T_yYxncBE59DqN0bUFVHFmX9eqvJywf7LFn_sJOvc1CJ14YuxxzRmcQblqYTCKw5rsMfTyqD9DunZXSIXeWhDpfZe4NApmAGj7GAQiMIavgPRwpty0SQG1SU-uXihkhW71c7KHINfiEJVzUsXL4lqT7lJW7p0fMp9TM5v6FWWF-UBVnVjpS_Y3RYiJ0NJG9Zg5kdq7pljUBnv8xpvxaxRxzx1C4FGxITevJqQ2Z6G78PhHjKCanbF9c8-T9naNR3fA";
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


    @POST("tranhis")
    @Headers({"accept: application/json",
            "Content-Type: application/json",
            "x-api-key: hutech_hackathon@123456",
            "access-token: "+ key})
    Call<TranhisRes>getTransHis(@Body TranhisReq acc) ;


    @POST("balance")
    @Headers({"accept: application/json",
            "Content-Type: application/json",
            "x-api-key: hutech_hackathon@123456",
            "access-token: "+ key})
    Call<BalanceRes>getAmount(@Body BalancReq acc) ;

    @POST("transfer")
    @Headers({"accept: application/json",
            "Content-Type: application/json",
            "x-api-key: hutech_hackathon@123456",
            "access-token: "+ key})
    Call<transferRes>getTransfer(@Body transferReq acc) ;






}
