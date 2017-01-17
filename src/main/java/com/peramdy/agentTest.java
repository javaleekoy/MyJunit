package com.peramdy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Peramdy on 2016/12/30.
 */
public class agentTest {

    public static void agentInActiveDadys(List<Integer>... lists ) {

        Map<String,Map<Integer,Integer>> map=new HashMap<String, Map<Integer, Integer>>();
        Map<Integer,Integer> agentMap=new HashMap<Integer, Integer>();
        map.put("inActiveDays",agentMap);


        for(List<Integer> agentIds:lists){
            if(agentMap.size()<1){
                for(Integer agentId: agentIds){
                    agentMap.put(agentId,1);
                }
            }else{
                for(Integer agentId: agentIds){
                    Boolean bFlag=true;
                    for(Integer key: agentMap.keySet()){
                        if(key==agentId){
                            agentMap.put(key,agentMap.get(key)+1);
                            bFlag=false;
                            break;
                        }
                    }
                    if(bFlag){
                        agentMap.put(agentId,1);
                    }
                }
            }
        }


        Map<Integer,Integer> reMap=map.get("inActiveDays");
        if(reMap.size()>0){
            for(Integer key: reMap.keySet()){
                 if(1==reMap.get(key)){
                    System.out.println("第一天："+key);
                 }else if(2==reMap.get(key)){
                    System.out.println("第二天："+key);
                 }else if(3==reMap.get(key)){
                    System.out.println("第三天："+key);
                 }
            }
        }
    }


}
