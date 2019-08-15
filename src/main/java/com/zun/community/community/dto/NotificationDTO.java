package com.zun.community.community.dto;

import com.zun.community.community.model.User;
import lombok.Data;

@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String  notifierName;
    private String  outerTitle;
    private Long outerid;
    private String typeName;
    private Integer type;
}
