package com.feicui.butterknifedemo;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindColor;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {


    //绑定视图
    @BindView(R.id.mytext)
    TextView textView;
    @BindView(R.id.mybutton)
    Button button;
    @BindView(R.id.butotn1)
    Button butotn1;


    //绑定资源
    @BindColor(R.color.colorAccent)
    int red;

    @BindDrawable(R.drawable.ic_launcher)
    Drawable icon;

    @BindString(R.string.app_name)
    String name;
    @BindView(R.id.mylistview)
    ListView mylistview;


    private Unbinder bind;
    private List<String> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Unbinder bind = ButterKnife.bind(this);


        list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add("你好" + i);
        }

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        mylistview.setAdapter(adapter);

    }


    @OnClick({R.id.mybutton, R.id.butotn1})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mybutton:
                textView.setText(name);
                textView.setTextColor(red);
                break;
            case R.id.butotn1:
                textView.setText("水电费水电费");
                break;
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }

    @OnItemClick(R.id.mylistview)

    public void itemClickchanged(int position) {
        Toast.makeText(this, "dianji" + position, Toast.LENGTH_SHORT).show();

    }

}
