package nnk.com.cwp23;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.lv1);
        String names[] = {"Dawn of the Planet of the Apes","District 9","Transformers: Age of Extinction","X-Men: Days of Future Past","The Machinist","The Last Samurai","The Amazing Spider-Man 2","Tangled","Rush","Drag Me to Hell"};
        float rating[] = {3.5f,2.5f,4.5f,.05f,5.0f,2.2f,1.9f,2.5f,4.0f,3.5f};
        int year[] = {2001,2002,2003,2004,2005,2006,2014,2015,2012,2011};
        int images[] = {R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six,R.drawable.seven,R.drawable.eight,R.drawable.nine,R.drawable.ten};


        MyAdapter ma = new MyAdapter(this,R.layout.my_list_items,names,rating,year,images);
        lv.setAdapter(ma);
    }
}
