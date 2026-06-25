package eu.hippix.bsctest.data.java;

import java.util.List;
import java.lang.Integer;
import java.lang.Double;
import com.google.gson.annotations.SerializedName;
import org.apache.fory.annotation.Nullable;

public class Google {
	@Nullable
	public String status;
	@SerializedName("available_travel_modes")
	@Nullable
	public List<String> availableTravelModes;
	@Nullable
	public List<Routes> routes;
	@SerializedName("geocoded_waypoints")
	@Nullable
	public List<GeocodedWaypoints> geocodedWaypoints;
	public static class OverviewPolyline {
		@Nullable
		public String points;
	}
	public static class Northeast {
		@Nullable
		public Double lat;
		@Nullable
		public Double lng;
	}
	public static class Bounds {
		@Nullable
		public Northeast northeast;
		@Nullable
		public Northeast southwest;
	}
	public static class Distance {
		@Nullable
		public Integer value;
		@Nullable
		public String text;
	}
	public static class Steps {
		@Nullable
		public Distance duration;
		@SerializedName("end_location")
		@Nullable
		public Northeast endLocation;
		@Nullable
		public Distance distance;
		@SerializedName("start_location")
		@Nullable
		public Northeast startLocation;
		@Nullable
		public OverviewPolyline polyline;
		@SerializedName("html_instructions")
		@Nullable
		public String htmlInstructions;
		@SerializedName("travel_mode")
		@Nullable
		public String travelMode;
	}
	public static class Legs {
		@SerializedName("traffic_speed_entry")
		@Nullable
		public List<String> trafficSpeedEntry;
		@Nullable
		public Distance duration;
		@Nullable
		public List<Steps> steps;
		@SerializedName("via_waypoint")
		@Nullable
		public List<String> viaWaypoint;
		@SerializedName("start_address")
		@Nullable
		public String startAddress;
		@SerializedName("end_address")
		@Nullable
		public String endAddress;
		@SerializedName("end_location")
		@Nullable
		public Northeast endLocation;
		@Nullable
		public Distance distance;
		@SerializedName("start_location")
		@Nullable
		public Northeast startLocation;
	}
	public static class Routes {
		@Nullable
		public Bounds bounds;
		@Nullable
		public List<String> warnings;
		@SerializedName("overview_polyline")
		@Nullable
		public OverviewPolyline overviewPolyline;
		@SerializedName("waypoint_order")
		@Nullable
		public List<String> waypointOrder;
		@Nullable
		public List<Legs> legs;
		@Nullable
		public String summary;
		@Nullable
		public String copyrights;
	}
	public static class GeocodedWaypoints {
		@SerializedName("place_id")
		@Nullable
		public String placeId;
		@SerializedName("geocoder_status")
		@Nullable
		public String geocoderStatus;
		@Nullable
		public List<String> types;
	}
}
