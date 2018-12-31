package com.sopt.dowadog.model.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AnimalCheckup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String inoculation; // code 테이블것 사용할예정

    @ManyToOne
    AnimalUserAbort animalUserAbort;
}