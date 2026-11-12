
package com.example.modul2ku;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import android.graphics.Color;

public class MainActivity_GridView extends ComponentActivity {

    String[] data = {
            "Merah", "Hijau", "Biru",
            "Kuning", "Orange", "Ungu",
            "Hitam", "Putih", "Pink"
    };

    int[] warna = {
            Color.RED,
            Color.GREEN,
            Color.BLUE,
            Color.YELLOW,
            0xFFFF9800,
            0xFF9C27B0,
            Color.BLACK,
            Color.WHITE,
            0xFFE91E63
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.gridview);

        GridView gridView = findViewById(R.id.grid_view);

        BaseAdapter adapter = new BaseAdapter() {

            @Override
            public int getCount() {
                return data.length;
            }

            @Override
            public Object getItem(int position) {
                return data[position];
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView,
                                ViewGroup parent) {

                TextView textView = new TextView(
                        MainActivity_GridView.this
                );

                textView.setText(data[position]);
                textView.setTextSize(18);
                textView.setGravity(Gravity.CENTER);
                textView.setTextColor(
                        position == 3 || position == 7
                                ? Color.BLACK : Color.WHITE
                );

                textView.setBackgroundColor(warna[position]);

                textView.setLayoutParams(
                        new GridView.LayoutParams(
                                ViewGroup.LayoutParams.MATCH_PARENT,
                                120
                        )
                );

                return textView;
            }
        };

        gridView.setAdapter(adapter);
    }
}
