package co.carlosandresjimenez.android.mysearchviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements SearchView.OnQueryTextListener {

    private TextView mTextMessage;

    MenuItem searchMenuItem;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        searchMenuItem = menu.findItem(R.id.action_search);
        searchView = (SearchView) searchMenuItem.getActionView();

        // Setting the listener on the SearchView
        searchView.setOnQueryTextListener(this);

        return true;
    }

    // This method will be executed as soon as the user clicks on
    // the search button on the keyboard
    @Override
    public boolean onQueryTextSubmit(String query) {

        Toast.makeText(this, "Searching for " + query, Toast.LENGTH_SHORT).show();
        mTextMessage.setText("Searching for: " + query);

        // After you run your desired action:

        // clear search bar
        searchView.setQuery("", false);

        // collapse the search box back to the menu icon
        searchView.setIconified(true);

        // clear the focus of the SearchView and
        View current = getCurrentFocus();
        if (current != null)
            current.clearFocus();

        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }
}
