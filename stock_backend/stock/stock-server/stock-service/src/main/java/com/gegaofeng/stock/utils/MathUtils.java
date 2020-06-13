package com.gegaofeng.stock.utils;

import java.math.BigDecimal;

/**
 * MathUtil
 *
 * @author Feng
 * @version 1.0   2020-06-13 18:54
 */
public class MathUtils {
    //    默认除法精度
    private static final int DEF_DIV_SCALE = 4;

    public static BigDecimal add(BigDecimal num1, BigDecimal num2) {
        if (null == num1) {
            num1 = BigDecimal.ZERO;
        }
        if (null == num2) {
            num2 = BigDecimal.ZERO;
        }
        return num1.add(num2);
    }


    /**
     * 精确减法运算
     *
     * @param num1 被减数
     * @param num2 减数
     * @return 两个参数的差(BigDecimal)
     */
    public static BigDecimal subtract(BigDecimal num1, BigDecimal num2) {
        if (null == num1) {
            num1 = BigDecimal.ZERO;
        }
        if (null == num2) {
            num2 = BigDecimal.ZERO;
        }
        return num1.subtract(num2);
    }

    /**
     * 精确乘法运算
     *
     * @param num1 被乘数
     * @param num2 乘数
     * @return 两个参数的积(BigDecimal)
     */
    public static BigDecimal multiply(BigDecimal num1, BigDecimal num2) {
        if (null == num1) {
            num1 = BigDecimal.ONE;
        }
        if (null == num2) {
            num2 = BigDecimal.ONE;
        }
        return num1.multiply(num2);
    }

    /**
     * ( 相对 )精确除法运算 , 当发生除不尽情况时 , 精确到 小数点以后2位 , 以后数字四舍五入
     *
     * @param num1 被除数
     * @param num2 除数
     * @return 两个参数的商(BigDecimal)
     */
    public static BigDecimal divide(BigDecimal num1, BigDecimal num2) {
        if (null !=num1 &null!=num2){
            return num1.divide(num2, DEF_DIV_SCALE, BigDecimal.ROUND_HALF_UP);
        }else {
            return null;
        }
    }

