package com.chinasofti.mergerequestverify.utils;

/**
 * @Auther: mingyang.Zhang
 * @Date: 2018/10/15
 * @Description:
 */
public enum OrderStatusEnum {

    ORDER_SUBMIT_WAIT_DISPOSE(1, "采购单已提交，等待平台处理"),
    ORDER_DISTRIBUTED_WAIT_SURE(2, "采购单处理完成，已分发给供应商，正在等待商家确认"),
    SUPPLIER_SURE_WAIT_PREPARE_GOODS(3, "商家已确认采购单，正在备货中"),
    SUPPLIER_PREPARED_GOODS_WAIT_TAKE(4, "商家已备货，等待配送工人取货"),
    WORKER_TOOK_TRANSPORT(5, "配送工人已取货，商品运输中"),
    GOODS_ARRIVED_STATION_WILL_TO_SHOP(6, "商品已到达中转站，等待发往采购店铺"),
    WORKER_TOOK_TRANSPORT_TO_SHOP(7, "配送工人已取货，正在发往配送店铺"),
    SHOP_RECEIVED_WAIT_ENTRY_STORE(8, "店铺已接收，配送完成，等待入库确认"),
    PURCHASE_COMPLETE(9, "入库统计完毕，采购单已完成"),
    CANCEL_PURCHASE(-1, "采购订单已取消");
    private Integer status;
    private String remark;

    OrderStatusEnum(Integer status, String remark) {
        this.status = status;
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public String getRemark() {
        return remark;
    }
}
