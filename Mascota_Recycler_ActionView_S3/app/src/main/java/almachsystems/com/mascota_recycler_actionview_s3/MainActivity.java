package almachsystems.com.mascota_recycler_actionview_s3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOtionsMenu(Menu menu)    {
        getMenuInflater().inflate(R.menu.menu_opciones, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.mAbaout:

                break;
        }

        return super.onOptionsItemSelected(item);
    }
}