package br.com.schneiderapps.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

class Config {
    private static String LOG_TAG = Config.class.getSimpleName();
    static final URL BASE_URL;


    static {
        URL url = null;
        try {
            url = new URL("https://nspf.github.io/XYZReader/data.json" );
        } catch (MalformedURLException ignored) {
            Log.w(LOG_TAG, ignored.getMessage(), ignored);
        }

        BASE_URL = url;
    }
}
