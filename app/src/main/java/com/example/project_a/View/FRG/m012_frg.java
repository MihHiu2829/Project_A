package com.example.project_a.View.FRG;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project_a.R;
import com.example.project_a.ViewModel.m012_VM;
import com.example.project_a.databinding.M012SearchingBinding;
import com.example.project_a.otherClass.detailGames;
import com.example.project_a.otherClass.papers;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class m012_frg extends baseFRG<M012SearchingBinding,m012_VM> {
    private List<detailGames> list ;
    private int index = 0 ;

    @Override
    protected void initViews() {
                importList();
        importListPaper() ;

    }

    private void importListPaper()
    {
        AssetManager asst = context.getAssets();
        binding.lnListFind.removeAllViews();
        try {
            String[] paper = asst.list("GameBackUp/photo/") ;
            for(String a : paper)
            {
                InputStream in = asst.open("GameBackUp/photo/" + a) ;
                Bitmap bitmap = BitmapFactory.decodeStream(in) ;
                View itemview = LayoutInflater.from(context).inflate(R.layout.item_detailgame,null) ;
                ImageView iv_games = itemview.findViewById(R.id.iv_imageGames) ;
                iv_games.setImageBitmap(bitmap);
                detailGames item = list.get(index++);
                TextView nameGame = itemview.findViewById(R.id.tv_titleGame) ;
                TextView tv_price = itemview.findViewById(R.id.tv_price) ;
                TextView tv_publisher = itemview.findViewById(R.id.tv_homeSource) ;
                TextView released = itemview.findViewById(R.id.tv_release) ;
                TextView option = itemview.findViewById(R.id.tv_option) ;
                nameGame.setText(item.nameGame);
                tv_price.setText(item.price);
                tv_publisher.setText(item.publisher);
                released.setText(item.released);
                option.setText(item.option);
                binding.lnListFind.addView(itemview);
            }


        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void importList() {
        AssetManager ast = context.getAssets();
        list = new ArrayList<>()  ;
        try{
            InputStream in = ast.open("GameBackUp/listGame.txt") ;
            InputStreamReader inSR =new InputStreamReader(in, StandardCharsets.UTF_8) ;
            BufferedReader reader = new BufferedReader(inSR) ;

            String nameGame = null ;
            String  option = null, released = null, publisher = null, price = null  ;
            String line = reader.readLine() ;
            while(line != null)
            {
                if(nameGame==null)
                    nameGame = line ;
                else if(line.contains("','0');"))
                {
                    detailGames game  = new detailGames(nameGame,price,released,publisher,option) ;
                    list.add(game) ;
                    nameGame = null ;
                }else if(!line.isEmpty())
                {
                    price = line ;
                    line = reader.readLine() ;
                    option = line ;
                    line = reader.readLine() ;
                    publisher = line ;
                    line = reader.readLine() ;
                    released = line ;
                } line = reader.readLine() ;
            }
            in.close();
            inSR.close();
            reader.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    protected Class<m012_VM> ClassVM() {
        return m012_VM.class;
    }

    @Override
    protected M012SearchingBinding initViewBindings(LayoutInflater inflater, ViewGroup container) {
        return M012SearchingBinding.inflate(inflater,container,false);
    }
}
