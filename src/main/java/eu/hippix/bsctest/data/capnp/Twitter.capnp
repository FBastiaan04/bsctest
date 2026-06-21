@0xd6317da505811901;
using Java = import "java.capnp";
$Java.package("eu.hippix.bsctest.data.capnp");
$Java.outerClassname("TwitterCapnp");
struct Twitter {
	id @0 :Int64;
	isQuoteStatus @1 :Bool;
	quotedStatusIdStr @2 :Text;
	inReplyToUserId @3 :Int64;
	limit @4 :Limit;
	source @5 :Text;
	extendedTweet @6 :ExtendedTweet;
	filterLevel @7 :Text;
	inReplyToUserIdStr @8 :Text;
	truncated @9 :Bool;
	possiblySensitive @10 :Bool;
	favoriteCount @11 :Int32;
	entities @12 :Entities;
	lang @13 :Text;
	extendedEntities @14 :ExtendedEntities;
	retweeted @15 :Bool;
	idStr @16 :Text;
	favorited @17 :Bool;
	contributors @18 :Text;
	retweetedStatus @19 :RetweetedStatus;
	quotedStatusId @20 :Int64;
	inReplyToScreenName @21 :Text;
	place @22 :Place;
	coordinates @23 :Geo;
	inReplyToStatusIdStr @24 :Text;
	geo @25 :Geo;
	timestampMs @26 :Text;
	displayTextRange @27 :List(Int32);
	quotedStatus @28 :QuotedStatus;
	inReplyToStatusId @29 :Int64;
	retweetCount @30 :Int32;
	createdAt @31 :Text;
	text @32 :Text;
	user @33 :User;
	struct User {
		profileUseBackgroundImage @0 :Bool;
		id @1 :Int64;
		verified @2 :Bool;
		screenName @3 :Text;
		statusesCount @4 :Int32;
		profileBackgroundTile @5 :Bool;
		utcOffset @6 :Int32;
		following @7 :Text;
		name @8 :Text;
		profileSidebarFillColor @9 :Text;
		isTranslator @10 :Bool;
		profileImageUrl @11 :Text;
		profileImageUrlHttps @12 :Text;
		profileTextColor @13 :Text;
		profileBackgroundImageUrl @14 :Text;
		profileSidebarBorderColor @15 :Text;
		followRequestSent @16 :Text;
		contributorsEnabled @17 :Bool;
		lang @18 :Text;
		favouritesCount @19 :Int32;
		profileBackgroundColor @20 :Text;
		profileBackgroundImageUrlHttps @21 :Text;
		profileLinkColor @22 :Text;
		geoEnabled @23 :Bool;
		idStr @24 :Text;
		url @25 :Text;
		protec @26 :Bool;
		friendsCount @27 :Int32;
		location @28 :Text;
		defaultProfile @29 :Bool;
		followersCount @30 :Int32;
		description @31 :Text;
		defaultProfileImage @32 :Bool;
		createdAt @33 :Text;
		timeZone @34 :Text;
		notifications @35 :Text;
		listedCount @36 :Int32;
		profileBannerUrl @37 :Text;
	}
	struct Urls {
		url @0 :Text;
		displayUrl @1 :Text;
		indices @2 :List(Int32);
		expandedUrl @3 :Text;
	}
	struct Entities {
		symbols @0 :List(Hashtags);
		hashtags @1 :List(Hashtags);
		media @2 :List(Media);
		userMentions @3 :List(UserMentions);
		urls @4 :List(Urls);
	}
	struct RetweetedStatus {
		id @0 :Int64;
		isQuoteStatus @1 :Bool;
		quotedStatusIdStr @2 :Text;
		inReplyToUserId @3 :Int64;
		source @4 :Text;
		extendedTweet @5 :ExtendedTweet;
		filterLevel @6 :Text;
		inReplyToUserIdStr @7 :Text;
		truncated @8 :Bool;
		possiblySensitive @9 :Bool;
		favoriteCount @10 :Int32;
		entities @11 :Entities;
		lang @12 :Text;
		scopes @13 :Scopes;
		extendedEntities @14 :ExtendedEntities;
		retweeted @15 :Bool;
		idStr @16 :Text;
		favorited @17 :Bool;
		contributors @18 :Text;
		quotedStatusId @19 :Int64;
		inReplyToScreenName @20 :Text;
		place @21 :Place;
		coordinates @22 :Geo;
		inReplyToStatusIdStr @23 :Text;
		geo @24 :Geo;
		displayTextRange @25 :List(Int32);
		quotedStatus @26 :QuotedStatus;
		inReplyToStatusId @27 :Int64;
		retweetCount @28 :Int32;
		createdAt @29 :Text;
		text @30 :Text;
		user @31 :User;
	}
	struct UserMentions {
		id @0 :Int64;
		screenName @1 :Text;
		name @2 :Text;
		idStr @3 :Text;
		indices @4 :List(Int32);
	}
	struct Hashtags {
		text @0 :Text;
		indices @1 :List(Int32);
	}
	struct QuotedStatus {
		id @0 :Int64;
		isQuoteStatus @1 :Bool;
		quotedStatusIdStr @2 :Text;
		retweeted @3 :Bool;
		idStr @4 :Text;
		inReplyToUserId @5 :Int64;
		favorited @6 :Bool;
		source @7 :Text;
		extendedTweet @8 :ExtendedTweet;
		contributors @9 :List(Int64);
		filterLevel @10 :Text;
		quotedStatusId @11 :Int64;
		inReplyToScreenName @12 :Text;
		place @13 :Place;
		inReplyToUserIdStr @14 :Text;
		coordinates @15 :Geo;
		inReplyToStatusIdStr @16 :Text;
		geo @17 :Geo;
		truncated @18 :Bool;
		displayTextRange @19 :List(Int32);
		possiblySensitive @20 :Bool;
		favoriteCount @21 :Int32;
		entities @22 :Entities;
		lang @23 :Text;
		inReplyToStatusId @24 :Int64;
		retweetCount @25 :Int32;
		scopes @26 :Scopes;
		createdAt @27 :Text;
		text @28 :Text;
		extendedEntities @29 :ExtendedEntities;
		user @30 :User;
	}
	struct ExtendedTweet {
		fullText @0 :Text;
		entities @1 :Entities;
		displayTextRange @2 :List(Int32);
		extendedEntities @3 :ExtendedEntities;
	}
	struct Thumb {
		h @0 :Int32;
		resize @1 :Text;
		w @2 :Int32;
	}
	struct Sizes {
		large @0 :Thumb;
		medium @1 :Thumb;
		small @2 :Thumb;
		thumb @3 :Thumb;
	}
	struct Media {
		id @0 :Int64;
		displayUrl @1 :Text;
		sourceStatusIdStr @2 :Text;
		sourceUserIdStr @3 :Text;
		idStr @4 :Text;
		url @5 :Text;
		mediaUrlHttps @6 :Text;
		type @7 :Text;
		sizes @8 :Sizes;
		videoInfo @9 :VideoInfo;
		mediaUrl @10 :Text;
		sourceStatusId @11 :Int64;
		sourceUserId @12 :Int64;
		indices @13 :List(Int32);
		expandedUrl @14 :Text;
	}
	struct ExtendedEntities {
		media @0 :List(Media);
	}
	struct Variants {
		url @0 :Text;
		bitrate @1 :Int32;
		contentType @2 :Text;
	}
	struct VideoInfo {
		variants @0 :List(Variants);
		aspectRatio @1 :List(Int32);
		durationMillis @2 :Int32;
	}
	struct BoundingBox {
		type @0 :Text;
		coordinates @1 :List(List(List(Float64)));
	}
	struct Attributes {
	}
	struct Place {
		id @0 :Text;
		fullName @1 :Text;
		url @2 :Text;
		boundingBox @3 :BoundingBox;
		country @4 :Text;
		placeType @5 :Text;
		name @6 :Text;
		countryCode @7 :Text;
		attributes @8 :Attributes;
	}
	struct Limit {
		timestampMs @0 :Text;
		track @1 :Int32;
	}
	struct Scopes {
		followers @0 :Bool;
	}
	struct Geo {
		type @0 :Text;
		coordinates @1 :List(Float64);
	}
}
