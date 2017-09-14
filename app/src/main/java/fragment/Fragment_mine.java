package fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lakalaka.test1.MainActivity;
import com.example.lakalaka.test1.R;

import java.util.concurrent.ConcurrentHashMap;

import static com.example.lakalaka.test1.R.layout.activity_main;
import static com.example.lakalaka.test1.R.layout.fragment_mine;

/**
 * Created by lakalaka on 2017/9/13/0013.
 */


public class Fragment_mine extends Fragment{
    public Fragment_mine(){



    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


        View view=inflater.inflate(R.layout.fragment_mine,container,false);
        return view;


    }

    /*private void intview() {
        but_login= (Button) getView().findViewById(R.id.btn_login);
        but_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
*/

    }