    /**
     * ( 相对 )精确除法运算 . 当发生除不尽情况时 , 由scale参数指 定精度 , 以后数字四舍五入
     *
     * @param num1    被除数
     * @param num2    除数
     * @param scale 表示表示需要精确到小数点以后几位
     * @return 两个参数的商(BigDecimal)
     */
    public static BigDecimal divide(BigDecimal num1, BigDecimal num2, Integer scale) {
        if (null == num1) {
            return BigDecimal.ZERO;
        }
        if (null == num2) {
            num2 = BigDecimal.ONE;
        }

        if (num2.compareTo(BigDecimal.ZERO) == 0) {
            throw new IllegalArgumentException("除数不能为0");
        }

        if (scale < 0) {
            throw new IllegalArgumentException("精确度不能小于0");
        }

        return num1.divide(num2, scale, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 精确加法运算
     *
     * @param num1 被加数
     * @param num2 加数
     * @return 两个参数的和(String)
     */
    public static String add(String num1, String num2) {
        if (isBlank(num1)) {
            num1 = "0";
        }
        if (isBlank(num2)) {
            num2 = "0";
        }
        BigDecimal b1 = new BigDecimal(num1.trim());
        BigDecimal b2 = new BigDecimal(num2.trim());
        return String.valueOf(add(b1, b2));
    }


    /**
     * 精确减法运算
     *
     * @param num1 被减数
     * @param num2 减数
     * @return 两个参数的差(String)
     */
    public static String subtract(String num1, String num2) {
        if (isBlank(num1)) {
            num1 = "0";
        }
        if (isBlank(num2)) {
            num2 = "0";
        }
        BigDecimal b1 = new BigDecimal(num1.trim());
        BigDecimal b2 = new BigDecimal(num2.trim());
        return String.valueOf(subtract(b1, b2));
    }

    /**
     * 精确乘法运算
     *
     * @param num1 被乘数
     * @param num2 乘数
     * @return 两个参数的积(String)
     */
    public static String multiply(String num1, String num2) {
        if (isBlank(num1)) {
            num1 = "1";
        }
        if (isBlank(num2)) {
            num2 = "1";
        }
        BigDecimal b1 = new BigDecimal(num1.trim());
        BigDecimal b2 = new BigDecimal(num2.trim());
        return String.valueOf(multiply(b1, b2));
    }

    /**
     * ( 相对 )精确除法运算 , 当发生除不尽情况时 , 精确到 小数点以后2位 , 以后数字四舍五入
     *
     * @param num1 被除数
     * @param num2 除数
     * @return 两个参数的商(String)
     */
    public static String divide(String num1, String num2) {
        return divide(num1, num2, DEF_DIV_SCALE);
    }

    /**
     * ( 相对 )精确除法运算 . 当发生除不尽情况时 , 由scale参数指 定精度 , 以后数字四舍五入
     *
     * @param num1    被除数
     * @param num2    除数
     * @param scale 表示表示需要精确到小数点以后几位
     * @return 两个参数的商(String)
     */
    public static String divide(String num1, String num2, Integer scale) {
        if (null == num1) {
            return "0";
        }
        if (null == num2) {
            num2 = "1";
        }
        BigDecimal b1 = new BigDecimal(num1.trim());
        BigDecimal b2 = new BigDecimal(num2.trim());
        return String.valueOf(divide(b1, b2, scale));
    }

    /**
     * 精确加法运算 , 计算多个数值总和 , 若其中有null值则忽略
     *
     * @param valList 被加数集合
     * @return 两个参数的和(BigDecimal)
     */
    public static BigDecimal sum(BigDecimal num1, BigDecimal... valList) {
        if (null == num1) {
            num1 = BigDecimal.ZERO;
        }
        if (null == valList || valList.length == 0) {
            return num1;
        }
        for (BigDecimal val : valList) {
            if (null != val) {
                num1 = num1.add(val);
            }
        }
        return num1;
    }

    /**
     * 精确加法运算 , 计算多个数值总和 , 若其中有null值则忽略
     *
     * @param valList 被加数集合
     * @return 两个参数的和(String)
     */
    public static String sum(String num1, String... valList) {
        if (isBlank(num1)) {
            num1 = "0";
        }
        if (null == valList || valList.length == 0) {
            return num1;
        }
        BigDecimal b1 = new BigDecimal(num1.trim());
        for (String val : valList) {
            if (!isBlank(val)) {
                b1 = add(b1, new BigDecimal(val.trim()));
            }
        }
        return String.valueOf(b1);
    }

    /**
     * 平均数
     *
     * @param valList 求平均数的集合
     * @return
     */
    public static BigDecimal avg(BigDecimal... valList) {
        if (null != valList && valList.length != 0) {
            return divide(sum(BigDecimal.ZERO, valList), new BigDecimal(valList.length));
        }
        return BigDecimal.ZERO;
    }

    /**
     * 平均数
     *
     * @param valList
     * @return
     */
    public static String avg(String... valList) {
        if (null != valList && valList.length != 0) {
            return divide(sum("0", valList), String.valueOf(valList.length));
        }
        return "0";
    }

    /**
     * 最大值
     *
     * @param num1
     * @param valList
     * @return
     */
    public static BigDecimal max(BigDecimal num1, BigDecimal... valList) {
        BigDecimal max = num1;
        if (null == valList || valList.length == 0) {
            return max;
        }
        for (BigDecimal val : valList) {
            if (null != val && val.compareTo(max) > 0) {
                max = val;
            }
        }
        return max;
    }

    /**
     * 最大值
     *
     * @param valList
     * @return
     */
    public static BigDecimal maxArr(BigDecimal... valList) {
        if (null == valList || valList.length == 0) {
            return null;
        }

        return max(valList[0], valList);
    }

    /**
     * 最小值
     *
     * @param num1
     * @param valList
     * @return
     */
    public static BigDecimal min(BigDecimal num1, BigDecimal... valList) {
        BigDecimal min = num1;
        if (null == valList || valList.length == 0) {
            return min;
        }
        for (BigDecimal val : valList) {
            if (null != val && val.compareTo(min) < 0) {
                min = val;
            }
        }
        return min;
    }

    /**
     * 最小值
     *
     * @param valList
     * @return
     */
    public static BigDecimal minArr(BigDecimal... valList) {
        if (null == valList || valList.length == 0) {
            return null;
        }
        return min(valList[0], valList);
    }

    /**
     * 最大值
     *
     * @param num1
     * @param valList
     * @return
     */
    public static String max(String num1, String... valList) {
        if (isBlank(num1)) {
            return null;
        }
        if (null == valList || valList.length == 0) {
            return num1;
        }
        BigDecimal maxBd = new BigDecimal(num1.trim());

        for (String val : valList) {
            if (!isBlank(val) && new BigDecimal(val).compareTo(maxBd) > 0) {
                maxBd = new BigDecimal(val);
            }
        }
        return String.valueOf(maxBd);
    }

    /**
     * 最大值
     *
     * @param valList
     * @return
     */
    public static String maxArr(String... valList) {
        if (null == valList || valList.length == 0) {
            return null;
        }
        return max(valList[0], valList);
    }

    /**
     * 最小值
     *
     * @param num1
     * @param valList
     * @return
     */
    public static String min(String num1, String... valList) {
        if (isBlank(num1)) {
            return null;
        }
        if (null == valList || valList.length == 0) {
            return num1;
        }
        BigDecimal minBd = new BigDecimal(num1.trim());

        for (String val : valList) {
            if (!isBlank(val) && new BigDecimal(val).compareTo(minBd) < 0) {
                minBd = new BigDecimal(val);
            }
        }
        return String.valueOf(minBd);
    }

    /**
     * 最小值
     *
     * @param valList
     * @return
     */
    public static String minArr(String... valList) {
        if (null == valList || valList.length == 0) {
            return null;
        }
        return min(valList[0], valList);
    }

    /**
     * 判断字符串是否为空(不依赖第三方)
     *
     * @param str
     * @return
     */
    private static boolean isBlank(String str) {
        return null == str || str.trim().length() == 0;
    }
}
