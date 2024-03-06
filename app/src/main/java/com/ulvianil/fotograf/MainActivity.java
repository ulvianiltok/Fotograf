package com.ulvianil.fotograf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.ulvianil.fotograf.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Gorsel> gorselArrayList;
    int seciliSiraNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        gorselArrayList = new ArrayList<>();
        Gorsel berkay1 = new Gorsel("Çalışkan Berkay",1,R.drawable.berkay1);
        Gorsel berkay2 = new Gorsel("Beatbox yapan Berkay",1,R.drawable.berkay2);
        Gorsel berkay3 = new Gorsel("Karizma Berkay",1,R.drawable.berkay3);
        Gorsel mqdefault = new Gorsel("Aşçı Berkay",1,R.drawable.mqdefault);

        gorselArrayList.add(berkay1);
        gorselArrayList.add(berkay2);
        gorselArrayList.add(berkay3);
        gorselArrayList.add(mqdefault);

        binding.imageView.setImageResource(gorselArrayList.get(0).foto);
        binding.textView.setText(gorselArrayList.get(0).bilgi);
        seciliSiraNo=0;
    }
    public void geriGelme(View view){
        if(seciliSiraNo>0){
            seciliSiraNo--;
            binding.imageView.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            binding.textView.setText(gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }
    public void ileriGitme(View view){
        if(seciliSiraNo<gorselArrayList.size()-1){
            seciliSiraNo++;
            binding.imageView.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            binding.textView.setText(gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }
}