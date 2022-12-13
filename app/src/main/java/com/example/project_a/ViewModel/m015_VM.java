package com.example.project_a.ViewModel;

import android.util.Log;

import com.example.project_a.API.API;
import com.example.project_a.API.Req.BalancReq;
import com.example.project_a.API.Req.TranhisReq;
import com.example.project_a.API.Req.transferReq;
import com.example.project_a.API.Res.BalanceRes;
import com.example.project_a.API.Res.TranhisRes;
import com.example.project_a.API.Res.transferRes;
import com.example.project_a.Storage.App;

import okhttp3.ResponseBody;

public class m015_VM extends BaseViewModel_API{

    public static final String GET_TRANSFER = "GET_TRANSFER";


    public void getTransfer(String amount, String desC, String toAcct)
    {
        getAPI().getTransfer(new transferReq(amount,desC,toAcct)).enqueue(initHandleResponse(GET_TRANSFER));
    }

    public static final String GET_TRANSHIS = "GET_TRANSHIS";
    public static final String GET_AMOUNT = "GET_AMOUNT" ;

    public void  getTransHis(String fromDate, String toDate){
              getAPI().getTransHis(new TranhisReq(App.getInstance()
                      .getStorage().accountNo,fromDate,toDate )).enqueue(initHandleResponse(GET_TRANSHIS));
      }

      public void getAmount()
      {
          getAPI().getAmount(new BalancReq()).enqueue(initHandleResponse(GET_AMOUNT));
      }

    public static String price = "0" ;

    public  String getPrice() {
        return price;
    }

    @Override
    protected void handleSuccess(String key, Object body) {
        super.handleSuccess(key, body);
        if(key.equals(GET_TRANSHIS))
        {
            TranhisRes res = (TranhisRes) body ;
            if(res.response.responseCode.equals("00"))
            {
                Log.e(m015_VM.class.getName(),res.response.responseMessage) ;
            }

        }else if (key.equals(GET_AMOUNT))
        {
            BalanceRes res1 = (BalanceRes) body ;
            Log.e(m015_VM.class.getName(),res1.response.responseMessage) ;
            if(res1.response.responseCode.equals("00"))
            {
                Log.e(m015_VM.class.getName(),res1.response.responseMessage) ;
                price = res1.data.amount ;
            }


        }else if(key.equals(GET_TRANSFER))
        {
            transferRes res = (transferRes)body ;
            Log.e(m015_VM.class.getName(), res.response.responseMessage) ;
            Log.e(m015_VM.class.getName(), res.response.responseCode) ;
//            if(res.response.responseCode.equals("03"))
//            {
//                Log.e(m015_VM.class.getName(),"Chuyen tien thanh cong? : "+res.response.responseMessage) ;
//            }
        }
        Log.e(m015_VM.class.getName(),"Thanh cong hoac khong thanh cong!!");
    }

    @Override
    protected void handleFail(String key, int code, ResponseBody errorBody) {
        super.handleFail(key, code, errorBody);
        if(key.equals(GET_TRANSHIS))
        {
            Log.e(m015_VM.class.getName(),errorBody.toString());
            Log.e(m015_VM.class.getName(),"That bai! ");
        }else if(key.equals(GET_TRANSFER))
        {
            Log.e(m015_VM.class.getName(),errorBody.toString());
            Log.e(m015_VM.class.getName(),"That bai! ");
        }

    }
}
