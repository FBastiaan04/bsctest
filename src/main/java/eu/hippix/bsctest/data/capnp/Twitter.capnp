@0xd6317da505811902;
using Java = import "java.capnp";
$Java.package("eu.hippix.bsctest.data.capnp");
$Java.outerClassname("TwitterCapnp");
struct Twitter {
	coordinates @0 :Geo;
	extendedEntities @1 :ExtendedEntities;
	inReplyToScreenName @2 :Text;
	contributors @3 :Text;
	createdAt @4 :Text;
	retweetedStatus @5 :RetweetedStatus;
	place @6 :Place;
	truncated @7 :Bool;
	inReplyToUserId @8 :Int64;
	favoriteCount @9 :Int32;
	id @10 :Int64;
	retweetCount @11 :Int32;
	possiblySensitive @12 :Bool;
	quotedStatusIdStr @13 :Text;
	favorited @14 :Bool;
	idStr @15 :Text;
	inReplyToStatusIdStr @16 :Text;
	lang @17 :Text;
	text @18 :Text;
	user @19 :User;
	retweeted @20 :Bool;
	extendedTweet @21 :ExtendedTweet;
	isQuoteStatus @22 :Bool;
	inReplyToStatusId @23 :Int64;
	source @24 :Text;
	filterLevel @25 :Text;
	quotedStatus @26 :QuotedStatus;
	quotedStatusId @27 :Int64;
	displayTextRange @28 :List(Int32);
	limit @29 :Limit;
	inReplyToUserIdStr @30 :Text;
	geo @31 :Geo;
	entities @32 :Entities;
	timestampMs @33 :Text;
	struct User {
		profileTextColor @0 :Text;
		createdAt @1 :Text;
		geoEnabled @2 :Bool;
		favouritesCount @3 :Int32;
		description @4 :Text;
		profileBackgroundImageUrl @5 :Text;
		profileBackgroundImageUrlHttps @6 :Text;
		verified @7 :Bool;
		followRequestSent @8 :Text;
		utcOffset @9 :Int32;
		id @10 :Int64;
		listedCount @11 :Int32;
		defaultProfile @12 :Bool;
		idStr @13 :Text;
		protec @14 :Bool;
		timeZone @15 :Text;
		profileSidebarFillColor @16 :Text;
		statusesCount @17 :Int32;
		profileLinkColor @18 :Text;
		lang @19 :Text;
		profileImageUrl @20 :Text;
		screenName @21 :Text;
		profileBackgroundColor @22 :Text;
		contributorsEnabled @23 :Bool;
		profileUseBackgroundImage @24 :Bool;
		followersCount @25 :Int32;
		location @26 :Text;
		profileBannerUrl @27 :Text;
		friendsCount @28 :Int32;
		profileSidebarBorderColor @29 :Text;
		profileBackgroundTile @30 :Bool;
		name @31 :Text;
		url @32 :Text;
		isTranslator @33 :Bool;
		notifications @34 :Text;
		profileImageUrlHttps @35 :Text;
		following @36 :Text;
		defaultProfileImage @37 :Bool;
	}
	struct Urls {
		url @0 :Text;
		indices @1 :List(Int32);
		displayUrl @2 :Text;
		expandedUrl @3 :Text;
	}
	struct Entities {
		hashtags @0 :List(Hashtags);
		userMentions @1 :List(UserMentions);
		symbols @2 :List(Hashtags);
		media @3 :List(Media);
		urls @4 :List(Urls);
	}
	struct RetweetedStatus {
		coordinates @0 :Geo;
		extendedEntities @1 :ExtendedEntities;
		inReplyToScreenName @2 :Text;
		contributors @3 :Text;
		createdAt @4 :Text;
		place @5 :Place;
		truncated @6 :Bool;
		inReplyToUserId @7 :Int64;
		favoriteCount @8 :Int32;
		scopes @9 :Scopes;
		id @10 :Int64;
		retweetCount @11 :Int32;
		possiblySensitive @12 :Bool;
		quotedStatusIdStr @13 :Text;
		favorited @14 :Bool;
		idStr @15 :Text;
		inReplyToStatusIdStr @16 :Text;
		lang @17 :Text;
		text @18 :Text;
		user @19 :User;
		retweeted @20 :Bool;
		extendedTweet @21 :ExtendedTweet;
		isQuoteStatus @22 :Bool;
		inReplyToStatusId @23 :Int64;
		source @24 :Text;
		filterLevel @25 :Text;
		quotedStatus @26 :QuotedStatus;
		displayTextRange @27 :List(Int32);
		quotedStatusId @28 :Int64;
		inReplyToUserIdStr @29 :Text;
		geo @30 :Geo;
		entities @31 :Entities;
	}
	struct UserMentions {
		name @0 :Text;
		indices @1 :List(Int32);
		id @2 :Int64;
		idStr @3 :Text;
		screenName @4 :Text;
	}
	struct Hashtags {
		indices @0 :List(Int32);
		text @1 :Text;
	}
	struct QuotedStatus {
		coordinates @0 :Geo;
		inReplyToStatusIdStr @1 :Text;
		lang @2 :Text;
		text @3 :Text;
		extendedEntities @4 :ExtendedEntities;
		inReplyToScreenName @5 :Text;
		user @6 :User;
		contributors @7 :List(Int64);
		createdAt @8 :Text;
		place @9 :Place;
		truncated @10 :Bool;
		inReplyToUserId @11 :Int64;
		retweeted @12 :Bool;
		favoriteCount @13 :Int32;
		extendedTweet @14 :ExtendedTweet;
		isQuoteStatus @15 :Bool;
		scopes @16 :Scopes;
		inReplyToStatusId @17 :Int64;
		source @18 :Text;
		id @19 :Int64;
		filterLevel @20 :Text;
		retweetCount @21 :Int32;
		displayTextRange @22 :List(Int32);
		quotedStatusId @23 :Int64;
		possiblySensitive @24 :Bool;
		quotedStatusIdStr @25 :Text;
		inReplyToUserIdStr @26 :Text;
		geo @27 :Geo;
		entities @28 :Entities;
		favorited @29 :Bool;
		idStr @30 :Text;
	}
	struct ExtendedTweet {
		displayTextRange @0 :List(Int32);
		fullText @1 :Text;
		entities @2 :Entities;
		extendedEntities @3 :ExtendedEntities;
	}
	struct Thumb {
		resize @0 :Text;
		h @1 :Int32;
		w @2 :Int32;
	}
	struct Sizes {
		medium @0 :Thumb;
		large @1 :Thumb;
		small @2 :Thumb;
		thumb @3 :Thumb;
	}
	struct Media {
		videoInfo @0 :VideoInfo;
		sourceUserIdStr @1 :Text;
		id @2 :Int64;
		displayUrl @3 :Text;
		indices @4 :List(Int32);
		url @5 :Text;
		sourceStatusId @6 :Int64;
		mediaUrl @7 :Text;
		idStr @8 :Text;
		expandedUrl @9 :Text;
		sizes @10 :Sizes;
		sourceUserId @11 :Int64;
		type @12 :Text;
		sourceStatusIdStr @13 :Text;
		mediaUrlHttps @14 :Text;
	}
	struct ExtendedEntities {
		media @0 :List(Media);
	}
	struct Variants {
		bitrate @0 :Int32;
		url @1 :Text;
		contentType @2 :Text;
	}
	struct VideoInfo {
		durationMillis @0 :Int32;
		aspectRatio @1 :List(Int32);
		variants @2 :List(Variants);
	}
	struct BoundingBox {
		coordinates @0 :List(List(List(Float64)));
		type @1 :Text;
	}
	struct Attributes {
	}
	struct Place {
		countryCode @0 :Text;
		country @1 :Text;
		id @2 :Text;
		attributes @3 :Attributes;
		name @4 :Text;
		boundingBox @5 :BoundingBox;
		url @6 :Text;
		placeType @7 :Text;
		fullName @8 :Text;
	}
	struct Limit {
		track @0 :Int32;
		timestampMs @1 :Text;
	}
	struct Scopes {
		followers @0 :Bool;
	}
	struct Geo {
		coordinates @0 :List(Float64);
		type @1 :Text;
	}
}
