package eliz.estacio.com.estacioelizlab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onClick(View v) {

        if (v.getId() == R.id.act1btn){
            // doStuff
            Intent intentMain = new Intent(Main2Activity.this,
                    MainActivity.class);
            Main2Activity.this.startActivity(intentMain);
            Log.i("Content View "," Main layout ");
        } else if (v.getId() == R.id.mapbtn) {
            Intent intentMain = new Intent(Intent.ACTION_VIEW);
            intentMain.setData(Uri.parse("geo://14.693600, 121.110400"));
        }

    }
}
