package com.jbst.exchange;

import com.google.common.base.Optional;

//TODO(xiaolu) �ĳɵ���ģʽ����
public class ExchangeFactory {
    
    public static AbstractExchange getExchange(ExchangeEnum ex) {
        switch (ex) {
        case OkcoinCn:
            return new OkcoinCnExchange("", "", Optional.of(""));
        case Huobi:
            return new HuobiExchange("", "", Optional.of(""));
        default:
            return new OkcoinCnExchange("", "", Optional.of(""));
        }
    }

}
