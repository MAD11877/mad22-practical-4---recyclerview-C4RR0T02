package sg.edu.np.mad.madpractical1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User u = new User("MAD", "Description", 00, false);

        TextView Name = (TextView) findViewById((R.id.Name));
        Name.setText(u.Name);

        Button followButton = (Button) findViewById(R.id.Follow);

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

        Intent i2 = getIntent();
        Integer number = i2.getIntExtra("rNumber", -1);

        String text = u.Name + number;
        Name.setText(text);

    }
}