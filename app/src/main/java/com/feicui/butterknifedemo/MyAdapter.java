package com.feicui.butterknifedemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/11/30 0030.
 */

public class MyAdapter extends BaseAdapter {


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder(view);

            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_main, null);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();

        }
        holder.mytext.setText("dfsdf");

        return view;
    }

    class ViewHolder {
        @BindView(R.id.mytext)
        TextView mytext;
        @BindView(R.id.mybutton)
        Button mybutton;
        @BindView(R.id.butotn1)
        Button butotn1;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
