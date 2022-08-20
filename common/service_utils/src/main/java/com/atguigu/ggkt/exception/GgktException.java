package com.atguigu.ggkt.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lyf
 * @date 2022/8/20 - 15:36
 * 功能描述：
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GgktException extends RuntimeException{
    private Integer code;
    private String msg;
}
