package com.chinasofti.mergerequestverify.utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;

public class JsonValidate {

    public static boolean isValidate(String source) {
        if (StringUtils.isBlank(source)) {
            return false;
        }
        try {
            JSONObject.parse(source);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
