package com.stackroute.pe5;
import java.util.*;
import java.util.Map;

public class CountString {

    public String[] coutString(String[] value1)
    {
       String[] wordList=value1.split("\\s+");
       HashMap<String, Integer> hmap = new HashMap<String,Integer>();
       for(String word:wordList)
       {
           if(hmap.containsKey(word))
           {
              int  count=map.get(word);
               map.put(word,count+1);
           }
           else
           {
               map.put(word,1);
           }
       }



   }
}
