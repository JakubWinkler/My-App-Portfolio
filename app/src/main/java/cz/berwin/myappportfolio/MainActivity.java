package cz.berwin.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void startSpotifyStreamer(View view) {
        Toast.makeText(this, "This button will launch the Spotify Streamer app.", Toast.LENGTH_SHORT).show();
    }

    public void startScoresApp(View view) {
        Toast.makeText(this, "This button will launch the Scores app.", Toast.LENGTH_SHORT).show();
    }

    public void startLibraryApp(View view) {
        Toast.makeText(this, "This button will launch the Library app.", Toast.LENGTH_SHORT).show();
    }

    public void startBuildItBigger(View view) {
        Toast.makeText(this, "This button will launch the Build it Bigger app.", Toast.LENGTH_SHORT).show();
    }

    public void startXYZReader(View view) {
        Toast.makeText(this, "This button will launch the XYZ Reader app.", Toast.LENGTH_SHORT).show();
    }

    public void startCapstoneApp(View view) {
        Toast.makeText(this, "This button will launch the my capstone app.", Toast.LENGTH_SHORT).show();
    }
}
