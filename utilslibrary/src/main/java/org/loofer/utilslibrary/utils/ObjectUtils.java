package org.loofer.utilslibrary.utils;

/**
 * ============================================================
 * 版权： xx有限公司 版权所有（c）2016
 * <p/>
 * 作者：Loofer
 * 版本：1.0
 * 创建日期 ：2016/10/8 22:28.
 * 描述：Object工具类，可用于Object常用操作
 * <p/>
 * 注:如果您修改了本类请填写以下内容作为记录，如非本人操作劳烦通知，谢谢！！！
 * Modified Date Modify Content:
 * <p/>
 * ==========================================================
 */
public class ObjectUtils {

    private ObjectUtils() {
        throw new AssertionError();
    }

    /**
     * compare two object
     * 比较两个对象是否相等
     * @param actual
     * @param expected
     * @return <ul>
     *         <li>if both are null, return true</li>
     *         <li>return actual.{@link Object#equals(Object)}</li>
     *         </ul>
     */
    public static boolean isEquals(Object actual, Object expected) {
        return actual == expected || (actual == null ? expected == null : actual.equals(expected));
    }

    /**
     * null Object to empty string
     *
     * <pre>
     * nullStrToEmpty(null) = &quot;&quot;;
     * nullStrToEmpty(&quot;&quot;) = &quot;&quot;;
     * nullStrToEmpty(&quot;aa&quot;) = &quot;aa&quot;;
     * </pre>
     *
     * @param str
     * @return
     */
    public static String nullStrToEmpty(Object str) {
        return (str == null ? "" : (str instanceof String ? (String)str : str.toString()));
    }

    /**
     * convert long array to Long array
     *long 数组转换为Long数组
     * @param source
     * @return
     */
    public static Long[] transformLongArray(long[] source) {
        Long[] destin = new Long[source.length];
        for (int i = 0; i < source.length; i++) {
            destin[i] = source[i];
        }
        return destin;
    }

    /**
     * convert Long array to long array
     *long 数组转换为Long数组
     * @param source
     * @return
     */
    public static long[] transformLongArray(Long[] source) {
        long[] destin = new long[source.length];
        for (int i = 0; i < source.length; i++) {
            destin[i] = source[i];
        }
        return destin;
    }

    /**Integer 数组转换为int数组
     * convert int array to Integer array
     *
     * @param source
     * @return
     */
    public static Integer[] transformIntArray(int[] source) {
        Integer[] destin = new Integer[source.length];
        for (int i = 0; i < source.length; i++) {
            destin[i] = source[i];
        }
        return destin;
    }

    /**
     * convert Integer array to int array
     *Integer 数组转换为int数组
     * @param source
     * @return
     */
    public static int[] transformIntArray(Integer[] source) {
        int[] destin = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            destin[i] = source[i];
        }
        return destin;
    }

    /**
     * compare two object
     *  比较两个对象大小
     * <ul>
     * <strong>About result</strong>
     * <li>if v1 > v2, return 1</li>
     * <li>if v1 = v2, return 0</li>
     * <li>if v1 < v2, return -1</li>
     * </ul>
     * <ul>
     * <strong>About rule</strong>
     * <li>if v1 is null, v2 is null, then return 0</li>
     * <li>if v1 is null, v2 is not null, then return -1</li>
     * <li>if v1 is not null, v2 is null, then return 1</li>
     * <li>return v1.{@link Comparable#compareTo(Object)}</li>
     * </ul>
     *
     * @param v1
     * @param v2
     * @return
     */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static <V> int compare(V v1, V v2) {
        return v1 == null ? (v2 == null ? 0 : -1) : (v2 == null ? 1 : ((Comparable)v1).compareTo(v2));
    }


}
