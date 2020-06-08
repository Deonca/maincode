package com.intelligencecommunity.maincode.entitys;


public class TbOwner {

  private long ownerId;
  private String ownerName;
  private String ownerSex;
  private String ownerLocation;
  private String ownerPhone;
  private String ownerMoney;
  private String ownerTime;
  private String levelId;
  private String other;

  @Override
  public String toString() {
    return "TbOwner{" +
            "ownerId=" + ownerId +
            ", ownerName='" + ownerName + '\'' +
            ", ownerSex='" + ownerSex + '\'' +
            ", ownerLocation='" + ownerLocation + '\'' +
            ", ownerPhone='" + ownerPhone + '\'' +
            ", ownerMoney='" + ownerMoney + '\'' +
            ", ownerTime='" + ownerTime + '\'' +
            ", levelId='" + levelId + '\'' +
            ", other='" + other + '\'' +
            '}';
  }

  public long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(long ownerId) {
    this.ownerId = ownerId;
  }


  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }


  public String getOwnerSex() {
    return ownerSex;
  }

  public void setOwnerSex(String ownerSex) {
    this.ownerSex = ownerSex;
  }


  public String getOwnerLocation() {
    return ownerLocation;
  }

  public void setOwnerLocation(String ownerLocation) {
    this.ownerLocation = ownerLocation;
  }


  public String getOwnerPhone() {
    return ownerPhone;
  }

  public void setOwnerPhone(String ownerPhone) {
    this.ownerPhone = ownerPhone;
  }


  public String getOwnerMoney() {
    return ownerMoney;
  }

  public void setOwnerMoney(String ownerMoney) {
    this.ownerMoney = ownerMoney;
  }


  public String getOwnerTime() {
    return ownerTime;
  }

  public void setOwnerTime(String ownerTime) {
    this.ownerTime = ownerTime;
  }


  public String getLevelId() {
    return levelId;
  }

  public void setLevelId(String levelId) {
    this.levelId = levelId;
  }


  public String getOther() {
    return other;
  }

  public void setOther(String other) {
    this.other = other;
  }

}
