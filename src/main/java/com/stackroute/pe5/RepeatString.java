package com.stackroute.pe5;
import java.util.HashMap;

public class RepeatString {

    public Boolean reString(String[] value1) {
        String[] wordList = value1.split(",");
        HashMap<String, Boolean> hmap = new HashMap<String, Boolean>();

        for (String word : wordList) {
            if(hmap.containsKey(word))
            {
                int count=map.get(word);
                map.put(word,count+1);
                if(count>2)
                    return true;
                else
                    return false;
            }
            else
                map.put(word,1);

        }


    }
}
