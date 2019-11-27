package com.creativecodes.multiplyme;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    EditText tableno;
    Button load;
    String tableno_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        tableno=(EditText)findViewById(R.id.editTexttableno);
        load=(Button)findViewById(R.id.buttonload);






        load.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
//                Toast.makeText(MainActivity.this, "Loading tables", Toast.LENGTH_SHORT).show();

                if(tableno.getText().toString().length()>5) {
                    tableno.setError("Limit exceeded,Enter less than 6 digits");
                }


                else
                {
                    Intent intent=new Intent(MainActivity.this,Display_table.class);
                    tableno_text=tableno.getText().toString();
                    intent.putExtra("table_no",tableno_text);
                    Toast.makeText(MainActivity.this, "Loading table no."+tableno_text, Toast.LENGTH_SHORT).show();


                    startActivity(intent);

                }



//
            }
        });



    }


}
