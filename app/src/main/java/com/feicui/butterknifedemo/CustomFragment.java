package com.feicui.butterknifedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2016/11/30 0030.
 */

public class CustomFragment extends Fragment {

    @BindView(R.id.mytext)
    TextView mytext;
    @BindView(R.id.mybutton)
    Button mybutton;
    @BindView(R.id.butotn1)
    Button butotn1;
    private Unbinder bind;
    //dfgsdfg

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, null);
        Unbinder bind = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        bind.unbind();

    }
}
