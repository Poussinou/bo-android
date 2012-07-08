package org.blitzortung.android.map.overlay;

import org.blitzortung.android.data.Coordsys;
import org.blitzortung.android.data.beans.Participant;
import org.blitzortung.android.data.beans.Participant.State;

import com.google.android.maps.OverlayItem;

public class StationOverlayItem extends OverlayItem {

	long lastDataTime;
	
	State state;
	
	public StationOverlayItem(Participant station) {
		super(Coordsys.toMapCoords(station.getLongitude(), station.getLatitude()), station.getName(), "");

		lastDataTime = station.getOfflineSince();
		state = station.getState();
	}
	
	public long getLastDataTime() {
		return lastDataTime;
	}
	
	public State getState() {
		return state;
	}

}
