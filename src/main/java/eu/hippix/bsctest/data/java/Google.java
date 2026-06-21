package eu.hippix.bsctest.data.java;

import java.util.List;
import java.lang.Integer;
import java.lang.Double;
import com.google.gson.annotations.SerializedName;
import org.apache.fory.annotation.Nullable;

public class Google {
	@Nullable
	public String status;
	public String getStatus() { return status; }
	public void setStatus(String status){ this.status = status; }
	@SerializedName("geocoded_waypoints")
	@Nullable
	public List<GeocodedWaypoints> geocodedWaypoints;
	public List<GeocodedWaypoints> getGeocodedWaypoints() { return geocodedWaypoints; }
	public void setGeocodedWaypoints(List<GeocodedWaypoints> geocodedWaypoints){ this.geocodedWaypoints = geocodedWaypoints; }
	@Nullable
	public List<Routes> routes;
	public List<Routes> getRoutes() { return routes; }
	public void setRoutes(List<Routes> routes){ this.routes = routes; }
	@SerializedName("available_travel_modes")
	@Nullable
	public List<String> availableTravelModes;
	public List<String> getAvailableTravelModes() { return availableTravelModes; }
	public void setAvailableTravelModes(List<String> availableTravelModes){ this.availableTravelModes = availableTravelModes; }
	public static class OverviewPolyline {
	@Nullable
	public String points;
	public String getPoints() { return points; }
	public void setPoints(String points){ this.points = points; }
	}
	public static class Northeast {
	@Nullable
	public Double lat;
	public Double getLat() { return lat; }
	public void setLat(Double lat){ this.lat = lat; }
	@Nullable
	public Double lng;
	public Double getLng() { return lng; }
	public void setLng(Double lng){ this.lng = lng; }
	}
	public static class Bounds {
	@Nullable
	public Northeast northeast;
	public Northeast getNortheast() { return northeast; }
	public void setNortheast(Northeast northeast){ this.northeast = northeast; }
	@Nullable
	public Northeast southwest;
	public Northeast getSouthwest() { return southwest; }
	public void setSouthwest(Northeast southwest){ this.southwest = southwest; }
	}
	public static class Distance {
	@Nullable
	public String text;
	public String getText() { return text; }
	public void setText(String text){ this.text = text; }
	@Nullable
	public Integer value;
	public Integer getValue() { return value; }
	public void setValue(Integer value){ this.value = value; }
	}
	public static class Steps {
	@SerializedName("end_location")
	@Nullable
	public Northeast endLocation;
	public Northeast getEndLocation() { return endLocation; }
	public void setEndLocation(Northeast endLocation){ this.endLocation = endLocation; }
	@SerializedName("start_location")
	@Nullable
	public Northeast startLocation;
	public Northeast getStartLocation() { return startLocation; }
	public void setStartLocation(Northeast startLocation){ this.startLocation = startLocation; }
	@Nullable
	public Distance duration;
	public Distance getDuration() { return duration; }
	public void setDuration(Distance duration){ this.duration = duration; }
	@SerializedName("html_instructions")
	@Nullable
	public String htmlInstructions;
	public String getHtmlInstructions() { return htmlInstructions; }
	public void setHtmlInstructions(String htmlInstructions){ this.htmlInstructions = htmlInstructions; }
	@SerializedName("travel_mode")
	@Nullable
	public String travelMode;
	public String getTravelMode() { return travelMode; }
	public void setTravelMode(String travelMode){ this.travelMode = travelMode; }
	@Nullable
	public Distance distance;
	public Distance getDistance() { return distance; }
	public void setDistance(Distance distance){ this.distance = distance; }
	@Nullable
	public OverviewPolyline polyline;
	public OverviewPolyline getPolyline() { return polyline; }
	public void setPolyline(OverviewPolyline polyline){ this.polyline = polyline; }
	}
	public static class Legs {
	@SerializedName("start_address")
	@Nullable
	public String startAddress;
	public String getStartAddress() { return startAddress; }
	public void setStartAddress(String startAddress){ this.startAddress = startAddress; }
	@Nullable
	public Distance distance;
	public Distance getDistance() { return distance; }
	public void setDistance(Distance distance){ this.distance = distance; }
	@SerializedName("start_location")
	@Nullable
	public Northeast startLocation;
	public Northeast getStartLocation() { return startLocation; }
	public void setStartLocation(Northeast startLocation){ this.startLocation = startLocation; }
	@SerializedName("via_waypoint")
	@Nullable
	public List<String> viaWaypoint;
	public List<String> getViaWaypoint() { return viaWaypoint; }
	public void setViaWaypoint(List<String> viaWaypoint){ this.viaWaypoint = viaWaypoint; }
	@SerializedName("traffic_speed_entry")
	@Nullable
	public List<String> trafficSpeedEntry;
	public List<String> getTrafficSpeedEntry() { return trafficSpeedEntry; }
	public void setTrafficSpeedEntry(List<String> trafficSpeedEntry){ this.trafficSpeedEntry = trafficSpeedEntry; }
	@Nullable
	public List<Steps> steps;
	public List<Steps> getSteps() { return steps; }
	public void setSteps(List<Steps> steps){ this.steps = steps; }
	@SerializedName("end_location")
	@Nullable
	public Northeast endLocation;
	public Northeast getEndLocation() { return endLocation; }
	public void setEndLocation(Northeast endLocation){ this.endLocation = endLocation; }
	@Nullable
	public Distance duration;
	public Distance getDuration() { return duration; }
	public void setDuration(Distance duration){ this.duration = duration; }
	@SerializedName("end_address")
	@Nullable
	public String endAddress;
	public String getEndAddress() { return endAddress; }
	public void setEndAddress(String endAddress){ this.endAddress = endAddress; }
	}
	public static class Routes {
	@Nullable
	public List<Legs> legs;
	public List<Legs> getLegs() { return legs; }
	public void setLegs(List<Legs> legs){ this.legs = legs; }
	@Nullable
	public String copyrights;
	public String getCopyrights() { return copyrights; }
	public void setCopyrights(String copyrights){ this.copyrights = copyrights; }
	@SerializedName("overview_polyline")
	@Nullable
	public OverviewPolyline overviewPolyline;
	public OverviewPolyline getOverviewPolyline() { return overviewPolyline; }
	public void setOverviewPolyline(OverviewPolyline overviewPolyline){ this.overviewPolyline = overviewPolyline; }
	@Nullable
	public List<String> warnings;
	public List<String> getWarnings() { return warnings; }
	public void setWarnings(List<String> warnings){ this.warnings = warnings; }
	@SerializedName("waypoint_order")
	@Nullable
	public List<String> waypointOrder;
	public List<String> getWaypointOrder() { return waypointOrder; }
	public void setWaypointOrder(List<String> waypointOrder){ this.waypointOrder = waypointOrder; }
	@Nullable
	public String summary;
	public String getSummary() { return summary; }
	public void setSummary(String summary){ this.summary = summary; }
	@Nullable
	public Bounds bounds;
	public Bounds getBounds() { return bounds; }
	public void setBounds(Bounds bounds){ this.bounds = bounds; }
	}
	public static class GeocodedWaypoints {
	@Nullable
	public List<String> types;
	public List<String> getTypes() { return types; }
	public void setTypes(List<String> types){ this.types = types; }
	@SerializedName("geocoder_status")
	@Nullable
	public String geocoderStatus;
	public String getGeocoderStatus() { return geocoderStatus; }
	public void setGeocoderStatus(String geocoderStatus){ this.geocoderStatus = geocoderStatus; }
	@SerializedName("place_id")
	@Nullable
	public String placeId;
	public String getPlaceId() { return placeId; }
	public void setPlaceId(String placeId){ this.placeId = placeId; }
	}
}
