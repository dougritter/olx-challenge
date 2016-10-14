
package com.ritterdouglas.olxchallenge.networking.ads_search.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

public class Ad implements Parcelable {

    @SerializedName("accurate_location")
    private Long mAccurateLocation;
    @SerializedName("age")
    private Long mAge;
    @SerializedName("business")
    private Long mBusiness;
    @SerializedName("campaignSource")
    private Object mCampaignSource;
    @SerializedName("category_id")
    private Long mCategoryId;
    @SerializedName("chat_options")
    private Long mChatOptions;
    @SerializedName("city_id")
    private String mCityId;
    @SerializedName("city_label")
    private String mCityLabel;
    @SerializedName("created")
    private String mCreated;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("featured")
    private List<Object> mFeatured;
    @SerializedName("has_email")
    private Long mHasEmail;
    @SerializedName("has_phone")
    private Long mHasPhone;
    @SerializedName("header")
    private String mHeader;
    @SerializedName("header_type")
    private String mHeaderType;
    @SerializedName("hide_user_ads_button")
    private Long mHideUserAdsButton;
    @SerializedName("highlighted")
    private Long mHighlighted;
    @SerializedName("id")
    private String mId;
    @SerializedName("is_price_negotiable")
    private Long mIsPriceNegotiable;
    @SerializedName("list_label")
    private String mListLabel;
    @SerializedName("list_label_ad")
    private String mListLabelAd;
    @SerializedName("map_lat")
    private String mMapLat;
    @SerializedName("map_location")
    private String mMapLocation;
    @SerializedName("map_lon")
    private String mMapLon;
    @SerializedName("map_radius")
    private Long mMapRadius;
    @SerializedName("map_show_detailed")
    private Boolean mMapShowDetailed;
    @SerializedName("map_zoom")
    private String mMapZoom;
    @SerializedName("numeric_user_id")
    private String mNumericUserId;
    @SerializedName("params")
    private List<Object> mParams;
    @SerializedName("person")
    private String mPerson;
    @SerializedName("photos")
    private Photos mPhotos;
    @SerializedName("preview_url")
    private String mPreviewUrl;
    @SerializedName("price_numeric")
    private String mPriceNumeric;
    @SerializedName("price_type")
    private String mPriceType;
    @SerializedName("promotion_section")
    private Long mPromotionSection;
    @SerializedName("region_id")
    private String mRegionId;
    @SerializedName("status")
    private String mStatus;
    @SerializedName("subtitle")
    private List<Object> mSubtitle;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("topAd")
    private Long mTopAd;
    @SerializedName("urgent")
    private Long mUrgent;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("user_ads_id")
    private String mUserAdsId;
    @SerializedName("user_ads_url")
    private String mUserAdsUrl;
    @SerializedName("user_business_logo")
    private String mUserBusinessLogo;
    @SerializedName("user_id")
    private String mUserId;
    @SerializedName("user_label")
    private String mUserLabel;

    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getAccurateLocation() {
        return mAccurateLocation;
    }

    public void setAccurateLocation(Long accurate_location) {
        mAccurateLocation = accurate_location;
    }

    public Long getAge() {
        return mAge;
    }

    public void setAge(Long age) {
        mAge = age;
    }

    public Long getBusiness() {
        return mBusiness;
    }

    public void setBusiness(Long business) {
        mBusiness = business;
    }

    public Object getCampaignSource() {
        return mCampaignSource;
    }

    public void setCampaignSource(Object campaignSource) {
        mCampaignSource = campaignSource;
    }

    public Long getCategoryId() {
        return mCategoryId;
    }

    public void setCategoryId(Long category_id) {
        mCategoryId = category_id;
    }

    public Long getChatOptions() {
        return mChatOptions;
    }

    public void setChatOptions(Long chat_options) {
        mChatOptions = chat_options;
    }

    public String getCityId() {
        return mCityId;
    }

    public void setCityId(String city_id) {
        mCityId = city_id;
    }

    public String getCityLabel() {
        return mCityLabel;
    }

    public void setCityLabel(String city_label) {
        mCityLabel = city_label;
    }

    public String getCreated() {
        return mCreated;
    }

