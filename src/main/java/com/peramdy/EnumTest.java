package com.peramdy;

/**
 * Created by Peramdy on 2017/1/17.
 */
public enum EnumTest {

    frist(1,"第一个值"),
    sconde(2,"第二个值");

    private Integer key;
    private String value;

    /**
     * @description 构造方法
     * @param key
     * @param value
     */
    EnumTest(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    /**
     * @description 获取key对应的value
     * @param newKey
     * @return
     */
    public static String getValueByKey(Integer newKey){
       for( EnumTest e  :EnumTest.values()){
            if(e.getKey()==newKey){
                return e.getValue();
            }
       }
        return null;
    }


}
