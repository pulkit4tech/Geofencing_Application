package com.example.pulkit.geofencing;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Created by pulkit on 05/12/16.
 */

public final class Constants {
    private Constants() {
    }

    public static final String PACKAGE_NAME = "com.google.android.gms.location.Geofence";

    public static final String SHARED_PREFERENCES_NAME = PACKAGE_NAME + ".SHARED_PREFERENCES_NAME";

    public static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    /**
     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    public static final long GEOFENCE_EXPIRATION_IN_HOURS = 128;

    /**
     * For this sample, geofences expire after twelve hours.
     */
    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
    //public static final float GEOFENCE_RADIUS_IN_METERS = 1609; // 1 mile, 1.6 km
    public static final float GEOFENCE_RADIUS_IN_METERS = 1; // 1 mile, 1.6 km

    /**
     * Map for storing information about Rohini area.
     */
    public static final HashMap<String, LatLng> BAY_AREA_LANDMARKS = new HashMap<String, LatLng>();
    static {
        // San Francisco International Airport.
        BAY_AREA_LANDMARKS.put("Home", new LatLng(28.7010058, 77.1063678));

        // Googleplex.
        BAY_AREA_LANDMARKS.put("University", new LatLng(28.595069, 77.019715));

        // Test
        BAY_AREA_LANDMARKS.put("Bus Stand", new LatLng(28.695271, 77.109381));
    }
}
