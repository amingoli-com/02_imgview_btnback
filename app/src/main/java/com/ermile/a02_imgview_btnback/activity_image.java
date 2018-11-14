package com.ermile.a02_imgview_btnback;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class activity_image extends AppCompatActivity {

    ImageView ball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_image );

        ball=findViewById ( R.id.ball );

        ball.animate ()
                .rotationBy ( 4 *360f )
                .setDuration ( 5000 )
                .translationX ( 500f )
                .translationY ( 400f )
        ;

    }
}
