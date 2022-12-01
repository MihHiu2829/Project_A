package com.example.project_a.ViewModel;

import android.util.Log;

import com.example.project_a.API.Req.Register;
import com.example.project_a.API.Res.GetKey;
import com.example.project_a.API.Res.RegisterRes;
import com.example.project_a.Storage.App;

import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class m003_VM extends BaseViewModel_API{

    public static final String REGISTER_KEY ="REGISTER_KEY" ;
    public String email ;
    public String phone ;
    public String fullName ;
    public String identity ;
    public String credential ;

   public void getResiger()
    {
            String credentialTmp = "{\"username\":\""+ App.getInstance().getStorage().username
                    +"\",\"password\":\""+App.getInstance().getStorage().passsword+"\"\n" +
                    "}" ;
            try{
                credential =  Base64.getEncoder().encodeToString(encrypt(credentialTmp, App.getInstance().getStorage().key));
                Log.e(m003_VM.class.getName(),"Credential: "+ credential) ;
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        getAPI().getAccount(new Register(credential,email,fullName,identity,App.getInstance().getStorage().key,phone)).enqueue(initHandleResponse(REGISTER_KEY));


    }

    public static PublicKey getPublicKey(String base64PublicKey){
        PublicKey publicKey = null;
        try{
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(Base64.getDecoder().decode(base64PublicKey.getBytes()));
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            publicKey = keyFactory.generatePublic(keySpec);
            return publicKey;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }
        return publicKey;
    }
    public static byte[] encrypt(String data, String publicKey) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, getPublicKey(publicKey));
        return cipher.doFinal(data.getBytes());
    }
//Format message invalid, email format invalid, phoneNumber should be 10-11 numbers and start with 0
    @Override
    protected void handleSuccess(String key, Object body) {
        super.handleSuccess(key, body);
        String notify ="" ;
        if(key.equals(REGISTER_KEY))
        {
            RegisterRes res =(RegisterRes) body ;
            Log.e(m003_VM.class.getName(),res.toString()) ;
            if(res.response.responseMessage.contains("email format invalid"))
                notify += "kiểu email của bạn bị sai, ";
            if(res.response.responseMessage.contains("phoneNumber should be 10-11 numbers and start with 0"))
                notify += "số điện thoại phải bắt đầu bằng 0 và đừng có chữ, ";
            if(res.response.responseMessage.contains("identityNumber should only include number"))
                notify += "Lỗi số căn cước," ;
        }

        App.getInstance().getStorage().notifyCase = notify ;
    }

}
