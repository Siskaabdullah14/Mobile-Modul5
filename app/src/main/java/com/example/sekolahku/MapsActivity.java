package com.example.sekolahku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map1);
        mapFragment.getMapAsync( this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

        LatLng Home = new LatLng( -8.013886,112.628681 );
        map.addMarker(new MarkerOptions() .position(Home).title("Marker in Home"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Home));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.map_menu, menu);
        inflater.inflate(R.menu.map_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {


            case R.id.Pilihan_Map:
                Toast.makeText( this, "Silahkan Pilih", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.normal_map:
                map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                return true;

            case R.id.hybrid_map:
                map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                return true;

            case R.id.satellite_map:
                map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                return true;

            case R.id.terrain_map:
                map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                return true;


            case R.id.Pilihan_Tempat:
                Toast.makeText( this, "Silahkan Pilih", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.SD:
                LatLng SD = new LatLng(-8.014186, 112.628315 );
                map.addMarker(new MarkerOptions() .position(SD).title("Marker in SD"));
                map.moveCamera(CameraUpdateFactory.newLatLng(SD));
                return true;

            case R.id.SMP:
                LatLng SMP = new LatLng(-7.990016, 112.630830 );
                map.addMarker(new MarkerOptions() .position(SMP).title("Marker in SMP"));
                map.moveCamera(CameraUpdateFactory.newLatLng(SMP));
                return true;

            case R.id.SMA:
                LatLng SMA = new LatLng(-7.991138, 112.633722 );
                map.addMarker(new MarkerOptions() .position(SMA).title("Marker in SMA"));
                map.moveCamera(CameraUpdateFactory.newLatLng(SMA));
                return true;

            case R.id.Kuliah:
                LatLng Kuliah = new LatLng(-7.921322, 112.597335 );
                map.addMarker(new MarkerOptions() .position(Kuliah).title("Marker in Kuliah"));
                map.moveCamera(CameraUpdateFactory.newLatLng(Kuliah));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
