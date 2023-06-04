package com.msaggik.homework31;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textCount;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textCount = findViewById(R.id.textCount);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(listner);
    }


    private final View.OnClickListener listner = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
         count++;
            textCount.setText(Integer.toString(count));
        }
    };

    @Override
    protected void onStart() {
        Toast toast = Toast.makeText(this, "Старт активности", Toast.LENGTH_LONG);
        toast.show();
        super.onStart();
    }
    @Override
    protected void onStop() {
        Toast toast = Toast.makeText(this, "Стоп активности", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.LEFT, 0, 0 );
        toast.show();
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Toast toast = Toast.makeText(this,"Уничтожение активности",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM,0,0);
        toast.show();
        super.onDestroy();
    }
    @Override
    protected void onPause() {
        Toast toast = Toast.makeText(this, R.string.pause_activity, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP,0,0);
        toast.show();
        super.onPause();
    }
    @Override
    protected void onResume() {
        Toast toast = Toast.makeText(this, R.string.resume_activity, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        LinearLayout toastContainer = (LinearLayout) toast.getView();
        ImageView sea = new ImageView(this);
        sea.setImageResource(R.drawable.unnamed);
        toastContainer.addView(sea, 1);
        toast.show();
        super.onResume();
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

}