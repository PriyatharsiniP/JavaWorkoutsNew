package org.example.immutablePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomImmutableMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> strList = new ArrayList<>();
        strList.add("Hi");
        strList.add("Hello");
        strList.add("I am Immutable list");
        Map<String,String> strMap = new HashMap<>();
        strMap.put("World","2");
        strMap.put("Welcome","1");
        Address address = new Address();
        address.setAreaName("SK");
        address.setFlatNo(123);
        address.setPinCode("111111");
        CustomImmutableClass customImm = new CustomImmutableClass(
                "Anuj",1000,strList,strMap,address);
        System.out.println(customImm);
        customImm.getStrList().add("Extra");
        System.out.println(customImm);
        customImm.getStrMap().put("Extra","7");
        System.out.println(customImm);
        customImm.getAddress().setAreaName("AKKK");
        System.out.println(customImm);

    }
}
