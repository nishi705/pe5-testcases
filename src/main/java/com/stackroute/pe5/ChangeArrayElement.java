package com.stackroute.pe5;
import java.util.*;

public class ChangeArrayElement {
    public String[] chaArray(String[] value) {


        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(value));
        int indexOfElement = wordsList.indexOf("Apple");

        if (indexOfElement != -1) {
            wordsList.set(indexOfElement, "Kiwi");

        }

        indexOfElement = wordsList.indexOf("Mango");

        if (indexOfElement != -1) {
            wordsList.set(indexOfElement, "Melon");

        }

return wordsList.toArray(new String[wordsList.size()] );
    }


}
