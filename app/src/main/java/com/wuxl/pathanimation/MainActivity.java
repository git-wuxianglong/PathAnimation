package com.wuxl.pathanimation;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView anim_path;
    private ImageView anim_path_with_fillcolor;
    private ImageView anim_path_with_strokecolor;
    private ImageView anim_path_all;

    private Drawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anim_path = (ImageView) findViewById(R.id.anim_path);
        anim_path.setOnClickListener(this);

        anim_path_with_fillcolor = (ImageView) findViewById(R.id.anim_path_with_fillcolor);
        anim_path_with_fillcolor.setOnClickListener(this);

        anim_path_with_strokecolor = (ImageView) findViewById(R.id.anim_path_with_strokeColor);
        anim_path_with_strokecolor.setOnClickListener(this);

        anim_path_all = (ImageView) findViewById(R.id.anim_path_all);
        anim_path_all.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.anim_path:
                startAnim(anim_path);
                break;
            case R.id.anim_path_with_fillcolor:
                startAnim(anim_path_with_fillcolor);
                break;
            case R.id.anim_path_with_strokeColor:
                startAnim(anim_path_with_strokecolor);
                break;
            case R.id.anim_path_all:
                startAnim(anim_path_all);
                break;
        }
    }

    /**
     * 启动动画
     *
     * @param imageView
     */
    private void startAnim(ImageView imageView) {
        drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }
}

