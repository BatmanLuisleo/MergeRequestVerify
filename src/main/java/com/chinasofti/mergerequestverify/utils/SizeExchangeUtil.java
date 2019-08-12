package com.chinasofti.mergerequestverify.utils;

import org.apache.commons.lang.StringUtils;

public class SizeExchangeUtil {

    public static String exchaneSize(String head, String url, String sizeTag) {
        if (StringUtils.isBlank(url) || StringUtils.isBlank(sizeTag)) {
            return null;
        }
        String str1 = StringUtils.substringBeforeLast(url, "/");
        String str2 = StringUtils.substring(str1, 0, str1.length() - 3);
        String suffix = StringUtils.substringAfterLast(url, "/");
        StringBuffer sb = new StringBuffer();
        if (StringUtils.isNotBlank(head)) {
            sb.append(head);
        }
        sb.append(str2).append(sizeTag).append("/").append(suffix);
        return sb.toString();
    }

}
