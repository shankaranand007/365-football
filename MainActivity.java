package com.futball.asa.futball365;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.os.Bundle;
import android.app.Activity;
import android.text.StaticLayout;
import android.view.Menu;

import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class MainActivity extends Activity {

    private static String url="https://www.dropbox.com/s/rhk01nqlyj5gixl/jsonparsing.txt?dl=1";
    private SimpleAdapter simpleAdpt;
    private List<? extends Map<String,?>> personList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create a JSON parser Instance ----- Used JSON parser from Android
        JSONParser jParser=new JSONParser();

        //Getting JSON string from URL ------ Used JSON Array from Android
        JSONArray json=jParser.getJSONFromUrl(url);

        List<WhateverObject> yourData= new ArrayList<WhateverObject>();

        try {
            for(int i=0;i<json.length();i++)
            {
                JSONObject c=json.getJSONObject(i);// Used JSON Object from Android

                //Storing each Json in a string variable
                int AGE=c.getInt("age");
                String NAME=c.getString("name");
                String CITY=c.getString("city");
                String GENDER=c.getString("Gender");
                String BIRTHDATE=c.getString("birthdate");



            }
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ListView yourListView = (ListView) findViewById(R.id.list);

        simpleAdpt = new SimpleAdapter(this, personList, android.R.layout.simple_list_item_1, new String[] {"person"},
                new int[] {android.R.id.text1});

        yourListView.setAdapter(simpleAdpt);

    }

    private HashMap<String, String> createPerson(int age, String name, String city, String gender, String birthdate) {
        HashMap<String, String> person = new HashMap<String, String>();
        person.put("person", name+" | "+age + " | "+city + " | "+gender + " | "+birthdate);
        return person;
    }
}
