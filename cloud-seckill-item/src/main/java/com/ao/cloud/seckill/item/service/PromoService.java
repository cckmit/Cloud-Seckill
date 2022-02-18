package com.ao.cloud.seckill.item.service;


import com.ao.cloud.seckill.item.model.pojo.PromoModel;

public interface PromoService {
    //根据itemid获取即将进行的或正在进行的秒杀活动
    PromoModel getPromoByItemId(Integer itemId);

    //活动发布
    void publishPromo(Integer promoId);

    Boolean validate(Integer promoId, Integer itemId);

    PromoModel getPromoModelByIdInCache(Integer id);
}
