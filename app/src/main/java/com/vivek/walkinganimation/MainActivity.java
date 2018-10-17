package com.vivek.walkinganimation;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends Activity {
    ImageView iv;
    Animation ani;
    AnimationDrawable ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=findViewById(R.id.iv);
       /* iv.setBackgroundResource(R.drawable.item_list);
        ad=(AnimationDrawable) iv.getBackground();
*/
      // ani= AnimationUtils.loadAnimation(this,R.anim.myanimation);
        ani=new TranslateAnimation(0,100,0,0);
        ani.setDuration(200);
        ani.setRepeatCount(4);
    }
    public void doThis(View view)
    {
  //     ad.start();
    }
}
