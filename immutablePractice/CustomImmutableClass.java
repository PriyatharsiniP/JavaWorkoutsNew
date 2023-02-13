package org.example.immutablePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class CustomImmutableClass {
    private final String name;//Immutable object
    private final int id;//Immutable object
    private final List<String> strList;//Immutable object
    private final Map<String,String> strMap;//Immutable object
    private final Address address;//Mutable object

    public CustomImmutableClass(String name, int id, List<String> strList, Map<String,String> strMap
    ,Address address){
        this.name = name;
        this.id = id;
        this.strList = strList;
        this.strMap = strMap;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<String> getStrList() {
        return new ArrayList<>(strList);
    }

    public Map<String, String> getStrMap() {
        return new HashMap<>(strMap);
    }
    public Address getAddress() throws CloneNotSupportedException {
        /*Address address = new Address();
        address.setAreaName(this.address.getAreaName());
        address.setFlatNo(this.address.getFlatNo());
        address.setPinCode(this.address.getPinCode());
        return address;*/
        return (Address)address.clone();
    }

    @Override
    public String toString() {
        return "CustomImmutableClass{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", strList=" + strList +
                ", strMap=" + strMap +
                ", address=" + address +
                '}';
    }
}
