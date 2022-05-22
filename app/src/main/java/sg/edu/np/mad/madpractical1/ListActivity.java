package sg.edu.np.mad.madpractical1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ArrayList<User> userList = new ArrayList<User>();

        for (int i = 0; i < 20; i++) {

            User m = new User();

            Random number1 = new Random();
            Integer num1 = number1.nextInt(99999999);
            Random number2 = new Random();
            Integer num2 = number2.nextInt(99999999);
            Random bool = new Random();
            Boolean rbool = bool.nextBoolean();

            m.Name = "Name " + num1 + "7";
            m.Description = "Description " + num2;
            m.Followed = rbool;
            m.Id = i;

            userList.add(m);

        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView recyclerView = findViewById(R.id.recycler);
        Adapter mAdapter = new Adapter(userList);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(ListActivity.this);

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);



        /*
        ImageView alertPrompt = findViewById(R.id.Alertpromptimage);

        alertPrompt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random num = new Random();
                Integer numint = num.nextInt(999999999);

                AlertDialog.Builder builder = new AlertDialog.Builder(ListActivity.this);

                builder.setTitle("Profile");
                builder.setMessage("MADness");
                builder.setPositiveButton("View", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        Intent i2 = new Intent(ListActivity.this, MainActivity.class);
                        i2.putExtra("rNumber", numint);
                        startActivity(i2);
                    }
                });
                builder.setNegativeButton("Close", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                    }
                });

                builder.show();
            }
        });

         */
    }
}