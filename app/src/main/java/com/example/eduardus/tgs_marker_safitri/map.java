package com.example.eduardus.tgs_marker_safitri;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.osmdroid.api.IMapController;
import org.osmdroid.api.IMapController;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;

public class map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        MapView map = (MapView) findViewById(R.id.map);
        map.setTileSource(TileSourceFactory.MAPNIK);
        map.setBuiltInZoomControls(true);
        map.setMultiTouchControls(true);
        //map.setBuiltInZoomControl(true);
        //map.setMultiTouchControl(true);
        GeoPoint startPoint = new GeoPoint(-5.379534, 105.251704);
        IMapController mapController = map.getController();
        mapController.setZoom(15);
        mapController.setCenter(startPoint);


        Marker startMarker = new Marker(map);
        startMarker.setPosition(startPoint);
        startMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker);
        map.invalidate();
        startMarker.setIcon(getResources().getDrawable(R.drawable.logomap1));
        startMarker.setTitle("Ubl s1");

        GeoPoint startPoint1 = new GeoPoint(-5.375348, 105.246246);
        IMapController mapController1 = map.getController();
        mapController.setZoom(15);
        mapController.setCenter(startPoint1);


        Marker startMarker1 = new Marker(map);
        startMarker1.setPosition(startPoint1);
        startMarker1.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker1);
        map.invalidate();
        startMarker1.setIcon(getResources().getDrawable(R.drawable.logomap2));
        startMarker1.setTitle("Ubl s2");

        GeoPoint startPoint2 = new GeoPoint(-5.381786, 105.259613);
        IMapController mapController2 = map.getController();
        mapController.setZoom(15);
        mapController.setCenter(startPoint1);


        Marker startMarker2 = new Marker(map);
        startMarker2.setPosition(startPoint2);
        startMarker2.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker2);
        map.invalidate();
        startMarker2.setIcon(getResources().getDrawable(R.drawable.logomap3));
        startMarker2.setTitle("Boemikedaton");

        GeoPoint startPoint3 = new GeoPoint(-5.390029, 105.261079);
        IMapController mapController3 = map.getController();
        mapController.setZoom(15);
        mapController.setCenter(startPoint3);


        Marker startMarker3 = new Marker(map);
        startMarker2.setPosition(startPoint3);
        startMarker2.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker2);
        map.invalidate();
        startMarker2.setIcon(getResources().getDrawable(R.drawable.logomap4));
        startMarker2.setTitle("Museum");

        GeoPoint startPoint3 = new GeoPoint(-4.284011, 105.221507);
        IMapController mapController3 = map.getController();
        mapController.setZoom(15);
        mapController.setCenter(startPoint3);


        Marker startMarker3 = new Marker(map);
        startMarker2.setPosition(startPoint3);
        startMarker2.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker2);
        map.invalidate();
        startMarker2.setIcon(getResources().getDrawable(R.drawable.logomap5));
        startMarker2.setTitle("Rumahku");
    }
}
