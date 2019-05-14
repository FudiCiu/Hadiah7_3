package com.latihanandroid.hadiah7_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPresident;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvPresident= (RecyclerView) findViewById(R.id.rvPresident);
//        rvPresident.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager= new GridLayoutManager(getApplicationContext(),2);
        rvPresident.setLayoutManager(gridLayoutManager);
        PresidentAdapter adapter= new PresidentAdapter(PresidentData.getListPresident(),this);
        rvPresident.setAdapter(adapter);
    }
}
