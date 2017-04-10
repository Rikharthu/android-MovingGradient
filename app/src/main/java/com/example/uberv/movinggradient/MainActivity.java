package com.example.uberv.movinggradient;

import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout mRootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRootView= (ConstraintLayout) findViewById(R.id.root);

        AnimationDrawable animationDrawable = (AnimationDrawable) mRootView.getBackground();

        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);

        animationDrawable.start();

        // Another approach:
        /*
        // Load the ImageView that will host the animation and
         // set its background to our AnimationDrawable XML resource.
         ImageView img = (ImageView)findViewById(R.id.spinning_wheel_image);
         img.setBackgroundResource(R.drawable.spin_animation);

         // Get the background, which has been compiled to an AnimationDrawable object.
         AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();

         // Start the animation (looped playback by default).
         frameAnimation.start();
         */

    }
}
