package com.chinasofti.mergerequestverify.utils;


import org.apache.commons.lang.StringUtils;

import java.util.Date;
import java.util.Random;

/**
 * @author Li Shijie
 * @Description //TODO 所有单号生成器$
 * @since 1.0.0
 */
public class GenerateCodeUtil {

    public static String generateCode(int type, String src, int num) {
        if (StringUtils.isBlank(src)){
            src = "1";
        }
        StringBuffer code = new StringBuffer();
        code.append(type);
        code.append(src);
        code.append((new Date()).getTime());
        Random random = new Random();
        int Range = (int) (9 * Math.pow(10, (num - 1)) - 1);
        int x = random.nextInt(Range);
        x = (int) (x + Math.pow(10, num - 1));
        code.append(x);
        return code.toString();
    }

    public static Long generateStoreMark() {
        StringBuffer code = new StringBuffer();
        code.append((new Date()).getTime());
        code.append((int) ((Math.random() * 9 + 1) * 10000));
        return Long.valueOf(code.toString());
    }


}
