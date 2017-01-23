package com.example.krish.geofence;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Created by Krish on 23/01/2017.
 */

public class Constants {

    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS = 12 * 60 * 60 * 1000;
    public static final float GEOFENCE_RADIUS_IN_METERS = 20;

    public static final HashMap<String, LatLng> LANDMARKS = new HashMap<String, LatLng>();
    static {
        // University of Mauritius.
        LANDMARKS.put("Uom Reduit", new LatLng(-20.233812,57.497518));

        // Home.
        LANDMARKS.put("Home", new LatLng(-20.2514065,57.4658574));

    }
}
