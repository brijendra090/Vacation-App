package com.crackcode.vacation;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.crackcode.vacation.adapter.RecentsAdapter;
import com.crackcode.vacation.adapter.TopPlacesAdapter;
import com.crackcode.vacation.model.RecentsData;
import com.crackcode.vacation.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Dal Lake","India","From $200",R.drawable.lake_dal_shikava_boat));
        recentsDataList.add(new RecentsData("Gangtok","India","From $300",R.drawable.gangtok));
        recentsDataList.add(new RecentsData("Jaipur","India","From $200",R.drawable.jaipur));
        recentsDataList.add(new RecentsData("Delhi","India","From $300",R.drawable.delhi));
        recentsDataList.add(new RecentsData("Lucknow","India","From $200",R.drawable.lucknow));
        recentsDataList.add(new RecentsData("Agra","India","From $300",R.drawable.agra));

        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Taj Mahal","India","$200 - $500",R.drawable.agra));
        topPlacesDataList.add(new TopPlacesData("India Gate","India","$200 - $500",R.drawable.delhi));
        topPlacesDataList.add(new TopPlacesData("Dal Lake","India","$200 - $500",R.drawable.lake_dal_shikava_boat));
        topPlacesDataList.add(new TopPlacesData("Lucknow","India","$200 - $500",R.drawable.lucknow));
        topPlacesDataList.add(new TopPlacesData("Gangtok","India","$200 - $500",R.drawable.gangtok));

        setTopPlacesRecycler(topPlacesDataList);
    }

    private  void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);

    }

    private  void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList){

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);

    }
}