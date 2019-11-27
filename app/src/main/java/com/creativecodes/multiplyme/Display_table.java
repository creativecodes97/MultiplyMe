package com.creativecodes.multiplyme;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class   Display_table extends AppCompatActivity {
    private static final String tag1 = "asd";
    String table_no;
    int sum;
    TextView resulthead;
    ArrayList<HashMap<String, String>> detaillist;
    String one;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_table);

        table_no=getIntent().getStringExtra("table_no");
        listView=(ListView)findViewById(R.id.listtable);
        resulthead=(TextView)findViewById(R.id.textViewresulthead) ;
        detaillist = new ArrayList<HashMap<String, String>>();

        resulthead.setText("THE TABLES OF "+table_no+" UPTO 40");

        loadtable();


    }







    public   void loadtable()
    {




        int t;
        t= Integer.parseInt(table_no);
        sum=t;
        for(int i=1;i<=40;i++)

        {
            String line=table_no+" X "+i+" = ";
            one= String.valueOf(sum);
            sum=sum+t;

            line=line+one;


            HashMap<String, String> detaillist1 = new HashMap<String, String>();
            detaillist1.put(tag1, line);
            detaillist.add(detaillist1);



        }







        ListAdapter adapter1=new SimpleAdapter(Display_table.this,detaillist,R.layout.listview_adapter,
                new String[]{tag1},
                new int[]{R.id.textviewresult});
        listView.setAdapter(adapter1);









    }





}
