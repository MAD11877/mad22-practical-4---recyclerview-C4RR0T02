package sg.edu.np.mad.madpractical1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.EventLogTags;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Name = (TextView) findViewById((R.id.Name));
        TextView Description = (TextView) findViewById((R.id.Description));

        Button followButton = (Button) findViewById(R.id.Follow);

        Intent i2 = getIntent();
        String username = i2.getStringExtra("Username");
        String description = i2.getStringExtra("Description");
        boolean followed = i2.getBooleanExtra("Followed", false);
        List<User> userList = (List<User>) i2.getSerializableExtra("UserList");
        int place = i2.getIntExtra("index", -1);

        Name.setText(username);
        Description.setText(description);
        if (followed == true){
            followButton.setText("Unfollow");
        }
        else {
            followButton.setText("Follow");
        }

        User u = userList.get(place);

        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (u.Followed == true){
                    u.Followed = false;
                    followButton.setText("Follow");
                    Toast.makeText(getApplicationContext(), "Unfollowed", Toast.LENGTH_SHORT).show();
                }
                else {
                    u.Followed = true;
                    followButton.setText("Unfollow");
                    Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}