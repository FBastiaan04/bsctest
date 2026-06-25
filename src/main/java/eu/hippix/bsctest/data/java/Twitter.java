package eu.hippix.bsctest.data.java;

import java.util.List;
import java.lang.Integer;
import java.lang.Double;
import com.google.gson.annotations.SerializedName;
import org.apache.fory.annotation.Nullable;

public class Twitter {
	@Nullable
	public Geo coordinates;
	@SerializedName("extended_entities")
	@Nullable
	public ExtendedEntities extendedEntities;
	@SerializedName("in_reply_to_screen_name")
	@Nullable
	public String inReplyToScreenName;
	@Nullable
	public String contributors; // Always null
	@SerializedName("created_at")
	@Nullable
	public String createdAt;
	@SerializedName("retweeted_status")
	@Nullable
	public RetweetedStatus retweetedStatus;
	@Nullable
	public Place place;
	@Nullable
	public Boolean truncated;
	@SerializedName("in_reply_to_user_id")
	@Nullable
	public Long inReplyToUserId;
	@SerializedName("favorite_count")
	@Nullable
	public Integer favoriteCount;
	@Nullable
	public Long id;
	@SerializedName("retweet_count")
	@Nullable
	public Integer retweetCount;
	@SerializedName("possibly_sensitive")
	@Nullable
	public Boolean possiblySensitive;
	@SerializedName("quoted_status_id_str")
	@Nullable
	public String quotedStatusIdStr;
	@Nullable
	public Boolean favorited;
	@SerializedName("id_str")
	@Nullable
	public String idStr;
	@SerializedName("in_reply_to_status_id_str")
	@Nullable
	public String inReplyToStatusIdStr;
	@Nullable
	public String lang;
	@Nullable
	public String text;
	@Nullable
	public User user;
	@Nullable
	public Boolean retweeted;
	@SerializedName("extended_tweet")
	@Nullable
	public ExtendedTweet extendedTweet;
	@SerializedName("is_quote_status")
	@Nullable
	public Boolean isQuoteStatus;
	@SerializedName("in_reply_to_status_id")
	@Nullable
	public Long inReplyToStatusId;
	@Nullable
	public String source;
	@SerializedName("filter_level")
	@Nullable
	public String filterLevel;
	@SerializedName("quoted_status")
	@Nullable
	public QuotedStatus quotedStatus;
	@SerializedName("quoted_status_id")
	@Nullable
	public Long quotedStatusId;
	@SerializedName("display_text_range")
	@Nullable
	public List<Integer> displayTextRange;
	@Nullable
	public Limit limit;
	@SerializedName("in_reply_to_user_id_str")
	@Nullable
	public String inReplyToUserIdStr;
	@Nullable
	public Geo geo;
	@Nullable
	public Entities entities;
	@SerializedName("timestamp_ms")
	@Nullable
	public String timestampMs;
	public static class User {
		@SerializedName("profile_text_color")
		@Nullable
		public String profileTextColor;
		@SerializedName("created_at")
		@Nullable
		public String createdAt;
		@SerializedName("geo_enabled")
		@Nullable
		public Boolean geoEnabled;
		@SerializedName("favourites_count")
		@Nullable
		public Integer favouritesCount;
		@Nullable
		public String description;
		@SerializedName("profile_background_image_url")
		@Nullable
		public String profileBackgroundImageUrl;
		@SerializedName("profile_background_image_url_https")
		@Nullable
		public String profileBackgroundImageUrlHttps;
		@Nullable
		public Boolean verified;
		@SerializedName("follow_request_sent")
		@Nullable
		public String followRequestSent; // Always null
		@SerializedName("utc_offset")
		@Nullable
		public Integer utcOffset;
		@Nullable
		public Long id;
		@SerializedName("listed_count")
		@Nullable
		public Integer listedCount;
		@SerializedName("default_profile")
		@Nullable
		public Boolean defaultProfile;
		@SerializedName("id_str")
		@Nullable
		public String idStr;
		@SerializedName("protected")
		@Nullable
		public Boolean protec;
		@SerializedName("time_zone")
		@Nullable
		public String timeZone;
		@SerializedName("profile_sidebar_fill_color")
		@Nullable
		public String profileSidebarFillColor;
		@SerializedName("statuses_count")
		@Nullable
		public Integer statusesCount;
		@SerializedName("profile_link_color")
		@Nullable
		public String profileLinkColor;
		@Nullable
		public String lang;
		@SerializedName("profile_image_url")
		@Nullable
		public String profileImageUrl;
		@SerializedName("screen_name")
		@Nullable
		public String screenName;
		@SerializedName("profile_background_color")
		@Nullable
		public String profileBackgroundColor;
		@SerializedName("contributors_enabled")
		@Nullable
		public Boolean contributorsEnabled;
		@SerializedName("profile_use_background_image")
		@Nullable
		public Boolean profileUseBackgroundImage;
		@SerializedName("followers_count")
		@Nullable
		public Integer followersCount;
		@Nullable
		public String location;
		@SerializedName("profile_banner_url")
		@Nullable
		public String profileBannerUrl;
		@SerializedName("friends_count")
		@Nullable
		public Integer friendsCount;
		@SerializedName("profile_sidebar_border_color")
		@Nullable
		public String profileSidebarBorderColor;
		@SerializedName("profile_background_tile")
		@Nullable
		public Boolean profileBackgroundTile;
		@Nullable
		public String name;
		@Nullable
		public String url;
		@SerializedName("is_translator")
		@Nullable
		public Boolean isTranslator;
		@Nullable
		public String notifications; // Always null
		@SerializedName("profile_image_url_https")
		@Nullable
		public String profileImageUrlHttps;
		@Nullable
		public String following; // Always null
		@SerializedName("default_profile_image")
		@Nullable
		public Boolean defaultProfileImage;
	}
	public static class Urls {
		@Nullable
		public String url;
		@Nullable
		public List<Integer> indices;
		@SerializedName("display_url")
		@Nullable
		public String displayUrl;
		@SerializedName("expanded_url")
		@Nullable
		public String expandedUrl;
	}
	public static class Entities {
		@Nullable
		public List<Hashtags> hashtags;
		@SerializedName("user_mentions")
		@Nullable
		public List<UserMentions> userMentions;
		@Nullable
		public List<Hashtags> symbols;
		@Nullable
		public List<Media> media;
		@Nullable
		public List<Urls> urls;
	}
	public static class RetweetedStatus {
		@Nullable
		public Geo coordinates;
		@SerializedName("extended_entities")
		@Nullable
		public ExtendedEntities extendedEntities;
		@SerializedName("in_reply_to_screen_name")
		@Nullable
		public String inReplyToScreenName;
		@Nullable
		public String contributors; // Always null
		@SerializedName("created_at")
		@Nullable
		public String createdAt;
		@Nullable
		public Place place;
		@Nullable
		public Boolean truncated;
		@SerializedName("in_reply_to_user_id")
		@Nullable
		public Long inReplyToUserId;
		@SerializedName("favorite_count")
		@Nullable
		public Integer favoriteCount;
		@Nullable
		public Scopes scopes;
		@Nullable
		public Long id;
		@SerializedName("retweet_count")
		@Nullable
		public Integer retweetCount;
		@SerializedName("possibly_sensitive")
		@Nullable
		public Boolean possiblySensitive;
		@SerializedName("quoted_status_id_str")
		@Nullable
		public String quotedStatusIdStr;
		@Nullable
		public Boolean favorited;
		@SerializedName("id_str")
		@Nullable
		public String idStr;
		@SerializedName("in_reply_to_status_id_str")
		@Nullable
		public String inReplyToStatusIdStr;
		@Nullable
		public String lang;
		@Nullable
		public String text;
		@Nullable
		public User user;
		@Nullable
		public Boolean retweeted;
		@SerializedName("extended_tweet")
		@Nullable
		public ExtendedTweet extendedTweet;
		@SerializedName("is_quote_status")
		@Nullable
		public Boolean isQuoteStatus;
		@SerializedName("in_reply_to_status_id")
		@Nullable
		public Long inReplyToStatusId;
		@Nullable
		public String source;
		@SerializedName("filter_level")
		@Nullable
		public String filterLevel;
		@SerializedName("quoted_status")
		@Nullable
		public QuotedStatus quotedStatus;
		@SerializedName("display_text_range")
		@Nullable
		public List<Integer> displayTextRange;
		@SerializedName("quoted_status_id")
		@Nullable
		public Long quotedStatusId;
		@SerializedName("in_reply_to_user_id_str")
		@Nullable
		public String inReplyToUserIdStr;
		@Nullable
		public Geo geo;
		@Nullable
		public Entities entities;
	}
	public static class UserMentions {
		@Nullable
		public String name;
		@Nullable
		public List<Integer> indices;
		@Nullable
		public Long id;
		@SerializedName("id_str")
		@Nullable
		public String idStr;
		@SerializedName("screen_name")
		@Nullable
		public String screenName;
	}
	public static class Hashtags {
		@Nullable
		public List<Integer> indices;
		@Nullable
		public String text;
	}
	public static class QuotedStatus {
		@Nullable
		public Geo coordinates;
		@SerializedName("in_reply_to_status_id_str")
		@Nullable
		public String inReplyToStatusIdStr;
		@Nullable
		public String lang;
		@Nullable
		public String text;
		@SerializedName("extended_entities")
		@Nullable
		public ExtendedEntities extendedEntities;
		@SerializedName("in_reply_to_screen_name")
		@Nullable
		public String inReplyToScreenName;
		@Nullable
		public User user;
		@Nullable
		public List<Long> contributors;
		@SerializedName("created_at")
		@Nullable
		public String createdAt;
		@Nullable
		public Place place;
		@Nullable
		public Boolean truncated;
		@SerializedName("in_reply_to_user_id")
		@Nullable
		public Long inReplyToUserId;
		@Nullable
		public Boolean retweeted;
		@SerializedName("favorite_count")
		@Nullable
		public Integer favoriteCount;
		@SerializedName("extended_tweet")
		@Nullable
		public ExtendedTweet extendedTweet;
		@SerializedName("is_quote_status")
		@Nullable
		public Boolean isQuoteStatus;
		@Nullable
		public Scopes scopes;
		@SerializedName("in_reply_to_status_id")
		@Nullable
		public Long inReplyToStatusId;
		@Nullable
		public String source;
		@Nullable
		public Long id;
		@SerializedName("filter_level")
		@Nullable
		public String filterLevel;
		@SerializedName("retweet_count")
		@Nullable
		public Integer retweetCount;
		@SerializedName("display_text_range")
		@Nullable
		public List<Integer> displayTextRange;
		@SerializedName("quoted_status_id")
		@Nullable
		public Long quotedStatusId;
		@SerializedName("possibly_sensitive")
		@Nullable
		public Boolean possiblySensitive;
		@SerializedName("quoted_status_id_str")
		@Nullable
		public String quotedStatusIdStr;
		@SerializedName("in_reply_to_user_id_str")
		@Nullable
		public String inReplyToUserIdStr;
		@Nullable
		public Geo geo;
		@Nullable
		public Entities entities;
		@Nullable
		public Boolean favorited;
		@SerializedName("id_str")
		@Nullable
		public String idStr;
	}
	public static class ExtendedTweet {
		@SerializedName("display_text_range")
		@Nullable
		public List<Integer> displayTextRange;
		@SerializedName("full_text")
		@Nullable
		public String fullText;
		@Nullable
		public Entities entities;
		@SerializedName("extended_entities")
		@Nullable
		public ExtendedEntities extendedEntities;
	}
	public static class Thumb {
		@Nullable
		public String resize;
		@Nullable
		public Integer h;
		@Nullable
		public Integer w;
	}
	public static class Sizes {
		@Nullable
		public Thumb medium;
		@Nullable
		public Thumb large;
		@Nullable
		public Thumb small;
		@Nullable
		public Thumb thumb;
	}
	public static class Media {
		@SerializedName("video_info")
		@Nullable
		public VideoInfo videoInfo;
		@SerializedName("source_user_id_str")
		@Nullable
		public String sourceUserIdStr;
		@Nullable
		public Long id;
		@SerializedName("display_url")
		@Nullable
		public String displayUrl;
		@Nullable
		public List<Integer> indices;
		@Nullable
		public String url;
		@SerializedName("source_status_id")
		@Nullable
		public Long sourceStatusId;
		@SerializedName("media_url")
		@Nullable
		public String mediaUrl;
		@SerializedName("id_str")
		@Nullable
		public String idStr;
		@SerializedName("expanded_url")
		@Nullable
		public String expandedUrl;
		@Nullable
		public Sizes sizes;
		@SerializedName("source_user_id")
		@Nullable
		public Long sourceUserId;
		@Nullable
		public String type;
		@SerializedName("source_status_id_str")
		@Nullable
		public String sourceStatusIdStr;
		@SerializedName("media_url_https")
		@Nullable
		public String mediaUrlHttps;
	}
	public static class ExtendedEntities {
		@Nullable
		public List<Media> media;
	}
	public static class Variants {
		@Nullable
		public Integer bitrate;
		@Nullable
		public String url;
		@SerializedName("content_type")
		@Nullable
		public String contentType;
	}
	public static class VideoInfo {
		@SerializedName("duration_millis")
		@Nullable
		public Integer durationMillis;
		@SerializedName("aspect_ratio")
		@Nullable
		public List<Integer> aspectRatio;
		@Nullable
		public List<Variants> variants;
	}
	public static class BoundingBox {
		@Nullable
		public List<List<List<Double>>> coordinates;
		@Nullable
		public String type;
	}
	public static class Attributes {
	}
	public static class Place {
		@SerializedName("country_code")
		@Nullable
		public String countryCode;
		@Nullable
		public String country;
		@Nullable
		public String id;
		@Nullable
		public Attributes attributes;
		@Nullable
		public String name;
		@SerializedName("bounding_box")
		@Nullable
		public BoundingBox boundingBox;
		@Nullable
		public String url;
		@SerializedName("place_type")
		@Nullable
		public String placeType;
		@SerializedName("full_name")
		@Nullable
		public String fullName;
	}
	public static class Limit {
		@Nullable
		public Integer track;
		@SerializedName("timestamp_ms")
		@Nullable
		public String timestampMs;
	}
	public static class Scopes {
		@Nullable
		public Boolean followers;
	}
	public static class Geo {
		@Nullable
		public List<Double> coordinates;
		@Nullable
		public String type;
	}
}
