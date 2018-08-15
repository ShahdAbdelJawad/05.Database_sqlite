package ws.idroid.database.ui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import ws.idroid.database.R;
import ws.idroid.database.model.Contact;
import ws.idroid.database.util.DatabaseHelper;

public class SQLiteActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqllite);

        DatabaseHelper db = new DatabaseHelper(this);
        /**
         * CRUD Operations
         * */
        // Inserting Contacts
        Log.d("Database", "Inserting ..");
        db.addContact(new Contact("Ravi", "9100000000"));
        db.addContact(new Contact("Srinivas", "9199999999"));
        db.addContact(new Contact("Tommy", "9522222222"));
        db.addContact(new Contact("Karthik", "9533333333"));

        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");
        List<Contact> contacts = db.getAllContacts();

        for (Contact cn : contacts) {
            String log = "Id: " + cn.getID() + " ,Name: " + cn.getName() + " ,Phone: " + cn
                    .getPhoneNumber();
            // Writing Contacts to log
            Log.d("Name: ", log);

        }
    }
}