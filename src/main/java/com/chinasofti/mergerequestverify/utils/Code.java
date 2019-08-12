package com.chinasofti.mergerequestverify.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Code {

    private static Random random = new Random();

    public static String generateCode(String pre){
//        Date date = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddHHmmssSSS");
//        String format = simpleDateFormat.format(date);
        int i = random.nextInt(1000) + 1000;
        return pre+System.currentTimeMillis()+String.valueOf(i).substring(1);
    }



    public static void main(String[] args) {

        System.out.println(generateCode("CO"));

        System.out.println(generateCode("CO"));

        System.out.println(generateCode("CO"));

        System.out.println(generateCode("CO"));

        System.out.println(GenerateCodeUtil.generateCode(1,"1",3));
        System.out.println(GenerateCodeUtil.generateCode(1,"1",3));
        System.out.println(GenerateCodeUtil.generateCode(1,"1",3));
        System.out.println(GenerateCodeUtil.generateCode(1,"1",3));
    }
}
