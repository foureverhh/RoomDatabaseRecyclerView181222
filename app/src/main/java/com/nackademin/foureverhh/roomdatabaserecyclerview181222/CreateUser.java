package com.nackademin.foureverhh.roomdatabaserecyclerview181222;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateUser extends AppCompatActivity {
    private static final String TAG = "CreateUser";
    EditText firstName;
    EditText lastName;
    EditText email;
    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_user);

        firstName = findViewById(R.id.first_name);
        lastName = findViewById(R.id.last_name);
        email = findViewById(R.id.email);
        button = findViewById(R.id.button);

        final AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class,
                "productions").
                allowMainThreadQueries().
                build();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 //Save to the database
                 Log.d(TAG,"OnClick:first name: "+firstName.getText().toString());
                 db.userDao().insertAll(new User("Daneil",
                         "Malone",
                         "Daneil.Malone@gmail.com"));
                 startActivity(new Intent(CreateUser.this,MainActivity.class));
            }
        });
        
    }

}
