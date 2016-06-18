package br.com.livroandroid.carros.activity;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import br.com.livroandroid.carros.R;

/**
 * Created by rabsouza on 18/06/16.
 */

public class BaseActivity extends AppCompatActivity {

    protected void setUpToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }
    }
}
