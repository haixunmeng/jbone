package com.majunwei.jbone.sys.service.model.permission;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class PermissionBaseInfoModel {
    private int id;
    private int systemId;
    private String name;
    private int type;
    private String permissionValue;
    private long orders;
    private Timestamp addTime;
    private Timestamp updateTime;
    private int menuId;
}
