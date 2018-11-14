package com.ermile.a02_imgview_btnback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        SubMenu smenu= menu.addSubMenu ( "View" );

        smenu.add ( "image" ).setOnMenuItemClickListener ( new MenuItem.OnMenuItemClickListener ( ) {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                startActivity ( new Intent ( MainActivity.this,activity_image.class ) );
                return false;
            }
        } );






        return super.onCreateOptionsMenu ( menu );

    }
}