    public void setCreated(String created) {
        mCreated = created;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public List<Object> getFeatured() {
        return mFeatured;
    }

    public void setFeatured(List<Object> featured) {
        mFeatured = featured;
    }

    public Long getHasEmail() {
        return mHasEmail;
    }

    public void setHasEmail(Long has_email) {
        mHasEmail = has_email;
    }

    public Long getHasPhone() {
        return mHasPhone;
    }

    public void setHasPhone(Long has_phone) {
        mHasPhone = has_phone;
    }

    public String getHeader() {
        return mHeader;
    }

    public void setHeader(String header) {
        mHeader = header;
    }

    public String getHeaderType() {
        return mHeaderType;
    }

    public void setHeaderType(String header_type) {
        mHeaderType = header_type;
    }

    public Long getHideUserAdsButton() {
        return mHideUserAdsButton;
    }

    public void setHideUserAdsButton(Long hide_user_ads_button) {
        mHideUserAdsButton = hide_user_ads_button;
    }

    public Long getHighlighted() {
        return mHighlighted;
    }

    public void setHighlighted(Long highlighted) {
        mHighlighted = highlighted;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public Long getIsPriceNegotiable() {
        return mIsPriceNegotiable;
    }

    public void setIsPriceNegotiable(Long is_price_negotiable) {
        mIsPriceNegotiable = is_price_negotiable;
    }

    public String getListLabel() {
        return mListLabel;
    }

    public void setListLabel(String list_label) {
        mListLabel = list_label;
    }

    public String getListLabelAd() {
        return mListLabelAd;
    }

    public void setListLabelAd(String list_label_ad) {
        mListLabelAd = list_label_ad;
    }

    public double getMapLat() {
        double returnValue = 0d;

        try {
            returnValue = Double.parseDouble(mMapLat);
        } catch (NumberFormatException e) {
            Log.e(Ad.class.getSimpleName(), e.getMessage());
        }

        return returnValue;
    }

    public void setMapLat(String map_lat) {
        mMapLat = map_lat;
    }

    public String getMapLocation() {
        return mMapLocation;
    }

    public void setMapLocation(String map_location) {
        mMapLocation = map_location;
    }

    public double getMapLon() {
        double returnValue = 0d;

        try {
            returnValue = Double.parseDouble(mMapLon);
        } catch (NumberFormatException e) {
            Log.e(Ad.class.getSimpleName(), e.getMessage());
        }

        return returnValue;
    }

    public void setMapLon(String map_lon) {
        mMapLon = map_lon;
    }

    public Long getMapRadius() {
        return mMapRadius;
    }

    public void setMapRadius(Long map_radius) {
        mMapRadius = map_radius;
    }

    public Boolean getMapShowDetailed() {
        return mMapShowDetailed;
    }

    public void setMapShowDetailed(Boolean map_show_detailed) {
        mMapShowDetailed = map_show_detailed;
    }

    public String getMapZoom() {
        return mMapZoom;
    }

    public void setMapZoom(String map_zoom) {
        mMapZoom = map_zoom;
    }

    public String getNumericUserId() {
        return mNumericUserId;
    }

    public void setNumericUserId(String numeric_user_id) {
        mNumericUserId = numeric_user_id;
    }

    public List<Object> getParams() {
        return mParams;
    }

    public void setParams(List<Object> params) {
        mParams = params;
    }

    public String getPerson() {
        return mPerson;
    }

    public void setPerson(String person) {
        mPerson = person;
    }

    public Photos getPhotos() {
        return mPhotos;
    }

    public void setPhotos(Photos photos) {
        mPhotos = photos;
    }

    public String getPreviewUrl() {
        return mPreviewUrl;
    }

    public void setPreviewUrl(String preview_url) {
        mPreviewUrl = preview_url;
    }

    public String getPriceNumeric() {
        return mPriceNumeric;
    }

    public void setPriceNumeric(String price_numeric) {
        mPriceNumeric = price_numeric;
    }

    public String getPriceType() {
        return mPriceType;
    }

    public void setPriceType(String price_type) {
        mPriceType = price_type;
    }

    public Long getPromotionSection() {
        return mPromotionSection;
    }

    public void setPromotionSection(Long promotion_section) {
        mPromotionSection = promotion_section;
    }

    public String getRegionId() {
        return mRegionId;
    }

    public void setRegionId(String region_id) {
        mRegionId = region_id;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

    public List<Object> getSubtitle() {
        return mSubtitle;
    }

    public void setSubtitle(List<Object> subtitle) {
        mSubtitle = subtitle;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Long getTopAd() {
        return mTopAd;
    }

    public void setTopAd(Long topAd) {
        mTopAd = topAd;
    }

    public Long getUrgent() {
        return mUrgent;
    }

    public void setUrgent(Long urgent) {
        mUrgent = urgent;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getUserAdsId() {
        return mUserAdsId;
    }

    public void setUserAdsId(String user_ads_id) {
        mUserAdsId = user_ads_id;
    }

    public String getUserAdsUrl() {
        return mUserAdsUrl;
    }

    public void setUserAdsUrl(String user_ads_url) {
        mUserAdsUrl = user_ads_url;
    }

    public String getUserBusinessLogo() {
        return mUserBusinessLogo;
    }

    public void setUserBusinessLogo(String user_business_logo) {
        mUserBusinessLogo = user_business_logo;
    }

    public String getUserId() {
        return mUserId;
    }

    public void setUserId(String user_id) {
        mUserId = user_id;
    }

    public String getUserLabel() {
        return mUserLabel;
    }

    public void setUserLabel(String user_label) {
        mUserLabel = user_label;
    }

    public Ad() {}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.mAccurateLocation);
        dest.writeValue(this.mAge);
        dest.writeValue(this.mBusiness);
        dest.writeValue(this.mCategoryId);
        dest.writeValue(this.mChatOptions);
        dest.writeString(this.mCityId);
        dest.writeString(this.mCityLabel);
        dest.writeString(this.mCreated);
        dest.writeString(this.mDescription);
        dest.writeList(this.mFeatured);
        dest.writeValue(this.mHasEmail);
        dest.writeValue(this.mHasPhone);
        dest.writeString(this.mHeader);
        dest.writeString(this.mHeaderType);
        dest.writeValue(this.mHideUserAdsButton);
        dest.writeValue(this.mHighlighted);
        dest.writeString(this.mId);
        dest.writeValue(this.mIsPriceNegotiable);
        dest.writeString(this.mListLabel);
        dest.writeString(this.mListLabelAd);
        dest.writeString(this.mMapLat);
        dest.writeString(this.mMapLocation);
        dest.writeString(this.mMapLon);
        dest.writeValue(this.mMapRadius);
        dest.writeValue(this.mMapShowDetailed);
        dest.writeString(this.mMapZoom);
        dest.writeString(this.mNumericUserId);
        dest.writeList(this.mParams);
        dest.writeString(this.mPerson);
        dest.writeParcelable(this.mPhotos, flags);
        dest.writeString(this.mPreviewUrl);
        dest.writeString(this.mPriceNumeric);
        dest.writeString(this.mPriceType);
        dest.writeValue(this.mPromotionSection);
        dest.writeString(this.mRegionId);
        dest.writeString(this.mStatus);
        dest.writeList(this.mSubtitle);
        dest.writeString(this.mTitle);
        dest.writeValue(this.mTopAd);
        dest.writeValue(this.mUrgent);
        dest.writeString(this.mUrl);
        dest.writeString(this.mUserAdsId);
        dest.writeString(this.mUserAdsUrl);
        dest.writeString(this.mUserBusinessLogo);
        dest.writeString(this.mUserId);
        dest.writeString(this.mUserLabel);
        dest.writeString(this.imageUrl);
    }

    protected Ad(Parcel in) {
        this.mAccurateLocation = (Long) in.readValue(Long.class.getClassLoader());
        this.mAge = (Long) in.readValue(Long.class.getClassLoader());
        this.mBusiness = (Long) in.readValue(Long.class.getClassLoader());
        this.mCampaignSource = in.readParcelable(Object.class.getClassLoader());
        this.mCategoryId = (Long) in.readValue(Long.class.getClassLoader());
        this.mChatOptions = (Long) in.readValue(Long.class.getClassLoader());
        this.mCityId = in.readString();
        this.mCityLabel = in.readString();
        this.mCreated = in.readString();
        this.mDescription = in.readString();
        this.mFeatured = new ArrayList<Object>();
        in.readList(this.mFeatured, Object.class.getClassLoader());
        this.mHasEmail = (Long) in.readValue(Long.class.getClassLoader());
        this.mHasPhone = (Long) in.readValue(Long.class.getClassLoader());
        this.mHeader = in.readString();
        this.mHeaderType = in.readString();
        this.mHideUserAdsButton = (Long) in.readValue(Long.class.getClassLoader());
        this.mHighlighted = (Long) in.readValue(Long.class.getClassLoader());
        this.mId = in.readString();
        this.mIsPriceNegotiable = (Long) in.readValue(Long.class.getClassLoader());
        this.mListLabel = in.readString();
        this.mListLabelAd = in.readString();
        this.mMapLat = in.readString();
        this.mMapLocation = in.readString();
        this.mMapLon = in.readString();
        this.mMapRadius = (Long) in.readValue(Long.class.getClassLoader());
        this.mMapShowDetailed = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.mMapZoom = in.readString();
        this.mNumericUserId = in.readString();
        this.mParams = new ArrayList<Object>();
        in.readList(this.mParams, Object.class.getClassLoader());
        this.mPerson = in.readString();
        this.mPhotos = in.readParcelable(Photos.class.getClassLoader());
        this.mPreviewUrl = in.readString();
        this.mPriceNumeric = in.readString();
        this.mPriceType = in.readString();
        this.mPromotionSection = (Long) in.readValue(Long.class.getClassLoader());
        this.mRegionId = in.readString();
        this.mStatus = in.readString();
        this.mSubtitle = new ArrayList<Object>();
        in.readList(this.mSubtitle, Object.class.getClassLoader());
        this.mTitle = in.readString();
        this.mTopAd = (Long) in.readValue(Long.class.getClassLoader());
        this.mUrgent = (Long) in.readValue(Long.class.getClassLoader());
        this.mUrl = in.readString();
        this.mUserAdsId = in.readString();
        this.mUserAdsUrl = in.readString();
        this.mUserBusinessLogo = in.readString();
        this.mUserId = in.readString();
        this.mUserLabel = in.readString();
        this.imageUrl = in.readString();
    }

    public static final Creator<Ad> CREATOR = new Creator<Ad>() {
        @Override
        public Ad createFromParcel(Parcel source) {
            return new Ad(source);
        }

        @Override
        public Ad[] newArray(int size) {
            return new Ad[size];
        }
    };
}
