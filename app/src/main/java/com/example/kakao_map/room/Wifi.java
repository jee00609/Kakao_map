package com.example.kakao_map.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Wifi {
    @PrimaryKey
    public int uid;

    @ColumnInfo(name = "ContentID")
    public String ContentID;//콘텐츠 ID

    @ColumnInfo(name = "District")
    public String District;//구명-강남구

    @ColumnInfo(name = "Type")
    public String Type;//유형-복지센터등

    @ColumnInfo(name = "EmplacementAdress")
    public String EmplacementAdress;//설치 주소-아동복지센터

    @ColumnInfo(name = "AreaName")
    public String AreaName;//지역 명-강남구 광평로34길 124

    @ColumnInfo(name = "Detail_EmplacementAdress")
    public String Detail_EmplacementAdress;//상세설치장소-아동복지센터 1F

    @ColumnInfo(name = "EmplacementCompany")
    public String EmplacementCompany;//설치기관-서울시(시스코)
    //대략 검색할 땐 (위도,경도) 순으로 작성한다. 예시 - 37.479804,127.088505

    @ColumnInfo(name = "Xcors")
    public float Xcors;//x좌표-127.088505 - 경도

    @ColumnInfo(name = "Ycors")
    public float Ycors;//y좌표-37.479804 - 위도
}
