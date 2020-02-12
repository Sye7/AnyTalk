package com.example.myapplicationsdfds;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.numpad.NumPad;
import com.example.numpad.NumPadClick;
import com.example.numpad.numPadClickListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    NumPad dialPad;
    EditText phoneNumberEditText;


    ImageView senderFlag;
    TextView senderCountryName;


    ImageView receiverFlag;
    TextView receiverCountryName;
    ImageButton switchlang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dialPad = findViewById(R.id.numpad_id);
        phoneNumberEditText = findViewById(R.id.phone_number_edit_text);
        senderCountryName = findViewById(R.id.sender_country_name_text_view);
        senderFlag = findViewById(R.id.senderFlag);
        receiverCountryName = findViewById(R.id.receiver_country_name_text_view);
        receiverFlag = findViewById(R.id.receiverFlag);
        switchlang = findViewById(R.id.switchLang);



        dialPad.setOnNumPadClickListener(new NumPadClick(new numPadClickListener() {
            @Override
            public void onNumpadClicked(ArrayList<Integer> nums) {

                String num = "";
                for(Integer a:nums)
                    num = num + a;
                phoneNumberEditText.setText(num);
            }
        }));
    }

    boolean flag = true;

    @SuppressLint("ResourceType")
    public void switchLang(View view)
    {
        String senderCountryTemp;
        int senderFlagTemp;

  //      senderFlagTemp = senderFlag.getId();
//            senderCountryTemp = senderCountryName.getText().toString();

        if(flag)
        {

            senderCountryName.setText(receiverCountryName.getText().toString());
            senderFlag.setImageResource(R.mipmap.in);


            receiverCountryName.setText(senderCountryName.getText().toString());
            receiverFlag.setImageResource(R.mipmap.ca);
            flag = false;

        }
        else
        {

            senderCountryName.setText("Canada");
            senderFlag.setImageResource(R.mipmap.ca);


            receiverCountryName.setText("India");
            receiverFlag.setImageResource(R.mipmap.in);
            flag = true;
        }




    }

    public void openCountrySenderActivity(View view)
    {
        startActivity(new Intent(getApplicationContext(), CountryList.class));
    }

    public void openCountryReceiverActivity(View view)
    {
        startActivity(new Intent(getApplicationContext(),CountryList.class));
    }
}
