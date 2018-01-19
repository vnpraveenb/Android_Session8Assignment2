package com.praveen.session8assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    // Create Object Of ListView, Collection of Person Class, And Object of CustomAdapter Class
    private ListView contactsListView;
    private ArrayList<Contact> contactsList;
    private ContactsListAdapter contactsListAdapter;

    ArrayList<String> monthsList;         // Declaring ArrayList Object to store month list as strings
    ArrayAdapter<String> monthsListAdapter; // Declaring ArrayList Adapter to show month objects
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //References View Object with Layout Views
        Button listContactsButton = findViewById(R.id.listContactsButton);
        Button clearButton = findViewById(R.id.clearButton);
        ListView listView = findViewById(R.id.listView);

        // Find List View And Type Cast to ListView Object
        contactsListView = (ListView)findViewById(R.id.contactsListView);

        // Initialize personList Array
        contactsList = new ArrayList<>();

        // Assign Values into Person List Array
        for(int i=1;i <=20; i++){
            contactsList.add(new Contact("Name " + i , "Phone Number " + i));
        }

        // Create Object of CustomAdapater and Assign personList Collection.
        contactsListAdapter = new contactsListAdapter(getApplicationContext(), contactsList);
        // Assign Custom Adapter to ListView
        personsListView.setAdapter(customAdapter);
        // Sets a ClickListener to listcontacts Button
        listContactsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              /*  Collections.sort(monthsList);  //Sorts the ArrayList in Ascending order with the static method sort() of Collections class
                monthsListAdapter.notifyDataSetChanged(); // Notifies the changes in the ArrayList to the ArrayAdapter
*/
            }
        });

        // Sets a ClickListener to Descending Button
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              /*  Collections.sort(monthsList);   ///Sorts the ArrayList in Ascending order with the static method sort() of Collections class
                Collections.reverse(monthsList); // Reverses the sort order of the  ArrayList to Descending order
                monthsListAdapter.notifyDataSetChanged(); // Notifies the changes in the ArrayList to the ArrayAdapter*/
            }
        });


        // Initializes ArrayList Object with months of the year
        monthsList = new ArrayList<String>();
        monthsList.add("January");
        monthsList.add("February");
        monthsList.add("March");
        monthsList.add("April");
        monthsList.add("May");
        monthsList.add("June");
        monthsList.add("July");
        monthsList.add("August");
        monthsList.add("September");
        monthsList.add("October");
        monthsList.add("November");
        monthsList.add("December");

        // Binds the ArrayList to ArrayAdapter
        monthsListAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,monthsList);
        listView.setAdapter(monthsListAdapter);

