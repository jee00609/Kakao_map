package com.example.kakao_map.room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Todo implements Serializable {
    /*
    구명
    유형
    설치주소
    지역명
    상세설치장소
    설치기관(회사)
    설치위치(X좌표)
    설치위치(Y좌표)
    콘텐츠아이디
    */

    @PrimaryKey
    public String ContentID;//콘텐츠 ID
    public String District;//구명-강남구
    public String Type;//유형-복지센터등
    public String EmplacementAdress;//설치 주소-아동복지센터
    public String AreaName;//지역 명-강남구 광평로34길 124
    public String Detail_EmplacementAdress;//상세설치장소-아동복지센터 1F
    public String EmplacementCompany;//설치기관-서울시(시스코)
    //대략 검색할 땐 (위도,경도) 순으로 작성한다. 예시 - 37.479804,127.088505
    public float Xcors;//x좌표-127.088505 - 경도
    public float Ycors;//y좌표-37.479804 - 위도

    public String getContentID() {
        return ContentID;
    }

    public void setContentID(String contentID) {
        this.ContentID = contentID;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        this.District = district;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public String getEmplacementAdress() {
        return EmplacementAdress;
    }

    public void setEmplacementAdress(String emplacementAdress) {
        this.EmplacementAdress = emplacementAdress;
    }

    public String getAreaName() {
        return AreaName;
    }

    public void setAreaName(String areaName) {
        this.AreaName = areaName;
    }

    public String getDetail_EmplacementAdress() {
        return Detail_EmplacementAdress;
    }

    public void setDetail_EmplacementAdress(String detail_EmplacementAdress) {
        this.Detail_EmplacementAdress = detail_EmplacementAdress;
    }

    public String getEmplacementCompany() {
        return EmplacementCompany;
    }

    public void setEmplacementCompany(String emplacementCompany) {
        this.EmplacementCompany = emplacementCompany;
    }

    public float getXcors() {
        return Xcors;
    }

    public void setXcors(float xcors) {
        this.Xcors = xcors;
    }

    public float getYcors() {
        return Ycors;
    }

    public void setYcors(float ycors) {
        this.Ycors = ycors;
    }

}
