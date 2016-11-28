package com.example.labp2komp5.project8animasi;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {
Button r,z,m,b,ma;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            run();

    }

    private void run() {

        r=(Button)findViewById(R.id.btnRotasi);
        z=(Button)findViewById(R.id.btnZoom);
        m=(Button)findViewById(R.id.btnmove);
        b=(Button)findViewById(R.id.btnBounce);
        ma=(Button)findViewById(R.id.btnMatch);
        iv=(ImageView)findViewById(R.id.image1);

       final Animation rotate= AnimationUtils.loadAnimation(this,R.anim.rotasi);
       final Animation zoom=AnimationUtils.loadAnimation(this,R.anim.zoom);
       final Animation move=AnimationUtils.loadAnimation(this,R.anim. move);
        final Animation bounce=AnimationUtils.loadAnimation(this,R.anim.bounce);
        final Animation match=AnimationUtils.loadAnimation(this,R.anim.match);

        r.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                iv.startAnimation(rotate);
            }
             });

        z.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                iv.startAnimation(zoom);
            }
        });

        m.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.startAnimation(move);
            }
        });

        b.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                    iv.startAnimation(bounce);
            }
        });

        ma.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                iv.startAnimation(match);
            }
        });
}
















    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
