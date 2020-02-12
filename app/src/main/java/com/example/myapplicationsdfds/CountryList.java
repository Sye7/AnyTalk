package com.example.myapplicationsdfds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplicationsdfds.CountryModel;
import com.example.myapplicationsdfds.LanguageListAdapter;
import com.example.myapplicationsdfds.R;

import java.util.ArrayList;

public class CountryList extends AppCompatActivity implements LanguageListAdapter.ItemClickListener {

    LanguageListAdapter adapter;
    ArrayList<CountryModel> animalNames;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list);


        // data to populate the RecyclerView with
        animalNames = new ArrayList<>();

        CountryModel c = new CountryModel("USA", R.mipmap.us, "us", "en");
        animalNames.add(c);


        c = new CountryModel("USA", R.mipmap.us, "us", "en");
        animalNames.add(c);
        c = new CountryModel("INDIA", R.mipmap.in, "in", "hi");
        animalNames.add(c);
        c = new CountryModel("JAPAN", R.mipmap.jp, "jp", "jp");
        animalNames.add(c);
        c = new CountryModel("Blah", R.mipmap.ag, "us", "en");
        animalNames.add(c);
        c = new CountryModel("Blah Blah", R.mipmap.ad, "us", "en");
        animalNames.add(c);
        c = new CountryModel("Dope", R.mipmap.ae, "as", "en");
        animalNames.add(c);
        c = new CountryModel("Itachi", R.mipmap.ai, "fs", "en");
        animalNames.add(c);
        c = new CountryModel("Sasuke", R.mipmap.am, "rs", "en");
        animalNames.add(c);
        c = new CountryModel("Gaara", R.mipmap.ba, "ut", "en");
        animalNames.add(c);
        c = new CountryModel("Might", R.mipmap.bb, "es", "en");
        animalNames.add(c);
        c = new CountryModel("NOOOO", R.mipmap.bf, "ws", "en");
        animalNames.add(c);
        c = new CountryModel("COUNTRY", R.mipmap.sb, "qs", "en");
        animalNames.add(c);
        c = new CountryModel("COUNTRY", R.mipmap.gb, "as", "en");
        animalNames.add(c);
        c = new CountryModel("COUNTRY", R.mipmap.bz, "fs", "en");
        animalNames.add(c);
        c = new CountryModel("COUNTRY", R.mipmap.by, "hs", "en");
        animalNames.add(c);
        c = new CountryModel("COUNTRY", R.mipmap.bn, "hs", "en");
        animalNames.add(c);
        c = new CountryModel("COUNTRY", R.mipmap.cd, "js", "en");
        animalNames.add(c);
        c = new CountryModel("COUNTRY", R.mipmap.dk, "ks", "en");
        animalNames.add(c);
        c = new CountryModel("COUNTRY", R.mipmap.sd, "cs", "en");
        animalNames.add(c);
        c = new CountryModel("COUNTRY", R.mipmap.tc, "xs", "en");
        animalNames.add(c);


        // set up the RecyclerView
         recyclerView = findViewById(R.id.rv_items);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new LanguageListAdapter(this, animalNames);
        recyclerView.setAdapter(adapter);
        adapter.setClickListener(this);




        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this) {
            @Override
            protected int getExtraLayoutSpace(RecyclerView.State state) {
                return 300;
            }

        };


    }

    @Override
    public void onItemClick(View view, int position) {

        Toast.makeText(this, animalNames.get(position).getNameSmall(), Toast.LENGTH_SHORT).show();
    }
}
