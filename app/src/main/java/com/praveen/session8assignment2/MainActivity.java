package com.praveen.session8assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Create Object Of ListView, Collection of Person Class, And Object of ContactListAdapter Class

    private ListView contactsListView; // Declares ListView object type variable to show the content from contacts
    private ArrayList<Contact> contactsList; // Declares ArrayList object type variable to store the content from contacts
    private ContactsListAdapter contactsListAdapter; // Declares a customAdapter object type variable to connect the List view with content from contacts

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //References View Object with Layout Views
        Button listContactsButton = findViewById(R.id.listContactsButton);
        Button clearButton = findViewById(R.id.clearButton);
        contactsListView =   findViewById(R.id.contactsListView);

        // Initializes contactList ArrayList
        contactsList = new ArrayList<>();



        // Sets a ClickListener to listcontacts Button
        listContactsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Assigns Values into contactList ArrayList
                for (int i = 0; i < 15; i++) {
                    contactsList.add(new Contact("Name " + (i + 1), "PhoneNumber" + (i + 1)));
                }

                // Instantiates Object of the CustomAdapter(contactListAdapter) and Assigns contactList ArrayList to it
                contactsListAdapter = new ContactsListAdapter(getApplicationContext(), contactsList);

                /* The ListView is loaded with contactsList items */

                // Assigns Custom Adapter(contactListAdapter) to ListView.
                contactsListView.setAdapter(contactsListAdapter);
            }

        });

        // Sets a ClickListener to clearButton
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contactsList.clear();
                contactsListAdapter.notifyDataSetChanged();
            }
        });

        // Set On Item Click Listener To Get Item And Show Person Name from the selected row as Toast.
        contactsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Contact Name : " + contactsList.get(i).getName() + "\nContact Number: " + contactsList.get(i).phoneNumber, Toast.LENGTH_SHORT).show();
            }
        });
    }

}

