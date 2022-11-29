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

    @Override
    protected void handleSuccess(String key, Object body) {
        super.handleSuccess(key, body);
        if(key.equals(REGISTER_KEY))
        {
            RegisterRes getKey =(RegisterRes) body ;
            Log.e(m003_VM.class.getName(),getKey.toString()) ;
        }
    }

}
