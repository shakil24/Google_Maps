package com.example.shakil.google_maps;
//xml theke https://console.developers.google.com/flow....copy kora browsera search dia  api key nita hoba
//next ai api key ta xml <string name="google_maps_key" templateMergeStrategy="preserve" translatable="false">
//     AIzaSyCzI1Rx1Hhf6meX8TGelOQyNes2aRUYhFA
//    </string>
//next browser gia locationer key ta akana  {LatLng mountAdora = new LatLng(24.900220, 91.876246);} paste korta hoba

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

       /* //satelite version
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID)*/;

        // Add a marker in Sydney and move the camera
        LatLng mountAdora = new LatLng(24.900220, 91.876246);
        mMap.addMarker(new MarkerOptions().position(mountAdora).title("we are noyasorok"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mountAdora));
    }
}
