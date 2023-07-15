package com.cyoku.practice.domain.model;

import lombok.Data;

@Data //GetterとSetterとtoString自動生成
public class LineUser {

    private int id;
    private String email;
    private String fullName;
    private String carNumber;
    private String lineUserId;

}
