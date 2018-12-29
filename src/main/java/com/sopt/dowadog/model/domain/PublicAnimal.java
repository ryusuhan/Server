package com.sopt.dowadog.model.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PublicAnimal {
    @Id
    private String noticeNo;

    private String age;
    private String careAddr;
    private String careNm;
    private String careTel;
    private String chargeNm;
    private String colorCd;
    private String desertionNo;
    private String filename;
    private String profile;
    private String happenDt;
    private String happenPlace;
    private String kindCd;
    private String neuterYn;

    private String noticeEdt;
    private String noticeSdt;

    private String specialMark;
    private String processState;
    private String sexCd;
    private String weight;
    private String officetel;
    private String popfile;
    private String orgNm;
    private String noticeComment;

}