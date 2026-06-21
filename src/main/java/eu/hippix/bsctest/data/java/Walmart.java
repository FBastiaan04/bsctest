package eu.hippix.bsctest.data.java;

import java.util.List;
import java.lang.Integer;
import java.lang.Double;
import com.google.gson.annotations.SerializedName;
import org.apache.fory.annotation.Nullable;

public class Walmart {
	@Nullable
	public Double standardShipRate;
	public Double getStandardShipRate() { return standardShipRate; }
	public void setStandardShipRate(Double standardShipRate){ this.standardShipRate = standardShipRate; }
	@Nullable
	public String categoryPath;
	public String getCategoryPath() { return categoryPath; }
	public void setCategoryPath(String categoryPath){ this.categoryPath = categoryPath; }
	@Nullable
	public String gender;
	public String getGender() { return gender; }
	public void setGender(String gender){ this.gender = gender; }
	@Nullable
	public Boolean rollBack;
	public Boolean getRollBack() { return rollBack; }
	public void setRollBack(Boolean rollBack){ this.rollBack = rollBack; }
	@Nullable
	public String color;
	public String getColor() { return color; }
	public void setColor(String color){ this.color = color; }
	@Nullable
	public Boolean availableOnline;
	public Boolean getAvailableOnline() { return availableOnline; }
	public void setAvailableOnline(Boolean availableOnline){ this.availableOnline = availableOnline; }
	@Nullable
	public String upc;
	public String getUpc() { return upc; }
	public void setUpc(String upc){ this.upc = upc; }
	@Nullable
	public BestMarketplacePrice bestMarketplacePrice;
	public BestMarketplacePrice getBestMarketplacePrice() { return bestMarketplacePrice; }
	public void setBestMarketplacePrice(BestMarketplacePrice bestMarketplacePrice){ this.bestMarketplacePrice = bestMarketplacePrice; }
	@Nullable
	public String name;
	public String getName() { return name; }
	public void setName(String name){ this.name = name; }
	@Nullable
	public String categoryNode;
	public String getCategoryNode() { return categoryNode; }
	public void setCategoryNode(String categoryNode){ this.categoryNode = categoryNode; }
	@Nullable
	public Attributes attributes;
	public Attributes getAttributes() { return attributes; }
	public void setAttributes(Attributes attributes){ this.attributes = attributes; }
	@Nullable
	public String addToCartUrl;
	public String getAddToCartUrl() { return addToCartUrl; }
	public void setAddToCartUrl(String addToCartUrl){ this.addToCartUrl = addToCartUrl; }
	@Nullable
	public String thumbnailImage;
	public String getThumbnailImage() { return thumbnailImage; }
	public void setThumbnailImage(String thumbnailImage){ this.thumbnailImage = thumbnailImage; }
	@Nullable
	public List<Integer> variants;
	public List<Integer> getVariants() { return variants; }
	public void setVariants(List<Integer> variants){ this.variants = variants; }
	@Nullable
	public String largeImage;
	public String getLargeImage() { return largeImage; }
	public void setLargeImage(String largeImage){ this.largeImage = largeImage; }
	@Nullable
	public Boolean ninetySevenCentShipping;
	public Boolean getNinetySevenCentShipping() { return ninetySevenCentShipping; }
	public void setNinetySevenCentShipping(Boolean ninetySevenCentShipping){ this.ninetySevenCentShipping = ninetySevenCentShipping; }
	@Nullable
	public String productTrackingUrl;
	public String getProductTrackingUrl() { return productTrackingUrl; }
	public void setProductTrackingUrl(String productTrackingUrl){ this.productTrackingUrl = productTrackingUrl; }
	@Nullable
	public Double overnightShippingRate;
	public Double getOvernightShippingRate() { return overnightShippingRate; }
	public void setOvernightShippingRate(Double overnightShippingRate){ this.overnightShippingRate = overnightShippingRate; }
	@Nullable
	public String brandName;
	public String getBrandName() { return brandName; }
	public void setBrandName(String brandName){ this.brandName = brandName; }
	@Nullable
	public Double msrp;
	public Double getMsrp() { return msrp; }
	public void setMsrp(Double msrp){ this.msrp = msrp; }
	@Nullable
	public Integer parentItemId;
	public Integer getParentItemId() { return parentItemId; }
	public void setParentItemId(Integer parentItemId){ this.parentItemId = parentItemId; }
	@Nullable
	public Boolean freeShipToStore;
	public Boolean getFreeShipToStore() { return freeShipToStore; }
	public void setFreeShipToStore(Boolean freeShipToStore){ this.freeShipToStore = freeShipToStore; }
	@Nullable
	public String mediumImage;
	public String getMediumImage() { return mediumImage; }
	public void setMediumImage(String mediumImage){ this.mediumImage = mediumImage; }
	@Nullable
	public Boolean clearance;
	public Boolean getClearance() { return clearance; }
	public void setClearance(Boolean clearance){ this.clearance = clearance; }
	@Nullable
	public String sellerInfo;
	public String getSellerInfo() { return sellerInfo; }
	public void setSellerInfo(String sellerInfo){ this.sellerInfo = sellerInfo; }
	@Nullable
	public Boolean freeShippingOver50Dollars;
	public Boolean getFreeShippingOver50Dollars() { return freeShippingOver50Dollars; }
	public void setFreeShippingOver50Dollars(Boolean freeShippingOver50Dollars){ this.freeShippingOver50Dollars = freeShippingOver50Dollars; }
	@Nullable
	public Double salePrice;
	public Double getSalePrice() { return salePrice; }
	public void setSalePrice(Double salePrice){ this.salePrice = salePrice; }
	@Nullable
	public String longDescription;
	public String getLongDescription() { return longDescription; }
	public void setLongDescription(String longDescription){ this.longDescription = longDescription; }
	@Nullable
	public String shortDescription;
	public String getShortDescription() { return shortDescription; }
	public void setShortDescription(String shortDescription){ this.shortDescription = shortDescription; }
	@Nullable
	public Double twoThreeDayShippingRate;
	public Double getTwoThreeDayShippingRate() { return twoThreeDayShippingRate; }
	public void setTwoThreeDayShippingRate(Double twoThreeDayShippingRate){ this.twoThreeDayShippingRate = twoThreeDayShippingRate; }
	@Nullable
	public Integer maxItemsInOrder;
	public Integer getMaxItemsInOrder() { return maxItemsInOrder; }
	public void setMaxItemsInOrder(Integer maxItemsInOrder){ this.maxItemsInOrder = maxItemsInOrder; }
	@Nullable
	public String modelNumber;
	public String getModelNumber() { return modelNumber; }
	public void setModelNumber(String modelNumber){ this.modelNumber = modelNumber; }
	@Nullable
	public Boolean marketplace;
	public Boolean getMarketplace() { return marketplace; }
	public void setMarketplace(Boolean marketplace){ this.marketplace = marketplace; }
	@Nullable
	public Boolean specialBuy;
	public Boolean getSpecialBuy() { return specialBuy; }
	public void setSpecialBuy(Boolean specialBuy){ this.specialBuy = specialBuy; }
	@Nullable
	public Integer itemId;
	public Integer getItemId() { return itemId; }
	public void setItemId(Integer itemId){ this.itemId = itemId; }
	@Nullable
	public String size;
	public String getSize() { return size; }
	public void setSize(String size){ this.size = size; }
	@Nullable
	public String productUrl;
	public String getProductUrl() { return productUrl; }
	public void setProductUrl(String productUrl){ this.productUrl = productUrl; }
	@Nullable
	public String stock;
	public String getStock() { return stock; }
	public void setStock(String stock){ this.stock = stock; }
	@Nullable
	public Boolean bundle;
	public Boolean getBundle() { return bundle; }
	public void setBundle(Boolean bundle){ this.bundle = bundle; }
	@Nullable
	public String customerRatingImage;
	public String getCustomerRatingImage() { return customerRatingImage; }
	public void setCustomerRatingImage(String customerRatingImage){ this.customerRatingImage = customerRatingImage; }
	@Nullable
	public String affiliateAddToCartUrl;
	public String getAffiliateAddToCartUrl() { return affiliateAddToCartUrl; }
	public void setAffiliateAddToCartUrl(String affiliateAddToCartUrl){ this.affiliateAddToCartUrl = affiliateAddToCartUrl; }
	@Nullable
	public Integer numReviews;
	public Integer getNumReviews() { return numReviews; }
	public void setNumReviews(Integer numReviews){ this.numReviews = numReviews; }
	@Nullable
	public String customerRating;
	public String getCustomerRating() { return customerRating; }
	public void setCustomerRating(String customerRating){ this.customerRating = customerRating; }
	@Nullable
	public String age;
	public String getAge() { return age; }
	public void setAge(String age){ this.age = age; }
	@Nullable
	public Boolean shipToStore;
	public Boolean getShipToStore() { return shipToStore; }
	public void setShipToStore(Boolean shipToStore){ this.shipToStore = shipToStore; }
	@Nullable
	public Boolean freight;
	public Boolean getFreight() { return freight; }
	public void setFreight(Boolean freight){ this.freight = freight; }
	@Nullable
	public Boolean preOrder;
	public Boolean getPreOrder() { return preOrder; }
	public void setPreOrder(Boolean preOrder){ this.preOrder = preOrder; }
	@Nullable
	public String isbn;
	public String getIsbn() { return isbn; }
	public void setIsbn(String isbn){ this.isbn = isbn; }
	public static class BestMarketplacePrice {
	@Nullable
	public Double twoThreeDayShippingRate;
	public Double getTwoThreeDayShippingRate() { return twoThreeDayShippingRate; }
	public void setTwoThreeDayShippingRate(Double twoThreeDayShippingRate){ this.twoThreeDayShippingRate = twoThreeDayShippingRate; }
	@Nullable
	public Boolean availableOnline;
	public Boolean getAvailableOnline() { return availableOnline; }
	public void setAvailableOnline(Boolean availableOnline){ this.availableOnline = availableOnline; }
	@Nullable
	public Double standardShipRate;
	public Double getStandardShipRate() { return standardShipRate; }
	public void setStandardShipRate(Double standardShipRate){ this.standardShipRate = standardShipRate; }
	@Nullable
	public Boolean clearance;
	public Boolean getClearance() { return clearance; }
	public void setClearance(Boolean clearance){ this.clearance = clearance; }
	@Nullable
	public Double price;
	public Double getPrice() { return price; }
	public void setPrice(Double price){ this.price = price; }
	@Nullable
	public String sellerInfo;
	public String getSellerInfo() { return sellerInfo; }
	public void setSellerInfo(String sellerInfo){ this.sellerInfo = sellerInfo; }
	}
	public static class Attributes {
	@Nullable
	public String vehicleType;
	public String getVehicleType() { return vehicleType; }
	public void setVehicleType(String vehicleType){ this.vehicleType = vehicleType; }
	@Nullable
	public String brightness;
	public String getBrightness() { return brightness; }
	public void setBrightness(String brightness){ this.brightness = brightness; }
	@Nullable
	public String lightBulbType;
	public String getLightBulbType() { return lightBulbType; }
	public void setLightBulbType(String lightBulbType){ this.lightBulbType = lightBulbType; }
	@Nullable
	public String shape;
	public String getShape() { return shape; }
	public void setShape(String shape){ this.shape = shape; }
	@Nullable
	public String gender;
	public String getGender() { return gender; }
	public void setGender(String gender){ this.gender = gender; }
	@Nullable
	public String rackDepth;
	public String getRackDepth() { return rackDepth; }
	public void setRackDepth(String rackDepth){ this.rackDepth = rackDepth; }
	@Nullable
	public String depth;
	public String getDepth() { return depth; }
	public void setDepth(String depth){ this.depth = depth; }
	@Nullable
	public String volts;
	public String getVolts() { return volts; }
	public void setVolts(String volts){ this.volts = volts; }
	@Nullable
	public String bins;
	public String getBins() { return bins; }
	public void setBins(String bins){ this.bins = bins; }
	@Nullable
	public String inkColor;
	public String getInkColor() { return inkColor; }
	public void setInkColor(String inkColor){ this.inkColor = inkColor; }
	@Nullable
	public String outletPosition;
	public String getOutletPosition() { return outletPosition; }
	public void setOutletPosition(String outletPosition){ this.outletPosition = outletPosition; }
	@Nullable
	public String numberOfDriveBays;
	public String getNumberOfDriveBays() { return numberOfDriveBays; }
	public void setNumberOfDriveBays(String numberOfDriveBays){ this.numberOfDriveBays = numberOfDriveBays; }
	@Nullable
	public String college;
	public String getCollege() { return college; }
	public void setCollege(String college){ this.college = college; }
	@Nullable
	public String cableLength;
	public String getCableLength() { return cableLength; }
	public void setCableLength(String cableLength){ this.cableLength = cableLength; }
	@Nullable
	public String baseFinish;
	public String getBaseFinish() { return baseFinish; }
	public void setBaseFinish(String baseFinish){ this.baseFinish = baseFinish; }
	@Nullable
	public String seatMaterial;
	public String getSeatMaterial() { return seatMaterial; }
	public void setSeatMaterial(String seatMaterial){ this.seatMaterial = seatMaterial; }
	@Nullable
	public String tableTop;
	public String getTableTop() { return tableTop; }
	public void setTableTop(String tableTop){ this.tableTop = tableTop; }
	@Nullable
	public String studSize;
	public String getStudSize() { return studSize; }
	public void setStudSize(String studSize){ this.studSize = studSize; }
	@Nullable
	public String sideFinish;
	public String getSideFinish() { return sideFinish; }
	public void setSideFinish(String sideFinish){ this.sideFinish = sideFinish; }
	@Nullable
	public String trimColor;
	public String getTrimColor() { return trimColor; }
	public void setTrimColor(String trimColor){ this.trimColor = trimColor; }
	@Nullable
	public String itemsIncluded;
	public String getItemsIncluded() { return itemsIncluded; }
	public void setItemsIncluded(String itemsIncluded){ this.itemsIncluded = itemsIncluded; }
	@Nullable
	public String optionalSeatbelt;
	public String getOptionalSeatbelt() { return optionalSeatbelt; }
	public void setOptionalSeatbelt(String optionalSeatbelt){ this.optionalSeatbelt = optionalSeatbelt; }
	@Nullable
	public String legColor;
	public String getLegColor() { return legColor; }
	public void setLegColor(String legColor){ this.legColor = legColor; }
	@Nullable
	public String frontAndBackPanel;
	public String getFrontAndBackPanel() { return frontAndBackPanel; }
	public void setFrontAndBackPanel(String frontAndBackPanel){ this.frontAndBackPanel = frontAndBackPanel; }
	@Nullable
	public String doorType;
	public String getDoorType() { return doorType; }
	public void setDoorType(String doorType){ this.doorType = doorType; }
	@Nullable
	public String dimensionsWXDXH;
	public String getDimensionsWXDXH() { return dimensionsWXDXH; }
	public void setDimensionsWXDXH(String dimensionsWXDXH){ this.dimensionsWXDXH = dimensionsWXDXH; }
	@Nullable
	public String character;
	public String getCharacter() { return character; }
	public void setCharacter(String character){ this.character = character; }
	@Nullable
	public String components;
	public String getComponents() { return components; }
	public void setComponents(String components){ this.components = components; }
	@Nullable
	public String aspectRatio;
	public String getAspectRatio() { return aspectRatio; }
	public void setAspectRatio(String aspectRatio){ this.aspectRatio = aspectRatio; }
	@Nullable
	public String offsetDistance;
	public String getOffsetDistance() { return offsetDistance; }
	public void setOffsetDistance(String offsetDistance){ this.offsetDistance = offsetDistance; }
	@Nullable
	public String team;
	public String getTeam() { return team; }
	public void setTeam(String team){ this.team = team; }
	@Nullable
	public String profile;
	public String getProfile() { return profile; }
	public void setProfile(String profile){ this.profile = profile; }
	@Nullable
	public String legs;
	public String getLegs() { return legs; }
	public void setLegs(String legs){ this.legs = legs; }
	@Nullable
	public String storageAccessories;
	public String getStorageAccessories() { return storageAccessories; }
	public void setStorageAccessories(String storageAccessories){ this.storageAccessories = storageAccessories; }
	@Nullable
	public String rearDoor;
	public String getRearDoor() { return rearDoor; }
	public void setRearDoor(String rearDoor){ this.rearDoor = rearDoor; }
	@Nullable
	public String trim;
	public String getTrim() { return trim; }
	public void setTrim(String trim){ this.trim = trim; }
	@Nullable
	public String dimensions;
	public String getDimensions() { return dimensions; }
	public void setDimensions(String dimensions){ this.dimensions = dimensions; }
	@Nullable
	public String customInterface;
	public String getCustomInterface() { return customInterface; }
	public void setCustomInterface(String customInterface){ this.customInterface = customInterface; }
	@Nullable
	public String binDimensions;
	public String getBinDimensions() { return binDimensions; }
	public void setBinDimensions(String binDimensions){ this.binDimensions = binDimensions; }
	@Nullable
	public String numberOfSpeakers;
	public String getNumberOfSpeakers() { return numberOfSpeakers; }
	public void setNumberOfSpeakers(String numberOfSpeakers){ this.numberOfSpeakers = numberOfSpeakers; }
	@Nullable
	public String amps;
	public String getAmps() { return amps; }
	public void setAmps(String amps){ this.amps = amps; }
	@Nullable
	public String orentation;
	public String getOrentation() { return orentation; }
	public void setOrentation(String orentation){ this.orentation = orentation; }
	@Nullable
	public String gauge;
	public String getGauge() { return gauge; }
	public void setGauge(String gauge){ this.gauge = gauge; }
	@Nullable
	public String seatBackColor;
	public String getSeatBackColor() { return seatBackColor; }
	public void setSeatBackColor(String seatBackColor){ this.seatBackColor = seatBackColor; }
	@Nullable
	public String assemblyRequired;
	public String getAssemblyRequired() { return assemblyRequired; }
	public void setAssemblyRequired(String assemblyRequired){ this.assemblyRequired = assemblyRequired; }
	@Nullable
	public String panSize;
	public String getPanSize() { return panSize; }
	public void setPanSize(String panSize){ this.panSize = panSize; }
	@Nullable
	public String numberOfPads;
	public String getNumberOfPads() { return numberOfPads; }
	public void setNumberOfPads(String numberOfPads){ this.numberOfPads = numberOfPads; }
	@Nullable
	public String panelColor;
	public String getPanelColor() { return panelColor; }
	public void setPanelColor(String panelColor){ this.panelColor = panelColor; }
	@Nullable
	public String lampChanger;
	public String getLampChanger() { return lampChanger; }
	public void setLampChanger(String lampChanger){ this.lampChanger = lampChanger; }
	@Nullable
	public String backing;
	public String getBacking() { return backing; }
	public void setBacking(String backing){ this.backing = backing; }
	@Nullable
	public String rightBookendColor;
	public String getRightBookendColor() { return rightBookendColor; }
	public void setRightBookendColor(String rightBookendColor){ this.rightBookendColor = rightBookendColor; }
	@Nullable
	public String opening;
	public String getOpening() { return opening; }
	public void setOpening(String opening){ this.opening = opening; }
	@Nullable
	public String transmitterIncluded;
	public String getTransmitterIncluded() { return transmitterIncluded; }
	public void setTransmitterIncluded(String transmitterIncluded){ this.transmitterIncluded = transmitterIncluded; }
	@Nullable
	public String seatFrameColor;
	public String getSeatFrameColor() { return seatFrameColor; }
	public void setSeatFrameColor(String seatFrameColor){ this.seatFrameColor = seatFrameColor; }
	@Nullable
	public String mapRail;
	public String getMapRail() { return mapRail; }
	public void setMapRail(String mapRail){ this.mapRail = mapRail; }
	@Nullable
	public String orientation;
	public String getOrientation() { return orientation; }
	public void setOrientation(String orientation){ this.orientation = orientation; }
	@Nullable
	public String amount;
	public String getAmount() { return amount; }
	public void setAmount(String amount){ this.amount = amount; }
	@Nullable
	public String baseColor;
	public String getBaseColor() { return baseColor; }
	public void setBaseColor(String baseColor){ this.baseColor = baseColor; }
	@Nullable
	public String arms;
	public String getArms() { return arms; }
	public void setArms(String arms){ this.arms = arms; }
	@Nullable
	public String poleHeight;
	public String getPoleHeight() { return poleHeight; }
	public void setPoleHeight(String poleHeight){ this.poleHeight = poleHeight; }
	@Nullable
	public String casterType;
	public String getCasterType() { return casterType; }
	public void setCasterType(String casterType){ this.casterType = casterType; }
	@Nullable
	public String cushioned;
	public String getCushioned() { return cushioned; }
	public void setCushioned(String cushioned){ this.cushioned = cushioned; }
	@Nullable
	public String sideColor;
	public String getSideColor() { return sideColor; }
	public void setSideColor(String sideColor){ this.sideColor = sideColor; }
	@Nullable
	public String resistanceRange;
	public String getResistanceRange() { return resistanceRange; }
	public void setResistanceRange(String resistanceRange){ this.resistanceRange = resistanceRange; }
	@Nullable
	public String carrel;
	public String getCarrel() { return carrel; }
	public void setCarrel(String carrel){ this.carrel = carrel; }
	@Nullable
	public String earPadMaterial;
	public String getEarPadMaterial() { return earPadMaterial; }
	public void setEarPadMaterial(String earPadMaterial){ this.earPadMaterial = earPadMaterial; }
	@Nullable
	public String assembly;
	public String getAssembly() { return assembly; }
	public void setAssembly(String assembly){ this.assembly = assembly; }
	@Nullable
	public String laminate;
	public String getLaminate() { return laminate; }
	public void setLaminate(String laminate){ this.laminate = laminate; }
	@Nullable
	public String viewingArea;
	public String getViewingArea() { return viewingArea; }
	public void setViewingArea(String viewingArea){ this.viewingArea = viewingArea; }
	@Nullable
	public String shipping;
	public String getShipping() { return shipping; }
	public void setShipping(String shipping){ this.shipping = shipping; }
	@Nullable
	public String color;
	public String getColor() { return color; }
	public void setColor(String color){ this.color = color; }
	@Nullable
	public String packageQuantity;
	public String getPackageQuantity() { return packageQuantity; }
	public void setPackageQuantity(String packageQuantity){ this.packageQuantity = packageQuantity; }
	@Nullable
	public String length;
	public String getLength() { return length; }
	public void setLength(String length){ this.length = length; }
	@Nullable
	public String tabNumber;
	public String getTabNumber() { return tabNumber; }
	public void setTabNumber(String tabNumber){ this.tabNumber = tabNumber; }
	@Nullable
	public String sportsTeam;
	public String getSportsTeam() { return sportsTeam; }
	public void setSportsTeam(String sportsTeam){ this.sportsTeam = sportsTeam; }
	@Nullable
	public String seatFinish;
	public String getSeatFinish() { return seatFinish; }
	public void setSeatFinish(String seatFinish){ this.seatFinish = seatFinish; }
	@Nullable
	public String base;
	public String getBase() { return base; }
	public void setBase(String base){ this.base = base; }
	@Nullable
	public String lightBulbColor;
	public String getLightBulbColor() { return lightBulbColor; }
	public void setLightBulbColor(String lightBulbColor){ this.lightBulbColor = lightBulbColor; }
	@Nullable
	public String lengthType;
	public String getLengthType() { return lengthType; }
	public void setLengthType(String lengthType){ this.lengthType = lengthType; }
	@Nullable
	public String sportsLeague;
	public String getSportsLeague() { return sportsLeague; }
	public void setSportsLeague(String sportsLeague){ this.sportsLeague = sportsLeague; }
	@Nullable
	public String absorbency;
	public String getAbsorbency() { return absorbency; }
	public void setAbsorbency(String absorbency){ this.absorbency = absorbency; }
	@Nullable
	public String rackSize;
	public String getRackSize() { return rackSize; }
	public void setRackSize(String rackSize){ this.rackSize = rackSize; }
	@Nullable
	public String standColor;
	public String getStandColor() { return standColor; }
	public void setStandColor(String standColor){ this.standColor = standColor; }
	@Nullable
	public String wirelessMicOption;
	public String getWirelessMicOption() { return wirelessMicOption; }
	public void setWirelessMicOption(String wirelessMicOption){ this.wirelessMicOption = wirelessMicOption; }
	@Nullable
	public String microphoneIncluded;
	public String getMicrophoneIncluded() { return microphoneIncluded; }
	public void setMicrophoneIncluded(String microphoneIncluded){ this.microphoneIncluded = microphoneIncluded; }
	@Nullable
	public String castersGlides;
	public String getCastersGlides() { return castersGlides; }
	public void setCastersGlides(String castersGlides){ this.castersGlides = castersGlides; }
	@Nullable
	public String electricCapability;
	public String getElectricCapability() { return electricCapability; }
	public void setElectricCapability(String electricCapability){ this.electricCapability = electricCapability; }
	@Nullable
	public String height;
	public String getHeight() { return height; }
	public void setHeight(String height){ this.height = height; }
	@Nullable
	public String dropAdjustmentLength;
	public String getDropAdjustmentLength() { return dropAdjustmentLength; }
	public void setDropAdjustmentLength(String dropAdjustmentLength){ this.dropAdjustmentLength = dropAdjustmentLength; }
	@Nullable
	public String numberOfLights;
	public String getNumberOfLights() { return numberOfLights; }
	public void setNumberOfLights(String numberOfLights){ this.numberOfLights = numberOfLights; }
	@Nullable
	public String tableSize;
	public String getTableSize() { return tableSize; }
	public void setTableSize(String tableSize){ this.tableSize = tableSize; }
	@Nullable
	public String woodenFrameFinish;
	public String getWoodenFrameFinish() { return woodenFrameFinish; }
	public void setWoodenFrameFinish(String woodenFrameFinish){ this.woodenFrameFinish = woodenFrameFinish; }
	@Nullable
	public String clothingSize;
	public String getClothingSize() { return clothingSize; }
	public void setClothingSize(String clothingSize){ this.clothingSize = clothingSize; }
	@Nullable
	public String paintAndLaminateFinish;
	public String getPaintAndLaminateFinish() { return paintAndLaminateFinish; }
	public void setPaintAndLaminateFinish(String paintAndLaminateFinish){ this.paintAndLaminateFinish = paintAndLaminateFinish; }
	@Nullable
	public String shelfSpan;
	public String getShelfSpan() { return shelfSpan; }
	public void setShelfSpan(String shelfSpan){ this.shelfSpan = shelfSpan; }
	@Nullable
	public String accentColor;
	public String getAccentColor() { return accentColor; }
	public void setAccentColor(String accentColor){ this.accentColor = accentColor; }
	@Nullable
	public String screenSize;
	public String getScreenSize() { return screenSize; }
	public void setScreenSize(String screenSize){ this.screenSize = screenSize; }
	@Nullable
	public String polesCaps;
	public String getPolesCaps() { return polesCaps; }
	public void setPolesCaps(String polesCaps){ this.polesCaps = polesCaps; }
	@Nullable
	public String numberOfMounts;
	public String getNumberOfMounts() { return numberOfMounts; }
	public void setNumberOfMounts(String numberOfMounts){ this.numberOfMounts = numberOfMounts; }
	@Nullable
	public String type;
	public String getType() { return type; }
	public void setType(String type){ this.type = type; }
	@Nullable
	public String ncaaTeam;
	public String getNcaaTeam() { return ncaaTeam; }
	public void setNcaaTeam(String ncaaTeam){ this.ncaaTeam = ncaaTeam; }
	@Nullable
	public String shelfFinish;
	public String getShelfFinish() { return shelfFinish; }
	public void setShelfFinish(String shelfFinish){ this.shelfFinish = shelfFinish; }
	@Nullable
	public String personalizable;
	public String getPersonalizable() { return personalizable; }
	public void setPersonalizable(String personalizable){ this.personalizable = personalizable; }
	@Nullable
	public String compatibleCaseSize;
	public String getCompatibleCaseSize() { return compatibleCaseSize; }
	public void setCompatibleCaseSize(String compatibleCaseSize){ this.compatibleCaseSize = compatibleCaseSize; }
	@Nullable
	public String finish;
	public String getFinish() { return finish; }
	public void setFinish(String finish){ this.finish = finish; }
	@Nullable
	public String topColor;
	public String getTopColor() { return topColor; }
	public void setTopColor(String topColor){ this.topColor = topColor; }
	@Nullable
	public String paintFinish;
	public String getPaintFinish() { return paintFinish; }
	public void setPaintFinish(String paintFinish){ this.paintFinish = paintFinish; }
	@Nullable
	public String shelfDepth;
	public String getShelfDepth() { return shelfDepth; }
	public void setShelfDepth(String shelfDepth){ this.shelfDepth = shelfDepth; }
	@Nullable
	public String compatibleTubeSize;
	public String getCompatibleTubeSize() { return compatibleTubeSize; }
	public void setCompatibleTubeSize(String compatibleTubeSize){ this.compatibleTubeSize = compatibleTubeSize; }
	@Nullable
	public String uvProtection;
	public String getUvProtection() { return uvProtection; }
	public void setUvProtection(String uvProtection){ this.uvProtection = uvProtection; }
	@Nullable
	public String furnitureFootType;
	public String getFurnitureFootType() { return furnitureFootType; }
	public void setFurnitureFootType(String furnitureFootType){ this.furnitureFootType = furnitureFootType; }
	@Nullable
	public String maximumRange;
	public String getMaximumRange() { return maximumRange; }
	public void setMaximumRange(String maximumRange){ this.maximumRange = maximumRange; }
	@Nullable
	public String legStyle;
	public String getLegStyle() { return legStyle; }
	public void setLegStyle(String legStyle){ this.legStyle = legStyle; }
	@Nullable
	public String legHeightGlideStyle;
	public String getLegHeightGlideStyle() { return legHeightGlideStyle; }
	public void setLegHeightGlideStyle(String legHeightGlideStyle){ this.legHeightGlideStyle = legHeightGlideStyle; }
	@Nullable
	public String assembledProductWidth;
	public String getAssembledProductWidth() { return assembledProductWidth; }
	public void setAssembledProductWidth(String assembledProductWidth){ this.assembledProductWidth = assembledProductWidth; }
	@Nullable
	public String tableTopType;
	public String getTableTopType() { return tableTopType; }
	public void setTableTopType(String tableTopType){ this.tableTopType = tableTopType; }
	@Nullable
	public String topFinish;
	public String getTopFinish() { return topFinish; }
	public void setTopFinish(String topFinish){ this.topFinish = topFinish; }
	@Nullable
	public String weight;
	public String getWeight() { return weight; }
	public void setWeight(String weight){ this.weight = weight; }
	@Nullable
	public String adjustableHeight;
	public String getAdjustableHeight() { return adjustableHeight; }
	public void setAdjustableHeight(String adjustableHeight){ this.adjustableHeight = adjustableHeight; }
	@Nullable
	public String headphonesIncluded;
	public String getHeadphonesIncluded() { return headphonesIncluded; }
	public void setHeadphonesIncluded(String headphonesIncluded){ this.headphonesIncluded = headphonesIncluded; }
	@Nullable
	public String capacity;
	public String getCapacity() { return capacity; }
	public void setCapacity(String capacity){ this.capacity = capacity; }
	@Nullable
	public String baseType;
	public String getBaseType() { return baseType; }
	public void setBaseType(String baseType){ this.baseType = baseType; }
	@Nullable
	public String magnification;
	public String getMagnification() { return magnification; }
	public void setMagnification(String magnification){ this.magnification = magnification; }
	@Nullable
	public String features;
	public String getFeatures() { return features; }
	public void setFeatures(String features){ this.features = features; }
	@Nullable
	public String feet;
	public String getFeet() { return feet; }
	public void setFeet(String feet){ this.feet = feet; }
	@Nullable
	public String compatibleDevices;
	public String getCompatibleDevices() { return compatibleDevices; }
	public void setCompatibleDevices(String compatibleDevices){ this.compatibleDevices = compatibleDevices; }
	@Nullable
	public String laptopSize;
	public String getLaptopSize() { return laptopSize; }
	public void setLaptopSize(String laptopSize){ this.laptopSize = laptopSize; }
	@Nullable
	public String deskFinish;
	public String getDeskFinish() { return deskFinish; }
	public void setDeskFinish(String deskFinish){ this.deskFinish = deskFinish; }
	@Nullable
	public String binColor;
	public String getBinColor() { return binColor; }
	public void setBinColor(String binColor){ this.binColor = binColor; }
	@Nullable
	public String numberOfHoles;
	public String getNumberOfHoles() { return numberOfHoles; }
	public void setNumberOfHoles(String numberOfHoles){ this.numberOfHoles = numberOfHoles; }
	@Nullable
	public String itemType;
	public String getItemType() { return itemType; }
	public void setItemType(String itemType){ this.itemType = itemType; }
	@Nullable
	public String edgeFinish;
	public String getEdgeFinish() { return edgeFinish; }
	public void setEdgeFinish(String edgeFinish){ this.edgeFinish = edgeFinish; }
	@Nullable
	public String rackSpaces;
	public String getRackSpaces() { return rackSpaces; }
	public void setRackSpaces(String rackSpaces){ this.rackSpaces = rackSpaces; }
	@Nullable
	public String sizeWXDXH;
	public String getSizeWXDXH() { return sizeWXDXH; }
	public void setSizeWXDXH(String sizeWXDXH){ this.sizeWXDXH = sizeWXDXH; }
	@Nullable
	public String shelfCapacity;
	public String getShelfCapacity() { return shelfCapacity; }
	public void setShelfCapacity(String shelfCapacity){ this.shelfCapacity = shelfCapacity; }
	@Nullable
	public String numberOfShelves;
	public String getNumberOfShelves() { return numberOfShelves; }
	public void setNumberOfShelves(String numberOfShelves){ this.numberOfShelves = numberOfShelves; }
	@Nullable
	public String seatHeight;
	public String getSeatHeight() { return seatHeight; }
	public void setSeatHeight(String seatHeight){ this.seatHeight = seatHeight; }
	@Nullable
	public String topPanelDoors;
	public String getTopPanelDoors() { return topPanelDoors; }
	public void setTopPanelDoors(String topPanelDoors){ this.topPanelDoors = topPanelDoors; }
	@Nullable
	public String legHeightAndGlideStyle;
	public String getLegHeightAndGlideStyle() { return legHeightAndGlideStyle; }
	public void setLegHeightAndGlideStyle(String legHeightAndGlideStyle){ this.legHeightAndGlideStyle = legHeightAndGlideStyle; }
	@Nullable
	public String lightBulbIncluded;
	public String getLightBulbIncluded() { return lightBulbIncluded; }
	public void setLightBulbIncluded(String lightBulbIncluded){ this.lightBulbIncluded = lightBulbIncluded; }
	@Nullable
	public String assembledProductHeight;
	public String getAssembledProductHeight() { return assembledProductHeight; }
	public void setAssembledProductHeight(String assembledProductHeight){ this.assembledProductHeight = assembledProductHeight; }
	@Nullable
	public String assembledProductLength;
	public String getAssembledProductLength() { return assembledProductLength; }
	public void setAssembledProductLength(String assembledProductLength){ this.assembledProductLength = assembledProductLength; }
	@Nullable
	public String material;
	public String getMaterial() { return material; }
	public void setMaterial(String material){ this.material = material; }
	@Nullable
	public String numberOfCompartments;
	public String getNumberOfCompartments() { return numberOfCompartments; }
	public void setNumberOfCompartments(String numberOfCompartments){ this.numberOfCompartments = numberOfCompartments; }
	@Nullable
	public String casters;
	public String getCasters() { return casters; }
	public void setCasters(String casters){ this.casters = casters; }
	@Nullable
	public String backPanelHeight;
	public String getBackPanelHeight() { return backPanelHeight; }
	public void setBackPanelHeight(String backPanelHeight){ this.backPanelHeight = backPanelHeight; }
	@Nullable
	public String interior;
	public String getInterior() { return interior; }
	public void setInterior(String interior){ this.interior = interior; }
	@Nullable
	public String desktopShelfLength;
	public String getDesktopShelfLength() { return desktopShelfLength; }
	public void setDesktopShelfLength(String desktopShelfLength){ this.desktopShelfLength = desktopShelfLength; }
	@Nullable
	public String edgeType;
	public String getEdgeType() { return edgeType; }
	public void setEdgeType(String edgeType){ this.edgeType = edgeType; }
	@Nullable
	public String hasFoamInterior;
	public String getHasFoamInterior() { return hasFoamInterior; }
	public void setHasFoamInterior(String hasFoamInterior){ this.hasFoamInterior = hasFoamInterior; }
	@Nullable
	public String wireSize;
	public String getWireSize() { return wireSize; }
	public void setWireSize(String wireSize){ this.wireSize = wireSize; }
	@Nullable
	public String tableTopColor;
	public String getTableTopColor() { return tableTopColor; }
	public void setTableTopColor(String tableTopColor){ this.tableTopColor = tableTopColor; }
	@Nullable
	public String recommendedUse;
	public String getRecommendedUse() { return recommendedUse; }
	public void setRecommendedUse(String recommendedUse){ this.recommendedUse = recommendedUse; }
	@Nullable
	public String armLegFinish;
	public String getArmLegFinish() { return armLegFinish; }
	public void setArmLegFinish(String armLegFinish){ this.armLegFinish = armLegFinish; }
	@Nullable
	public String glassColor;
	public String getGlassColor() { return glassColor; }
	public void setGlassColor(String glassColor){ this.glassColor = glassColor; }
	@Nullable
	public String paperSize;
	public String getPaperSize() { return paperSize; }
	public void setPaperSize(String paperSize){ this.paperSize = paperSize; }
	@Nullable
	public String cdSpace;
	public String getCdSpace() { return cdSpace; }
	public void setCdSpace(String cdSpace){ this.cdSpace = cdSpace; }
	@Nullable
	public String maximumWireLength;
	public String getMaximumWireLength() { return maximumWireLength; }
	public void setMaximumWireLength(String maximumWireLength){ this.maximumWireLength = maximumWireLength; }
	@Nullable
	public String upholstery;
	public String getUpholstery() { return upholstery; }
	public void setUpholstery(String upholstery){ this.upholstery = upholstery; }
	@Nullable
	public String pattern;
	public String getPattern() { return pattern; }
	public void setPattern(String pattern){ this.pattern = pattern; }
	@Nullable
	public String shelfColor;
	public String getShelfColor() { return shelfColor; }
	public void setShelfColor(String shelfColor){ this.shelfColor = shelfColor; }
	@Nullable
	public String sideAndBackPanels;
	public String getSideAndBackPanels() { return sideAndBackPanels; }
	public void setSideAndBackPanels(String sideAndBackPanels){ this.sideAndBackPanels = sideAndBackPanels; }
	@Nullable
	public String rackrailType;
	public String getRackrailType() { return rackrailType; }
	public void setRackrailType(String rackrailType){ this.rackrailType = rackrailType; }
	@Nullable
	public String diameter;
	public String getDiameter() { return diameter; }
	public void setDiameter(String diameter){ this.diameter = diameter; }
	@Nullable
	public String actualColor;
	public String getActualColor() { return actualColor; }
	public void setActualColor(String actualColor){ this.actualColor = actualColor; }
	@Nullable
	public String tabLetter;
	public String getTabLetter() { return tabLetter; }
	public void setTabLetter(String tabLetter){ this.tabLetter = tabLetter; }
	@Nullable
	public String hasCasters;
	public String getHasCasters() { return hasCasters; }
	public void setHasCasters(String hasCasters){ this.hasCasters = hasCasters; }
	@Nullable
	public String convertsToSize;
	public String getConvertsToSize() { return convertsToSize; }
	public void setConvertsToSize(String convertsToSize){ this.convertsToSize = convertsToSize; }
	@Nullable
	public String tabDimensions;
	public String getTabDimensions() { return tabDimensions; }
	public void setTabDimensions(String tabDimensions){ this.tabDimensions = tabDimensions; }
	@Nullable
	public String platformFrameFinish;
	public String getPlatformFrameFinish() { return platformFrameFinish; }
	public void setPlatformFrameFinish(String platformFrameFinish){ this.platformFrameFinish = platformFrameFinish; }
	@Nullable
	public String frameFinish;
	public String getFrameFinish() { return frameFinish; }
	public void setFrameFinish(String frameFinish){ this.frameFinish = frameFinish; }
	@Nullable
	public String paintAndLaminateColors;
	public String getPaintAndLaminateColors() { return paintAndLaminateColors; }
	public void setPaintAndLaminateColors(String paintAndLaminateColors){ this.paintAndLaminateColors = paintAndLaminateColors; }
	@Nullable
	public String tensileStrength;
	public String getTensileStrength() { return tensileStrength; }
	public void setTensileStrength(String tensileStrength){ this.tensileStrength = tensileStrength; }
	@Nullable
	public String iflexPrivacyPanels;
	public String getIflexPrivacyPanels() { return iflexPrivacyPanels; }
	public void setIflexPrivacyPanels(String iflexPrivacyPanels){ this.iflexPrivacyPanels = iflexPrivacyPanels; }
	@Nullable
	public String reticle;
	public String getReticle() { return reticle; }
	public void setReticle(String reticle){ this.reticle = reticle; }
	@Nullable
	public String model;
	public String getModel() { return model; }
	public void setModel(String model){ this.model = model; }
	@Nullable
	public String numberOfPieces;
	public String getNumberOfPieces() { return numberOfPieces; }
	public void setNumberOfPieces(String numberOfPieces){ this.numberOfPieces = numberOfPieces; }
	@Nullable
	public String option;
	public String getOption() { return option; }
	public void setOption(String option){ this.option = option; }
	@Nullable
	public String tab;
	public String getTab() { return tab; }
	public void setTab(String tab){ this.tab = tab; }
	@Nullable
	public String numberOfRackUnits;
	public String getNumberOfRackUnits() { return numberOfRackUnits; }
	public void setNumberOfRackUnits(String numberOfRackUnits){ this.numberOfRackUnits = numberOfRackUnits; }
	@Nullable
	public String includesSoundSystem;
	public String getIncludesSoundSystem() { return includesSoundSystem; }
	public void setIncludesSoundSystem(String includesSoundSystem){ this.includesSoundSystem = includesSoundSystem; }
	@Nullable
	public String finishWidth;
	public String getFinishWidth() { return finishWidth; }
	public void setFinishWidth(String finishWidth){ this.finishWidth = finishWidth; }
	@Nullable
	public String legFinish;
	public String getLegFinish() { return legFinish; }
	public void setLegFinish(String legFinish){ this.legFinish = legFinish; }
	@Nullable
	public String railLength;
	public String getRailLength() { return railLength; }
	public void setRailLength(String railLength){ this.railLength = railLength; }
	@Nullable
	public String lockerColor;
	public String getLockerColor() { return lockerColor; }
	public void setLockerColor(String lockerColor){ this.lockerColor = lockerColor; }
	@Nullable
	public String fastenerType;
	public String getFastenerType() { return fastenerType; }
	public void setFastenerType(String fastenerType){ this.fastenerType = fastenerType; }
	@Nullable
	public String topMaterial;
	public String getTopMaterial() { return topMaterial; }
	public void setTopMaterial(String topMaterial){ this.topMaterial = topMaterial; }
	@Nullable
	public String hardwareFinish;
	public String getHardwareFinish() { return hardwareFinish; }
	public void setHardwareFinish(String hardwareFinish){ this.hardwareFinish = hardwareFinish; }
	@Nullable
	public String hasRearLockingDoor;
	public String getHasRearLockingDoor() { return hasRearLockingDoor; }
	public void setHasRearLockingDoor(String hasRearLockingDoor){ this.hasRearLockingDoor = hasRearLockingDoor; }
	@Nullable
	public String flavor;
	public String getFlavor() { return flavor; }
	public void setFlavor(String flavor){ this.flavor = flavor; }
	@Nullable
	public String wallMountable;
	public String getWallMountable() { return wallMountable; }
	public void setWallMountable(String wallMountable){ this.wallMountable = wallMountable; }
	@Nullable
	public String fabric;
	public String getFabric() { return fabric; }
	public void setFabric(String fabric){ this.fabric = fabric; }
	@Nullable
	public String drawerOptions;
	public String getDrawerOptions() { return drawerOptions; }
	public void setDrawerOptions(String drawerOptions){ this.drawerOptions = drawerOptions; }
	@Nullable
	public String nflTeam;
	public String getNflTeam() { return nflTeam; }
	public void setNflTeam(String nflTeam){ this.nflTeam = nflTeam; }
	@Nullable
	public String threadType;
	public String getThreadType() { return threadType; }
	public void setThreadType(String threadType){ this.threadType = threadType; }
	@Nullable
	public String trayColor;
	public String getTrayColor() { return trayColor; }
	public void setTrayColor(String trayColor){ this.trayColor = trayColor; }
	@Nullable
	public String handleColor;
	public String getHandleColor() { return handleColor; }
	public void setHandleColor(String handleColor){ this.handleColor = handleColor; }
	@Nullable
	public String configuration;
	public String getConfiguration() { return configuration; }
	public void setConfiguration(String configuration){ this.configuration = configuration; }
	@SerializedName("interface")
	@Nullable
	public String interfac;
	public String getInterfac() { return interfac; }
	public void setInterfac(String interfac){ this.interfac = interfac; }
	@Nullable
	public String runTime;
	public String getRunTime() { return runTime; }
	public void setRunTime(String runTime){ this.runTime = runTime; }
	@Nullable
	public String microphoneType;
	public String getMicrophoneType() { return microphoneType; }
	public void setMicrophoneType(String microphoneType){ this.microphoneType = microphoneType; }
	@Nullable
	public String backPanelColor;
	public String getBackPanelColor() { return backPanelColor; }
	public void setBackPanelColor(String backPanelColor){ this.backPanelColor = backPanelColor; }
	@Nullable
	public String tabletopSize;
	public String getTabletopSize() { return tabletopSize; }
	public void setTabletopSize(String tabletopSize){ this.tabletopSize = tabletopSize; }
	@Nullable
	public String sidePanelFinish;
	public String getSidePanelFinish() { return sidePanelFinish; }
	public void setSidePanelFinish(String sidePanelFinish){ this.sidePanelFinish = sidePanelFinish; }
	@Nullable
	public String suspensionLength;
	public String getSuspensionLength() { return suspensionLength; }
	public void setSuspensionLength(String suspensionLength){ this.suspensionLength = suspensionLength; }
	@Nullable
	public String frame;
	public String getFrame() { return frame; }
	public void setFrame(String frame){ this.frame = frame; }
	@Nullable
	public String electricalUnit;
	public String getElectricalUnit() { return electricalUnit; }
	public void setElectricalUnit(String electricalUnit){ this.electricalUnit = electricalUnit; }
	@Nullable
	public String leftBookendColor;
	public String getLeftBookendColor() { return leftBookendColor; }
	public void setLeftBookendColor(String leftBookendColor){ this.leftBookendColor = leftBookendColor; }
	@Nullable
	public String laminateFinish;
	public String getLaminateFinish() { return laminateFinish; }
	public void setLaminateFinish(String laminateFinish){ this.laminateFinish = laminateFinish; }
	@Nullable
	public String cabinetColor;
	public String getCabinetColor() { return cabinetColor; }
	public void setCabinetColor(String cabinetColor){ this.cabinetColor = cabinetColor; }
	@Nullable
	public String rugSize;
	public String getRugSize() { return rugSize; }
	public void setRugSize(String rugSize){ this.rugSize = rugSize; }
	@Nullable
	public String style;
	public String getStyle() { return style; }
	public void setStyle(String style){ this.style = style; }
	@Nullable
	public String mlbTeam;
	public String getMlbTeam() { return mlbTeam; }
	public void setMlbTeam(String mlbTeam){ this.mlbTeam = mlbTeam; }
	@Nullable
	public String woodFinish;
	public String getWoodFinish() { return woodFinish; }
	public void setWoodFinish(String woodFinish){ this.woodFinish = woodFinish; }
	@Nullable
	public String mountSize;
	public String getMountSize() { return mountSize; }
	public void setMountSize(String mountSize){ this.mountSize = mountSize; }
	@Nullable
	public String guideKitIncluded;
	public String getGuideKitIncluded() { return guideKitIncluded; }
	public void setGuideKitIncluded(String guideKitIncluded){ this.guideKitIncluded = guideKitIncluded; }
	@Nullable
	public String lampType;
	public String getLampType() { return lampType; }
	public void setLampType(String lampType){ this.lampType = lampType; }
	@Nullable
	public String glide;
	public String getGlide() { return glide; }
	public void setGlide(String glide){ this.glide = glide; }
	@Nullable
	public String interfaceType;
	public String getInterfaceType() { return interfaceType; }
	public void setInterfaceType(String interfaceType){ this.interfaceType = interfaceType; }
	@Nullable
	public String upholsteryCasters;
	public String getUpholsteryCasters() { return upholsteryCasters; }
	public void setUpholsteryCasters(String upholsteryCasters){ this.upholsteryCasters = upholsteryCasters; }
	@Nullable
	public String hasAdapterKit;
	public String getHasAdapterKit() { return hasAdapterKit; }
	public void setHasAdapterKit(String hasAdapterKit){ this.hasAdapterKit = hasAdapterKit; }
	@Nullable
	public String shadeColor;
	public String getShadeColor() { return shadeColor; }
	public void setShadeColor(String shadeColor){ this.shadeColor = shadeColor; }
	@Nullable
	public String cut;
	public String getCut() { return cut; }
	public void setCut(String cut){ this.cut = cut; }
	@Nullable
	public String surfaceColor;
	public String getSurfaceColor() { return surfaceColor; }
	public void setSurfaceColor(String surfaceColor){ this.surfaceColor = surfaceColor; }
	@SerializedName("package")
	@Nullable
	public String packag;
	public String getPackag() { return packag; }
	public void setPackag(String packag){ this.packag = packag; }
	@Nullable
	public String edgeBanding;
	public String getEdgeBanding() { return edgeBanding; }
	public void setEdgeBanding(String edgeBanding){ this.edgeBanding = edgeBanding; }
	@Nullable
	public String size;
	public String getSize() { return size; }
	public void setSize(String size){ this.size = size; }
	@Nullable
	public String seatColor;
	public String getSeatColor() { return seatColor; }
	public void setSeatColor(String seatColor){ this.seatColor = seatColor; }
	@Nullable
	public String fabricMaterial;
	public String getFabricMaterial() { return fabricMaterial; }
	public void setFabricMaterial(String fabricMaterial){ this.fabricMaterial = fabricMaterial; }
	@Nullable
	public String legHeight;
	public String getLegHeight() { return legHeight; }
	public void setLegHeight(String legHeight){ this.legHeight = legHeight; }
	@Nullable
	public String lockType;
	public String getLockType() { return lockType; }
	public void setLockType(String lockType){ this.lockType = lockType; }
	@Nullable
	public String product;
	public String getProduct() { return product; }
	public void setProduct(String product){ this.product = product; }
	@Nullable
	public String dimensionsWXH;
	public String getDimensionsWXH() { return dimensionsWXH; }
	public void setDimensionsWXH(String dimensionsWXH){ this.dimensionsWXH = dimensionsWXH; }
	@Nullable
	public String drawerColor;
	public String getDrawerColor() { return drawerColor; }
	public void setDrawerColor(String drawerColor){ this.drawerColor = drawerColor; }
	@Nullable
	public String hasMirror;
	public String getHasMirror() { return hasMirror; }
	public void setHasMirror(String hasMirror){ this.hasMirror = hasMirror; }
	@Nullable
	public String leatherColor;
	public String getLeatherColor() { return leatherColor; }
	public void setLeatherColor(String leatherColor){ this.leatherColor = leatherColor; }
	@Nullable
	public String footType;
	public String getFootType() { return footType; }
	public void setFootType(String footType){ this.footType = footType; }
	@Nullable
	public String drop;
	public String getDrop() { return drop; }
	public void setDrop(String drop){ this.drop = drop; }
	@Nullable
	public String width;
	public String getWidth() { return width; }
	public void setWidth(String width){ this.width = width; }
	@Nullable
	public String bedSize;
	public String getBedSize() { return bedSize; }
	public void setBedSize(String bedSize){ this.bedSize = bedSize; }
	@Nullable
	public String sheftSize;
	public String getSheftSize() { return sheftSize; }
	public void setSheftSize(String sheftSize){ this.sheftSize = sheftSize; }
	@Nullable
	public String quantity;
	public String getQuantity() { return quantity; }
	public void setQuantity(String quantity){ this.quantity = quantity; }
	@Nullable
	public String scopeSize;
	public String getScopeSize() { return scopeSize; }
	public void setScopeSize(String scopeSize){ this.scopeSize = scopeSize; }
	@Nullable
	public String edgeColor;
	public String getEdgeColor() { return edgeColor; }
	public void setEdgeColor(String edgeColor){ this.edgeColor = edgeColor; }
	@Nullable
	public String watts;
	public String getWatts() { return watts; }
	public void setWatts(String watts){ this.watts = watts; }
	}
}
