package com.odbpo.fenggo.glide_circleimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.odbpo.fenggo.glide_circleimage.view.GlideCircleTransform;
import com.odbpo.fenggo.glide_circleimage.view.GlideRoundTransform;

/**
 * https://www.cnblogs.com/guilin-hu/p/5706916.html
 */
public class MainActivity extends AppCompatActivity {

    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = findViewById(R.id.iv);

        Glide.with(this)
                .load("https://www.baidu.com/img/bdlogo.png")
                .placeholder(R.mipmap.ic_launcher_round)//加载等待图片
                .error(R.mipmap.ic_launcher)//加载出错图片
                .diskCacheStrategy(DiskCacheStrategy.ALL)//缓存策略
                .transform(new GlideCircleTransform(this))//加载圆形图片
                //.transform(new GlideRoundTransform(this,10))//加载圆角图片
                .into(iv);
    }
}
