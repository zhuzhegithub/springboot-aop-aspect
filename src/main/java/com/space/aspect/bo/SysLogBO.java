package com.space.aspect.bo;

import lombok.Data;

/**
 * 系统日志bo
 * @author zhuzhe
 * @date 2018/6/4 9:36
 * @email 1529949535@qq.com
 */
@Data
public class SysLogBO {

    private String className;

    private String methodName;

    private String params;

    private Long exeuTime;

    private String remark;

    private String createDate;
}
