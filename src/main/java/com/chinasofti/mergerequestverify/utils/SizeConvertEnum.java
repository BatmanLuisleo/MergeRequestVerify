package com.chinasofti.mergerequestverify.utils;

public enum SizeConvertEnum {
    S000x000("000", "需要展示图片原始尺寸"),
    S140x140("100", "预约订单页面图片显示尺寸"),
    S152x152("105", "订单商品缩略图尺寸"),
    S170x170("110", "填写订单页面图片尺寸"),
    S180x180("115", "购物车页面图片尺寸"),
    S200x200("120", "商品详情页弹框商品图片尺寸"),
    S350x200("125", "分类图片尺寸"),
    S350x350("130", "商品列表图片尺寸"),
    S750x750("135", "填写订单页面图片尺寸");
    private String status;
    private String remark;

    SizeConvertEnum(String status, String remark) {
        this.status = status;
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
