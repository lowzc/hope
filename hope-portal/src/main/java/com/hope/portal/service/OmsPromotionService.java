package com.hope.portal.service;

import com.hope.mbg.model.OmsCartItem;
import com.hope.portal.domain.CartPromotionItem;

import java.util.List;

;

/**
 * 促销管理Service
 * Created by macro on 2018/8/27.
 */
public interface OmsPromotionService {
    /**
     * 计算购物车中的促销活动信息
     * @param cartItemList 购物车
     */
    List<CartPromotionItem> calcCartPromotion(List<OmsCartItem> cartItemList);
}
