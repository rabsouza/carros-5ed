package br.com.livroandroid.carros;

import android.app.Application;
import android.util.Log;

/**
 * Created by rabsouza on 18/06/16.
 */
public class CarrosApplication extends Application {

    private static final String TAG = CarrosApplication.class.getSimpleName();

    private static CarrosApplication instance = null;

    public static CarrosApplication getInstance(){
        return  instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: CarrosApplication!");

        instance = this;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.d(TAG, "onTerminate: CarrosApplication!");
    }
}
