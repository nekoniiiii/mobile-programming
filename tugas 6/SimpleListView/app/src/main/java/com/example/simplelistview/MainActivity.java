package com.example.simplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private ArrayAdapter<String> kontak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.listView);
        String[] nama = new String[] {"Agus","Budi","Cica","Dani",
                                    "Eka","Fani","Gina","Hadi","Indah",
                                    "Jono","Kana","Lina","Maya","Nanik","Opi"};

        ArrayList<String> listNama = new ArrayList<>();
        listNama.addAll(Arrays.asList(nama));

        kontak = new ArrayAdapter<String>(this, R.layout.simplerow, listNama);
        lv.setAdapter(kontak);
    }
}