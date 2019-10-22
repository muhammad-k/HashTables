package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        Map<UUID, String> testMap = new HashMap<>();

        testMap.put(UUID.randomUUID(), "hello world");
        testMap.put(UUID.randomUUID(), "Hello bob");
        testMap.put(UUID.randomUUID(), "TEST");

        for(Map.Entry<UUID, String> entry :  testMap.entrySet()){
            if(entry.getValue() == "TEST")
                System.out.println(entry.getKey() + " with value " + entry.getValue() + " was found");
            else
                System.out.println("Nothing has been found");
        }



    }
}
