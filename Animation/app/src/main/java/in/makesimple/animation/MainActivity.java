package in.makesimple.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Animation fadein,fadeout,zoomin,zoomout;
    Button b_fin,b_fout,b_zin,b_zout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fadein= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        fadeout= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
        zoomin= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
        zoomout= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);

        final ImageView imageView=(ImageView)findViewById(R.id.image);


        b_fin=(Button)findViewById(R.id.fadein);
        b_fout=(Button)findViewById(R.id.fadeout);
        b_zin=(Button)findViewById(R.id.zoomin);
        b_zout=(Button)findViewById(R.id.zoomout);

        b_fin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.startAnimation(fadein);
            }
        });

        b_fout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.startAnimation(fadeout);
            }
        });
        b_zin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.startAnimation(zoomin);
            }
        });

        b_zout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.startAnimation(zoomout);
            }
        });

    }
}
