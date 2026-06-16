@0xd6317da505811901;
using Java = import "java.capnp";
$Java.package("eu.hippix.bsctest.data.capnp");
$Java.outerClassname("GoogleCapnp");
struct Google {
	status @0 :Text;
	availableTravelModes @1 :List(Text);
	routes @2 :List(Routes);
	geocodedWaypoints @3 :List(GeocodedWaypoints);
	struct OverviewPolyline {
		points @0 :Text;
	}
	struct Northeast {
		lat @0 :Float64;
		lng @1 :Float64;
	}
	struct Bounds {
		northeast @0 :Northeast;
		southwest @1 :Northeast;
	}
	struct Distance {
		value @0 :Int32;
		text @1 :Text;
	}
	struct Steps {
		duration @0 :Distance;
		endLocation @1 :Northeast;
		distance @2 :Distance;
		startLocation @3 :Northeast;
		polyline @4 :OverviewPolyline;
		htmlInstructions @5 :Text;
		travelMode @6 :Text;
	}
	struct Legs {
		trafficSpeedEntry @0 :List(Text);
		duration @1 :Distance;
		steps @2 :List(Steps);
		viaWaypoint @3 :List(Text);
		startAddress @4 :Text;
		endAddress @5 :Text;
		endLocation @6 :Northeast;
		distance @7 :Distance;
		startLocation @8 :Northeast;
	}
	struct Routes {
		bounds @0 :Bounds;
		warnings @1 :List(Text);
		overviewPolyline @2 :OverviewPolyline;
		waypointOrder @3 :List(Text);
		legs @4 :List(Legs);
		summary @5 :Text;
		copyrights @6 :Text;
	}
	struct GeocodedWaypoints {
		placeId @0 :Text;
		geocoderStatus @1 :Text;
		types @2 :List(Text);
	}
}
