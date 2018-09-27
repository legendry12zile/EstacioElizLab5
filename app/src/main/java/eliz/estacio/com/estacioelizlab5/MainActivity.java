package eliz.estacio.com.estacioelizlab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {

        if (v.getId() == R.id.act2btn){
            // doStuff
            Intent intentMain = new Intent(MainActivity.this,
                    Main2Activity.class);
            MainActivity.this.startActivity(intentMain);
            Log.i("Content "," Main layout 2 ");
        }else if (v.getId() == R.id.mapbtn){
            Intent intentMain = new Intent(Intent.ACTION_VIEW);
            intentMain.setData(Uri.parse("geo://14.693600, 121.110400"));

        }
    }
}
