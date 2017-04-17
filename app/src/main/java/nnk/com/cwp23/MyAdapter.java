package nnk.com.cwp23;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created by Naveen on 11/18/2016.
 */

public class MyAdapter extends BaseAdapter
{
    Context c;
    int xml_file;
    String names[];
    float rating[];
    int years[];
    int images[];

    public MyAdapter(Context c,int xml_file,String names[],float rating[],int years[],int images[])
    {
        this.c = c;
        this.xml_file = xml_file;
        this.names = names;
        this.rating =rating;
        this.years = years;
        this.images = images;
    }

    @Override
    public int getCount()
    {
        return names.length;
    }

    @Override
    public Object getItem(int position)
    {
        return names[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {

        LayoutInflater li = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = li.inflate(xml_file,parent,false);

        ImageView iv = (ImageView)v.findViewById(R.id.iv1);
        iv.setImageResource(images[position]);

        TextView tv1 = (TextView)v.findViewById(R.id.name);
       // TextView tv2 = (TextView)v.findViewById(R.id.rating);
        RatingBar rb = (RatingBar)v.findViewById(R.id.rating);
        TextView tv3 = (TextView)v.findViewById(R.id.year);

        tv1.setText(names[position]);
        rb.setRating(rating[position]);
        tv3.setText(""+years[position]);

        return v;
    }
}
