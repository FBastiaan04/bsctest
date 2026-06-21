@0xd6317da505811900;
using Java = import "java.capnp";
$Java.package("eu.hippix.bsctest.data.capnp");
$Java.outerClassname("GoogleCapnp");
struct Google {
	status @0 :Text;
	geocodedWaypoints @1 :List(GeocodedWaypoints);
	routes @2 :List(Routes);
	availableTravelModes @3 :List(Text);
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
		text @0 :Text;
		value @1 :Int32;
	}
	struct Steps {
		endLocation @0 :Northeast;
		startLocation @1 :Northeast;
		duration @2 :Distance;
		htmlInstructions @3 :Text;
		travelMode @4 :Text;
		distance @5 :Distance;
		polyline @6 :OverviewPolyline;
	}
	struct Legs {
		startAddress @0 :Text;
		distance @1 :Distance;
		startLocation @2 :Northeast;
		viaWaypoint @3 :List(Text);
		trafficSpeedEntry @4 :List(Text);
		steps @5 :List(Steps);
		endLocation @6 :Northeast;
		duration @7 :Distance;
		endAddress @8 :Text;
	}
	struct Routes {
		legs @0 :List(Legs);
		copyrights @1 :Text;
		overviewPolyline @2 :OverviewPolyline;
		warnings @3 :List(Text);
		waypointOrder @4 :List(Text);
		summary @5 :Text;
		bounds @6 :Bounds;
	}
	struct GeocodedWaypoints {
		types @0 :List(Text);
		geocoderStatus @1 :Text;
		placeId @2 :Text;
	}
}
