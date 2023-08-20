package com.atyouxuan.yx.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum ProcessStatus {
    UNPAID(1, com.atyouxuan.yx.enums.OrderStatus.UNPAID),
    WAITING_DELEVER(2, com.atyouxuan.yx.enums.OrderStatus.WAITING_DELEVER),
    WAITING_LEADER_TAKE(3, com.atyouxuan.yx.enums.OrderStatus.WAITING_TAKE),
    WAITING_USER_TAKE(4, com.atyouxuan.yx.enums.OrderStatus.WAITING_TAKE),
    WAITING_COMMON(5, com.atyouxuan.yx.enums.OrderStatus.WAITING_COMMON),
    FINISHED(6, com.atyouxuan.yx.enums.OrderStatus.FINISHED),
    CANCEL(-1, com.atyouxuan.yx.enums.OrderStatus.CANCEL),
    PAY_FAIL(-2, com.atyouxuan.yx.enums.OrderStatus.UNPAID);

     @EnumValue
    private Integer code ;
    private com.atyouxuan.yx.enums.OrderStatus orderStatus;

    ProcessStatus(Integer code, com.atyouxuan.yx.enums.OrderStatus orderStatus){
        this.code=code;
        this.orderStatus=orderStatus;
    }

}
