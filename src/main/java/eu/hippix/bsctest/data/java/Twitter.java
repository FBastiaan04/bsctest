package eu.hippix.bsctest.data.java;

import java.util.List;
import java.lang.Integer;
import java.lang.Double;
import com.google.gson.annotations.SerializedName;
import org.apache.fory.annotation.Nullable;

public class Twitter {
	@Nullable
	public Long id;
	public Long getId() { return id; }
	public void setId(Long id){ this.id = id; }
	@SerializedName("is_quote_status")
	@Nullable
	public Boolean isQuoteStatus;
	public Boolean getIsQuoteStatus() { return isQuoteStatus; }
	public void setIsQuoteStatus(Boolean isQuoteStatus){ this.isQuoteStatus = isQuoteStatus; }
	@SerializedName("quoted_status_id_str")
	@Nullable
	public String quotedStatusIdStr;
	public String getQuotedStatusIdStr() { return quotedStatusIdStr; }
	public void setQuotedStatusIdStr(String quotedStatusIdStr){ this.quotedStatusIdStr = quotedStatusIdStr; }
	@SerializedName("in_reply_to_user_id")
	@Nullable
	public Long inReplyToUserId;
	public Long getInReplyToUserId() { return inReplyToUserId; }
	public void setInReplyToUserId(Long inReplyToUserId){ this.inReplyToUserId = inReplyToUserId; }
	@Nullable
	public Limit limit;
	public Limit getLimit() { return limit; }
	public void setLimit(Limit limit){ this.limit = limit; }
	@Nullable
	public String source;
	public String getSource() { return source; }
	public void setSource(String source){ this.source = source; }
	@SerializedName("extended_tweet")
	@Nullable
	public ExtendedTweet extendedTweet;
	public ExtendedTweet getExtendedTweet() { return extendedTweet; }
	public void setExtendedTweet(ExtendedTweet extendedTweet){ this.extendedTweet = extendedTweet; }
	@SerializedName("filter_level")
	@Nullable
	public String filterLevel;
	public String getFilterLevel() { return filterLevel; }
	public void setFilterLevel(String filterLevel){ this.filterLevel = filterLevel; }
	@SerializedName("in_reply_to_user_id_str")
	@Nullable
	public String inReplyToUserIdStr;
	public String getInReplyToUserIdStr() { return inReplyToUserIdStr; }
	public void setInReplyToUserIdStr(String inReplyToUserIdStr){ this.inReplyToUserIdStr = inReplyToUserIdStr; }
	@Nullable
	public Boolean truncated;
	public Boolean getTruncated() { return truncated; }
	public void setTruncated(Boolean truncated){ this.truncated = truncated; }
	@SerializedName("possibly_sensitive")
	@Nullable
	public Boolean possiblySensitive;
	public Boolean getPossiblySensitive() { return possiblySensitive; }
	public void setPossiblySensitive(Boolean possiblySensitive){ this.possiblySensitive = possiblySensitive; }
	@SerializedName("favorite_count")
	@Nullable
	public Integer favoriteCount;
	public Integer getFavoriteCount() { return favoriteCount; }
	public void setFavoriteCount(Integer favoriteCount){ this.favoriteCount = favoriteCount; }
	@Nullable
	public Entities entities;
	public Entities getEntities() { return entities; }
	public void setEntities(Entities entities){ this.entities = entities; }
	@Nullable
	public String lang;
	public String getLang() { return lang; }
	public void setLang(String lang){ this.lang = lang; }
	@SerializedName("extended_entities")
	@Nullable
	public ExtendedEntities extendedEntities;
	public ExtendedEntities getExtendedEntities() { return extendedEntities; }
	public void setExtendedEntities(ExtendedEntities extendedEntities){ this.extendedEntities = extendedEntities; }
	@Nullable
	public Boolean retweeted;
	public Boolean getRetweeted() { return retweeted; }
	public void setRetweeted(Boolean retweeted){ this.retweeted = retweeted; }
	@SerializedName("id_str")
	@Nullable
	public String idStr;
	public String getIdStr() { return idStr; }
	public void setIdStr(String idStr){ this.idStr = idStr; }
	@Nullable
	public Boolean favorited;
	public Boolean getFavorited() { return favorited; }
	public void setFavorited(Boolean favorited){ this.favorited = favorited; }
	@Nullable
	public String contributors;
	public String getContributors() { return contributors; }
	public void setContributors(String contributors){ this.contributors = contributors; }
	@SerializedName("retweeted_status")
	@Nullable
	public RetweetedStatus retweetedStatus;
	public RetweetedStatus getRetweetedStatus() { return retweetedStatus; }
	public void setRetweetedStatus(RetweetedStatus retweetedStatus){ this.retweetedStatus = retweetedStatus; }
	@SerializedName("quoted_status_id")
	@Nullable
	public Long quotedStatusId;
	public Long getQuotedStatusId() { return quotedStatusId; }
	public void setQuotedStatusId(Long quotedStatusId){ this.quotedStatusId = quotedStatusId; }
	@SerializedName("in_reply_to_screen_name")
	@Nullable
	public String inReplyToScreenName;
	public String getInReplyToScreenName() { return inReplyToScreenName; }
	public void setInReplyToScreenName(String inReplyToScreenName){ this.inReplyToScreenName = inReplyToScreenName; }
	@Nullable
	public Place place;
	public Place getPlace() { return place; }
	public void setPlace(Place place){ this.place = place; }
	@Nullable
	public Geo coordinates;
	public Geo getCoordinates() { return coordinates; }
	public void setCoordinates(Geo coordinates){ this.coordinates = coordinates; }
	@SerializedName("in_reply_to_status_id_str")
	@Nullable
	public String inReplyToStatusIdStr;
	public String getInReplyToStatusIdStr() { return inReplyToStatusIdStr; }
	public void setInReplyToStatusIdStr(String inReplyToStatusIdStr){ this.inReplyToStatusIdStr = inReplyToStatusIdStr; }
	@Nullable
	public Geo geo;
	public Geo getGeo() { return geo; }
	public void setGeo(Geo geo){ this.geo = geo; }
	@SerializedName("timestamp_ms")
	@Nullable
	public String timestampMs;
	public String getTimestampMs() { return timestampMs; }
	public void setTimestampMs(String timestampMs){ this.timestampMs = timestampMs; }
	@SerializedName("display_text_range")
	@Nullable
	public List<Integer> displayTextRange;
	public List<Integer> getDisplayTextRange() { return displayTextRange; }
	public void setDisplayTextRange(List<Integer> displayTextRange){ this.displayTextRange = displayTextRange; }
	@SerializedName("quoted_status")
	@Nullable
	public QuotedStatus quotedStatus;
	public QuotedStatus getQuotedStatus() { return quotedStatus; }
	public void setQuotedStatus(QuotedStatus quotedStatus){ this.quotedStatus = quotedStatus; }
	@SerializedName("in_reply_to_status_id")
	@Nullable
	public Long inReplyToStatusId;
	public Long getInReplyToStatusId() { return inReplyToStatusId; }
	public void setInReplyToStatusId(Long inReplyToStatusId){ this.inReplyToStatusId = inReplyToStatusId; }
	@SerializedName("retweet_count")
	@Nullable
	public Integer retweetCount;
	public Integer getRetweetCount() { return retweetCount; }
	public void setRetweetCount(Integer retweetCount){ this.retweetCount = retweetCount; }
	@SerializedName("created_at")
	@Nullable
	public String createdAt;
	public String getCreatedAt() { return createdAt; }
	public void setCreatedAt(String createdAt){ this.createdAt = createdAt; }
	@Nullable
	public String text;
	public String getText() { return text; }
	public void setText(String text){ this.text = text; }
	@Nullable
	public User user;
	public User getUser() { return user; }
	public void setUser(User user){ this.user = user; }
	public static class User {
	@SerializedName("profile_use_background_image")
	@Nullable
	public Boolean profileUseBackgroundImage;
	public Boolean getProfileUseBackgroundImage() { return profileUseBackgroundImage; }
	public void setProfileUseBackgroundImage(Boolean profileUseBackgroundImage){ this.profileUseBackgroundImage = profileUseBackgroundImage; }
	@Nullable
	public Long id;
	public Long getId() { return id; }
	public void setId(Long id){ this.id = id; }
	@Nullable
	public Boolean verified;
	public Boolean getVerified() { return verified; }
	public void setVerified(Boolean verified){ this.verified = verified; }
	@SerializedName("screen_name")
	@Nullable
	public String screenName;
	public String getScreenName() { return screenName; }
	public void setScreenName(String screenName){ this.screenName = screenName; }
	@SerializedName("statuses_count")
	@Nullable
	public Integer statusesCount;
	public Integer getStatusesCount() { return statusesCount; }
	public void setStatusesCount(Integer statusesCount){ this.statusesCount = statusesCount; }
	@SerializedName("profile_background_tile")
	@Nullable
	public Boolean profileBackgroundTile;
	public Boolean getProfileBackgroundTile() { return profileBackgroundTile; }
	public void setProfileBackgroundTile(Boolean profileBackgroundTile){ this.profileBackgroundTile = profileBackgroundTile; }
	@SerializedName("utc_offset")
	@Nullable
	public Integer utcOffset;
	public Integer getUtcOffset() { return utcOffset; }
	public void setUtcOffset(Integer utcOffset){ this.utcOffset = utcOffset; }
	@Nullable
	public String following;
	public String getFollowing() { return following; }
	public void setFollowing(String following){ this.following = following; }
	@Nullable
	public String name;
	public String getName() { return name; }
	public void setName(String name){ this.name = name; }
	@SerializedName("profile_sidebar_fill_color")
	@Nullable
	public String profileSidebarFillColor;
	public String getProfileSidebarFillColor() { return profileSidebarFillColor; }
	public void setProfileSidebarFillColor(String profileSidebarFillColor){ this.profileSidebarFillColor = profileSidebarFillColor; }
	@SerializedName("is_translator")
	@Nullable
	public Boolean isTranslator;
	public Boolean getIsTranslator() { return isTranslator; }
	public void setIsTranslator(Boolean isTranslator){ this.isTranslator = isTranslator; }
	@SerializedName("profile_image_url")
	@Nullable
	public String profileImageUrl;
	public String getProfileImageUrl() { return profileImageUrl; }
	public void setProfileImageUrl(String profileImageUrl){ this.profileImageUrl = profileImageUrl; }
	@SerializedName("profile_image_url_https")
	@Nullable
	public String profileImageUrlHttps;
	public String getProfileImageUrlHttps() { return profileImageUrlHttps; }
	public void setProfileImageUrlHttps(String profileImageUrlHttps){ this.profileImageUrlHttps = profileImageUrlHttps; }
	@SerializedName("profile_text_color")
	@Nullable
	public String profileTextColor;
	public String getProfileTextColor() { return profileTextColor; }
	public void setProfileTextColor(String profileTextColor){ this.profileTextColor = profileTextColor; }
	@SerializedName("profile_background_image_url")
	@Nullable
	public String profileBackgroundImageUrl;
	public String getProfileBackgroundImageUrl() { return profileBackgroundImageUrl; }
	public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl){ this.profileBackgroundImageUrl = profileBackgroundImageUrl; }
	@SerializedName("profile_sidebar_border_color")
	@Nullable
	public String profileSidebarBorderColor;
	public String getProfileSidebarBorderColor() { return profileSidebarBorderColor; }
	public void setProfileSidebarBorderColor(String profileSidebarBorderColor){ this.profileSidebarBorderColor = profileSidebarBorderColor; }
	@SerializedName("follow_request_sent")
	@Nullable
	public String followRequestSent;
	public String getFollowRequestSent() { return followRequestSent; }
	public void setFollowRequestSent(String followRequestSent){ this.followRequestSent = followRequestSent; }
	@SerializedName("contributors_enabled")
	@Nullable
	public Boolean contributorsEnabled;
	public Boolean getContributorsEnabled() { return contributorsEnabled; }
	public void setContributorsEnabled(Boolean contributorsEnabled){ this.contributorsEnabled = contributorsEnabled; }
	@Nullable
	public String lang;
	public String getLang() { return lang; }
	public void setLang(String lang){ this.lang = lang; }
	@SerializedName("favourites_count")
	@Nullable
	public Integer favouritesCount;
	public Integer getFavouritesCount() { return favouritesCount; }
	public void setFavouritesCount(Integer favouritesCount){ this.favouritesCount = favouritesCount; }
	@SerializedName("profile_background_color")
	@Nullable
	public String profileBackgroundColor;
	public String getProfileBackgroundColor() { return profileBackgroundColor; }
	public void setProfileBackgroundColor(String profileBackgroundColor){ this.profileBackgroundColor = profileBackgroundColor; }
	@SerializedName("profile_background_image_url_https")
	@Nullable
	public String profileBackgroundImageUrlHttps;
	public String getProfileBackgroundImageUrlHttps() { return profileBackgroundImageUrlHttps; }
	public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps){ this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps; }
	@SerializedName("profile_link_color")
	@Nullable
	public String profileLinkColor;
	public String getProfileLinkColor() { return profileLinkColor; }
	public void setProfileLinkColor(String profileLinkColor){ this.profileLinkColor = profileLinkColor; }
	@SerializedName("geo_enabled")
	@Nullable
	public Boolean geoEnabled;
	public Boolean getGeoEnabled() { return geoEnabled; }
	public void setGeoEnabled(Boolean geoEnabled){ this.geoEnabled = geoEnabled; }
	@SerializedName("id_str")
	@Nullable
	public String idStr;
	public String getIdStr() { return idStr; }
	public void setIdStr(String idStr){ this.idStr = idStr; }
	@Nullable
	public String url;
	public String getUrl() { return url; }
	public void setUrl(String url){ this.url = url; }
	@SerializedName("protected")
	@Nullable
	public Boolean protec;
	public Boolean getProtec() { return protec; }
	public void setProtec(Boolean protec){ this.protec = protec; }
	@SerializedName("friends_count")
	@Nullable
	public Integer friendsCount;
	public Integer getFriendsCount() { return friendsCount; }
	public void setFriendsCount(Integer friendsCount){ this.friendsCount = friendsCount; }
	@Nullable
	public String location;
	public String getLocation() { return location; }
	public void setLocation(String location){ this.location = location; }
	@SerializedName("default_profile")
	@Nullable
	public Boolean defaultProfile;
	public Boolean getDefaultProfile() { return defaultProfile; }
	public void setDefaultProfile(Boolean defaultProfile){ this.defaultProfile = defaultProfile; }
	@SerializedName("followers_count")
	@Nullable
	public Integer followersCount;
	public Integer getFollowersCount() { return followersCount; }
	public void setFollowersCount(Integer followersCount){ this.followersCount = followersCount; }
	@Nullable
	public String description;
	public String getDescription() { return description; }
	public void setDescription(String description){ this.description = description; }
	@SerializedName("default_profile_image")
	@Nullable
	public Boolean defaultProfileImage;
	public Boolean getDefaultProfileImage() { return defaultProfileImage; }
	public void setDefaultProfileImage(Boolean defaultProfileImage){ this.defaultProfileImage = defaultProfileImage; }
	@SerializedName("created_at")
	@Nullable
	public String createdAt;
	public String getCreatedAt() { return createdAt; }
	public void setCreatedAt(String createdAt){ this.createdAt = createdAt; }
	@SerializedName("time_zone")
	@Nullable
	public String timeZone;
	public String getTimeZone() { return timeZone; }
	public void setTimeZone(String timeZone){ this.timeZone = timeZone; }
	@Nullable
	public String notifications;
	public String getNotifications() { return notifications; }
	public void setNotifications(String notifications){ this.notifications = notifications; }
	@SerializedName("listed_count")
	@Nullable
	public Integer listedCount;
	public Integer getListedCount() { return listedCount; }
	public void setListedCount(Integer listedCount){ this.listedCount = listedCount; }
	@SerializedName("profile_banner_url")
	@Nullable
	public String profileBannerUrl;
	public String getProfileBannerUrl() { return profileBannerUrl; }
	public void setProfileBannerUrl(String profileBannerUrl){ this.profileBannerUrl = profileBannerUrl; }
	}
	public static class Urls {
	@Nullable
	public String url;
	public String getUrl() { return url; }
	public void setUrl(String url){ this.url = url; }
	@SerializedName("display_url")
	@Nullable
	public String displayUrl;
	public String getDisplayUrl() { return displayUrl; }
	public void setDisplayUrl(String displayUrl){ this.displayUrl = displayUrl; }
	@Nullable
	public List<Integer> indices;
	public List<Integer> getIndices() { return indices; }
	public void setIndices(List<Integer> indices){ this.indices = indices; }
	@SerializedName("expanded_url")
	@Nullable
	public String expandedUrl;
	public String getExpandedUrl() { return expandedUrl; }
	public void setExpandedUrl(String expandedUrl){ this.expandedUrl = expandedUrl; }
	}
	public static class Entities {
	@Nullable
	public List<Hashtags> symbols;
	public List<Hashtags> getSymbols() { return symbols; }
	public void setSymbols(List<Hashtags> symbols){ this.symbols = symbols; }
	@Nullable
	public List<Hashtags> hashtags;
	public List<Hashtags> getHashtags() { return hashtags; }
	public void setHashtags(List<Hashtags> hashtags){ this.hashtags = hashtags; }
	@Nullable
	public List<Media> media;
	public List<Media> getMedia() { return media; }
	public void setMedia(List<Media> media){ this.media = media; }
	@SerializedName("user_mentions")
	@Nullable
	public List<UserMentions> userMentions;
	public List<UserMentions> getUserMentions() { return userMentions; }
	public void setUserMentions(List<UserMentions> userMentions){ this.userMentions = userMentions; }
	@Nullable
	public List<Urls> urls;
	public List<Urls> getUrls() { return urls; }
	public void setUrls(List<Urls> urls){ this.urls = urls; }
	}
	public static class RetweetedStatus {
	@Nullable
	public Long id;
	public Long getId() { return id; }
	public void setId(Long id){ this.id = id; }
	@SerializedName("is_quote_status")
	@Nullable
	public Boolean isQuoteStatus;
	public Boolean getIsQuoteStatus() { return isQuoteStatus; }
	public void setIsQuoteStatus(Boolean isQuoteStatus){ this.isQuoteStatus = isQuoteStatus; }
	@SerializedName("quoted_status_id_str")
	@Nullable
	public String quotedStatusIdStr;
	public String getQuotedStatusIdStr() { return quotedStatusIdStr; }
	public void setQuotedStatusIdStr(String quotedStatusIdStr){ this.quotedStatusIdStr = quotedStatusIdStr; }
	@SerializedName("in_reply_to_user_id")
	@Nullable
	public Long inReplyToUserId;
	public Long getInReplyToUserId() { return inReplyToUserId; }
	public void setInReplyToUserId(Long inReplyToUserId){ this.inReplyToUserId = inReplyToUserId; }
	@Nullable
	public String source;
	public String getSource() { return source; }
	public void setSource(String source){ this.source = source; }
	@SerializedName("extended_tweet")
	@Nullable
	public ExtendedTweet extendedTweet;
	public ExtendedTweet getExtendedTweet() { return extendedTweet; }
	public void setExtendedTweet(ExtendedTweet extendedTweet){ this.extendedTweet = extendedTweet; }
	@SerializedName("filter_level")
	@Nullable
	public String filterLevel;
	public String getFilterLevel() { return filterLevel; }
	public void setFilterLevel(String filterLevel){ this.filterLevel = filterLevel; }
	@SerializedName("in_reply_to_user_id_str")
	@Nullable
	public String inReplyToUserIdStr;
	public String getInReplyToUserIdStr() { return inReplyToUserIdStr; }
	public void setInReplyToUserIdStr(String inReplyToUserIdStr){ this.inReplyToUserIdStr = inReplyToUserIdStr; }
	@Nullable
	public Boolean truncated;
	public Boolean getTruncated() { return truncated; }
	public void setTruncated(Boolean truncated){ this.truncated = truncated; }
	@SerializedName("possibly_sensitive")
	@Nullable
	public Boolean possiblySensitive;
	public Boolean getPossiblySensitive() { return possiblySensitive; }
	public void setPossiblySensitive(Boolean possiblySensitive){ this.possiblySensitive = possiblySensitive; }
	@SerializedName("favorite_count")
	@Nullable
	public Integer favoriteCount;
	public Integer getFavoriteCount() { return favoriteCount; }
	public void setFavoriteCount(Integer favoriteCount){ this.favoriteCount = favoriteCount; }
	@Nullable
	public Entities entities;
	public Entities getEntities() { return entities; }
	public void setEntities(Entities entities){ this.entities = entities; }
	@Nullable
	public String lang;
	public String getLang() { return lang; }
	public void setLang(String lang){ this.lang = lang; }
	@Nullable
	public Scopes scopes;
	public Scopes getScopes() { return scopes; }
	public void setScopes(Scopes scopes){ this.scopes = scopes; }
	@SerializedName("extended_entities")
	@Nullable
	public ExtendedEntities extendedEntities;
	public ExtendedEntities getExtendedEntities() { return extendedEntities; }
	public void setExtendedEntities(ExtendedEntities extendedEntities){ this.extendedEntities = extendedEntities; }
	@Nullable
	public Boolean retweeted;
	public Boolean getRetweeted() { return retweeted; }
	public void setRetweeted(Boolean retweeted){ this.retweeted = retweeted; }
	@SerializedName("id_str")
	@Nullable
	public String idStr;
	public String getIdStr() { return idStr; }
	public void setIdStr(String idStr){ this.idStr = idStr; }
	@Nullable
	public Boolean favorited;
	public Boolean getFavorited() { return favorited; }
	public void setFavorited(Boolean favorited){ this.favorited = favorited; }
	@Nullable
	public String contributors;
	public String getContributors() { return contributors; }
	public void setContributors(String contributors){ this.contributors = contributors; }
	@SerializedName("quoted_status_id")
	@Nullable
	public Long quotedStatusId;
	public Long getQuotedStatusId() { return quotedStatusId; }
	public void setQuotedStatusId(Long quotedStatusId){ this.quotedStatusId = quotedStatusId; }
	@SerializedName("in_reply_to_screen_name")
	@Nullable
	public String inReplyToScreenName;
	public String getInReplyToScreenName() { return inReplyToScreenName; }
	public void setInReplyToScreenName(String inReplyToScreenName){ this.inReplyToScreenName = inReplyToScreenName; }
	@Nullable
	public Place place;
	public Place getPlace() { return place; }
	public void setPlace(Place place){ this.place = place; }
	@Nullable
	public Geo coordinates;
	public Geo getCoordinates() { return coordinates; }
	public void setCoordinates(Geo coordinates){ this.coordinates = coordinates; }
	@SerializedName("in_reply_to_status_id_str")
	@Nullable
	public String inReplyToStatusIdStr;
	public String getInReplyToStatusIdStr() { return inReplyToStatusIdStr; }
	public void setInReplyToStatusIdStr(String inReplyToStatusIdStr){ this.inReplyToStatusIdStr = inReplyToStatusIdStr; }
	@Nullable
	public Geo geo;
	public Geo getGeo() { return geo; }
	public void setGeo(Geo geo){ this.geo = geo; }
	@SerializedName("display_text_range")
	@Nullable
	public List<Integer> displayTextRange;
	public List<Integer> getDisplayTextRange() { return displayTextRange; }
	public void setDisplayTextRange(List<Integer> displayTextRange){ this.displayTextRange = displayTextRange; }
	@SerializedName("quoted_status")
	@Nullable
	public QuotedStatus quotedStatus;
	public QuotedStatus getQuotedStatus() { return quotedStatus; }
	public void setQuotedStatus(QuotedStatus quotedStatus){ this.quotedStatus = quotedStatus; }
	@SerializedName("in_reply_to_status_id")
	@Nullable
	public Long inReplyToStatusId;
	public Long getInReplyToStatusId() { return inReplyToStatusId; }
	public void setInReplyToStatusId(Long inReplyToStatusId){ this.inReplyToStatusId = inReplyToStatusId; }
	@SerializedName("retweet_count")
	@Nullable
	public Integer retweetCount;
	public Integer getRetweetCount() { return retweetCount; }
	public void setRetweetCount(Integer retweetCount){ this.retweetCount = retweetCount; }
	@SerializedName("created_at")
	@Nullable
	public String createdAt;
	public String getCreatedAt() { return createdAt; }
	public void setCreatedAt(String createdAt){ this.createdAt = createdAt; }
	@Nullable
	public String text;
	public String getText() { return text; }
	public void setText(String text){ this.text = text; }
	@Nullable
	public User user;
	public User getUser() { return user; }
	public void setUser(User user){ this.user = user; }
	}
	public static class UserMentions {
	@Nullable
	public Long id;
	public Long getId() { return id; }
	public void setId(Long id){ this.id = id; }
	@SerializedName("screen_name")
	@Nullable
	public String screenName;
	public String getScreenName() { return screenName; }
	public void setScreenName(String screenName){ this.screenName = screenName; }
	@Nullable
	public String name;
	public String getName() { return name; }
	public void setName(String name){ this.name = name; }
	@SerializedName("id_str")
	@Nullable
	public String idStr;
	public String getIdStr() { return idStr; }
	public void setIdStr(String idStr){ this.idStr = idStr; }
	@Nullable
	public List<Integer> indices;
	public List<Integer> getIndices() { return indices; }
	public void setIndices(List<Integer> indices){ this.indices = indices; }
	}
	public static class Hashtags {
	@Nullable
	public String text;
	public String getText() { return text; }
	public void setText(String text){ this.text = text; }
	@Nullable
	public List<Integer> indices;
	public List<Integer> getIndices() { return indices; }
	public void setIndices(List<Integer> indices){ this.indices = indices; }
	}
	public static class QuotedStatus {
	@Nullable
	public Long id;
	public Long getId() { return id; }
	public void setId(Long id){ this.id = id; }
	@SerializedName("is_quote_status")
	@Nullable
	public Boolean isQuoteStatus;
	public Boolean getIsQuoteStatus() { return isQuoteStatus; }
	public void setIsQuoteStatus(Boolean isQuoteStatus){ this.isQuoteStatus = isQuoteStatus; }
	@SerializedName("quoted_status_id_str")
	@Nullable
	public String quotedStatusIdStr;
	public String getQuotedStatusIdStr() { return quotedStatusIdStr; }
	public void setQuotedStatusIdStr(String quotedStatusIdStr){ this.quotedStatusIdStr = quotedStatusIdStr; }
	@Nullable
	public Boolean retweeted;
	public Boolean getRetweeted() { return retweeted; }
	public void setRetweeted(Boolean retweeted){ this.retweeted = retweeted; }
	@SerializedName("id_str")
	@Nullable
	public String idStr;
	public String getIdStr() { return idStr; }
	public void setIdStr(String idStr){ this.idStr = idStr; }
	@SerializedName("in_reply_to_user_id")
	@Nullable
	public Long inReplyToUserId;
	public Long getInReplyToUserId() { return inReplyToUserId; }
	public void setInReplyToUserId(Long inReplyToUserId){ this.inReplyToUserId = inReplyToUserId; }
	@Nullable
	public Boolean favorited;
	public Boolean getFavorited() { return favorited; }
	public void setFavorited(Boolean favorited){ this.favorited = favorited; }
	@Nullable
	public String source;
	public String getSource() { return source; }
	public void setSource(String source){ this.source = source; }
	@SerializedName("extended_tweet")
	@Nullable
	public ExtendedTweet extendedTweet;
	public ExtendedTweet getExtendedTweet() { return extendedTweet; }
	public void setExtendedTweet(ExtendedTweet extendedTweet){ this.extendedTweet = extendedTweet; }
	@Nullable
	public List<Long> contributors;
	public List<Long> getContributors() { return contributors; }
	public void setContributors(List<Long> contributors){ this.contributors = contributors; }
	@SerializedName("filter_level")
	@Nullable
	public String filterLevel;
	public String getFilterLevel() { return filterLevel; }
	public void setFilterLevel(String filterLevel){ this.filterLevel = filterLevel; }
	@SerializedName("quoted_status_id")
	@Nullable
	public Long quotedStatusId;
	public Long getQuotedStatusId() { return quotedStatusId; }
	public void setQuotedStatusId(Long quotedStatusId){ this.quotedStatusId = quotedStatusId; }
	@SerializedName("in_reply_to_screen_name")
	@Nullable
	public String inReplyToScreenName;
	public String getInReplyToScreenName() { return inReplyToScreenName; }
	public void setInReplyToScreenName(String inReplyToScreenName){ this.inReplyToScreenName = inReplyToScreenName; }
	@Nullable
	public Place place;
	public Place getPlace() { return place; }
	public void setPlace(Place place){ this.place = place; }
	@SerializedName("in_reply_to_user_id_str")
	@Nullable
	public String inReplyToUserIdStr;
	public String getInReplyToUserIdStr() { return inReplyToUserIdStr; }
	public void setInReplyToUserIdStr(String inReplyToUserIdStr){ this.inReplyToUserIdStr = inReplyToUserIdStr; }
	@Nullable
	public Geo coordinates;
	public Geo getCoordinates() { return coordinates; }
	public void setCoordinates(Geo coordinates){ this.coordinates = coordinates; }
	@SerializedName("in_reply_to_status_id_str")
	@Nullable
	public String inReplyToStatusIdStr;
	public String getInReplyToStatusIdStr() { return inReplyToStatusIdStr; }
	public void setInReplyToStatusIdStr(String inReplyToStatusIdStr){ this.inReplyToStatusIdStr = inReplyToStatusIdStr; }
	@Nullable
	public Geo geo;
	public Geo getGeo() { return geo; }
	public void setGeo(Geo geo){ this.geo = geo; }
	@Nullable
	public Boolean truncated;
	public Boolean getTruncated() { return truncated; }
	public void setTruncated(Boolean truncated){ this.truncated = truncated; }
	@SerializedName("display_text_range")
	@Nullable
	public List<Integer> displayTextRange;
	public List<Integer> getDisplayTextRange() { return displayTextRange; }
	public void setDisplayTextRange(List<Integer> displayTextRange){ this.displayTextRange = displayTextRange; }
	@SerializedName("possibly_sensitive")
	@Nullable
	public Boolean possiblySensitive;
	public Boolean getPossiblySensitive() { return possiblySensitive; }
	public void setPossiblySensitive(Boolean possiblySensitive){ this.possiblySensitive = possiblySensitive; }
	@SerializedName("favorite_count")
	@Nullable
	public Integer favoriteCount;
	public Integer getFavoriteCount() { return favoriteCount; }
	public void setFavoriteCount(Integer favoriteCount){ this.favoriteCount = favoriteCount; }
	@Nullable
	public Entities entities;
	public Entities getEntities() { return entities; }
	public void setEntities(Entities entities){ this.entities = entities; }
	@Nullable
	public String lang;
	public String getLang() { return lang; }
	public void setLang(String lang){ this.lang = lang; }
	@SerializedName("in_reply_to_status_id")
	@Nullable
	public Long inReplyToStatusId;
	public Long getInReplyToStatusId() { return inReplyToStatusId; }
	public void setInReplyToStatusId(Long inReplyToStatusId){ this.inReplyToStatusId = inReplyToStatusId; }
	@SerializedName("retweet_count")
	@Nullable
	public Integer retweetCount;
	public Integer getRetweetCount() { return retweetCount; }
	public void setRetweetCount(Integer retweetCount){ this.retweetCount = retweetCount; }
	@Nullable
	public Scopes scopes;
	public Scopes getScopes() { return scopes; }
	public void setScopes(Scopes scopes){ this.scopes = scopes; }
	@SerializedName("created_at")
	@Nullable
	public String createdAt;
	public String getCreatedAt() { return createdAt; }
	public void setCreatedAt(String createdAt){ this.createdAt = createdAt; }
	@Nullable
	public String text;
	public String getText() { return text; }
	public void setText(String text){ this.text = text; }
	@SerializedName("extended_entities")
	@Nullable
	public ExtendedEntities extendedEntities;
	public ExtendedEntities getExtendedEntities() { return extendedEntities; }
	public void setExtendedEntities(ExtendedEntities extendedEntities){ this.extendedEntities = extendedEntities; }
	@Nullable
	public User user;
	public User getUser() { return user; }
	public void setUser(User user){ this.user = user; }
	}
	public static class ExtendedTweet {
	@SerializedName("full_text")
	@Nullable
	public String fullText;
	public String getFullText() { return fullText; }
	public void setFullText(String fullText){ this.fullText = fullText; }
	@Nullable
	public Entities entities;
	public Entities getEntities() { return entities; }
	public void setEntities(Entities entities){ this.entities = entities; }
	@SerializedName("display_text_range")
	@Nullable
	public List<Integer> displayTextRange;
	public List<Integer> getDisplayTextRange() { return displayTextRange; }
	public void setDisplayTextRange(List<Integer> displayTextRange){ this.displayTextRange = displayTextRange; }
	@SerializedName("extended_entities")
	@Nullable
	public ExtendedEntities extendedEntities;
	public ExtendedEntities getExtendedEntities() { return extendedEntities; }
	public void setExtendedEntities(ExtendedEntities extendedEntities){ this.extendedEntities = extendedEntities; }
	}
	public static class Thumb {
	@Nullable
	public Integer h;
	public Integer getH() { return h; }
	public void setH(Integer h){ this.h = h; }
	@Nullable
	public String resize;
	public String getResize() { return resize; }
	public void setResize(String resize){ this.resize = resize; }
	@Nullable
	public Integer w;
	public Integer getW() { return w; }
	public void setW(Integer w){ this.w = w; }
	}
	public static class Sizes {
	@Nullable
	public Thumb large;
	public Thumb getLarge() { return large; }
	public void setLarge(Thumb large){ this.large = large; }
	@Nullable
	public Thumb medium;
	public Thumb getMedium() { return medium; }
	public void setMedium(Thumb medium){ this.medium = medium; }
	@Nullable
	public Thumb small;
	public Thumb getSmall() { return small; }
	public void setSmall(Thumb small){ this.small = small; }
	@Nullable
	public Thumb thumb;
	public Thumb getThumb() { return thumb; }
	public void setThumb(Thumb thumb){ this.thumb = thumb; }
	}
	public static class Media {
	@Nullable
	public Long id;
	public Long getId() { return id; }
	public void setId(Long id){ this.id = id; }
	@SerializedName("display_url")
	@Nullable
	public String displayUrl;
	public String getDisplayUrl() { return displayUrl; }
	public void setDisplayUrl(String displayUrl){ this.displayUrl = displayUrl; }
	@SerializedName("source_status_id_str")
	@Nullable
	public String sourceStatusIdStr;
	public String getSourceStatusIdStr() { return sourceStatusIdStr; }
	public void setSourceStatusIdStr(String sourceStatusIdStr){ this.sourceStatusIdStr = sourceStatusIdStr; }
	@SerializedName("source_user_id_str")
	@Nullable
	public String sourceUserIdStr;
	public String getSourceUserIdStr() { return sourceUserIdStr; }
	public void setSourceUserIdStr(String sourceUserIdStr){ this.sourceUserIdStr = sourceUserIdStr; }
	@SerializedName("id_str")
	@Nullable
	public String idStr;
	public String getIdStr() { return idStr; }
	public void setIdStr(String idStr){ this.idStr = idStr; }
	@Nullable
	public String url;
	public String getUrl() { return url; }
	public void setUrl(String url){ this.url = url; }
	@SerializedName("media_url_https")
	@Nullable
	public String mediaUrlHttps;
	public String getMediaUrlHttps() { return mediaUrlHttps; }
	public void setMediaUrlHttps(String mediaUrlHttps){ this.mediaUrlHttps = mediaUrlHttps; }
	@Nullable
	public String type;
	public String getType() { return type; }
	public void setType(String type){ this.type = type; }
	@Nullable
	public Sizes sizes;
	public Sizes getSizes() { return sizes; }
	public void setSizes(Sizes sizes){ this.sizes = sizes; }
	@SerializedName("video_info")
	@Nullable
	public VideoInfo videoInfo;
	public VideoInfo getVideoInfo() { return videoInfo; }
	public void setVideoInfo(VideoInfo videoInfo){ this.videoInfo = videoInfo; }
	@SerializedName("media_url")
	@Nullable
	public String mediaUrl;
	public String getMediaUrl() { return mediaUrl; }
	public void setMediaUrl(String mediaUrl){ this.mediaUrl = mediaUrl; }
	@SerializedName("source_status_id")
	@Nullable
	public Long sourceStatusId;
	public Long getSourceStatusId() { return sourceStatusId; }
	public void setSourceStatusId(Long sourceStatusId){ this.sourceStatusId = sourceStatusId; }
	@SerializedName("source_user_id")
	@Nullable
	public Long sourceUserId;
	public Long getSourceUserId() { return sourceUserId; }
	public void setSourceUserId(Long sourceUserId){ this.sourceUserId = sourceUserId; }
	@Nullable
	public List<Integer> indices;
	public List<Integer> getIndices() { return indices; }
	public void setIndices(List<Integer> indices){ this.indices = indices; }
	@SerializedName("expanded_url")
	@Nullable
	public String expandedUrl;
	public String getExpandedUrl() { return expandedUrl; }
	public void setExpandedUrl(String expandedUrl){ this.expandedUrl = expandedUrl; }
	}
	public static class ExtendedEntities {
	@Nullable
	public List<Media> media;
	public List<Media> getMedia() { return media; }
	public void setMedia(List<Media> media){ this.media = media; }
	}
	public static class Variants {
	@Nullable
	public String url;
	public String getUrl() { return url; }
	public void setUrl(String url){ this.url = url; }
	@Nullable
	public Integer bitrate;
	public Integer getBitrate() { return bitrate; }
	public void setBitrate(Integer bitrate){ this.bitrate = bitrate; }
	@SerializedName("content_type")
	@Nullable
	public String contentType;
	public String getContentType() { return contentType; }
	public void setContentType(String contentType){ this.contentType = contentType; }
	}
	public static class VideoInfo {
	@Nullable
	public List<Variants> variants;
	public List<Variants> getVariants() { return variants; }
	public void setVariants(List<Variants> variants){ this.variants = variants; }
	@SerializedName("aspect_ratio")
	@Nullable
	public List<Integer> aspectRatio;
	public List<Integer> getAspectRatio() { return aspectRatio; }
	public void setAspectRatio(List<Integer> aspectRatio){ this.aspectRatio = aspectRatio; }
	@SerializedName("duration_millis")
	@Nullable
	public Integer durationMillis;
	public Integer getDurationMillis() { return durationMillis; }
	public void setDurationMillis(Integer durationMillis){ this.durationMillis = durationMillis; }
	}
	public static class BoundingBox {
	@Nullable
	public String type;
	public String getType() { return type; }
	public void setType(String type){ this.type = type; }
	@Nullable
	public List<List<List<Double>>> coordinates;
	public List<List<List<Double>>> getCoordinates() { return coordinates; }
	public void setCoordinates(List<List<List<Double>>> coordinates){ this.coordinates = coordinates; }
	}
	public static class Attributes {
	}
	public static class Place {
	@Nullable
	public String id;
	public String getId() { return id; }
	public void setId(String id){ this.id = id; }
	@SerializedName("full_name")
	@Nullable
	public String fullName;
	public String getFullName() { return fullName; }
	public void setFullName(String fullName){ this.fullName = fullName; }
	@Nullable
	public String url;
	public String getUrl() { return url; }
	public void setUrl(String url){ this.url = url; }
	@SerializedName("bounding_box")
	@Nullable
	public BoundingBox boundingBox;
	public BoundingBox getBoundingBox() { return boundingBox; }
	public void setBoundingBox(BoundingBox boundingBox){ this.boundingBox = boundingBox; }
	@Nullable
	public String country;
	public String getCountry() { return country; }
	public void setCountry(String country){ this.country = country; }
	@SerializedName("place_type")
	@Nullable
	public String placeType;
	public String getPlaceType() { return placeType; }
	public void setPlaceType(String placeType){ this.placeType = placeType; }
	@Nullable
	public String name;
	public String getName() { return name; }
	public void setName(String name){ this.name = name; }
	@SerializedName("country_code")
	@Nullable
	public String countryCode;
	public String getCountryCode() { return countryCode; }
	public void setCountryCode(String countryCode){ this.countryCode = countryCode; }
	@Nullable
	public Attributes attributes;
	public Attributes getAttributes() { return attributes; }
	public void setAttributes(Attributes attributes){ this.attributes = attributes; }
	}
	public static class Limit {
	@SerializedName("timestamp_ms")
	@Nullable
	public String timestampMs;
	public String getTimestampMs() { return timestampMs; }
	public void setTimestampMs(String timestampMs){ this.timestampMs = timestampMs; }
	@Nullable
	public Integer track;
	public Integer getTrack() { return track; }
	public void setTrack(Integer track){ this.track = track; }
	}
	public static class Scopes {
	@Nullable
	public Boolean followers;
	public Boolean getFollowers() { return followers; }
	public void setFollowers(Boolean followers){ this.followers = followers; }
	}
	public static class Geo {
	@Nullable
	public String type;
	public String getType() { return type; }
	public void setType(String type){ this.type = type; }
	@Nullable
	public List<Double> coordinates;
	public List<Double> getCoordinates() { return coordinates; }
	public void setCoordinates(List<Double> coordinates){ this.coordinates = coordinates; }
	}
}
